/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modèle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static Vue.Interface.connecterDB;

/**
 *
 * @author leand
 */
public class ajouterdbb {
     public void ajouterdbb(String query){

    //On se connecte
  Connection conn = connecterDB();
  PreparedStatement state;
         try {
             state = conn.prepareStatement(query);
             state.executeUpdate(query);
             javax.swing.JOptionPane.showMessageDialog(null,"Données ajoutées !");
         } catch (SQLException ex) {
             Logger.getLogger(ajouterdbb.class.getName()).log(Level.SEVERE, null, ex);
             javax.swing.JOptionPane.showMessageDialog(null,"ERREUR");
         }

  
     
}
}
