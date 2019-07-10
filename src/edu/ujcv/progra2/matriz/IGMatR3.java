package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class IGMatR3 {
    private double a;
    private double b;
    private double c;

    private LectorDeTecladoValidado lt = new LectorDeTecladoValidado();

    public void SumarMatriz(){
        double a1 = lt.leerEntero("Ingrese el numero de a1","Ingrese un numero Entero");
        double a2 = lt.leerEntero("Ingrese el numero de a2","Ingrese un numero Entero");
        double a3 = lt.leerEntero("Ingrese el numero de a3","Ingrese un numero Entero");
        double a4 = lt.leerEntero("Ingrese el numero de a4","Ingrese un numero Entero");
        double a5 = lt.leerEntero("Ingrese el numero de a5","Ingrese un numero Entero");
        double a6 = lt.leerEntero("Ingrese el numero de a6","Ingrese un numero Entero");
        double a7 = lt.leerEntero("Ingrese el numero de a7","Ingrese un numero Entero");
        double a8 = lt.leerEntero("Ingrese el numero de a8","Ingrese un numero Entero");
        double a9 = lt.leerEntero("Ingrese el numero de a9","Ingrese un numero Entero");

        double b1 = lt.leerEntero("Ingrese el numero de b1","Ingrese un numero Entero");
        double b2 = lt.leerEntero("Ingrese el numero de b2","Ingrese un numero Entero");
        double b3 = lt.leerEntero("Ingrese el numero de b3","Ingrese un numero Entero");
        double b4 = lt.leerEntero("Ingrese el numero de b4","Ingrese un numero Entero");
        double b5 = lt.leerEntero("Ingrese el numero de b5","Ingrese un numero Entero");
        double b6 = lt.leerEntero("Ingrese el numero de b6","Ingrese un numero Entero");
        double b7 = lt.leerEntero("Ingrese el numero de b7","Ingrese un numero Entero");
        double b8 = lt.leerEntero("Ingrese el numero de b8","Ingrese un numero Entero");
        double b9 = lt.leerEntero("Ingrese el numero de b9","Ingrese un numero Entero");

        double c1 = a1+b1;
        double c2 = a2+b2;
        double c3 = a3+b3;
        double c4 = a4+b4;
        double c5 = a5+b5;
        double c6 = a6+b6;
        double c7 = a7+b7;
        double c8 = a8+b8;
        double c9 = a9+b9;


        System.out.println("|"+c1+" "+c2+" "+c3+"|");
        System.out.println("|"+c4+" "+c5+" "+c6+"|");
        System.out.println("|"+c7+" "+c8+" "+c9+"|");
    }
    public void RestaMatriz(){
        double a1 = lt.leerEntero("Ingrese el numero de a1","Ingrese un numero Entero");
        double a2 = lt.leerEntero("Ingrese el numero de a2","Ingrese un numero Entero");
        double a3 = lt.leerEntero("Ingrese el numero de a3","Ingrese un numero Entero");
        double a4 = lt.leerEntero("Ingrese el numero de a4","Ingrese un numero Entero");
        double a5 = lt.leerEntero("Ingrese el numero de a5","Ingrese un numero Entero");
        double a6 = lt.leerEntero("Ingrese el numero de a6","Ingrese un numero Entero");
        double a7 = lt.leerEntero("Ingrese el numero de a7","Ingrese un numero Entero");
        double a8 = lt.leerEntero("Ingrese el numero de a8","Ingrese un numero Entero");
        double a9 = lt.leerEntero("Ingrese el numero de a9","Ingrese un numero Entero");

        double b1 = lt.leerEntero("Ingrese el numero de b1","Ingrese un numero Entero");
        double b2 = lt.leerEntero("Ingrese el numero de b2","Ingrese un numero Entero");
        double b3 = lt.leerEntero("Ingrese el numero de b3","Ingrese un numero Entero");
        double b4 = lt.leerEntero("Ingrese el numero de b4","Ingrese un numero Entero");
        double b5 = lt.leerEntero("Ingrese el numero de b5","Ingrese un numero Entero");
        double b6 = lt.leerEntero("Ingrese el numero de b6","Ingrese un numero Entero");
        double b7 = lt.leerEntero("Ingrese el numero de b7","Ingrese un numero Entero");
        double b8 = lt.leerEntero("Ingrese el numero de b8","Ingrese un numero Entero");
        double b9 = lt.leerEntero("Ingrese el numero de b9","Ingrese un numero Entero");

        double c1 = a1-b1;
        double c2 = a2-b2;
        double c3 = a3-b3;
        double c4 = a4-b4;
        double c5 = a5-b5;
        double c6 = a6-b6;
        double c7 = a7-b7;
        double c8 = a8-b8;
        double c9 = a9-b9;


        System.out.println("|"+c1+" "+c2+" "+c3+"|");
        System.out.println("|"+c4+" "+c5+" "+c6+"|");
        System.out.println("|"+c7+" "+c8+" "+c9+"|");
    }

    public void multiplicar(){
        double a1 = lt.leerEntero("Favor ingresar el numero a1","ingrese un entero");
        double a2 = lt.leerEntero("Favor ingresar el numero a2","ingrese un entero");
        double a3 = lt.leerEntero("Favor ingresar el numero a3","ingrese un entero");
        double a4 = lt.leerEntero("Favor ingresar el numero a4","ingrese un entero");
        double a5 = lt.leerEntero("Favor ingresar el numero a5","ingrese un entero");
        double a6 = lt.leerEntero("Favor ingresar el numero a6","ingrese un entero");
        double a7 = lt.leerEntero("Favor ingresar el numero a7","ingrese un entero");
        double a8 = lt.leerEntero("Favor ingresar el numero a8","ingrese un entero");
        double a9 = lt.leerEntero("Favor ingresar el numero a9","ingrese un entero");

        double b1 = lt.leerEntero("Favor ingresar el numero b1","ingrese un entero");
        double b2 = lt.leerEntero("Favor ingresar el numero b2","ingrese un entero");
        double b3 = lt.leerEntero("Favor ingresar el numero b3","ingrese un entero");
        double b4 = lt.leerEntero("Favor ingresar el numero b4","ingrese un entero");
        double b5 = lt.leerEntero("Favor ingresar el numero b5","ingrese un entero");
        double b6 = lt.leerEntero("Favor ingresar el numero b6","ingrese un entero");
        double b7 = lt.leerEntero("Favor ingresar el numero b7","ingrese un entero");
        double b8 = lt.leerEntero("Favor ingresar el numero b8","ingrese un entero");
        double b9 = lt.leerEntero("Favor ingresar el numero b9","ingrese un entero");

        double c1 = a1*b1+a2*b4+a3*b7;
        double c2 = a1*b2+a2*b5+b3*b8;
        double c3 = a1*b3+a2*b6+a3*b9;
        double c4 = a4*b1+a5*b4+a6*b7;
        double c5 = a4*b2+a5*b5+a6*b8;
        double c6 = a4*b3+a5*b6+a6*b6;
        double c7 = a7*b1+a8*b4+a9*b7;
        double c8 = a7*b2+a8*b5+a9*b8;
        double c9 = a7*b3+a8*b6+a9*b9;

        System.out.println("|"+c1+" "+c2+" "+c3+"|");
        System.out.println("|"+c4+" "+c5+" "+c6+"|");
        System.out.println("|"+c7+" "+c8+" "+c9+"|");

    }

    public void matrizXescalar(){
        double a1 = lt.leerEntero("Favor ingresar el numero a1","ingrese un entero");
        double a2 = lt.leerEntero("Favor ingresar el numero a2","ingrese un entero");
        double a3 = lt.leerEntero("Favor ingresar el numero a3","ingrese un entero");
        double a4 = lt.leerEntero("Favor ingresar el numero a4","ingrese un entero");
        double a5 = lt.leerEntero("Favor ingresar el numero a5","ingrese un entero");
        double a6 = lt.leerEntero("Favor ingresar el numero a6","ingrese un entero");
        double a7 = lt.leerEntero("Favor ingresar el numero a7","ingrese un entero");
        double a8 = lt.leerEntero("Favor ingresar el numero a8","ingrese un entero");
        double a9 = lt.leerEntero("Favor ingresar el numero a9","ingrese un entero");

        double Escalar = lt.leerEntero("Favor ingrese el escalar","Favor Intente de nuevo");

        double c1 = Escalar*a1;
        double c2 = Escalar*a2;
        double c3 = Escalar*a3;
        double c4 = Escalar*a4;
        double c5 = Escalar*a5;
        double c6 = Escalar*a6;
        double c7 = Escalar*a7;
        double c8 = Escalar*a8;
        double c9 = Escalar*a9;

        System.out.println("|"+c1+" "+c2+" "+c3+"|");
        System.out.println("|"+c4+" "+c5+" "+c6+"|");
        System.out.println("|"+c7+" "+c8+" "+c9+"|");
    }

    public void MatrizRotacion(){
        double grados = lt.leerFlotante("Favor ingrese los grados","Intente de nuevo");

        double a1 = lt.leerEntero("Favor ingresar el numero a1","ingrese un entero");
        double a2 = lt.leerEntero("Favor ingresar el numero a2","ingrese un entero");
        double a3 = lt.leerEntero("Favor ingresar el numero a3","ingrese un entero");

        //Rx
        double Rx1 = 1;
        double Rx2 = 0;
        double Rx3 = 0;

        double Rx4 = 0;
        double Rx5 = Math.cos(grados);
        double Rx6 = Math.sin(grados);

        double Rx7 = 0;
        double Rx8 = Math.sin(grados);
        double Rx9 = Math.cos(grados);

        //Ry
        double Ry1 = Math.cos(grados);
        double Ry2 = 0;
        double Ry3 = Math.sin(grados);

        double Ry4 = 0;
        double Ry5 = 1;
        double Ry6 = 0;

        double Ry7 = Math.sin(grados);
        double Ry8 = 0;
        double Ry9 = Math.cos(grados);

        //Rz
        double Rz1 = Math.cos(grados);
        double Rz2 = 0;
        double Rz3 = Math.sin(grados);

        double Rz4 = Math.sin(grados);
        double Rz5 = Math.cos(grados);
        double Rz6 = 0;

        double Rz7 = 0;
        double Rz8 = 0;
        double Rz9 = 1;

        // Matriz Rotacion en Referencia a X
        double ARx = Rx1*a1 + Rx2*a2 + Rx3*a3;
        double BRx = Rx4*a1 + Rx5*a2 + (-Rx6*a3);
        double CRx = Rx7*a1 + Rx8*a2 + Rx9*a3;

        //Matriz Rotacion en Referencia a Y
        double ARy = Ry1*a1 + Ry2*a2 + Ry3*a3;
        double BRy = Ry4*a1 + Ry5*a2 + (-Ry6*a3);
        double CRy = Ry7*a1 + Ry8*a2 + Ry9*a3;

        //Matriz Rotacion en Referencia a Z
        double ARz = Rz1*a1 + Rz2*a2 + Rz3*a3;
        double BRz = Rz4*a1 + Rz5*a2 + Rz6*a3;
        double CRz = Rz7*a1 + Rz8*a2 + Rz9*a3;


        System.out.println("La Matriz Rotacion de X: ");
        System.out.println("|"+ARx+" "+BRx+" "+CRx+"|");
        System.out.println("La Matriz Rotacion de Y:");
        System.out.println("|"+ARy+" "+BRy+" "+BRz+"|");
        System.out.println("La Matriz Rotacion de Z:");
        System.out.println("|"+ARz+" "+BRz+" "+CRz+"|");
    }
    public void VecXMat(){
        double x = lt.leerEntero("Ingrese el valor 'x' del vector A","Intente de nuevo");
        double y = lt.leerEntero("Ingrese el valor 'y' del vector A","Intente de nuevo");
        double z = lt.leerEntero("ingrese el valor z del vector A","Intente de nuevo");

        double a1 = lt.leerEntero("Ingrese el valor A1 de la matriz","Intente de nuevo");
        double a2 = lt.leerEntero("Ingrese el valor A2 de la Matriz","Intente de nuevo ");
        double a3 = lt.leerEntero("Ingrese el valor A3 de la matriz","Intente de nuevo");
        double a4 = lt.leerEntero("Ingrese el valor A4 de la matriz","Intente de nuevo ");
        double a5 = lt.leerEntero("Favor ingresar el numero a5","ingrese un entero");
        double a6 = lt.leerEntero("Favor ingresar el numero a6","ingrese un entero");
        double a7 = lt.leerEntero("Favor ingresar el numero a7","ingrese un entero");
        double a8 = lt.leerEntero("Favor ingresar el numero a8","ingrese un entero");
        double a9 = lt.leerEntero("Favor ingresar el numero a9","ingrese un entero");

        double total1= x*a1 + y*a2 +z*a3;
        double total2 = x*a4 + y*a5 +z*a6;
        double total3 = x*a7 + y*a8 + z*a9;

        double total = total1+total2+total3;
        System.out.println("El total es: "+total);
    }
}


