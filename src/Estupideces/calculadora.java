package Estupideces;

import java.util.Scanner;

public class calculadora{
    float primerDigito;
    float segundoDigito;
    private int operacionEscogida;
    Scanner sc;

    public calculadora() {
        primerDigito = 0;
        segundoDigito = 0;
        sc = new Scanner(System.in);
    }
public void escojaUnaOperacionEnPantalla (){
        System.out.println("Seleccione la operación que quiere llevar a Cabo");
        System.out.println("1-suma"+ " \n " + "2-Resta" + "\n" + "3- Multiplique"+"\n" + "4-Divida" + "\n" + "5-Salir");
        operacionEscogida= sc.nextInt();
    }
public int traerOperacionEscogida2(){return operacionEscogida};

public void preguntarAlUsuario() {
    System.out.println("Escoja su primer Digito");
    primerDigito = sc.nextFloat();
    System.out.println("Escoja su segundo Digito");
    segundoDigito = sc.nextFloat();
}
public float Suma() { return primerDigito + segundoDigito;}

public float Resta() { return primerDigito - segundoDigito;}

    public float Multiplicacion(){ return primerDigito * segundoDigito;}

    public float División (){
    System.out.println(" No se puede dividir entre cero, perro.. ponele papi"+ "\n"+ "No seas así, querete");
    return 0;

    return primerDigito / segundoDigito ;}

    }
}




