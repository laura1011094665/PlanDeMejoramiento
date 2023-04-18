package Daviplata;
import java.util.Scanner;

public class Ejecutar {
          public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int Desicion;
        int NumDoc1=0;
        int Clave=0;
        int opcion=1;

       Consultar plata=new Consultar();
        Login ingresar=new Login();
        ingresar.ingresar();

      while (opcion==1) {
    
            System.out.println("Desea ingresar o restirar dinero (1 consultar, 2 ingresar plata  o 3 registrar plata)");
            Desicion=lectura.nextInt();
            switch(Desicion){
               case 1:{   
                plata.MostrarPlata();

                System.out.println("si desea continuar digite 1, si no quiere continuar digite 2 ");
                opcion=lectura.nextInt();

               }break;
               case 2:{ 
                plata.IngresarPlata();

                System.out.println("si desea continuar digite 1, si no quiere continuar digite 2 ");
                opcion=lectura.nextInt();

            }break;
               case 3: {
                plata.RetirarPlata();

                System.out.println("si desea continuar digite 1, si no quiere continuar digite 2 ");
                opcion=lectura.nextInt();
               }break;
         
         }
           lectura.close();
         }
        }
      }
   
