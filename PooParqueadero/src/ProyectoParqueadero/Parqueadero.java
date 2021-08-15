

package ProyectoParqueadero;


public class Parqueadero {
    public int pisos;
    public int espacios;
    public int cantidadParqueados;
    public int historial;
    public Vehiculo matris[][];
    
    
    public Parqueadero(int pisos, int espacios, int pCarro, int pMoto){
    
        this.pisos = pisos;
        this.espacios = espacios;
        Carro.precio = pCarro;
        Moto.precio = pMoto;
        this.matris = new Vehiculo[pisos][espacios];
    
    
    
    }
    
    public String imprimeVacios(){
    
        String info = "";
        for(int i=0; i<matris.length;i++){
            for(int j=0; j<matris[0].length;j++){
            
                if(matris[i][j] == null){
                
                info = info + "Piso: " + i + ", Espacio: " + j + " - VACIO\n";

                }
            
            }
        
        

        }
        
        return info;
    }
    
    
    public String parqueaVehiculo(int posicion, int espacio, int tipo, String placa){

        try{
        
            if(matris[posicion][espacio] == null){


            switch(tipo){
            
                case 1:
                    matris[posicion][espacio] = new Carro(placa);
                    break;
                case 2:
                    matris[posicion][espacio] = new Moto(placa);
                    break;
                default:
                    return "Error tipo";
      
            }
          
            }else{
            
            return "Ya hay un movil parqueado";
            
            }
        
        
        }catch(Exception ex){
            
           return "Index fuera de rango";
        
        }

     return "Registro exitoso";  
    }
    
    public String estadoParqueadero(){
    
    String info = "";
    
    for(int i = 0; i < matris.length;i++){
        for(int j=0; j<matris[0].length;j++){
        
            if(matris[i][j] == null){
            
            info = info + "Piso "+ i + " Espacio "+ j + "- VACIO\n";
            
            }else{
            
            info = info + "Piso "+ i + " Espacio "+ j + ""+ matris[i][j].info() +"\n";

            
            
            }
        
        }
   
    }
     return info;
     
  }
    
    
}
