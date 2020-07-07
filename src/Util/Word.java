/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Word {
    Render[] img;

    public Word() {
        img = new Render[122];
        img[0] = new Render("font.png");
        int cont = 1;
        for (int i = 0; i < 7; i++) {    
            for (int j = 0; j < 14; j++) {    
                
                if (i == 0 && j==0) {
                    continue;
                }else{
                    img[cont] = new Render(img[0].img.getSubimage( j * 20 ,  (i)*20 , 22, 20));  
                    cont++;
                }
                             
        
                
            // x : coordenada donde inicia en x , y coordenada en y , que tan ancho , que tan alto
               
            }
        }
        
        //img[0].img.getSubimage
        
    }
    
    public Render getLetter(int i){
        
        return img[i];
    }
    
    
    
}
