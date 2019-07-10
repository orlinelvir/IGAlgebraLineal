package edu.ujcv.progra2.vector;
import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class IGVecR2 {

    private int x;
    private int y;

    private LectorDeTecladoValidado lt = new LectorDeTecladoValidado();

    public void sumar() {
        double X1 = lt.leerEntero("Ingrese el valor de 'X' para el Vector A", "Intentelo de nuevo");
        double Y1 = lt.leerEntero("Ingrese el valor de 'Y' para el vector A", "Intentelo de nuevo");

        double X2 = lt.leerEntero("Ingrese el valor de 'X' para el Vector B", "Intentelo de nuevo");
        double Y2 = lt.leerEntero("Ingrese el valor de 'Y' para el Vector B", "Intentelo de nuevo");

        double resultX = X1 + X2;
        double resultY = Y1 + Y2;

        System.out.println("El Vector A es: " + "(" + X1 + "," + Y1 + ")");
        System.out.println("El Vector B es: " + "(" + X2 + "," + Y2 + ")");
        System.out.println("El Vector C es: " + "(" + resultX + "," + resultY + ")");
    }

    public void restar() {
        double X1 = lt.leerEntero("Ingrese el valor de 'X' para el Vector A", "Intentelo de nuevo");
        double Y1 = lt.leerEntero("Ingrese el valor de 'Y' para el Vector A", "Intentelo de nuevo");

        double X2 = lt.leerEntero("Ingrese el valor de 'X' para el Vector B", "Intentelo de nuevo");
        double Y2 = lt.leerEntero("Ingrese el valor de 'Y' para el Vector B", "Intentelo de nuevo");

        double resultX = X2 - X1;
        double resultY = Y2 - Y1;

        System.out.println("El vector A es: " + "(" + X1 + "," + Y1 + ")");
        System.out.println("El vector B es: " + "(" + X2 + "," + Y2 + ")");

        System.out.println("El Vector C es: " + "(" + resultX + "," + resultY + ")");

    }

    public void ProdPunto() {
        double X1 = lt.leerEntero("Ingrese el valor de 'X' para el Vector A", "Intentelo de nuevo");
        double Y1 = lt.leerEntero("Ingrese el valor de 'Y' para el Vector A", "Intentelo de nuevo");

        double X2 = lt.leerEntero("Ingrese el valor de 'X' para el Vector B", "Intentelo de nuevo");
        double Y2 = lt.leerEntero("Ingrese el valor de 'Y' para el Vector B", "Intentelo de nuevo");

        double result = X1 * X2;
        double result2 = Y1 * Y2;
        double total = result + result2;

        System.out.println("El Vector A es: " + "(" + X1 + "," + Y1 + ")");
        System.out.println("El Vector B es: " + "(" + X2 + "," + Y2 + ")");
        System.out.println("El Producto Punto es: " + total);
    }

    public void ProdCoeficiente() {
        double X1 = lt.leerEntero("Ingrese el valor de 'X' para el Vector A", "Intentelo de nuevo");
        double Y1 = lt.leerEntero("Ingrese el valor de 'Y' para el Vector A", "Intentelo de nuevo");

        double k = lt.leerEntero("Ingrese el coeficiente", "Intentelo de nuevo");

        System.out.println("El Vector es: " + "(" + X1 + "," + Y1 + ")");

        double totalX = k * X1;
        double totalY = k * Y1;

        System.out.println(" El Coeficiente es: " + "(" + totalX + "," + totalY + ")3");
    }

    public void ProdCruz() {
        double A1 = lt.leerEntero("Ingrese el valor de 'A1' para el vector A", "Intentelo de nuevo");
        double A2 = lt.leerEntero("Ingrese el valor de 'A2' para el vector A", "Intentelo de nuevo");
        double A3 = lt.leerEntero("Ingrese el valor de 'A3' para el vector A", "Intentelo de nuevo");

        double B1 = lt.leerEntero("Ingrese el valor de 'B1' para el vector B", "Intentelo de nuevo");
        double B2 = lt.leerEntero("Ingrese el valor de 'B2' para el vector B", "Intentelo de nuevo");
        double B3 = lt.leerEntero("Ingrese el valor de 'B3' para el vector B", "Intentelo de nuevo");

        double c1 = A2 * B3 + A3 * B2;
        double c2 = A3 * B1 + B1 * A3;
        double c3 = A1 * B2;

        System.out.println("(" + "i" + c1 + "," + "j" + c2 + "," + "k" + c3 + ")");
    }

    public void VecXMat() {
        double x = lt.leerEntero("Ingrese el valor de 'X' para el Vector A", "Intentelo de nuevo");
        double y = lt.leerEntero("Ingrese el valor de 'Y' para el Vector A", "Intentelo de nuevo");

        double a1 = lt.leerEntero("Ingrese el valor A1 de la matriz", "Intentelo de nuevo");
        double a2 = lt.leerEntero("Ingrese el valor A2 de la Matriz", "Intentelo de nuevo");
        double a3 = lt.leerEntero("Ingrese el valor A3 de la matriz", "Intentelo de nuevo");
        double a4 = lt.leerEntero("Ingrese el valor A4 de la matriz", "Intentelo de nuevo");

        double total1 = x * a1 + y * a2;
        double total2 = x * a3 + y * a4;

        double total = total1 + total2;
        System.out.println("El Total es: " + total);
    }
}