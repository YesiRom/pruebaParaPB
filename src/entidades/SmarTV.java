package entidades;


public class SmarTV extends Dispositivo implements Conectable{

  
    public SmarTV(String marca, boolean encendido) {
        super(marca, encendido);
    }

  
    @Override
    public void mostrarEstado() {
        if(this.encendido){
             System.out.println("El SmarTV esta Encendido");
        }else{
           System.out.println("El SmarTV esta Apagado"); 
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
    
    public void reproducirStreming(String servicio){
        encender();
        System.out.println("Se esta reproduciendo el siguiente servicio" + servicio);
    }
}
