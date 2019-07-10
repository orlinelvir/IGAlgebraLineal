package edu.ujcv.progra2.utility;
import java.util.Scanner;
public class LectorDeTecladoValidado {
    private Scanner scanner;
    private static LectorDeTecladoValidado instance;

    public LectorDeTecladoValidado(){
        scanner = new Scanner(System.in);
    }
    public static LectorDeTecladoValidado getInstance(){
        if (instance == null){
            instance = new LectorDeTecladoValidado();
        }
        return instance;
    }
    String leerPalabra(){
        return scanner.next();
    }
    String leeerLinea(){
        return scanner.next();
    }
    public int leerEntero(String mensaje, String reintento){
        System.out.println(mensaje);
        do {
            if (scanner.hasNextInt()){
                return scanner.nextInt();
            }
            scanner.next();
            System.out.println(reintento);
        }while (true);
    }
    public double leerFlotante (String mensaje, String reintento){
        System.out.println(mensaje);
        do {
            if(scanner.hasNextDouble()){
                return scanner.nextDouble();
            }
            scanner.next();
            System.out.println(reintento);
        }while (true);
    }
}