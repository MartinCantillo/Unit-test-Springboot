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
    
    Calculadora Calculadora;
    
    @BeforeEach
    public void init(){
        Calculadora =new Calculadora();
        System.out.println("inicializando");
    }
    @Test//para que lo reconozca como test Junit 
    public void testSuma(){
        //Valor esperado
        double esperado=25;
        //valor obtenido
        double obtenido=Calculadora.sumar(5.0, 20.0);
        //comparar esperado vs obtenido
        //assert de Junit para comparar
        Assertions.assertEquals(esperado, obtenido);
        
        
    }
    
     @Test
    public void testResta(){

        Assertions.assertEquals(50, Calculadora.restar(100.0, 50.0));
        //
        
    }
    
     @Test
    public void testMultiplicacion(){

        Assertions.assertEquals(10, Calculadora.multiplicar(2.0, 5.0));
        //
        
    }
      @Test
    public void testDivicion(){

        Assertions.assertEquals(2, Calculadora.dividir(4.0, 2.0));
        //
        
    }
    
    //inicializar el metodo calculadora en cada metodo es redundante para eso creo el objeto general y creo un metodo
    //para que lo inicie antes de cada metodo para eso se le coloca la anotacion beforeeach
}
