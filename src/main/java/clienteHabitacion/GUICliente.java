/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clienteHabitacion;

import clienteHabitacion.sop_rmi.AsintomaticoCllbckImpl;
import clienteHabitacion.utilidades.UtilidadesConsola;
import clienteHabitacion.utilidades.UtilidadesRegistroC;
import java.awt.BorderLayout;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import servidorAlertas.dto.ClsAsintomaticoDTO;
import servidorAlertas.sop_rmi.GestionAsintomaticosInt;

/**
 *
 * @author VICTOR MANUEL
 */
public class GUICliente extends javax.swing.JFrame {

    private static GestionAsintomaticosInt objetoRemotoServidorAlertas;
    /** Creates new form GUICliente */
    public GUICliente() {
        initComponents();
    }

    public void limpiarPanelRegistrar(){
        buttonGroupTipo.clearSelection();
        jTextFieldId.setText("");
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jTextFieldDireccion.setText("");
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipo = new javax.swing.ButtonGroup();
        jPanelMenu = new javax.swing.JPanel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonEnviarIndicadores = new javax.swing.JButton();
        jPanelRegistrar = new javax.swing.JPanel();
        jLabelTipoId = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jButtonRegistrarPaciente = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jRadioButtonCC = new javax.swing.JRadioButton();
        jRadioButtonTI = new javax.swing.JRadioButton();
        jRadioButtonPP = new javax.swing.JRadioButton();
        jLabelApellido = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonEnviarIndicadores.setText("Enviar Indicadores");
        jButtonEnviarIndicadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarIndicadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelMenuLayout.createSequentialGroup()
                            .addComponent(jButtonEnviarIndicadores, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(94, 94, 94)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEnviarIndicadores, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanelRegistrar.setName(""); // NOI18N

        jLabelTipoId.setText("Tipo de identificacion");

        jLabelId.setText("Numero de identificacion");

        jLabelNombre.setText("Nombre");

        jButtonRegistrarPaciente.setText("Registrar");
        jButtonRegistrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarPacienteActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");

        buttonGroupTipo.add(jRadioButtonCC);
        jRadioButtonCC.setText("CC");

        buttonGroupTipo.add(jRadioButtonTI);
        jRadioButtonTI.setText("TI");

        buttonGroupTipo.add(jRadioButtonPP);
        jRadioButtonPP.setText("PP");

        jLabelApellido.setText("Apellido");

        jLabelDireccion.setText("Direccion de domicilio");

        javax.swing.GroupLayout jPanelRegistrarLayout = new javax.swing.GroupLayout(jPanelRegistrar);
        jPanelRegistrar.setLayout(jPanelRegistrarLayout);
        jPanelRegistrarLayout.setHorizontalGroup(
            jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelId)
                        .addComponent(jLabelTipoId)
                        .addComponent(jLabelDireccion, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabelApellido)
                    .addComponent(jLabelNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelRegistrarLayout.createSequentialGroup()
                        .addComponent(jRadioButtonCC)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonTI)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonPP))
                    .addComponent(jTextFieldNombre)
                    .addComponent(jTextFieldApellido)
                    .addComponent(jTextFieldDireccion)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelRegistrarLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButtonRegistrarPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalir)
                .addGap(77, 77, 77))
        );
        jPanelRegistrarLayout.setVerticalGroup(
            jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoId)
                    .addComponent(jRadioButtonCC)
                    .addComponent(jRadioButtonTI)
                    .addComponent(jRadioButtonPP))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellido)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrarPaciente)
                    .addComponent(jButtonSalir))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(381, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 170, Short.MAX_VALUE)
                    .addComponent(jPanelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
        //jPanelRegistrar.setSize(400,300);
        //jPanelRegistrar.setLocation(5,5);
        //jPanelMenu.setVisible(false);
        jPanelRegistrar.setVisible(true);
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonEnviarIndicadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarIndicadoresActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonEnviarIndicadoresActionPerformed

    private void jButtonRegistrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarPacienteActionPerformed
        // TODO add your handling code here:
        String tipo;
        if(jRadioButtonCC.isSelected())
        tipo = "CC";
        else
        if(jRadioButtonTI.isSelected())
        tipo = "TI";
        else
        tipo = "PP";
        ClsAsintomaticoDTO paciente = new ClsAsintomaticoDTO(jTextFieldNombre.getText(),jTextFieldApellido.getText(),tipo, Integer.parseInt(jTextFieldId.getText()), jTextFieldDireccion.getText());
        AsintomaticoCllbckImpl asintomatico;
      
        try {
            asintomatico = new AsintomaticoCllbckImpl(paciente);
            if(objetoRemotoServidorAlertas.registrarAsintomatico(asintomatico) ){
                JOptionPane.showMessageDialog(null, "Paciente registrado");
                limpiarPanelRegistrar();
            }else
                JOptionPane.showMessageDialog(null, "El paciente no se pudo registrar");
                
        } catch (RemoteException ex) {
            Logger.getLogger(GUICliente.class.getName()).log(Level.SEVERE, null, ex);
        }    

    }//GEN-LAST:event_jButtonRegistrarPacienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws NotBoundException, MalformedURLException, RemoteException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        int numPuertoRMIRegistry = 0;
        String direccionIpRMIRegistry = "";
        if(args.length == 0){           
            System.out.print("Cual es la direccion ip donde se encuentra el rmiregistry: ");
            direccionIpRMIRegistry = UtilidadesConsola.leerCadena();
            System.out.print("Cual es el numero de puerto por el cual escucha el rmiregistry: ");	
            numPuertoRMIRegistry = UtilidadesConsola.leerEntero();
        }else{
            direccionIpRMIRegistry = args[0];
            numPuertoRMIRegistry = Integer.parseInt(args[1]);
        }
        objetoRemotoServidorAlertas = (GestionAsintomaticosInt)UtilidadesRegistroC.ObtenerObjRemoto(direccionIpRMIRegistry, numPuertoRMIRegistry,"ObjetoGestionAsintomaticos");
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipo;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEnviarIndicadores;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonRegistrarPaciente;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTipoId;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelRegistrar;
    private javax.swing.JRadioButton jRadioButtonCC;
    private javax.swing.JRadioButton jRadioButtonPP;
    private javax.swing.JRadioButton jRadioButtonTI;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

}