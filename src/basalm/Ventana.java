/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basalm;
import com.linuxense.javadbf.DBFException;
import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFWriter;
import java.io.*;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author witzkito
 */
public class Ventana extends javax.swing.JFrame {
    
    /**
     * Creates new form Ventana
     */
    public Ventana() throws FileNotFoundException, IOException {
        initComponents();
        BufferedReader saveFile= new BufferedReader(new FileReader("config.txt"));
        this.txtBasFab.setText(saveFile.readLine());
        this.txtPesPeso.setText(saveFile.readLine());
        this.txtBascula.setText(saveFile.readLine());
        saveFile.close();        
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBasFab = new javax.swing.JTextPane();
        bttExaminarBasFab = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPesPeso = new javax.swing.JTextPane();
        bttExaminarPesPeso = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtBascula = new javax.swing.JTextPane();
        bttExaminarBascula = new javax.swing.JToggleButton();
        bttActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BasAlm");

        jLabel1.setText("Ubicacion basfab.mdb");

        jScrollPane1.setViewportView(txtBasFab);

        bttExaminarBasFab.setText("Examinar");
        bttExaminarBasFab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttExaminarBasFabActionPerformed(evt);
            }
        });

        jLabel2.setText("Ubicacio a generar pes_peso");

        jScrollPane2.setViewportView(txtPesPeso);

        bttExaminarPesPeso.setText("Examinar");
        bttExaminarPesPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttExaminarPesPesoActionPerformed(evt);
            }
        });

        jLabel3.setText("Ubicacio Bascula.mdb");

        jScrollPane3.setViewportView(txtBascula);

        bttExaminarBascula.setText("Examinar");
        bttExaminarBascula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttExaminarBasculaActionPerformed(evt);
            }
        });

        bttActualizar.setText("Actualizar");
        bttActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttActualizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SIMPLE IMPORTADOR Y EXPORTADOR DE BASE DE DATOS BASCULA Y ALMA");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("witzkito@gmail.com");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                                .addComponent(jScrollPane2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bttExaminarPesPeso, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bttExaminarBasFab, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(bttExaminarBascula, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bttActualizar)
                .addGap(283, 283, 283))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bttExaminarBasFab)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttExaminarPesPeso)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttExaminarBascula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3))
                .addGap(65, 65, 65)
                .addComponent(bttActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttExaminarBasFabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttExaminarBasFabActionPerformed
        JFileChooser file=new JFileChooser();
        file.showOpenDialog(this);
        File archivo=file.getSelectedFile();
        if (archivo != null){
            this.txtBasFab.setText(archivo.getAbsolutePath());
        }
    }//GEN-LAST:event_bttExaminarBasFabActionPerformed

    private void bttExaminarPesPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttExaminarPesPesoActionPerformed
        JFileChooser file=new JFileChooser();
        file.showOpenDialog(this);
        File archivo=file.getSelectedFile();
        if (archivo != null){
            this.txtPesPeso.setText(archivo.getAbsolutePath());
        }
    }//GEN-LAST:event_bttExaminarPesPesoActionPerformed

    private void bttExaminarBasculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttExaminarBasculaActionPerformed
        JFileChooser file=new JFileChooser();
        file.showOpenDialog(this);
        File archivo=file.getSelectedFile();
        if (archivo != null){
            this.txtBascula.setText(archivo.getAbsolutePath());
        }
    }//GEN-LAST:event_bttExaminarBasculaActionPerformed

    private void bttActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttActualizarActionPerformed
        try {
            System.out.println("10% - Guardando Configuracion");            
            this.guardarConfig();            
            this.procesar();            
            JOptionPane.showMessageDialog(this,"IMPORTACION Y EXPORTACION GENERADA EXITOSAMENTE", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } catch (IOException ex) {
            if (ex.getMessage().equals("Fields has already been set")){
                JOptionPane.showMessageDialog(this, "El archivo para alma (pes_peso) ya existe","Error" , JOptionPane.ERROR_MESSAGE);            
            }else{
                JOptionPane.showMessageDialog(this, ex.getMessage(),"Error" , JOptionPane.ERROR_MESSAGE);            
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bttActualizarActionPerformed

    
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Ventana().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttActualizar;
    private javax.swing.JToggleButton bttExaminarBasFab;
    private javax.swing.JToggleButton bttExaminarBascula;
    private javax.swing.JToggleButton bttExaminarPesPeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane txtBasFab;
    private javax.swing.JTextPane txtBascula;
    private javax.swing.JTextPane txtPesPeso;
    // End of variables declaration//GEN-END:variables

    private void guardarConfig() throws IOException {
        FileWriter saveFile = new FileWriter("config.txt");
        saveFile.write(this.txtBasFab.getText() + "\n");
        saveFile.write(this.txtPesPeso.getText() + "\n");
        saveFile.write(this.txtBascula.getText() + "\n");
        saveFile.close();
    }

    private void procesar() throws SQLException, DBFException {
        
        //Se borra el archivo dbf si existe
        System.out.println("20% - Borrando archivo si existe");            
        File fichero = new File(this.txtPesPeso.getText());
        fichero.delete();
        
        System.out.println("30% - Conectando a Base de Datos Fabrica");
        ConeccionBasFab conBas = new ConeccionBasFab(this.txtBasFab.getText());
        ResultSet rs = conBas.select("SELECT * FROM PES_PESO");
        System.out.println("40% - Conectando a Bascula (DEMORA!!)");
        ConeccionBascula conBascula = new ConeccionBascula(this.txtBascula.getText());
          // let us create field definitions first
          // we will go for 3 fields
          //
          System.out.println("50% - Creando Cabecera dbf");
          DBFField fields[] = new DBFField[15];

          fields[0] = new DBFField();
          fields[0].setName( "P_FECHA");
          fields[0].setDataType( DBFField.FIELD_TYPE_D);

          fields[1] = new DBFField();
          fields[1].setName( "P_TICKET");
          fields[1].setDataType( DBFField.FIELD_TYPE_N);
          fields[1].setFieldLength( 8);
          
          fields[2] = new DBFField();
          fields[2].setName( "P_SOCIO");
          fields[2].setDataType( DBFField.FIELD_TYPE_N);
          fields[2].setFieldLength( 6);
          
          fields[3] = new DBFField();
          fields[3].setName( "P_ARTIC");
          fields[3].setDataType( DBFField.FIELD_TYPE_C);
          fields[3].setFieldLength( 6);
          
          fields[4] = new DBFField();
          fields[4].setName( "P_BRUTO");
          fields[4].setDataType( DBFField.FIELD_TYPE_N);
          fields[4].setFieldLength( 9);
          fields[4].setDecimalCount(2);
          
          fields[5] = new DBFField();
          fields[5].setName( "P_TARA");
          fields[5].setDataType( DBFField.FIELD_TYPE_N);
          fields[5].setFieldLength( 9);
          fields[5].setDecimalCount(2);
          
          fields[6] = new DBFField();
          fields[6].setName( "P_NETO");
          fields[6].setDataType( DBFField.FIELD_TYPE_N);
          fields[6].setFieldLength( 9);
          fields[6].setDecimalCount(2);
          
          fields[7] = new DBFField();
          fields[7].setName( "P_DESCU");
          fields[7].setDataType( DBFField.FIELD_TYPE_N);
          fields[7].setFieldLength( 5);
          fields[7].setDecimalCount(2);
          
          fields[8] = new DBFField();
          fields[8].setName( "P_FACTU");
          fields[8].setDataType( DBFField.FIELD_TYPE_L);
          fields[8].setFieldLength( 1);
          
          fields[9] = new DBFField();
          fields[9].setName( "P_TRANS");
          fields[9].setDataType( DBFField.FIELD_TYPE_C);
          fields[9].setFieldLength( 25);
          
          fields[10] = new DBFField();
          fields[10].setName( "P_CHAPA");
          fields[10].setDataType( DBFField.FIELD_TYPE_C);
          fields[10].setFieldLength( 8);
          
          fields[11] = new DBFField();
          fields[11].setName( "P_CONDUC");
          fields[11].setDataType( DBFField.FIELD_TYPE_C);
          fields[11].setFieldLength( 25);
          
          fields[12] = new DBFField();
          fields[12].setName( "P_FECACRE");
          fields[12].setDataType( DBFField.FIELD_TYPE_D);
          
          fields[13] = new DBFField();
          fields[13].setName( "P_REMITO");
          fields[13].setDataType( DBFField.FIELD_TYPE_N);
          fields[13].setFieldLength( 8);
          
          fields[14] = new DBFField();
          fields[14].setName( "P_RINDE");
          fields[14].setDataType( DBFField.FIELD_TYPE_N);
          fields[14].setFieldLength( 12);
          fields[14].setDecimalCount(2);

          DBFWriter writer = new DBFWriter(new File( this.txtPesPeso.getText()));
          writer.setFields( fields);

          // now populate DBFWriter
          //
          System.out.println("60% - Guardando Datos");
          while (rs.next()){
            System.out.println("   - Guardando Ticket " + rs.getDouble("P_TICKET"));
            Object rowData[] = new Object[15];
            rowData[0] =rs.getDate("P_FECHA");
            rowData[1] = rs.getDouble("P_TICKET");
            rowData[2] = rs.getDouble("P_SOCIO");
            rowData[3] = rs.getString("P_ARTIC");
            rowData[4] = rs.getDouble("P_BRUTO");
            rowData[5] = rs.getDouble("P_TARA");
            rowData[6] = rs.getDouble("P_NETO");
            rowData[7] = rs.getDouble("P_DESCU");
            rowData[8] = rs.getBoolean("P_FACTU");
            rowData[9] = rs.getString("P_TRANS");
            rowData[10] = rs.getString("P_CHAPA");
            rowData[11] = rs.getString("P_CONDUC");
            rowData[12] = rs.getDate("P_FECACRE");
            rowData[13] = rs.getDouble("P_REMITO");
            rowData[14] = rs.getDouble("P_RINDE");

            writer.addRecord( rowData);
            
            String p_fecha;
            /*SimpleDateFormat dt = new SimpleDateFormat("dd/mm/yy"); 
            if (rs.getDate("P_FECHA") != null)
            {
                p_fecha = dt.format(rs.getDate("P_FECHA"));
            }else{
                p_fecha = "";
            }
            System.out.println(p_fecha);
            String p_fecacre;
            if (rs.getDate("P_FECACRE") != null)
            {
                p_fecacre = dt.format(rs.getDate("P_FECACRE"));
            }else{
                p_fecacre = "";
            }
            System.out.println(p_fecacre);*/
            
            conBascula.insert("INSERT INTO PES_PESO (P_TICKET,P_SOCIO,P_ARTIC,"
                    + "P_BRUTO,P_TARA,P_NETO,P_DESCU,P_FACTU,P_TRANS,P_CHAPA,"
                    + "P_CONDUC,P_REMITO,P_RINDE, P_FECHA) VALUES("
                    + rs.getDouble("P_TICKET") + ","
                    + rs.getDouble("P_SOCIO") + ",'"
                    + rs.getString("P_ARTIC") + "',"
                    + rs.getDouble("P_BRUTO") + ","
                    + rs.getDouble("P_TARA") + ","
                    + rs.getDouble("P_NETO") + ","
                    + rs.getDouble("P_DESCU") + ","
                    + rs.getBoolean("P_FACTU") + ",'"
                    + rs.getString("P_TRANS") + "','"
                    + rs.getString("P_CHAPA") + "','"
                    + rs.getString("P_CONDUC") + "',"
                    + rs.getDouble("P_REMITO") + ","
                    + rs.getDouble("P_RINDE") + ",#" + rs.getDate("P_FECHA") +"#)");
          }

          writer.write();
          
    }
}