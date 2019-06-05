/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author maria
 */
public class MenuGame extends javax.swing.JDialog {
    private boolean state;
    private int option;
   
    
    public void open()
    {
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        state=true;
        
    }

    public boolean isState() { return state; }

    public int getOption() { return option; }
    
    
    /**
     * Creates new form MenuGame
     * @param parent
     */
    public MenuGame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        state=true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtTitulo = new javax.swing.JLabel();
        BtNewGame = new javax.swing.JButton();
        BtLoadGame = new javax.swing.JButton();
        BTSave = new javax.swing.JButton();
        BTInstructions = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtTitulo.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jtTitulo.setText("HEALTY EXPLOSION");
        getContentPane().add(jtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 400, 40));

        BtNewGame.setBackground(new java.awt.Color(153, 204, 255));
        BtNewGame.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtNewGame.setText("New Game");
        BtNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtNewGameActionPerformed(evt);
            }
        });
        getContentPane().add(BtNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 200, 40));

        BtLoadGame.setBackground(new java.awt.Color(153, 204, 255));
        BtLoadGame.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtLoadGame.setText("Load Game");
        BtLoadGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLoadGameActionPerformed(evt);
            }
        });
        getContentPane().add(BtLoadGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 200, 40));

        BTSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BTSave.setText("Save");
        BTSave.setEnabled(false);
        BTSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSaveActionPerformed(evt);
            }
        });
        getContentPane().add(BTSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 200, 40));

        BTInstructions.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BTInstructions.setText("Instrucctions");
        BTInstructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTInstructionsActionPerformed(evt);
            }
        });
        getContentPane().add(BTInstructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 200, 40));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 80, 40));

        BackGround.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MenuGame.jpg"))); // NOI18N
        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 510, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtNewGameActionPerformed
        option=0;
        this.dispose();
    }//GEN-LAST:event_BtNewGameActionPerformed

    private void BtLoadGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLoadGameActionPerformed
        option=1;
        this.dispose();
    }//GEN-LAST:event_BtLoadGameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        state=false;
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void BTInstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTInstructionsActionPerformed
        option=03;
        this.dispose();
    }//GEN-LAST:event_BTInstructionsActionPerformed

    private void BTSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSaveActionPerformed
        option=02;
        this.dispose();
    }//GEN-LAST:event_BTSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTInstructions;
    private javax.swing.JButton BTSave;
    private javax.swing.JLabel BackGround;
    private javax.swing.JButton BtLoadGame;
    private javax.swing.JButton BtNewGame;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jtTitulo;
    // End of variables declaration//GEN-END:variables
}
