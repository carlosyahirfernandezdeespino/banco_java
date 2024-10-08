package banco;
import java.util.*;
import datos.Cuenta;
import control.Movimientos;
public class Banco {
            Scanner leer = new Scanner(System.in);
            Cuenta can = new Cuenta();
    public static void main(String[] args) {
        Banco b = new Banco();
        b.solicitarDatos();
        
    }
    public void solicitarDatos(){
        Banco m = new Banco();
        System.out.println("Ingresa tu nombre completo: ");
        String nom = leer.nextLine();
        can.setNombre(nom);
        System.out.println("Ingresar numero de cuenta: ");
        String nc = leer.nextLine();
        can.setNumeroDeCuenta(nc);
        System.out.println("Ingresar una cantidad: ");
        double canti = leer.nextDouble();
        System.out.println("Dato "+ canti);
        can.setCantidad(canti);//set devuelve valor
        Movimientos mov = new Movimientos(can.getNumeroDeCuenta(),can.getNombre());
        if(mov.validarCuenta()){
            m.seleccion(m.menu(can.getNombre()));
                }
        else{
            System.out.println("La cuenta no existe");
        }
    }
    public int menu(String nom){
        System.out.println("Bienvenido a tu cuenta " + nom);
        System.out.println("1. Consultar cuenta");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Ingresar dinero");
        System.out.println("4. Transferir dinero");
        System.out.println("Elige una opcion: ");
        int op = leer.nextInt();
        return op;
    }
    public void seleccion(int op){
        switch(op){
            case 1: 
                System.out.println("Consultando cuenta...");
                System.out.println("Tu saldo es de: " + can.getCantidad());
                break;
            case 2:
                System.out.println("Retirando dinero...");
                break;
            case 3:
                System.out.println("Ingresando dinero...");
                break;
            case 4:
                System.out.println("Transfiriendo dinero...");
                break;
            default:
                System.out.println("Esta opcion no es valida...");
        }
    }
}
