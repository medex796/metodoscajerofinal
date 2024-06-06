/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author Jhonny
 */
public class DepositoQuechua extends javax.swing.JFrame {

    /**
     * Creates new form Deposito
     */
    public String usuario = "null";
     public Principal principal = new Principal();
     public int numeroCuenta=000;
    public DepositoQuechua() {
        initComponents();
    }
    public DepositoQuechua(String name,int numerocuent){
        initComponents();
        this.usuario=name;
        this.numeroCuenta=numerocuent;
        cargar();
    
    }
     public void cargar (){
       
       FileInputStream archivo = null; // variable para leer datos de un arcchivo txt 
        ObjectInputStream convertidorarchivo = null;// variable que permitira en este caso sacar datos del archivo txt 

        try {
            archivo = new FileInputStream("C://Metodos//Cajero.txt");//llama al constructor que permite leer el archivo donde le pasamos la unbicacion del archivo 
            convertidorarchivo = new ObjectInputStream(archivo);// llamamos al constructor que permitira sacar datos del archivo donde le pasamos el archivo de donde queremos sacar los datos
               
                principal= (Principal)convertidorarchivo.readObject(); //agregamos ala lista el objeto que sacamos del archivo txt 
             
        }catch (IOException ex){// excepcion que nos ayuda si no encuentra el archivo 
          
            File archivos = new File ("C://Metodos//Cajero.txt"); // SI NO ENCUENTRA EL ARCHIVO SE CREARA UN NUEVO ARCHIVO 
        }catch (ClassNotFoundException cnfe)//ndica que Java no puede encontrar una clase específica en tiempo de ejecución, lo que generalmente ocurre debido a problemas como errores en el nombre de la clase
                {
                    cnfe.printStackTrace();
                }
       
       
       
       }
     private void actualizarLista() {
        try {
           
            FileOutputStream ficherosalida =new FileOutputStream ("C://Metodos//Cajero.txt") ; 
            ObjectOutputStream  convertidor = new ObjectOutputStream (ficherosalida);
            
                convertidor.writeObject(principal);
            
            convertidor.close();
            ficherosalida.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnDolares = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnBolivianos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AKLLAY IMAYNIN QELQATA CHURANAPAQ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 320, 30));

        btnDolares.setBackground(new java.awt.Color(0, 51, 51));
        btnDolares.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDolares.setForeground(new java.awt.Color(255, 255, 255));
        btnDolares.setText("DULAR QULLQI");
        btnDolares.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDolaresActionPerformed(evt);
            }
        });
        jPanel1.add(btnDolares, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 120, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("QULLQI CHURANAKUYKUNA ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 510, 50));

        btnBolivianos.setBackground(new java.awt.Color(0, 51, 51));
        btnBolivianos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBolivianos.setForeground(new java.awt.Color(255, 255, 255));
        btnBolivianos.setText("BULIBYA QULLQI");
        btnBolivianos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBolivianos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBolivianosActionPerformed(evt);
            }
        });
        jPanel1.add(btnBolivianos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("QULLQITA PAKARICHAY ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 190, 30));

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("QHIPANAY ");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logf1nuevo.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com (4).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 0, -1, 420));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(900, 900));
        jLabel1.setPreferredSize(new java.awt.Dimension(900, 900));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDolaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDolaresActionPerformed
        Deposito2Quechua ventana = new Deposito2Quechua (usuario,numeroCuenta,true,false);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnDolaresActionPerformed

    private void btnBolivianosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBolivianosActionPerformed
        Deposito2Quechua ventana = new Deposito2Quechua (usuario,numeroCuenta,false,true);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBolivianosActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MenuQuechua ventana = new MenuQuechua (usuario,numeroCuenta);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(DepositoQuechua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepositoQuechua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepositoQuechua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepositoQuechua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepositoQuechua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBolivianos;
    private javax.swing.JButton btnDolares;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
