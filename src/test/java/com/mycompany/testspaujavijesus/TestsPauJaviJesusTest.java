package com.mycompany.testspaujavijesus;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestsPauJaviJesusTest {
 class_test checker = new class_test(0, 0);
 class_test check_positiu = new class_test(0);
    
    /**
     *
     * @author PauVizcaino
     */

@Test
public void sumaEnteros(){
    System.out.println("Suma de enteros");
    int numero = checker.suma(4, 7);
    assertEquals(11,numero);

} 


       /**
     *
     * @author JavierRiscos
     */

@Test
public void checkPositiu() {
  System.out.println("Comprobar si es un numero positiu");
  int numero = check_positiu.positiu(2);
  assertEquals(2,numero);
}



       /**
     *
     * @author JesusAmeller
     */
}

