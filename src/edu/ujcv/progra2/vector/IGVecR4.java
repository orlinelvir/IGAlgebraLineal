package edu.ujcv.progra2.vector;

import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class IGVecR4 {
    private double x;
    private double y;
    private double z;
    private double w;

    {

        private LectorDeTecladoValidado lt = new LectorDeTecladoValidado();

        public  suma(){
        double x1 = lt.leerEntero("Ingrese el X del vector 1 ","Intente de nuevo");
        double y1 = lt.leerEntero("Ingrese el Y del vector 1 ","Intente de nuevo");
        double z1 = lt.leerEntero("Ingrese el Z del vector 1 ","Intente de nuevo");
        double w1 = lt.leerEntero("Ingrese el W del vector 1 ","Intente de nuevo");

        double x2 = lt.leerEntero("Ingrese el X del vector 2 ","Intente de nuevo");
        double y2 = lt.leerEntero("Ingrese el Y del vector 2 ","Intente de nuevo");
        double z2 = lt.leerEntero("Ingrese el Z del vector 2 ","Intente de nuevo");
        double w2 = lt.leerEntero("Ingrese el W del vector 2 ","Intente de nuevo");

        double a1 = x1+x2;
        double a2 = y1+y2;
        double a3 = z1+z2;
        double a4 = w1+w2;

        System.out.println("el Vector resultado es: "+"("+a1+","+a2+","+a3+","+a4+")");
    }

        public void resta(){
        double x1 = lt.leerEntero("Ingrese el X del vector 1 ","Intente de nuevo");
        double y1 = lt.leerEntero("Ingrese el Y del vector 1 ","Intente de nuevo");
        double z1 = lt.leerEntero("Ingrese el Z del vector 1 ","Intente de nuevo");
        double w1 = lt.leerEntero("Ingrese el W del vector 1 ","Intente de nuevo");

        double x2 = lt.leerEntero("Ingrese el X del vector 2 ","Intente de nuevo");
        double y2 = lt.leerEntero("Ingrese el Y del vector 2 ","Intente de nuevo");
        double z2 = lt.leerEntero("Ingrese el Z del vector 2 ","Intente de nuevo");
        double w2 = lt.leerEntero("Ingrese el W del vector 2 ","Intente de nuevo");

        double a1 = x2-x1;
        double a2 = y2-y1;
        double a3 = z2-z1;
        double a4 = w2-w1;

        System.out.println("el Vector resultado es: "+"("+a1+","+a2+","+a3+","+a4+")");
    }

        public ProdPunto(){
        double x1 = lt.leerEntero("Ingrese el X del vector 1 ","Intente de nuevo");
        double y1 = lt.leerEntero("Ingrese el Y del vector 1 ","Intente de nuevo");
        double z1 = lt.leerEntero("Ingrese el Z del vector 1 ","Intente de nuevo");
        double w1 = lt.leerEntero("Ingrese el W del vector 1 ","Intente de nuevo");

        double x2 = lt.leerEntero("Ingrese el X del vector 2 ","Intente de nuevo");
        double y2 = lt.leerEntero("Ingrese el Y del vector 2 ","Intente de nuevo");
        double z2 = lt.leerEntero("Ingrese el Z del vector 2 ","Intente de nuevo");
        double w2 = lt.leerEntero("Ingrese el W del vector 2 ","Intente de nuevo");

        double result1 = x1 * x2;
        double result2 = y1 * y2;
        double result3 = z1 * z2;
        double result4 = w1 * w2;

        double TotalResult = result1+result2+result3+result4;

        System.out.println("El producto punto es: "+TotalResult);
    }

        public ProdPorCoeficiente(){
        double x1 = lt.leerEntero("Ingrese el X del vector 1 ","Intente de nuevo");
        double y1 = lt.leerEntero("Ingrese el Y del vector 1 ","Intente de nuevo");
        double z1 = lt.leerEntero("Ingrese el Z del vector 1 ","Intente de nuevo");
        double w1 = lt.leerEntero("Ingrese el W del vector 1 ","Intente de nuevo");

        double coe = lt.leerEntero("Ingrese el coeficiente","Intente de nuevo");

        double res1 = x1*coe;
        double res2 = y1*coe;
        double res3 = z1*coe;
        double res4 = w1*coe;

        System.out.println("El producto por coeficiente es: "+"("+res1+","+res2+","+res3+","+","+res4+")");
    }
    }
