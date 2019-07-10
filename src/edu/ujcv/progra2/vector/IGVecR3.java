package edu.ujcv.progra2.vector;

import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class IGVecR3 {
    private int x;
    private int y;

    private LectorDeTecladoValidado lt = new LectorDeTecladoValidado();

    public void suma(){
        double x1 = lt.leerEntero("Introduzca el valor x del vector a","Intente de nuevo");
        double y1 = lt.leerEntero("Introduzac el valor x del vector a","Intente de nuevo");
        double z1 = lt.leerEntero("Introduzca el valor z del vector a","intente de nuevo");

        double x2 = lt.leerEntero("Introduzca el valor x del vector b","Intente de nuevo");
        double y2 = lt.leerEntero("Introduzac el valor x del vector b","Intente de nuevo");
        double z2 = lt.leerEntero("Introduzca el valor z del vector b","intente de nuevo");

        double c1 = x1+x2;
        double c2 = y1+y2;
        double c3 = z1+z2;

        System.out.println("el vector A: "+"("+x1+","+y1+","+z1);
        System.out.println("El vector B: "+"("+x2+","+y2+","+z2);
        System.out.println("El resultado es: "+"("+c1+","+c2+","+c3+")");
    }
    public resta(){
        double x1 = lt.leerEntero("Introduzca el valor x del vector a","Intente de nuevo");
        double y1 = lt.leerEntero("Introduzac el valor x del vector a","Intente de nuevo");
        double z1 = lt.leerEntero("Introduzca el valor z del vector a","intente de nuevo");

        double x2 = lt.leerEntero("Introduzca el valor x del vector b","Intente de nuevo");
        double y2 = lt.leerEntero("Introduzac el valor x del vector b","Intente de nuevo");
        double z2 = lt.leerEntero("Introduzca el valor z del vector b","intente de nuevo");

        double c1 = x1-x2;
        double c2 = y1-y2;
        double c3 = z1-z2;

        System.out.println("el vector A: "+"("+x1+","+y1+","+z1);
        System.out.println("El vector B: "+"("+x2+","+y2+","+z2);
        System.out.println("El resultado es: "+"("+c1+","+c2+","+c3+")");
    }
    public prodpunto(){
        double x1 = lt.leerEntero("Introduzca el valor x del vector a","Intente de nuevo");
        double y1 = lt.leerEntero("Introduzac el valor x del vector a","Intente de nuevo");
        double z1 = lt.leerEntero("Introduzca el valor z del vector a","intente de nuevo");

        double x2 = lt.leerEntero("Introduzca el valor x del vector b","Intente de nuevo");
        double y2 = lt.leerEntero("Introduzac el valor x del vector b","Intente de nuevo");
        double z2 = lt.leerEntero("Introduzca el valor z del vector b","intente de nuevo");

        double result1 = x1 * x2;
        double result2 = y1 * y2;
        double result3 = z1 * z2;

        double finalresult = result1+result2+result3;
        System.out.println("el producto punto es: "+finalresult);
    }
    public ProdPorCoeficiente() {
        double x1 = lt.leerEntero("Ingrese el X del vector 1 ", "Intente de nuevo");
        double y1 = lt.leerEntero("Ingrese el Y del vector 1 ", "Intente de nuevo");
        double z1 = lt.leerEntero("Ingrese el Z del vector 1 ", "Intente de nuevo");

        double co = lt.leerEntero("Ingrese el coeficiente ","Intente de nuevo");

        double result1  = x1*co;
        double result2  = y1*co;
        double result3  = z1*co;

        System.out.println("el producto por coeficiente es: "+"("+result1+","+result2+","+result3+")");
    }
}
