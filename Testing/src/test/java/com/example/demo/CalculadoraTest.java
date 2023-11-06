/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;


import org.junit.jupiter.api.*;

/**
 *
 * @author marti
 */
public class CalculadoraTest {
    
    @Test//para que lo reconozca como test Junit 
    public void testSuma(){
        //Valor esperado
        double esperado=25;
        var Calculadora =new Calculadora();
        //valor obtenido
        double obtenido=Calculadora.sumar(5.0, 10.0);
        //comparar esperado vs obtenido
        //assert de Junit para comparar
        Assertions.assertEquals(esperado, obtenido);
        
        
    }
}
