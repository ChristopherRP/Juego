/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author William
 */
public class PanelGame extends JPanel{

    public PanelGame() {
        ImageObjects = new ArrayList<>();
        ImageObjects.add( new Render("horca.jpg"));
        ImageObjects.add( new Render("font.png"));
    }
   
    
   
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.drawRoundRect(100, 100, 100, 2, 199, 199);
        System.out.println(ImageObjects.size());
        for( int i = 0; i < ImageObjects.size(); i++){
            g.drawImage(ImageObjects.get(i).getImage() , 10, 10, null);
        }
        g.drawOval(20, 2, 2, 2);
    }
    
     ArrayList<Render> ImageObjects;
     
     private void startComponents(){  
        
            
    }   
    
}
