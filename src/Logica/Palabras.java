
package Logica;

/**
 *
 * @author Christopher Reyes
 */
public class Palabras {

    String Palabra;
    String Decripcion;

    
    public Palabras() {
    }

    public Palabras(String Palabra, String Decripcion) {
        this.Palabra = Palabra;
        this.Decripcion = Decripcion;
    }

    public String getPalabra() {
        return Palabra;
    }

    public void setPalabra(String Palabra) {
        this.Palabra = Palabra;
    }

    public String getDecripcion() {
        return Decripcion;
    }

    public void setDecripcion(String Decripcion) {
        this.Decripcion = Decripcion;
    }
    
    
    

}
