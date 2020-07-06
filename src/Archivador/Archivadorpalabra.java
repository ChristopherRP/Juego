
package Archivador;

import Logica.Palabras;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Christopher Reyes
 */
public class Archivadorpalabra {

    private static ArrayList<Palabras> arrayPalabras=new ArrayList();
    
    public static void agregarPalabra(Palabras palabras){
        arrayPalabras.add(palabras);
    }
    public static void modificarPalabra(int posicion,Palabras palabras){
          arrayPalabras.set(posicion, palabras);
    }
    public static void eliminarPalabra(String Palabras){       
         for (int i = 0; i < arrayPalabras.size(); i++) {
            if(arrayPalabras.get(i).getPalabra().equals(Palabras))
                arrayPalabras.remove(i);
        }
        
    }
    public static boolean existePalabra(String palabras){
        for (Palabras palabra : arrayPalabras) {
            if(palabra.getPalabra().equalsIgnoreCase(palabras))
                return true;
        }
        return false;
    }
     
    public static int posicionPalabra(String palabras){
        for (int i = 0; i < arrayPalabras.size(); i++) {
            if(arrayPalabras.get(i).getPalabra().equalsIgnoreCase(palabras))
                return i;
        }
        return -1;
    }

    public static ArrayList<Palabras> getArrayPalabras() {
        return arrayPalabras;
    }

    public static void setArrayPalabras(ArrayList<Palabras> arrayPalabras) {
        Archivadorpalabra.arrayPalabras = arrayPalabras;
    }
    
    
    


    
    public static String listaPalabras(){
        String hilera="";
        Iterator iter = arrayPalabras.iterator();
        while(iter.hasNext()){
            hilera+=iter.next();
        }
        return hilera;
    }
    
    
   
}
