/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentación;

import Util.GameObject;
import Util.Render;
import Util.Word;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.KeyCode;
import javax.swing.JOptionPane;

/**
 *
 * @author Christopher Reyes
 */
public class frmJuego extends javax.swing.JFrame implements Runnable{
    ArrayList<Render> ImageObjects;
    private boolean Ingame;    
    /**
     * Creates new form frmJuego
     */    
    public frmJuego() {
        
        initComponents();
        Ingame = true;
        ImageObjects = new ArrayList<>();   
        start();
        panelGame2.set_Background("horca.jpg"); 
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGame2 = new Util.PanelGame();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        panelGame2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelGame2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelGame2Layout = new javax.swing.GroupLayout(panelGame2);
        panelGame2.setLayout(panelGame2Layout);
        panelGame2Layout.setHorizontalGroup(
            panelGame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        panelGame2Layout.setVerticalGroup(
            panelGame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGame2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGame2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        Ingame = false;
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Ingame = false;
    }//GEN-LAST:event_formWindowClosing

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        //System.out.println(evt.getKeyChar());
        if (evt.getKeyCode() == KeyEvent.VK_A  || evt.getKeyCode() == KeyEvent.VK_LEFT) {
            posx -=5;
            //System.out.println("moviendo a la izquierda");
            
        }else if (evt.getKeyCode() == KeyEvent.VK_D  || evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            posx +=5;
           // System.out.println("moviendo a la derecha");
            
        }else if (evt.getKeyCode() == KeyEvent.VK_W  || evt.getKeyCode() == KeyEvent.VK_UP) {
            posy -=5;
           // System.out.println("moviendo a la derecha");
            
        }else if (evt.getKeyCode() == KeyEvent.VK_S  || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            posy +=5;
           // System.out.println("moviendo a la derecha");
            
        }else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE ) {
           Ingame = false;
           
           // System.out.println("moviendo a la derecha");
            
        }
        
    }//GEN-LAST:event_formKeyPressed

    private void panelGame2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelGame2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelGame2KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Util.PanelGame panelGame2;
    // End of variables declaration//GEN-END:variables
   
    @Override
    public void run() {
        
        while (Ingame) {             
            this.update_canvas();            
        }    
        stop();
        this.dispose();
        cerrarForm();
    }
    private void cerrarForm(){
        this.dispose();
    }
    private Thread hilo;    
    public void start(){
        startComponents();        
        hilo = new Thread(this);
        hilo.start();     
    }    
    private void stop() {
        JOptionPane.showMessageDialog(null, "El hilo se a parado");   
        Ingame = false;
        try {
            hilo.join();
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error \n"+ ex);
        }
        dispose();
    }
    private void startComponents(){  
        //panelGame2.drawImage("font.png");
       // panelGame2.drawImage("font.png");
        //panelGame2.drawImage("cancelar.png");
        
        panelGame2.drawImage( new Word().getLetter(31).img);
        //panelGame2.drawImage( panelGame2.get_Background());
            
    }     
    private int posx=0, posy=0 ;
    /**
     * Esta funcion actualiza el panel, esto para que se puedean visualizar los cambios
     */
    private void update_canvas(){
        panelGame2.setPosition(0, posx, posy);       
    }
}
