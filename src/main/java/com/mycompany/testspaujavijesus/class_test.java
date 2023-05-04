package com.mycompany.testspaujavijesus;

public class class_test {
   
    private int num1;
    private int num2;

    public class_test(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }

    public int suma(int Nombre1, int Nombre2) {
        int x;
        x = Nombre1 + Nombre2;
        return x;
    }

    public int resta(int Nombre1, int Nombre2) {
        int x;
        int aux;
        if (Nombre2 > Nombre1) {
            aux = Nombre1;
            Nombre1 = Nombre2;
            Nombre2 = aux;
        }
        x = Nombre1 - Nombre2;
        return x;
    }

    public boolean positiu(int Nombre) {
        return Nombre > 0;
    }
}