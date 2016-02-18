/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qusoft.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class DbManager {
    public static void main(String[] a)throws Exception {
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:~/test;MODE=MySQL", "sa", "");
        createUserTable(conn);
        // add application code here
        conn.close();
    }
    
    private static void createUserTable(Connection conn){
        final StringBuilder sb=new StringBuilder();
        sb.append("create table IF NOT EXISTS UTENTE(id int primary key, name varchar(255));");
        PreparedStatement pst=null;
        try{
            pst=conn.prepareStatement(sb.toString());
            pst.executeUpdate();
        }catch(Exception e){
          e.printStackTrace();
        }finally{
            if(pst!=null)
                try {
                    pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
