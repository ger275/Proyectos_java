/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gerson
 */
public class UserDAO implements CRUD{
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex = new Conexion();

    @Override
    public List listar() {
        List<User> datos = new ArrayList<>();
        String sql = "select * from user";
        try{
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setFname(rs.getString("nombre"));
                u.setLname(rs.getString("apellido"));
                datos.add(u);
            }
        }catch(Exception e){
        }
        return datos;
    }

    @Override
    public User listarID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String add(String nombre, String ape) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String edit(int id, String nombre, String ape) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
