
package dispositivointeligente;

import entidades.*;
import java.util.ArrayList;
import java.util.List;


public class DispositivoInteligente {

 
    public static void main(String[] args) {
        
        HeladeraInteligente heladera = new HeladeraInteligente("Samsung", true, 4);
        SmarTV tele = new SmarTV("LG", false);
        LamparaInteligente lampara= new LamparaInteligente("Sica", false, "Azul");
        
        List<Conectable> dispConectable = new ArrayList<>();
        
        dispConectable.add(heladera);
        dispConectable.add(tele);
         dispConectable.add(lampara);
        
        for (Conectable dispositivo : dispConectable) {
            dispositivo.encender();
            dispositivo.conectarWifi("Telecentro");
            if(dispositivo instanceof SmarTV){
                ((SmarTV) dispositivo).reproducirStreming("Netflix");
                ((SmarTV) dispositivo).mostrarEstado();
            }
            if(dispositivo instanceof LamparaInteligente){
                ((LamparaInteligente) dispositivo).cambiarColor("Rojo");
                ((LamparaInteligente) dispositivo).mostrarEstado();
            }
            if(dispositivo instanceof HeladeraInteligente){
                ((HeladeraInteligente) dispositivo).verTemperatura();
                ((HeladeraInteligente) dispositivo).mostrarEstado();
            }
            dispositivo.apagar();
           }
    }
    
}
