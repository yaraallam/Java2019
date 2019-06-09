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
import java.sql.Statement;
  
import static Vue.Interface.connecterDB;

/**
 *
 * @author leand
 */
//CTRL + SHIFT + O pour générer les imports
public class Resultset {
    
    public String Resultat(String query){
    try {
      
        //On se connecte
      Connection conn = connecterDB();
      PreparedStatement state = conn.prepareStatement(query);
      
      ResultSet res = state.executeQuery();
      ResultSetMetaData resultMeta = res.getMetaData();

 
      
      while (res.next()){
        for(int j = 1; j <= resultMeta.getColumnCount(); j++){
            
            return res.getObject(j).toString();
       
      }     
      }

      res.close();
      state.close();

    } catch (SQLException e) {
      e.printStackTrace();
      javax.swing.JOptionPane.showMessageDialog(null,"ERREUR");
    }
    return "ERREUR";
}
}
