/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;
import Util.Vector2;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Render{
    private BufferedImage img;
    private Vector2 dimension;
    
    public Render(){  
        try {
            this.defaultImg = ImageIO.read(getClass().getResource("/Files/gamecontroller_23721.png"));
        } catch (IOException ex) {
            Logger.getLogger(Render.class.getName()).log(Level.SEVERE, null, ex);
        }
        img = null;
        dimension = null;
    }
    /**
     * carga una imagen para el objeto
     * fuerza a utilizar un try catch
     * @param path 
     * ruta de la imagen
     */
    public Render(String path) {
        
        try { 
             //this.defaultImg = ImageIO.read("/Files/gamecontroller_23721.png");       
             img = loadImage(path);
            // dimension = new Vector2(img.getWidth(), img.getHeight());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e +" Error al cargar "+ path);
        }        
    }
    /**
     * devuelve una una imagen del tipoBufferedImage
     * @param path
     * direccion de la imagen
     * @return 
     */
    private BufferedImage loadImage(String path) throws IOException {       
//            this.defaultImg = ImageIO.read(new File("Files/gamecontroller_23721.png"));       
            //URL t = getClass().getResource(path);
            //System.out.println(t.getPath());
            BufferedImage img = ImageIO.read( getClass().getResource( "../Files/" +path ));
            return img;
        
    }    
    private BufferedImage defaultImg;
    public BufferedImage getImage(){
        
            return img;
              
    }
}
