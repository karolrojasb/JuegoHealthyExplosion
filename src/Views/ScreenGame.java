/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controlador.Game;
import java.awt.Graphics;

/**
 *
 * @author maria
 */
public class ScreenGame extends javax.swing.JFrame {

     private final Homepage homePage;
     private final LevelGame levelGame;
     private final MenuGame menuGame;
     private final NameGame nameGame;
     
     private Game game ;


     
     @Override
    public void paint(Graphics g)
    {
        game.draw(g);
    }

    public void startGame(){
        this.setSize(800, 700); 
        this.pack();
        
        start();
    }
    private void start(){
        homePage.open();
        if (homePage.isState())
        {
            menuGame.open();
            if(menuGame.isState())
            {
                switch(menuGame.getOption())
                {
                    case 0: // New Game
                        levelGame.open();
                        if(levelGame.isState())
                        {
                            nameGame.open();
                            String name=nameGame.getName();
                            startLevel(levelGame.getOption());
                        }
                        break;
                    case 1: //Load Game
                        break;
                    case 2: //Save Game
                        break;
                    case 3: // Instructions
                        break;
                }
            }else{
               System.exit(WIDTH);
            }
        }else{
            System.exit(WIDTH);
        }
    }
    
    private void startLevel(int option)
    {
        switch(option)
        {
            case 0:  //Estomach
                
                break;
            case 1: //Lung
                
                break;
            case 2: //Heart
                
                break;
        }
       
    }
    /**
     * Create a new ScreenGame
     */
    public ScreenGame(Game game) {
        
        this.game=game;
        homePage= new Homepage(null, true);
        levelGame=new LevelGame(null,true);
        menuGame= new MenuGame(null, true);
        nameGame= new NameGame(null, true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gamePanel1 = new Containers.GamePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        gamePanel1.setGame(game);
        gamePanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gamePanel1KeyPressed(evt);
            }
        });
        gamePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(gamePanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

          
// TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void gamePanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gamePanel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_gamePanel1KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed


        game.keyPressed(evt);     
// TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Containers.GamePanel gamePanel1;
    // End of variables declaration//GEN-END:variables
}
