
package entidades;


public class HeladeraInteligente extends Dispositivo implements Conectable{
 
      private int temperatura;
      
    public HeladeraInteligente(String marca, boolean encendido, int temperatura ) {
        super(marca, encendido);
         this.temperatura = temperatura;
    }
     
      public int verTemperatura(){
        return temperatura;
    }
     
     //Implentacion del metodo abs
    @Override
    public void mostrarEstado() {
           if(this.encendido){
             System.out.println("La heladera  esta Encendida");
        }else{
           System.out.println("La heladera esta Apagada"); 
        }
    }

   //implementacion de los metodos de la interfaz
    @Override
    public void encender() {
         if(!super.isEncendido()){
         this.encendido= true;
     }
    }

    @Override
    public void apagar() {
        if(super.isEncendido()){
         this.encendido= false;
     }
    }

    @Override
    public void conectarWifi(String mensaje) {
     if(super.isEncendido()){
          encender();
          System.out.println("Conectado a"+ mensaje);
      }
    }
    
    
}
