/*
Programa que calcula e imprime
la identificacion del vendedor.
el numero de ventas del vendedor.
el valor de la venta realizada por el vendedor.
el tipo de venta.
la comision que se gana el vendedor tien una comisión fija de 7 y si este realiza venta al contado es de 15, si es cheque 10 
y credito es 5.
el total a pagar al vendedor.
 */
package valorpagarempleado;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Empleado {

    private int comision1=7;
    private String tipoVenta;
    private int cuantiaVentas;
    private String identificacionVendedor;
    private int valorVenta;

    public Empleado( ) {
        
       
        this.tipoVenta = null;
        this.cuantiaVentas = 0;
        this.identificacionVendedor = null;
        this.valorVenta = 0;
    }

    public int getComision1() {
        return comision1;
    }

    public void setComision1(int comision1) {
        this.comision1 = comision1;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public int getCuantiaVentas() {
        return cuantiaVentas;
    }

    public void setCuantiaVentas(int cuantiaVentas) {
        this.cuantiaVentas = cuantiaVentas;
    }

    public String getIdentificacionVendedor() {
        return identificacionVendedor;
    }

    public void setIdentificacionVendedor(String identificacionVendedor) {
        this.identificacionVendedor = identificacionVendedor;
    }

    public int getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(int valorVenta) {
        this.valorVenta = valorVenta;
    }
    
    

    public void setIdentificacionvendedor(String identificacionVendedor) {
        this.identificacionVendedor = identificacionVendedor;
    }

    public int getValorventa() {
        return valorVenta;
    }

    public void setValorventa(int valorVenta) {
        this.valorVenta = valorVenta;
    }
    
    public void identificacionvendedor(){
        Scanner leer =new Scanner(System.in);
        
        for(int i =0;i<1;i++){
            System.out.println("ingrese la identificacion del vendedor ");
            identificacionVendedor=leer.next();
            System.out.println("ingrese el numero de ventas");
            cuantiaVentas =leer.nextInt();
            System.out.println("ingrese el valor de la venta");
            valorVenta=leer.nextInt();
            System.out.println("ingrese el tipo de venta si es contado, con cheque o credito");
            tipoVenta=leer.next().intern();
            
        }
       
        
    }
   
    public void tipodeventaypagarvendedor(){
        System.out.println("la identificacion del vendedor es :"+identificacionVendedor);
        System.out.println("el numero de ventas es :"+cuantiaVentas);
        System.out.println("el valor de la venta es :"+valorVenta); 
        int comision2 = 0;
        
        if(tipoVenta=="contado"){
        comision2=15;  
        }
        if(tipoVenta=="cheque"){
        comision2=10;
        }
        if(tipoVenta=="credito"){
        comision2=5;
        }
        int pagarvendedor=(valorVenta*comision1)/100+(valorVenta*comision2)/100;
        int totalpagarvendedor=pagarvendedor*cuantiaVentas;
        System.out.println("el tipo de venta es :"+tipoVenta);
        System.out.println("la comision es :"+comision2);
        System.out.println("el total a pagar al vendedor "+identificacionVendedor+ "es:"+totalpagarvendedor);
        System.out.println("\n");
           
        
        
        
    }

    public static void main(String[] args) {
        
        	
         Empleado vendedor1 = new Empleado();
         
         vendedor1.identificacionvendedor();
         vendedor1.tipodeventaypagarvendedor();
         
         
         Empleado vendedor2 = new Empleado();
         vendedor2.identificacionvendedor();
         vendedor2.tipodeventaypagarvendedor();
         
         
         Empleado vendedor3 = new Empleado();
         vendedor3.identificacionvendedor();
         vendedor3.tipodeventaypagarvendedor();
         
    }
    

}
