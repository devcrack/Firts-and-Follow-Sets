/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero_siguiente_GUI;

import P_Grammar_things.C_Grammar;
import P_Grammar_things.C_Production;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import jdk.jfr.events.FileReadEvent;

/**
 *
 * @author devcrack
 */
public class main extends javax.swing.JFrame {
    int n_error;
    C_Grammar grammar;
    /**
     * Creates new form main
     */
    public main() {
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

        jPanel_Work_Field = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxt_Area_wrk_field = new javax.swing.JTextArea();
        jBtt_Iniciar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMen_It_Nw = new javax.swing.JMenuItem();
        jMenItem_Abrir = new javax.swing.JMenuItem();
        jMenIt_guardar = new javax.swing.JMenuItem();
        jMen_It_Cerrar = new javax.swing.JMenuItem();
        jMenu_Aiuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel_Work_Field.setBorder(javax.swing.BorderFactory.createTitledBorder("Area de Trabajo"));

        jTxt_Area_wrk_field.setColumns(20);
        jTxt_Area_wrk_field.setRows(5);
        jTxt_Area_wrk_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxt_Area_wrk_fieldKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTxt_Area_wrk_field);

        javax.swing.GroupLayout jPanel_Work_FieldLayout = new javax.swing.GroupLayout(jPanel_Work_Field);
        jPanel_Work_Field.setLayout(jPanel_Work_FieldLayout);
        jPanel_Work_FieldLayout.setHorizontalGroup(
            jPanel_Work_FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        jPanel_Work_FieldLayout.setVerticalGroup(
            jPanel_Work_FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );

        jBtt_Iniciar.setText("Iniciar");
        jBtt_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtt_IniciarActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMen_It_Nw.setText("Nuevo");
        jMen_It_Nw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMen_It_NwActionPerformed(evt);
            }
        });
        jMenu1.add(jMen_It_Nw);

        jMenItem_Abrir.setText("Abrir");
        jMenItem_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItem_AbrirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenItem_Abrir);

        jMenIt_guardar.setText("Guardar");
        jMenIt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenIt_guardarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenIt_guardar);

        jMen_It_Cerrar.setText("Cerrar");
        jMenu1.add(jMen_It_Cerrar);

        jMenuBar1.add(jMenu1);

        jMenu_Aiuda.setText("Ayuda");

        jMenuItem1.setText("La ayuda esta aqui");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu_Aiuda.add(jMenuItem1);

        jMenuBar1.add(jMenu_Aiuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Work_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtt_Iniciar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Work_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jBtt_Iniciar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxt_Area_wrk_fieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxt_Area_wrk_fieldKeyPressed
        if
        (
            evt.getKeyChar() == '('
            ||
            evt.getKeyChar() == ')'
            ||
            evt.getKeyChar() =='\''
            ||
            evt.getKeyChar() == '-'
            ||
            evt.getKeyChar() == '\\'
            ||
            evt.getKeyChar() == '_'
            ||
            evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'
            ||
            evt.getKeyChar() == '>'
            ||
            evt.getKeyChar() == '<'
            ||
            evt.getKeyChar() == '~'
            ||
            evt.getKeyChar() == '|'
            ||
            evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z'
            ||
            evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z'
            ||
            evt.getKeyChar() =='*'
            ||
            evt.getKeyChar() =='+'
            ||   
            evt.getKeyChar() == '+'
            ||
            evt.getKeyCode() == 8
            ||
             evt.getKeyCode() == 10
        )
        {
            if(evt.getKeyCode() == 10)
            {
                String lines[];
                boolean flag;
               
                lines = this.jTxt_Area_wrk_field.getText().split("\n");
                flag = C_Production.check_production(lines[lines.length - 1]);
                this.jTxt_Area_wrk_field.setEditable(flag);
                
                if(flag)
                {
                    C_Production nw_pr = new C_Production();
                   // nw_pr.load_production(lines[lines.length - 1]);
                }
                else
                {                    
                    Object[] options = {"OK"};
                    this.n_error = JOptionPane.showOptionDialog(this,
                            "Error en el formato de la produccion",
                            "ERROR", JOptionPane.PLAIN_MESSAGE,
                            JOptionPane.ERROR_MESSAGE, null, options, options[0]);
                    if( n_error == JOptionPane.OK_OPTION)
                        this.jTxt_Area_wrk_field.getCaret().setVisible(true);
                }
            }
            else
                this.jTxt_Area_wrk_field.setEditable(true);
        }
        else
            this.jTxt_Area_wrk_field.setEditable(false);
    }//GEN-LAST:event_jTxt_Area_wrk_fieldKeyPressed

    
    private void jMenIt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenIt_guardarActionPerformed
         JFileChooser jFrame_f_save = new JFileChooser();
         
         jFrame_f_save.setApproveButtonText("Guardar");
         jFrame_f_save.setCurrentDirectory(new File("./Gramaticas"));
         if(jFrame_f_save.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
         {
             File file = jFrame_f_save.getSelectedFile();
             if(!file.getName().endsWith(".g"))
                 file = new File(file.getAbsolutePath() + ".g");
             BufferedWriter out_file = null;
             
             try
             {
                   out_file = new BufferedWriter(new FileWriter(file));
                   this.jTxt_Area_wrk_field.write(out_file);
             }
             catch(IOException ex)
             {
                 ex.printStackTrace();
             }
             finally
             {
                 if(out_file != null)
                 {
                     try
                     {
                         out_file.close();
                     }
                     catch(IOException e)
                     {
                         e.printStackTrace();
                     }
                 }
             }
         }
    }//GEN-LAST:event_jMenIt_guardarActionPerformed

    private void jMenItem_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItem_AbrirActionPerformed
        JFileChooser jFrame_openFile = new JFileChooser();
        String str;
        
        jFrame_openFile.setCurrentDirectory(new File("./Gramaticas"));
        jFrame_openFile.showOpenDialog(this);
        
        File f = jFrame_openFile.getSelectedFile();
        FileReader f_rd = null;
        
        if(f != null)
        {
            try { f_rd = new FileReader(f);}
            catch(FileNotFoundException ex)
            {
                Object[] options = {"OK"};
                this.n_error = JOptionPane.showOptionDialog(this,
                        ex.getMessage(),
                        "ERROR", JOptionPane.PLAIN_MESSAGE,
                        JOptionPane.ERROR_MESSAGE, null, options, options[0]);
            }
            BufferedReader reader = new BufferedReader(f_rd);
            
            try
            {
                this.jTxt_Area_wrk_field.setText(null);
                while((str = reader.readLine())!=null)
                     this.jTxt_Area_wrk_field.append(str + "\n");
            }
            catch(IOException ex)
            {
                Object[] options = {"OK"};
                this.n_error = JOptionPane.showOptionDialog(this,
                        ex.getMessage(),
                        "ERROR", JOptionPane.PLAIN_MESSAGE,
                        JOptionPane.ERROR_MESSAGE, null, options, options[0]);
            }
        }
    }//GEN-LAST:event_jMenItem_AbrirActionPerformed

    
    /**
     * 
     * @param evt 
     */
    private void jMen_It_NwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMen_It_NwActionPerformed
        this.jTxt_Area_wrk_field.setText(null);
    }//GEN-LAST:event_jMen_It_NwActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
         
         this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Aiuda dlg;
        
        dlg = new Aiuda(this, rootPaneCheckingEnabled);
        dlg.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    private void jBtt_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtt_IniciarActionPerformed
        C_Production nw_pr;
        String[] split_production; 
        
        this.grammar = new C_Grammar();
        for(String line : this.jTxt_Area_wrk_field.getText().split("\n"))//Start to read lines for characters flow and load these in a production.
        {
            split_production = line.split("-(\\s)*>");            
            nw_pr = new C_Production();
            nw_pr.set_Left(split_production[0]); // Load the Left side of the production;            
            nw_pr.ld_production(split_production[1]);// Load the rest of the characters, i mean the right side of the production;
            this.grammar.add_production(nw_pr);//Append the production to the grammar
            
        }
    }//GEN-LAST:event_jBtt_IniciarActionPerformed

    
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtt_Iniciar;
    private javax.swing.JMenuItem jMenIt_guardar;
    private javax.swing.JMenuItem jMenItem_Abrir;
    private javax.swing.JMenuItem jMen_It_Cerrar;
    private javax.swing.JMenuItem jMen_It_Nw;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenu_Aiuda;
    private javax.swing.JPanel jPanel_Work_Field;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxt_Area_wrk_field;
    // End of variables declaration//GEN-END:variables
}
