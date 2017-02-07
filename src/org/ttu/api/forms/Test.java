/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ttu.api.forms;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nyame Tease
 */
public class Test {
    
    public static void main(String[]args){
        Forms form=new Forms();
        try {
            form.sell("G386R68H", "TTU9H170003", "AMA", "0243348522", "GTBANK");
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
