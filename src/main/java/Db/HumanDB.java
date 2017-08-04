package Db;

import Modelos.Conexion;
import Modelos.Human;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by HSEQ on 04/08/2017.
 */
public class HumanDB {


    public static List<Human> humanList;

    public static List<Human> getHumanList()throws ClassNotFoundException,SQLException{
        humanList=new LinkedList<>();
        String sql="select * from HUMAN";

        PreparedStatement ps= Conexion.conection().prepareStatement(sql);

        ResultSet rs=ps.executeQuery();

        while (rs.next()){
            Human humanoBaseDatos=new Human();
            humanoBaseDatos.setId(rs.getInt("id"));
            humanoBaseDatos.setNombre(rs.getString("nameHuman"));
            humanList.add(humanoBaseDatos);
        }
        ps.close();
        return humanList;
    }
    public static List<Human> getHumanListEspecific(int id)throws ClassNotFoundException,SQLException{
        humanList=new LinkedList<>();
        String sql="select * from HUMAN where id= ?";

        PreparedStatement ps= Conexion.conection().prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet rs=ps.executeQuery();

        while (rs.next()){
            Human humanoBaseDatos=new Human();
            humanoBaseDatos.setId(rs.getInt("id"));
            humanoBaseDatos.setNombre(rs.getString("nameHuman"));
            humanList.add(humanoBaseDatos);
        }
        ps.close();
        return humanList;
    }
    public static void main(String[]args) throws SQLException, ClassNotFoundException{
        List<Human> recorrerLista;
        List<Human> recorrerLista2;
        recorrerLista=  getHumanList();
        int idBuscado=1;
        recorrerLista2=getHumanListEspecific(idBuscado);
        for (Human humanIndice:recorrerLista){
            System.out.println("mi id es " + humanIndice.getId());
            System.out.println("mi nombre  es " + humanIndice.getNombre());
        }
        for (Human humanIndice:recorrerLista2){
            System.out.println("mi id especifico es  " + humanIndice.getId());
            System.out.println("mi nombre  especifico es  " + humanIndice.getNombre());
        }

    }
}
