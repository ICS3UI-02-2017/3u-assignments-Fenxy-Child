/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Constants;

/**
 *
 * @author choij2116
 */
public class A5UbbiDubbi extends javax.swing.JFrame {

    /**
     * Creates new form A5ubbiDubbi
     */
    public A5UbbiDubbi() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        englishTxtF = new javax.swing.JTextField();
        ubbidubbiTxtF = new javax.swing.JTextField();
        ubbiDubbiBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("English:");

        jLabel2.setText("Ubbi Dubbi:");

        englishTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishTxtFActionPerformed(evt);
            }
        });

        ubbidubbiTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubbidubbiTxtFActionPerformed(evt);
            }
        });

        ubbiDubbiBtn.setText("Ubbi Dubbi");
        ubbiDubbiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubbiDubbiBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Ubbi Dubbi Translator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(englishTxtF, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(ubbidubbiTxtF)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(ubbiDubbiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 175, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(englishTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22)
                .addComponent(ubbiDubbiBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(ubbidubbiTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void englishTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_englishTxtFActionPerformed

    private void ubbiDubbiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubbiDubbiBtnActionPerformed
        // Translate English to ubbi dubbi
        String english= englishTxtF.getText();
        english = english.toLowerCase();
            // walk down the word looking for the vowel
            int length = english.length();
            // use for loop to go through the character
            String w = "";
            for (int i = 0; i < length; i++) {
                if(english.charAt(i)=='a'||english.charAt(i)=='e'||english.charAt(i)=='i'||english.charAt(i)=='o'||english.charAt(i)=='u'){        
                String e = english.replaceAll("a|e|i|o|u", "ub$0");
                String transWord = e;
                ubbidubbiTxtF.setText(transWord);
            }if(english.charAt(i-1)=='a'||english.charAt(i-1)=='e'||english.charAt(i-1)=='i'||english.charAt(i-1)=='o'||english.charAt(i-1)=='u'){
                
            }    
                if(english.startsWith("a")||english.startsWith("e")||english.startsWith("i")||english.startsWith("o")||english.startsWith("u")){
            //print out the result (translation)
                String transWord = "ub";
                ubbidubbiTxtF.setText(transWord);
                if(true){
                    if(english.charAt(i)=='a'||english.charAt(i)=='e'||english.charAt(i)=='i'||english.charAt(i)=='o'||english.charAt(i)=='u'){
                    // i is the position of the vowel
                        if(english.charAt(i)=='a'||english.charAt(i)=='e'||english.charAt(i)=='i'||english.charAt(i)=='o'||english.charAt(i)=='u'){        
                        String e = english.replaceAll("a|e|i|o|u", "ub$0");
                        ubbidubbiTxtF.setText(e);
                    }else if(english.charAt(i)!='a'||english.charAt(i)!='e'||english.charAt(i)!='i'||english.charAt(i)!='o'||english.charAt(i)!='u'){
                        String last = transWord + english;
                        ubbidubbiTxtF.setText(last);
                    }
                }
            }
        }
        }
    }//GEN-LAST:event_ubbiDubbiBtnActionPerformed

    private void ubbidubbiTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubbidubbiTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubbidubbiTxtFActionPerformed

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
            java.util.logging.Logger.getLogger(A5UbbiDubbi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A5UbbiDubbi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A5UbbiDubbi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A5UbbiDubbi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A5UbbiDubbi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField englishTxtF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton ubbiDubbiBtn;
    private javax.swing.JTextField ubbidubbiTxtF;
    // End of variables declaration//GEN-END:variables
}
