package com.example.practicas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class practicas1 {

    public static void main(String[] args) {
        int NUM1, NUM2;
        int  SUMA, RES, MUL, DIV;
        //Tipo de datos primitivos
        byte variableByte = 10;
        char variableChar = 'A';
        short variableShort = 15; int variableint =20; long variableLong =25;
        float variableFloat=1.0f; double variableDouble = 1.0; boolean varaibleboolean= true;
        System.out.println(variableByte);
        System.out.println(variableChar);
        System.out.println(variableShort);
        System.out.println(variableint);
        System.out.println(variableLong);
        System.out.println(variableFloat);
        System.out.println(variableDouble);
        System.out.println(varaibleboolean);
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESO EL PRIMER NUEMRO");
         NUM1=scanner.nextInt();
        System.out.println("INGRESO EL SEGUNDO NUMERO");
         NUM2=scanner.nextInt();
         SUMA=NUM1+NUM2; RES=NUM1-NUM2;
         MUL=NUM1*NUM2; DIV=NUM1/NUM2;
         System.out.println("LA SUMA ES=" +SUMA);
        System.out.println("LA RESTA ES=" + RES);
        System.out.println("LA MULTIPLICACION ES=" +MUL);
        System.out.println("LA DIVISION ES=" +DIV);


    }

}
