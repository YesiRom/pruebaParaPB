
package entidades;


public class LamparaInteligente extends Dispositivo implements Conectable{

    private String color;
    public LamparaInteligente(String marca, boolean encendido, String color) {
        super(marca, encendido);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void cambiarColor(String color){
        setColor(color);
    }

    @Override
    public void mostrarEstado() {
        if(this.encendido){
             System.out.println("La lampara  esta Encendido");
        }else{
           System.out.println("La lampara esta Apagado"); 
        }
    }

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
