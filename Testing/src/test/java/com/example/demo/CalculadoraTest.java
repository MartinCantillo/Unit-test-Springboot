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
    
    //inicialzador global (Cuando la clase arranca se ejecuta el test ese primero), ademas tiene que ser static porque es de la clase
    @BeforeAll
    public static void startup(){
        System.out.println("Inicializacion global---------");
    }

      //inicializar el metodo calculadora en cada metodo es redundante para eso creo el objeto general y creo un metodo
    //para que lo inicie antes de cada metodo para eso se le coloca la anotacion beforeeach
    @BeforeEach
    public void init() {
        Calculadora = new Calculadora();
        System.out.println("inicializando");
    }

    @Test//para que lo reconozca como test Junit 
    public void testSuma() {
        //Valor esperado
        double esperado = 25;
        //valor obtenido
        double obtenido = Calculadora.sumar(5.0, 20.0);
        //comparar esperado vs obtenido
        //assert de Junit para comparar
        Assertions.assertEquals(esperado, obtenido);
        System.out.println("testeando suma");

    }

    @Test
    @DisplayName("TestRestaDisplay") //para cambiarle el nombre del test
    public void testResta() {

        Assertions.assertEquals(50, Calculadora.restar(100.0, 50.0));
        System.out.println("testeando resta");

    }

    @Test
    @Disabled("Deshabilitar text")//deshabilitar test
    public void testMultiplicacion() {

        Assertions.assertEquals(10, Calculadora.multiplicar(2.0, 5.0));
        System.out.println("testeando testMultiplicacion");

    }

    @Test
    public void testDivicion() {

        Assertions.assertEquals(2, Calculadora.dividir(4.0, 2.0));
        System.out.println("testDivicion");

    }

    //ahora para cerrar despues de cada test , esto es bueno para cuando se maneja con bd para limpiar tablas, cerrar 
    //conexiones a bd, preparar la ejecucion del test sgt , 
    
     @AfterEach
    public void showTest() {
        System.out.println("Finalizando Test");
    }
  
    @AfterAll //para finalizaciond de la clase 
    public static void destroy(){
        System.out.println("finalizacion global---------");
    }
}
