


package ProyectoParqueadero;

import java.util.Date;


public class Carro extends Vehiculo{

    public static int precio;
    
    public Carro(String placa) {
        super(placa);
    }
    
    
    
    @Override
    public String info(){
    
    return "Carro - "+ super.info();
    
    }
  
    @Override
    public String pago() {

        Date hoy = new Date();
         long  diff= hoy.getTime()-super.ingreso.getTime();
        long diffSeconds = diff / 1000;
        double precioTotal =diffSeconds * (precio/60);
        return "El Carro de placa "+super.placa+", lleva "+diffSeconds/60.0+" minutos, TOTAL PAGAR:"+precioTotal+"$";
        
    }
    
    
    
    
    
}
