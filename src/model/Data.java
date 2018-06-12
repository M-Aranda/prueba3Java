package model;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Data {

    private final Conexion con;
    private String query;
    private ResultSet rs;


    public Data() throws ClassNotFoundException, SQLException {
        con = new Conexion("localhost", "bd_colores", "root", "");
    }


    public void guardarColor(String colorHexa) throws SQLException{
        query="INSERT INTO color VALUES (NULL, '"+colorHexa+"');";
        con.ejecutar(query);
        
    }
    
    public ArrayList<ColorIngresado> rescatarTodosLosColores() throws SQLException{
        
        ArrayList<ColorIngresado> listaDeColores=new ArrayList();
        
        query="SELECT * FROM color";
        
        rs = con.ejecutarSelect(query);

       while (rs.next()) {
            ColorIngresado co= new ColorIngresado();

            co.setId(rs.getInt(1));
            co.setColor_hexa(rs.getString(2));
            

           listaDeColores.add(co);
       }

        
        return listaDeColores;
   
    }
    
    
    public void borrarColor(int indice) throws SQLException{
        query="DELETE FROM color WHERE id="+indice+"";
        con.ejecutar(query);
    }
   
    
 
    
}
