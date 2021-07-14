/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author Gerson
 */
public interface CRUD {
    public List listar();
    public User listarID(int id);
    public String add(String nombre, String ape);
    public String edit(int id, String nombre, String ape);
    public User delete(int id);
}
