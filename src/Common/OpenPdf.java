/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author TOMMOGO
 */
public class OpenPdf {
    public static void OpenById(String BillID){
        try{
            if((new File("E:\\"+BillID+".pdf")).exists()){
                Process p=Runtime
                        .getRuntime()
                        .exec("rund1132 url.dll,FileProtocolHandler E:\\"+BillID+".pdf");
            }
            else
                JOptionPane.showMessageDialog(null, "File Does not Exists");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
