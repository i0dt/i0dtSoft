/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i0dt.i0dtSoft.client;

import com.i0dt.i0dtSoft.client.model.UtenteEnv;
import com.i0dt.i0dtSoft.client.view.LoginPage;

import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class QClient extends Application {
    private static Stage mainStage;
    private static final UtenteEnv env=new UtenteEnv();
    
    final public static Stage getMainStage(){
        return mainStage;
    }
    final public static UtenteEnv getEnv(){
        return env;
    }
    
    @Override
    public void start(Stage primaryStage) {
        mainStage=primaryStage;
        LoginPage.load();  
    }
    
    @Override
    public void stop() {
        try {
            super.stop();
        } catch (Exception ex) {
            Logger.getLogger(QClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
