package control;

public class Movimientos {
    String numeroDeCuenta;
    String titular;
    double cantidad;
    public Movimientos(String nc, String ti){
        this.numeroDeCuenta = nc;
        this.titular = ti;
    }
    public boolean validarCuenta(){
        boolean vc = false;
        if(numeroDeCuenta.length()== 10){
        if(numeroDeCuenta.equals("1234567890")  & titular.equals("Carlos Yahir Fernandez Carrillo") ){
            vc=true;
        }
        else{
            vc=false;
        }
        }
        return vc;
    }
    public void transferir(double can){
        
    }
    public void retirar(double can){
        
    }
    public void ingresar(double can){
        
    }
}
