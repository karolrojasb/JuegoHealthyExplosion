/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controlador.Game;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author maria
 */
public class ScreenGame extends javax.swing.JFrame {

     private final Homepage homePage;
     private final LevelGame levelGame;
     private final MenuGame menuGame;
     private final NameGame nameGame;
     private final MessageStateGame messageStateGame;
     private final Instruction instruction;
     
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
        game.playIntro();
        homePage.open();
        homePageOpen();
       
    }
    
    private void homePageOpen(){
        if (homePage.isState())
        {
            menuGame.open();
            menuGameOpen();
        }else{
            System.exit(WIDTH);
            game.playEndIntro();
        }
    }
    
    private void menuGameOpen()
    {
        if(menuGame.isState())
            {
                switch(menuGame.getOption())
                {
                    case 0: // New Game
                        levelGame.open(0);
                        levelGameOpen();
                        break;
                    case 1: //Load Game
                        break;
                    case 2: //Save Game
                        break;
                    case 3: // Instructions
                        instruction.open();
                        menuGame.open();
                        menuGameOpen();
                    break;
                }
            }else{
               start();
            }
    }
    
    private void levelGameOpen()
    {
        if(levelGame.isState())
        {
            nameGame.open();
            if(nameGame.isState())
            {
            String name=nameGame.getName();
            game.setNameGame(name);
             this.
              
            startLevel(levelGame.getOption());
            
            }
            else
            {
              levelGame.open(0);  
              levelGameOpen();
              
            }
        }
        else
        {
          menuGame.open();
          menuGameOpen();
        }
    }
    
        /**
     * 
     */
    private void checkStateGame()
    {
        int stateStage = game.checkStateStage();
        System.out.println("entre");
        if(stateStage == 1)
        {
            messageStateGame.writeMessage("Has Ganado,continue con el siguiente nivel");
            messageStateGame.setStateMessage(true);
            messageStateGame.open();
            if(messageStateGame.isStateMessage()== false)
            {
                levelGame.open(1);
                levelGameOpen();
            }
        }
        else if (stateStage == 2)
        {
            messageStateGame.writeMessage("Has Perdido");
            messageStateGame.open();
        }
    }
    
    private void startLevel(int option)
    {
        game.playEndIntro();
        switch(option)
        {
            case 0:  //Estomach
                game.setStage(0);
                open();
                 
                break;
            case 1: //Lung
                game.setStage(1);
                
                open();
                break;
            case 2: //Heart
                game.playHeart();
                game.setStage(2);
                open();
                break;
        }
       
    }
    
    private void open(){
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
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
        messageStateGame = new MessageStateGame(null,true);
        instruction= new Instruction(null, true);
      
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

       checkStateGame();
        game.keyPressed(evt);     
// TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Containers.GamePanel gamePanel1;
    // End of variables declaration//GEN-END:variables
}
