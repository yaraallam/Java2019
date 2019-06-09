/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modèle;

import static Vue.Interface.connecterDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author cha
 */
public class modifier
{

  public void supprimer(String query)
  {
    try
    {
     
      Connection conn = connecterDB();
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      javax.swing.JOptionPane.showMessageDialog(null,"ESuppression faite !");
     

      // execute the preparedstatement
      preparedStmt.execute();
      
      conn.close();
    }
    catch (Exception e)
    {
      javax.swing.JOptionPane.showMessageDialog(null,"ERREUR");
    }

  }
  
  public void modifier(String query)
  {
    try
    {
     
      Connection conn1 = connecterDB();
      PreparedStatement preparedStmt = conn1.prepareStatement(query);
      javax.swing.JOptionPane.showMessageDialog(null,"Modifications faites !");
     

      // execute the preparedstatement
      preparedStmt.execute();
      
      conn1.close();
    }
    catch (Exception ee)
    {
      javax.swing.JOptionPane.showMessageDialog(null,"ERREUR");
    }

  }
}