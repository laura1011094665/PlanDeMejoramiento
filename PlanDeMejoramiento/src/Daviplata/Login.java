package Daviplata;

import java.util.Scanner;

public class Login {

    private int NumDoc;
    private int Clave;
    int validar = 1;

    Scanner leer = new Scanner(System.in);


public int getNumDoc() {
        return NumDoc;
    }


    public void setNumDoc(int numDoc) {
        NumDoc = numDoc;
    }


    public int getClave() {
        return Clave;
    }


    public void setClave(int clave) {
        Clave = clave;
    }


public void ingresar () {

    while (validar == 1) {

        System.out.println("por favor digite su ususario");
        NumDoc = leer.nextInt();

        System.out.println("por favor digite su contraseña");
        Clave = leer.nextInt();

        if (NumDoc==10101 && Clave==2687) {

            System.out.println("bienvenido al sistema");

            validar = 2;
            
        } else if (NumDoc!=10101 && Clave==2687) {

            System.out.println("el numero de documento es incorrecto");

            validar = 1;
             
        } else if (NumDoc==10101 && Clave!=2687) {

            System.out.println("la contraseña es incorrecta");

            validar = 1;
            
        } else if (NumDoc!=10101 && Clave!=2687) {

            System.out.println("ambos datos son incorrectos");

            validar = 1;
            
        }
        
    }
    
}
    
	  
    
    }
