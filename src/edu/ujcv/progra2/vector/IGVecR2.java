package edu.ujcv.progra2.vector;

public class IGVecR2 {

    //privado los datos
    // un escalar que represente 'x' y 'y' los componentes del vector
    double X;
    double Y;


    // publico los constructores por defecto, copia, y conveniencia. recuerden a bob


    // publico accesoras y mutadoras

    //publico interfase

    //this es el vector a
    // c.x = a.x + b.x
    // c.y = a.y + b.y
    public IGVecR2 suma(IGVecR2 b){
        IGVecR2 c = new IGVecR2()
        double X1 = this.("Ingrese el valor 'x' del vector A","intente de nuevo");
        double Y1 = this.leerEntero("Ingrese el valor 'y' del vector A","intente de nuevo");

        double X2 = this.leerEntero("Ingrese el valor 'x' del vector B","intente de nuevo");
        double Y2 = this.leerEntero("Ingrese el valor 'y' del vector B","intente de nuevo");

        double resultX = X1 + X2;
        double resultY = Y1 + Y2;

        System.out.println("El vector A es: "+"("+X1+","+Y1+")");
        System.out.println("El vector B es: "+"("+X2+","+Y2+")");

        System.out.println("El Vector C es: "+"("+resultX+","+resultY+")");
    }

    public IGVecR2 resta(IGVecR2 b){
        //TODO: implementar
        return new IGVecR2();
    }

    //producto.
    public  IGVecR2 escalarPorVector(double alpha){
        //TODO: implementar
        return new IGVecR2();
    }

    public double productoPunto(IGVecR2 b){
        //TODO: implementar
        return 0.0;
    }


    // no esta definido en R2.!!!!!
    //public IGVecR2 productoCruz(IGVecR2 b){

    //}


    public double determinante(){
        //TODO: implementar
        return 0.0;
    }

    public double angulo(IGVecR2 b){
        //TODO: implementar
        return 0.0;
    }

    public double magnitud(){
        return Math.sqrt(productoPunto(this));
    }


}
