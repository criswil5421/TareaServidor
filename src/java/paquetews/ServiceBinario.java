/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetews;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Pc
 */
@WebService(serviceName = "ServiceBinario")
public class ServiceBinario {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getFicheroAdjunto")
    public byte[] getFicheroAdjunto() {
        
        String ruta = "C:\\Users\\Pc\\Documents\\NetBeansProjects\\trabajo.txt";
        File file = new File(ruta);
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream input = new BufferedInputStream(fis);
            byte[] salida = new byte[(int) file.length()];
            input.read(salida);
            input.close();
            return salida;
        } catch (IOException ex) {
             return null;
        }
    }
}
