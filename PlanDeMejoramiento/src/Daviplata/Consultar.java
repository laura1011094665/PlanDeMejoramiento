package Daviplata;
import java.util.Scanner;
public class Consultar{
    private int Saldo=5000;
    private int CantidadPlata;
    
    public int getSaldo() {
        return Saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo=saldo;
    }
    public int getCantidadPlata() {
        return CantidadPlata;
    }
    public void setCantidadPlata(int cantidadPlata) {
        CantidadPlata = cantidadPlata;
    }
    public void MostrarPlata(){
        System.out.println("Su saldo es: "+Saldo);
    }
    public void IngresarPlata(){
        Scanner lectura=new Scanner(System.in);
        System.out.println("¿Cuanta plata quiere ingresar?");
        CantidadPlata=lectura.nextInt();
        Saldo=CantidadPlata+Saldo;
        System.out.println("Su saldo actual es: "+Saldo);
        lectura.close();
        
    }
    public void RetirarPlata(){
        Scanner lectura=new Scanner(System.in);
        System.out.println("¿Cuanta plata quiere retirar?");
        CantidadPlata=lectura.nextInt();
        Saldo=CantidadPlata-Saldo;
        System.out.println("Su saldo actual es: "+Saldo);
        lectura.close();
    }
    
}
