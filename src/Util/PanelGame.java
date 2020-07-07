/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author William
 */
public class PanelGame extends JPanel implements ActionListener{

    private BufferedImage background;
    public PanelGame() {
        ImageObjects = new ArrayList<>();         
    }
    /**
     * dibuja una imagen en pantalla
     * @param name 
     * nombre de la imagen que se quiere dibujar
     */
    public void setPosition(int i, float x, float y){
        ImageObjects.get(i).setPosicion(new Vector2(x,y));
        this.repaint();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        update_world();
    }    
    public void update_world(){
        
    }    
    public void drawImage(String name){
        ImageObjects.add( new Render(name));       
    } 
    public void drawImage(String name, float x, float y ){
        ImageObjects.add( new Render(name));       
    } 
    public void drawImage(BufferedImage img ){
        ImageObjects.add(  new Render(img) );       
    } 
    
    public void set_Background(String name){
        background = new Render(name).getImage();       
    }
    public BufferedImage get_Background(){
        return background;
    }
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        //g.drawRoundRect(100, 100, 100, 2, 199, 199);
         if(background!= null){
            g.drawImage(background, 100, 30, null);
        }        
         //g.drawImage(ImageObjects.get(0).getImage().getSubimage(100, 100, 10, 10) ,(int) ImageObjects.get(0).getPosicion().x , (int)ImageObjects.get(0).getPosicion().y, null);
        
        for( int i = 0; i < ImageObjects.size(); i++){
            g.drawImage(ImageObjects.get(i).getImage() ,(int) ImageObjects.get(i).getPosicion().x , (int)ImageObjects.get(i).getPosicion().y, null);
             
        }       
    }    
     ArrayList<Render> ImageObjects;     

    public void add(Render letter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    
}
