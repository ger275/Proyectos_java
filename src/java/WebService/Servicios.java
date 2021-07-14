/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import Modelo.User;
import Modelo.UserDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Gerson
 */
@WebService(serviceName = "Servicios")
public class Servicios {
    
    UserDAO dao = new UserDAO();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listar")
    public List<User> listar() {
        //TODO write your implementation code here:
        List datos = dao.listar();
        return datos;
    }
}
