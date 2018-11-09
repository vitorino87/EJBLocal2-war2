/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gg;

import ejbb.Meu_EJBLocal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author tiago.lucas
 */
public class NovoClass {

    Meu_EJBLocal meu_EJB = lookupMeu_EJBLocal();

    public Meu_EJBLocal lookupMeu_EJBLocal() {
        try {
            Context c = new InitialContext();
            return (Meu_EJBLocal) c.lookup("java:comp/env/Meu_EJB");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    
    
}
