/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

import controllers.ConvertidorController;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *
 * @author Javier Martínez Ruiz. DAM
 */
public class Convertidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConvertidorController cc = new ConvertidorController();
        System.out.println(cc.euroToDollar(189));
    }
    
}
