package datos;

public class Cuenta {
    private String titular;
    private double cantidad;
    private String numeroDeCuenta;

    
    public String getNombre() {
        return titular;
    }
    
     public void setNombre(String titular) {
        this.titular = titular;
    }
     
     
    public double getCantidad() {
        return cantidad;
    }
    
     public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

     
    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    
     public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    } 
}
