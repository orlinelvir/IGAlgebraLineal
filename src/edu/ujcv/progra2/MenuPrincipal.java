package edu.ujcv.progra2;
import edu.ujcv.progra2.matriz.IGMatR2;
import edu.ujcv.progra2.matriz.IGMatR3;
import edu.ujcv.progra2.matriz.IGMatR4;
import edu.ujcv.progra2.utility.LectorDeTecladoValidado;
import edu.ujcv.progra2.vector.IGVecR2;
import edu.ujcv.progra2.vector.IGVecR3;
import edu.ujcv.progra2.vector.IGVecR4;

import java.util.Scanner;
public class MenuPrincipal {

    public MenuPrincipal(){
    }
    public void Menu() {
        LectorDeTecladoValidado lt = new LectorDeTecladoValidado();
        int j;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Calculadora De Algebra Lineal");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Seleccione la dimension en la que desea Trabajar");
            System.out.println("Seleccione una de las Opciones: ");
            System.out.println("\t\t 1. R2");
            System.out.println("\t\t 2. R3");
            System.out.println("\t\t 3. R4");
            System.out.println("\t\t 5. ALT + F4 (SALIR)");
            j = lt.leerEntero("Ingrese una de las Opciones", "Intentelo de nuevo");
            switch (j) {
                case 1:
                    System.out.println("Dimension en R2");
                    System.out.println("\t\t 1. Vectores");
                    System.out.println("\t\t 2. Matrices");

                    int j2 = lt.leerEntero("Ingrese una Opcion Valida", "Intentelo de nuevo");
                    switch (j) {
                        case 1:
                            System.out.println("Seleccione una de las opciones para Vectores R2: ");
                            System.out.println("1. Suma de Vectores");
                            System.out.println("2. Resta de vectores");
                            System.out.println("3. Producto Punto");
                            System.out.println("4. Producto Por Coeficiente");
                            System.out.println("5. Vector por matriz");
                            System.out.println("");
                            System.out.println("");
                            int j3 = lt.leerEntero("Ingrese una Opcion Valida", "Intentelo de nuevo");
                            switch (j3) {
                                case 1: {
                                    IGVecR2 igVectorR2 = new IGVecR2();
                                    igVectorR2.sumar();
                                    break;
                                }
                                case 2: {
                                    IGVecR2 vectorR2 = new IGVecR2();
                                    vectorR2.restar();
                                    break;
                                }
                                case 3: {
                                    IGVecR2 igVectorR2 = new IGVecR2();
                                    igVectorR2.ProdPunto();
                                    break;
                                }
                                case 4: {
                                    IGVecR2 igVectorR2 = new IGVecR2();
                                    igVectorR2.ProdCoeficiente();
                                    break;
                                }
                                case 5: {
                                    IGVecR2 igVectorR2 = new IGVecR2();
                                    igVectorR2.VecXMat();
                                    break;
                                }
                            }
                    }
                    int j5 = lt.leerEntero("Ingrese una Opcion Valida", "Intentelo de nuevo");
                    switch (j5) {
                        case 1:
                            System.out.println("Seleccione una de las opciones para Matrices R2");
                            System.out.println("1. Suma de Matrices");
                            System.out.println("2. Resta de Matrices");
                            System.out.println("3. Multiplicacion de Matrices");
                            System.out.println("4. Matriz por Escalar");
                            System.out.println("5. Matriz Rotacion");
                    }
                    int j6 = lt.leerEntero("Ingrese una opcion valida", "Intentelo de nuevo");
                    switch (j6) {
                        case 1: {
                            IGMatR2 igMatR2 = new IGMatR2();
                            igMatR2.suma();
                            break;
                        }
                        case 2: {
                            IGMatR2 igMatR2 = new IGMatR2();
                            igMatR2.resta();
                            break;
                        }
                        case 3: {
                            IGMatR2 igMatR2 = new IGMatR2();
                            igMatR2.multiplicacion();
                        }
                        case 4: {
                            IGMatR2 igMatR2 = new IGMatR2();
                            igMatR2.escalar();
                            break;
                        }
                        case 5: {
                            IGMatR2 igMatR2 = new IGMatR2();
                            igMatR2.MatrizRotacion();
                            break;
                        }
                    }
                case 2:
                    System.out.println("Seleccione una de las opciones para R3");
                    System.out.println("1. Vectores");
                    System.out.println("2. Matrices");
                    int j7 = lt.leerEntero("Ingrese una opcion valida", "Intentelo de nuevo");
                    switch (j7) {
                        case 1:
                            System.out.println("Seleccione una de las Opciones para Vectores en R3");
                            System.out.println("1. Suma de vectores");
                            System.out.println("2. Resta de vectores");
                            System.out.println("3. Producto Punto");
                            System.out.println("4. Producto por Coeficiente");

                            int j8 = sc.nextInt();
                            switch (j8) {
                                case 1: {
                                    IGVecR3 igvectorR3 = new IGVecR3();
                                    igvectorR3.suma();
                                    break;
                                }
                                case 2: {
                                    IGVecR3 igvectorR3 = new IGVecR3();
                                    igvectorR3.resta();
                                    break;
                                }
                                case 3: {
                                    IGVecR3 igvectorR3 = new IGVecR3();
                                    igvectorR3.prodpunto();
                                    break;
                                }
                                case 4: {
                                    IGVecR3 igvectorR3 = new IGVecR3();
                                    igvectorR3.ProdPorCoeficiente();
                                    break;
                                }
                            }
                        case 2:
                            System.out.println("Seleccione una de las Opciones para Matrices en R3");
                            System.out.println("\t\t1. Suma de Matrices");
                            System.out.println("\t\t2. Resta de Matrices");
                            System.out.println("\t\t3. Multiplicar Matrices");
                            System.out.println("\t\t4. Vector Por Matriz");
                            System.out.println("\t\t5. Matriz Rotacion");
                            System.out.println("\t\t5. Producto Punto");
                            int j10 = lt.leerEntero("Ingrese una Opcion Valida", "Intentelo de nuevo");
                            switch (j10) {
                                case 1: {
                                    IGMatR3 igMatR3 = new IGMatR3();
                                    igMatR3.SumarMatriz();
                                    break;
                                }
                                case 2: {
                                    IGMatR3 igMatR3 = new IGMatR3();
                                    igMatR3.RestaMatriz();
                                    break;
                                }
                                case 3: {
                                    IGMatR3 igMatR3 = new IGMatR3();
                                    igMatR3.multiplicar();
                                    break;
                                }
                                case 4: {
                                    IGMatR3 igMatR3 = new IGMatR3();
                                    igMatR3.VecXMat();
                                    break;
                                }
                                case 5: {
                                    IGMatR3 igMatR3 = new IGMatR3();
                                    igMatR3.MatrizRotacion();
                                    break;
                                }
                                case 6: {
                                    IGMatR3 igMatR3 = new IGMatR3();
                                    igMatR3.MatrizRotacion();
                                }
                            }
                    }
                case 3:
                    System.out.println("Seleccione una de las opciones para R4");
                    System.out.println("\t\t1. Vectores");
                    System.out.println("\t\t2. Matriz");
                    int j11 = lt.leerEntero("Ingrese una Opcion Valida", "Intentelo de nuevo");
                    switch (j11) {
                        case 2:
                            System.out.println("Seleccione una de las Opciones para Vectores en R4");
                            System.out.println("\t\t1. Suma de vectores");
                            System.out.println("\t\t2. Resta de vectores");
                            System.out.println("\t\t3. Producto Punto");
                            System.out.println("\t\t4. Producto por Coeficiente");
                            int j12 = sc.nextInt();
                            switch (j12) {
                                case 1: {
                                    IGVecR4 igVecR4 = new IGVecR4();
                                    igVecR4.suma();
                                    break;
                                }
                                case 2: {
                                    IGVecR4 igVecR4 = new IGVecR4();
                                    igVecR4.resta();
                                    break;
                                }
                                case 3: {
                                    IGVecR4 igVecR4 = new IGVecR4();
                                    igVecR4.ProdPunto();
                                    break;
                                }
                                case 4: {
                                    IGVecR4 igVecR4 = new IGVecR4();
                                    igVecR4.ProdPorCoeficiente();
                                    break;
                                }
                            }
                    }
                    int j13 = sc.nextInt();
                    switch (j13) {
                        case 2: {
                            System.out.println("Seleccione una de las Opciones para Matrices en R4");
                            System.out.println("\t\t1. Suma");
                            System.out.println("\t\t2. Resta");
                            System.out.println("\t\t3. Multiplicacion");
                            System.out.println("\t\t4. Escalar x Matriz");
                            System.out.println("\t\t5. Matriz Rotacion");
                            int j14 = lt.leerEntero("Ingrese una Opcion Valida", "Intentelo de nuevo");
                            switch (j14) {
                                case 1: {
                                    IGMatR4 igMatR4 = new IGMatR4();
                                    igMatR4.suma();
                                    break;
                                }
                                case 2: {
                                    IGMatR4 igMatR4 = new IGMatR4();
                                    igMatR4.resta();
                                    break;
                                }
                                case 3: {
                                    IGMatR4 igMatR4 = new IGMatR4();
                                    igMatR4.multiplicacion();
                                    break;
                                }
                                case 4: {
                                    IGMatR4 igMatR4 = new IGMatR4();
                                    igMatR4.EscalarXMatriz();
                                    break;
                                }
                                case 5: {
                                    IGMatR4 igMatR4 = new IGMatR4();
                                    igMatR4.MatrizRotacion();
                                    break;
                                }
                            }
                        }
                    }

            }

        }

        while (j < 5) ;

    }
}