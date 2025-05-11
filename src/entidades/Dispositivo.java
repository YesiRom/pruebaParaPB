
package entidades;


public abstract class Dispositivo {
    protected String marca;
    protected  boolean encendido;

    public Dispositivo(String marca, boolean encendido) {
        this.marca = marca;
        this.encendido = encendido;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
 public abstract void mostrarEstado();
}
