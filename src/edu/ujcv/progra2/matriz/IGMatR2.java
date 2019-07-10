package edu.ujcv.progra2.matriz;
import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class IGMatR2 {

    private double a;
    private double b;
    private double c;
    private LectorDeTecladoValidado lt = new LectorDeTecladoValidado();

    public void suma(){
        double a1 = lt.leerEntero("Ingrese el Numero correspondiente a a1","Intentelo de nuevo");
        double a2 = lt.leerEntero("Ingrese el Numero correspondiente a a2","Intentelo de nuevo");
        double a3 = lt.leerEntero("Ingrese el Numero correspondiente a a3","Intentelo de nuevo");
        double a4 = lt.leerEntero("Ingrese el Numero correspondiente a a4","Intentelo de nuevo");

        double b1 = lt.leerEntero("Ingrese el Numero correspondiente a b1","Intentelo de nuevo");
        double b2 = lt.leerEntero("Ingrese el Numero correspondiente a b2","Intentelo de nuevo");
        double b3 = lt.leerEntero("Ingrese el Numero correspondiente a b3","Intentelo de nuevo");
        double b4 = lt.leerEntero("Ingrese el Numero correspondiente a b4","Intentelo de nuevo");

        double c1 = a1 + b1;
        double c2 = a2 + b2;
        double c3 = a3 + b3;
        double c4 = a4 + b4;

        System.out.println("|"+c1+" "+c3+"|");
        System.out.println("|"+c2+" "+c4+"|");
    }

    public void resta(){
        double a1 = lt.leerEntero("Ingrese el Numero correspondiente a a1","Intentelo de nuevo");
        double a2 = lt.leerEntero("Ingrese el Numero correspondiente a a2","Intentelo de nuevo");
        double a3 = lt.leerEntero("Ingrese el Numero correspondiente a a3","Intentelo de nuevo");
        double a4 = lt.leerEntero("Ingrese el Numero correspondiente a a4","Intentelo de nuevo");

        double b1 = lt.leerEntero("Ingrese el Numero correspondiente a b1","Intentelo de nuevo");
        double b2 = lt.leerEntero("Ingrese el Numero correspondiente a b2","Intentelo de nuevo");
        double b3 = lt.leerEntero("Ingrese el Numero correspondiente a b3","Intentelo de nuevo");
        double b4 = lt.leerEntero("Ingrese el Numero correspondiente a b4","Intentelo de nuevo");

        double c1 = a1 - b1;
        double c2 = a2 - b2;
        double c3 = a3 - b3;
        double c4 = a4 - b4;

        System.out.println("|"+c1+" "+c3+"|");
        System.out.println("|"+c2+" "+c4+"|");
    }
    public void multiplicacion(){
        double a1 = lt.leerEntero("Ingrese el Numero correspondiente a a1","Intentelo de nuevo");
        double a2 = lt.leerEntero("Ingrese el Numero correspondiente a a2","Intentelo de nuevo");
        double a3 = lt.leerEntero("Ingrese el Numero correspondiente a a3","Intentelo de nuevo");
        double a4 = lt.leerEntero("Ingrese el Numero correspondiente a a4","Intentelo de nuevo");

        double b1 = lt.leerEntero("Ingrese el Numero correspondiente a b1","Intentelo de nuevo");
        double b2 = lt.leerEntero("Ingrese el Numero correspondiente a b2","Intentelo de nuevo");
        double b3 = lt.leerEntero("Ingrese el Numero correspondiente a b3","Intentelo de nuevo");
        double b4 = lt.leerEntero("Ingrese el Numero correspondiente a b4","Intentelo de nuevo");

        double c1 = (a1*b1+a2*b3);
        double c2 = (a3*b1+a4*b3);
        double c3 = (a1*b2+a2*b4);
        double c4 = (a3*b2+a4*b4);

        System.out.println("|"+c1+" "+c3+"|");
        System.out.println("|"+c2+" "+c4+"|");
    }
    public void escalar(){
        double a1 = lt.leerEntero("Ingrese el Numero correspondiente a a1","Intentelo de nuevo");
        double a2 = lt.leerEntero("Ingrese el Numero correspondiente a a2","Intentelo de nuevo");
        double a3 = lt.leerEntero("Ingrese el Numero correspondiente a a3","Intentelo de nuevo");
        double a4 = lt.leerEntero("Ingrese el Numero correspondiente a a4","Intentelo de nuevo");

        double Escalar = lt.leerEntero("Ingrese el Escalar: ","Intentelo de nuevo");

        double b1 = Escalar*a1;
        double b2 = Escalar*a2;
        double b3 = Escalar*a3;
        double b4 = Escalar*a4;

        System.out.println("|"+b1+" "+b3+"|");
        System.out.println("|"+b2+" "+b4+"|");
    }
    public void MatrizRotacion(){
        double x = lt.leerEntero("Ingrese el valor del Vector X","Intentelo de nuevo");
        double y = lt.leerEntero("Ingrese el valor del Vector Y","Intentelo de nuevo");

        double grados = lt.leerFlotante("Ingrese el valor del angulo","Intentelo de nuevo");

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

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}