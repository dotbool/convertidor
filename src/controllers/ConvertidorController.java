/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *
 * @author Javier Martínez Ruiz. DAM
 */
public class ConvertidorController {
    
    public final BigDecimal EUR_TO_DOLLAR = new BigDecimal(1.08223);
    public final BigDecimal DOLLAR_TO_EUR = new BigDecimal(0.92388);

    public ConvertidorController() {
    
    
    }
    
    
    /**
     * Convierte una cantidad de dólares a euros
     * @param dollars
     * @return 
     */
    public BigDecimal dollarToEuro(double dollars){
        
        BigDecimal dollarsDecimal = new BigDecimal(dollars);
        return dollarsDecimal
                .multiply(DOLLAR_TO_EUR)
                .round(new MathContext(5, RoundingMode.HALF_EVEN));
    
    }
    
    
    /**
     * Convierte euros a dólares
     * @param euros
     * @return 
     */
    public BigDecimal euroToDollar(double euros){
        
        BigDecimal eurosDecimal = new BigDecimal(euros);
        return eurosDecimal.
                multiply(EUR_TO_DOLLAR)
                .round(new MathContext(5, RoundingMode.HALF_EVEN));
        
    }
    
}
