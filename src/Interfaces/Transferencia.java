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
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Jhonny
 */
public class Transferencia extends javax.swing.JFrame {
     public int numeroCuenta=000;
    public String usuario = "null";
    public Principal principal =new Principal();
    /**
     * Creates new form Transferencia
     */
    public Transferencia() {
        initComponents();
        setLocationRelativeTo(null);
    }
    /**
     * Constructor sobrecargado que inicializa la interfaz gráfica de Transferencia con el nombre del usuario y el número de cuenta.
     * @param name Nombre del usuario
     * @param numeroCuenta Número de cuenta del usuario
     */
    public Transferencia(String name,int numeroCuenta){
        initComponents(); // Inicializa los componentes de la interfaz gráfica
        this.usuario = name; // Asigna el nombre del usuario al atributo usuario
        this.numeroCuenta = numeroCuenta; // Asigna el número de cuenta al atributo numeroCuenta
        cargar(); // Carga los datos de las cuentas desde el archivo
    
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


/**
     * Método para actualizar la lista de cuentas en el archivo de texto.
     * Guarda los datos de la lista de cuentas en un archivo de texto.
     */
 private void actualizarLista() {
        try {
            FileOutputStream ficherosalida = new FileOutputStream("C://Metodos//Cajero.txt"); // Abre el archivo para escribir datos
            ObjectOutputStream convertidor = new ObjectOutputStream(ficherosalida); // Crea un convertidor de objetos a archivo
            convertidor.writeObject(principal); // Escribe los datos del objeto principal en el archivo
            convertidor.close(); // Cierra el convertidor
            ficherosalida.close(); // Cierra el archivo
        } catch (IOException ex) {
            ex.printStackTrace(); // Muestra un rastreo de la pila de errores si hay un problema de E/S
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
        jLabel5 = new javax.swing.JLabel();
        txtSaldoTransferir = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        txtCuentaTransferir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("N° CUENTA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, 30));

        txtSaldoTransferir.setBackground(new java.awt.Color(0, 51, 51));
        txtSaldoTransferir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSaldoTransferir.setForeground(new java.awt.Color(255, 255, 255));
        txtSaldoTransferir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoTransferirKeyTyped(evt);
            }
        });
        jPanel1.add(txtSaldoTransferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 370, 40));

        jButton7.setBackground(new java.awt.Color(0, 51, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("LISTO");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 100, -1));

        txtCuentaTransferir.setBackground(new java.awt.Color(0, 51, 51));
        txtCuentaTransferir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCuentaTransferir.setForeground(new java.awt.Color(255, 255, 255));
        txtCuentaTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuentaTransferirActionPerformed(evt);
            }
        });
        txtCuentaTransferir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuentaTransferirKeyTyped(evt);
            }
        });
        jPanel1.add(txtCuentaTransferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 370, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TRANSFERENCIAS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 330, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SALDO A TRANSFERIR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 200, 30));

        jButton8.setBackground(new java.awt.Color(0, 51, 51));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("ATRAS");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 110, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BANCO CACHUPIN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logf1nuevo.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com (4).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSaldoTransferirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoTransferirKeyTyped
        char c = evt.getKeyChar();
        if( c < '0'|| c>'9'  ) evt.consume();
        if (txtSaldoTransferir.getText().length() >= 5) evt.consume();

        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoTransferirKeyTyped

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(!txtCuentaTransferir.getText().equals("")&&!txtSaldoTransferir.getText().equals("")){

            if (cuentaExiste(Integer.parseInt(txtCuentaTransferir.getText()))){
                if(saldo(numeroCuenta) >= (Double.parseDouble(txtSaldoTransferir.getText()))){

                    transferirSaldo(Integer.parseInt(txtCuentaTransferir.getText()),Double.parseDouble(txtSaldoTransferir.getText()));
                     historias(Integer.parseInt(txtCuentaTransferir.getText()),Double.parseDouble(txtSaldoTransferir.getText()));


                    actualizarLista();
                    Finish ventana = new Finish (usuario,numeroCuenta);
                    ventana.setVisible(true);
                    ventana.setLocationRelativeTo(null);
                    Factura factura =new Factura(usuario,numeroCuenta,"Transeferencia",Double.parseDouble(txtSaldoTransferir.getText()));
                    factura.setVisible(true);
                    factura.setLocationRelativeTo(null);
                    dispose();
                }else {

                    JOptionPane.showMessageDialog(null, "Saldo insuficiente  ", "Error", JOptionPane.INFORMATION_MESSAGE);

                }

            }else {
                JOptionPane.showMessageDialog(null, "La cuenta no existe ", "Error", JOptionPane.INFORMATION_MESSAGE);

            }

        }else {
            JOptionPane.showMessageDialog(null, "Llene todas las casillas porfavor", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed
     public double redondear(double numero) {
        // Multiplica el número por 10^digitos para desplazar los dígitos decimales
        double factor = Math.pow(10, 3);
        double numeroMultiplicado = numero * factor;

        // Redondea al entero más cercano
        long parteEntera = Math.round(numeroMultiplicado);

        // Divide el resultado por 10^digitos para obtener el número redondeado
        return parteEntera / factor;
    }
    
    private void txtCuentaTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuentaTransferirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuentaTransferirActionPerformed

    private void txtCuentaTransferirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaTransferirKeyTyped
        char c = evt.getKeyChar();
        if( c < '0'|| c>'9'  ) evt.consume();
        if (txtCuentaTransferir.getText().length() >= 9) evt.consume();

        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuentaTransferirKeyTyped

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Menu ventana = new Menu (usuario,numeroCuenta);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed
    public void historias(int numeroCuentaTransferir,double saldoTransferir){
         Historia historiaEmisor = new Historia ();
                    Historia historiaReceptor = new Historia ();
                    LocalDateTime ahora = LocalDateTime.now();
                         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                         String fechaYHoraActual = ahora.format(formatter);
         for(int i= 0 ; principal.getListaCuenta().size()>i;i++){
            if(principal.getListaCuenta().get(i).getNumeroCuenta()==numeroCuentaTransferir){
                for ( int j =0;principal.getListaCuenta().size() > j;j++){
                    if(principal.getListaCuenta().get(j).getNumeroCuenta()==numeroCuenta){
                        
                        if (verificarDolar(numeroCuenta)){
                            if(verificarDolar(numeroCuentaTransferir)){
                                    historiaEmisor = new Historia (fechaYHoraActual,"Transaccion","-"+( txtSaldoTransferir.getText()),nombreCliente(Integer.parseInt(txtCuentaTransferir.getText())),Integer.parseInt(txtCuentaTransferir.getText()),redondear(saldo(numeroCuenta) )+"");
                                     historiaReceptor = new Historia (fechaYHoraActual,"Transaccion","+"+txtSaldoTransferir.getText(),nombreCliente(numeroCuenta),numeroCuenta,redondear(saldo(Integer.parseInt(txtCuentaTransferir.getText())))+"");
                            
                            }else {
                                double saldo = saldoTransferir * 6.91;
                                saldo = redondear (saldo);
                                                           
                                                    historiaEmisor = new Historia (fechaYHoraActual,"Transaccion","-"+( txtSaldoTransferir.getText()),nombreCliente(Integer.parseInt(txtCuentaTransferir.getText())),Integer.parseInt(txtCuentaTransferir.getText()),redondear(saldo(numeroCuenta) )+"");
                                                     historiaReceptor = new Historia (fechaYHoraActual,"Transaccion","+"+ saldo,nombreCliente(numeroCuenta),numeroCuenta, redondear(saldo(Integer.parseInt(txtCuentaTransferir.getText())))+"");
                            
                                
                            }
                        
                        }else {
                            if(verificarDolar(numeroCuentaTransferir)){
                                    double saldo2 = saldoTransferir / 6.91;
                                    saldo2 = redondear (saldo2);
                                                historiaEmisor = new Historia (fechaYHoraActual,"Transaccion","-"+( txtSaldoTransferir.getText()),nombreCliente(Integer.parseInt(txtCuentaTransferir.getText())),Integer.parseInt(txtCuentaTransferir.getText()),redondear(saldo(numeroCuenta) )+"");
                                                     historiaReceptor = new Historia (fechaYHoraActual,"Transaccion","+"+ saldo2,nombreCliente(numeroCuenta),numeroCuenta,redondear(saldo(Integer.parseInt(txtCuentaTransferir.getText())))+"");
                            

                            }else {
                                                   historiaEmisor = new Historia (fechaYHoraActual,"Transaccion","-"+( txtSaldoTransferir.getText()),nombreCliente(Integer.parseInt(txtCuentaTransferir.getText())),Integer.parseInt(txtCuentaTransferir.getText()),redondear(saldo(numeroCuenta) )+"");
                                                      historiaReceptor = new Historia (fechaYHoraActual,"Transaccion", "+"+ txtSaldoTransferir.getText(),nombreCliente(numeroCuenta),numeroCuenta,redondear(saldo(Integer.parseInt(txtCuentaTransferir.getText())))+"");
                            

                        
                        }
                        
                        
                        
                        
                    }
                
                
                }
            }
        
      
        }

   
   
    }
                                      agregarHistoria(historiaEmisor,historiaReceptor,Integer.parseInt(txtCuentaTransferir.getText()));

    }
         
    public String nombreCliente(int numerocuentaCliente){
        String res = "";
        for(int i= 0 ; principal.getListaCuenta().size()>i;i++){
            if(principal.getListaCuenta().get(i).getNumeroCuenta()==numerocuentaCliente){
                        String usuarioBuscado = principal.getListaCuenta().get(i).getUsuario();
                for ( int j =0;principal.getListaCliente ().size() > j;j++){
                    if(principal.getListaCliente().get(j).getUsuario().equals(usuarioBuscado)){//emisor
                        res = principal.getListaCliente().get(j).getNombre()+" " + principal.getListaCliente().get(j).getApellido();
                        
                        break;
                        
                    }
                
                
                }
            }
        
        
        }
    
    return res;
    
    
    }
    public void agregarHistoria(Historia historiaEmisor , Historia historiaReceptor ,int numeroCuentaTransferir){
        for(int i= 0 ; principal.getListaCuenta().size()>i;i++){
            if(principal.getListaCuenta().get(i).getNumeroCuenta()==numeroCuentaTransferir){//receptor
                for ( int j =0;principal.getListaCuenta().size() > j;j++){
                    if(principal.getListaCuenta().get(j).getNumeroCuenta()==numeroCuenta){//emisor
                        principal.getListaCuenta().get(i).getListaHistoria().add(historiaReceptor);
                        principal.getListaCuenta().get(j).getListaHistoria().add(historiaEmisor);
                        break;
                        
                    }
                
                
                }
            }
        
        
        }
    
    
    }
    /**
     * Método para realizar la transferencia de saldo entre cuentas.
     * Transfiere el saldo especificado desde la cuenta del emisor a la cuenta del receptor.
     * @param numeroCuentaTransferir Número de cuenta destino
     * @param saldoTransferir Saldo a transferir
     */
    public void transferirSaldo(int numeroCuentaTransferir,double saldoTransferir){
         
         for(int i= 0 ; principal.getListaCuenta().size()>i;i++){
            if(principal.getListaCuenta().get(i).getNumeroCuenta()==numeroCuentaTransferir){
                for ( int j =0;principal.getListaCuenta().size() > j;j++){
                    if(principal.getListaCuenta().get(j).getNumeroCuenta()==numeroCuenta){
                        
                        if (verificarDolar(numeroCuenta)){
                            if(verificarDolar(numeroCuentaTransferir)){
                                principal.getListaCuenta().get(i).setSaldo(principal.getListaCuenta().get(i).getSaldo()+saldoTransferir);
                                     principal.getListaCuenta().get(j).setSaldo(principal.getListaCuenta().get(j).getSaldo()- saldoTransferir);
                            }else {
                                double saldo = saldoTransferir *6.91;
                                                   principal.getListaCuenta().get(i).setSaldo(principal.getListaCuenta().get(i).getSaldo()+saldo);
                                                    principal.getListaCuenta().get(j).setSaldo(principal.getListaCuenta().get(j).getSaldo()- saldoTransferir);

                                
                            }
                        
                        }else {
                            if(verificarDolar(numeroCuentaTransferir)){
                                    double saldo = saldoTransferir /6.91;
                                                 principal.getListaCuenta().get(i).setSaldo(principal.getListaCuenta().get(i).getSaldo()+saldo);
                                                    principal.getListaCuenta().get(j).setSaldo(principal.getListaCuenta().get(j).getSaldo()- saldoTransferir);

                            }else {
                                 principal.getListaCuenta().get(i).setSaldo(principal.getListaCuenta().get(i).getSaldo()+saldoTransferir);
                                     principal.getListaCuenta().get(j).setSaldo(principal.getListaCuenta().get(j).getSaldo()- saldoTransferir);
                        
                        
                        }
                        
                        
                        
                        
                    }
                
                
                }
            }
        
      
        }
   
         }
    }
    public boolean verificarDolar(int numerocuenta){
        boolean res =false;
        for (int i =0; principal.getListaCuenta().size()>i;i++){
            if(principal.getListaCuenta().get(i).getNumeroCuenta()==numerocuenta){
                if(principal.getListaCuenta().get(i).getMoneda().equals("Dolares")){
                    res = true;
                    break;
                }
            
            }
        
        }
        return res;
    
    
    }
    public double saldo(int numeroCuenta){
        double  res = 0;
        if(principal.getListaCuenta()!=null){
        for(int i =0;principal.getListaCuenta().size()>i ;i++ ){
            if (principal.getListaCuenta().get(i).getNumeroCuenta()==numeroCuenta){
                 
                res = principal.getListaCuenta().get(i).getSaldo();
                 break;
            
            }
         
        }
        }
        
     
        return res;
    
    }
    public boolean cuentaExiste(int numeroCuenta){
        boolean res = false;
        if(principal.getListaCuenta()!=null){
        for(int i =0;principal.getListaCuenta().size()>i ;i++ ){
            if (principal.getListaCuenta().get(i).getNumeroCuenta()==numeroCuenta){
                 res =true;
                 break;
            
            }
         
        }
        }
        
     
    return res;
    
    
    }

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
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transferencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCuentaTransferir;
    private javax.swing.JTextField txtSaldoTransferir;
    // End of variables declaration//GEN-END:variables
}