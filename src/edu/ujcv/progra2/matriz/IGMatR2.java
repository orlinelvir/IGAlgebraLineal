package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class IGMatR2 {
    // TODO: implementar.

    //double x1,y1;
    //double x2,y2;


    // double[][] m;

    //IGVecR2 f1;
    //IGVecR2 f2;

    //IGVecR2 col1;
    //IGVecR2 col2;
    double a;
    double b;
    double c;
    LectorDeTecladoValidado lt = new LectorDeTecladoValidado();

    public suma(){
        double a1 = lt.leerEntero("favor ingresar el numero a1","Favor intentar de nuevo");
        double a2 = lt.leerEntero("Favor ingresar el numero a2","Favor intentar de nuevo");
        double a3 = lt.leerEntero("favor ingresar el numero a3","Favor intentar de nuevo");
        double a4 = lt.leerEntero("favor ingresar el numero a4", "Favor intentar de nuevo");

        double b1 = lt.leerEntero("favor ingresar el numero b1","Favor intentar de nuevo");
        double b2 = lt.leerEntero("Favor ingresar el numero b2","Favor intentar de nuevo");
        double b3 = lt.leerEntero("favor ingresar el numero b3","Favor intentar de nuevo");
        double b4 = lt.leerEntero("favor ingresar el numero b4", "Favor intentar de nuevo");

        double c1 = a1 + b1;
        double c2 = a2 + b2;
        double c3 = a3 + b3;
        double c4 = a4 + b4;

        System.out.println("|"+c1+" "+c3+"|");
        System.out.println("|"+c2+" "+c4+"|");
    }

    public resta(){
        double a1 = lt.leerEntero("favor ingresar el numero a1","Favor intentar de nuevo");
        double a2 = lt.leerEntero("Favor ingresar el numero a2","Favor intentar de nuevo");
        double a3 = lt.leerEntero("favor ingresar el numero a3","Favor intentar de nuevo");
        double a4 = lt.leerEntero("favor ingresar el numero a4", "Favor intentar de nuevo");

        double b1 = lt.leerEntero("favor ingresar el numero b1","Favor intentar de nuevo");
        double b2 = lt.leerEntero("Favor ingresar el numero b2","Favor intentar de nuevo");
        double b3 = lt.leerEntero("favor ingresar el numero b3","Favor intentar de nuevo");
        double b4 = lt.leerEntero("favor ingresar el numero b4", "Favor intentar de nuevo");

        double c1 = a1 - b1;
        double c3 = a3 - b3;
        double c4 = a4 - b4;

        System.out.println("|"+c1+" "+c3+"|");
        System.out.println("|"+c2+" "+c4+"|");
    }
    public multiplicacion(){
        double a1 = lt.leerEntero("favor ingresar el numero a1","Favor intentar de nuevo");
        double a2 = lt.leerEntero("Favor ingresar el numero a2","Favor intentar de nuevo");
        double a3 = lt.leerEntero("favor ingresar el numero a3","Favor intentar de nuevo");
        double a4 = lt.leerEntero("favor ingresar el numero a4", "Favor intentar de nuevo");

        double b1 = lt.leerEntero("favor ingresar el numero b1","Favor intentar de nuevo");
        double b2 = lt.leerEntero("Favor ingresar el numero b2","Favor intentar de nuevo");
        double b3 = lt.leerEntero("favor ingresar el numero b3","Favor intentar de nuevo");
        double b4 = lt.leerEntero("favor ingresar el numero b4", "Favor intentar de nuevo");

        double c1 = (a1*b1+a2*b3);
        double c2 = (a3*b1+a4*b3);
        double c3 = (a1*b2+a2*b4);
        double c4 = (a3*b2+a4*b4);

        System.out.println("|"+c1+" "+c3+"|");
        System.out.println("|"+c2+" "+c4+"|");
    }
    public escalar(){
        double a1 = lt.leerEntero("favor ingresar el numero a1","Favor intentar de nuevo");
        double a2 = lt.leerEntero("Favor ingresar el numero a2","Favor intentar de nuevo");
        double a3 = lt.leerEntero("favor ingresar el numero a3","Favor intentar de nuevo");
        double a4 = lt.leerEntero("favor ingresar el numero a4", "Favor intentar de nuevo");

        double Escalar = lt.leerEntero("Favor ingrese el escalar","Favor intente de nuevo");

        double b1 = Escalar*a1;
        double b2 = Escalar*a2;
        double b3 = Escalar*a3;
        double b4 = Escalar*a4;

        System.out.println("|"+b1+" "+b3+"|");
        System.out.println("|"+b2+" "+b4+"|");
    }
    public MatrizRotacion(){
        double x = lt.leerEntero("ingrese el valor x del vector","intente de nuevo");
        double y = lt.leerEntero("ingrese el valor y del vector","intente de nuevo");

        double grados = lt.leerFlotante("Ingrese el angulo","intente de nuevo");

        double a1 = Math.cos(grados);
        double a2 = Math.sin(grados);
        double a3 = Math.sin(grados);
        double a4 = Math.cos(grados);

        System.out.println("la matriz rotacion es:");
        System.out.println("|"+a1+" "+a2+"|");
        System.out.println("|"+a3+" "+a4+"|");

        System.out.println("La matriz del vector es: ");
        System.out.println("|"+x+" "+y+"|");

        double b1 = a1 * x + (-a2 * y);
        double b2 = a3 * x + a4 * y;

        System.out.println("El total es: ");
        System.out.println("|"+b1+" "+b2+"|");
    }

    public double getA() {
        return a;
    }

    public setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public IGMatR2() {
        this.c = c;
    }

}