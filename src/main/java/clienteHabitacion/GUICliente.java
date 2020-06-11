
package clienteHabitacion;

import clienteHabitacion.sop_rmi.ClsAsintomaticoCllbckImpl;
import clienteHabitacion.utilidades.UtilidadesConsola;
import clienteHabitacion.utilidades.UtilidadesRegistroC;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.File;
import static java.lang.System.exit;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import servidorAlertas.dto.ClsAsintomaticoDTO;
import servidorAlertas.sop_rmi.GestionAsintomaticosInt;


public class GUICliente extends javax.swing.JFrame implements Runnable{

    private static GestionAsintomaticosInt objetoRemotoServidorAlertas;
    CardLayout cardLayout;
    /** Creates new form GUICliente */
    public GUICliente() {
        initComponents();
        cardLayout = (CardLayout) (jPanelCardLayout.getLayout());
    }
    
    public void limpiarPanelRegistrar(){
        buttonGroupTipo.clearSelection();
        jTextFieldId.setText("");
        jTextFieldNombres.setText("");
        jTextFieldApellidos.setText("");
        jTextFieldDireccion.setText("");
    }
    public void fijarAlerta(String mensaje){
        appendToPane(jTextPaneArea, mensaje+"\n", Color.red);
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
        jPanelCardLayout = new javax.swing.JPanel();
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
        jTextFieldNombres = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jPanelConsultar = new javax.swing.JPanel();
        jTextFieldIdConsulta = new javax.swing.JTextField();
        jLabelIdConsulta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaConsultas = new javax.swing.JTextArea();
        jButtonBuscar = new javax.swing.JButton();
        jPanelIndicadores = new javax.swing.JPanel();
        jTextFieldIdIndicador = new javax.swing.JTextField();
        jLabelIdIndicador = new javax.swing.JLabel();
        jButtonEnviar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPaneArea = new javax.swing.JTextPane();

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
                        .addComponent(jButtonEnviarIndicadores, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCardLayout.setLayout(new java.awt.CardLayout());

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
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        buttonGroupTipo.add(jRadioButtonCC);
        jRadioButtonCC.setText("CC");

        buttonGroupTipo.add(jRadioButtonTI);
        jRadioButtonTI.setText("TI");

        buttonGroupTipo.add(jRadioButtonPP);
        jRadioButtonPP.setText("PP");

        jLabelApellido.setText("Apellido");

        jLabelDireccion.setText("Direccion de domicilio");

        jTextFieldNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombresKeyTyped(evt);
            }
        });

        jTextFieldApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidosKeyTyped(evt);
            }
        });

        jTextFieldDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDireccionKeyTyped(evt);
            }
        });

        jTextFieldId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIdKeyTyped(evt);
            }
        });

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
                    .addComponent(jTextFieldNombres)
                    .addComponent(jTextFieldApellidos)
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
                    .addComponent(jTextFieldNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellido)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrarPaciente)
                    .addComponent(jButtonSalir))
                .addGap(25, 25, 25))
        );

        jPanelCardLayout.add(jPanelRegistrar, "cardRegistrar");

        jLabelIdConsulta.setText("Numero de identificacion");

        jTextAreaConsultas.setColumns(20);
        jTextAreaConsultas.setRows(5);
        jScrollPane1.setViewportView(jTextAreaConsultas);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultarLayout = new javax.swing.GroupLayout(jPanelConsultar);
        jPanelConsultar.setLayout(jPanelConsultarLayout);
        jPanelConsultarLayout.setHorizontalGroup(
            jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelConsultarLayout.createSequentialGroup()
                        .addComponent(jLabelIdConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelConsultarLayout.setVerticalGroup(
            jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdConsulta)
                    .addComponent(jTextFieldIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelCardLayout.add(jPanelConsultar, "cardConsultar");

        jLabelIdIndicador.setText("Numero de identificacion");

        jButtonEnviar.setText("Enviar");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jTextPaneArea);

        javax.swing.GroupLayout jPanelIndicadoresLayout = new javax.swing.GroupLayout(jPanelIndicadores);
        jPanelIndicadores.setLayout(jPanelIndicadoresLayout);
        jPanelIndicadoresLayout.setHorizontalGroup(
            jPanelIndicadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIndicadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIdIndicador)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldIdIndicador, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEnviar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIndicadoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelIndicadoresLayout.setVerticalGroup(
            jPanelIndicadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIndicadoresLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelIndicadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdIndicador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdIndicador)
                    .addComponent(jButtonEnviar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelCardLayout.add(jPanelIndicadores, "cardIndicadores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(526, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(169, 169, 169)
                    .addComponent(jPanelCardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(106, 106, 106))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelCardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
        //jPanelRegistrar.setSize(400,300);
        //jPanelRegistrar.setLocation(5,5);
        //jPanelMenu.setVisible(false);
        cardLayout.show(jPanelCardLayout, "cardRegistrar");
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:
       cardLayout.show(jPanelCardLayout, "cardConsultar");
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonEnviarIndicadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarIndicadoresActionPerformed
        // TODO add your handling code here:
        cardLayout.show(jPanelCardLayout, "cardIndicadores");
       
    }//GEN-LAST:event_jButtonEnviarIndicadoresActionPerformed

    private void jButtonRegistrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarPacienteActionPerformed
        // TODO add your handling code here:
        String tipo_id="";
        
       if((!jRadioButtonCC.isSelected() && !jRadioButtonTI.isSelected() && !jRadioButtonPP.isSelected()) ||
          jTextFieldId.getText().isEmpty() || jTextFieldNombres.getText().isEmpty() || 
          jTextFieldApellidos.getText().isEmpty() || jTextFieldDireccion.getText().isEmpty()) 
        {
               JOptionPane.showMessageDialog(null, "Datos requeridos no deben estar vacios!!!");
        }else
        {
            if(jRadioButtonCC.isSelected())
                tipo_id = "CC";
            if(jRadioButtonTI.isSelected())
                tipo_id = "TI";
            if(jRadioButtonPP.isSelected())
                tipo_id = "PP";
        
            ClsAsintomaticoDTO paciente = new ClsAsintomaticoDTO(jTextFieldNombres.getText(),jTextFieldApellidos.getText(),tipo_id, Integer.parseInt(jTextFieldId.getText()), jTextFieldDireccion.getText());
            ClsAsintomaticoCllbckImpl asintomatico;

            try {
                asintomatico = new ClsAsintomaticoCllbckImpl(paciente,this);
                if(objetoRemotoServidorAlertas.registrarAsintomatico(asintomatico) ){
                    JOptionPane.showMessageDialog(null, "Se registro paciente exitosamente!!!");
                    limpiarPanelRegistrar();
                }else
                    JOptionPane.showMessageDialog(null, "Error de registro de paciente o ya se registraron el maximo numero de pacientes!!!");

            } catch (RemoteException ex) {
                Logger.getLogger(GUICliente.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }
    }//GEN-LAST:event_jButtonRegistrarPacienteActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
            // TODO add your handling code here:
            ClsAsintomaticoDTO pacienteAsintomatico = objetoRemotoServidorAlertas.consultarAsintomatico(Integer.parseInt(jTextFieldIdConsulta.getText()) );
            if(pacienteAsintomatico != null)
            {
                jTextAreaConsultas.append("Datos del paciente asintomatico\n");
                jTextAreaConsultas.append("Nombres: "+pacienteAsintomatico.getNombres()+"\n");
                jTextAreaConsultas.append("Apellidos: "+pacienteAsintomatico.getApellidos()+"\n");
                jTextAreaConsultas.append("Tipo de Id: "+pacienteAsintomatico.getTipo_id()+"\n");
                jTextAreaConsultas.append("Id: "+pacienteAsintomatico.getId()+"\n");
                jTextAreaConsultas.append("Direccion: "+pacienteAsintomatico.getDireccion()+"\n");
                jTextAreaConsultas.append("Datos del paciente asintomatico consultados exitosamente!!!\n");
            }else
            {
                JOptionPane.showMessageDialog(null,"No se consulto paciente asintomatico (error de consulta o el paciente no existe!!!)");
            }
        } catch (RemoteException ex) {
            Logger.getLogger(GUICliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        // TODO add your handling code here:
        Thread enviarIndicadores = new Thread(this);
        enviarIndicadores.start();
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jTextFieldIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdKeyTyped
        // TODO add your handling code here:
        int longitudCadena = 0;
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar))
        {   evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Ingrese solo numeros!!!");
        }
        longitudCadena = jTextFieldId.getText().length();
        
        if(longitudCadena >= 5)
        {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"El id del paciente debe estar entre 0 y 99999!!!");
        }
        
        
    }//GEN-LAST:event_jTextFieldIdKeyTyped

    private void jTextFieldNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombresKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar))
        {   evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Ingrese solo letras!!!");
        }
        if(jTextFieldNombres.getText().length() >= 30)
        {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"El nombre del paciente debe ser maximo de 30 caracteres!!!");
        }
        
    }//GEN-LAST:event_jTextFieldNombresKeyTyped

    private void jTextFieldApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidosKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar))
        {   evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Ingrese solo letras!!!");
        }
        if(jTextFieldApellidos.getText().length() >= 30)
        {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"El apellido del paciente debe ser maximo de 30 caracteres!!!");
        }
    }//GEN-LAST:event_jTextFieldApellidosKeyTyped

    private void jTextFieldDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDireccionKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar))
        {   evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Ingresar solo letras!!!");
        }
        if(jTextFieldDireccion.getText().length() >= 30)
        {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"La direccion del paciente debe ser maximo de 30 caracteres!!!");
        }
    }//GEN-LAST:event_jTextFieldDireccionKeyTyped

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
        
        File archivo = new File("historialDeAlertas.txt");
        if(archivo.delete())
            System.out.println("El archivo historialDeAlertas.txt ha sido borrado satisfactoriamente!!!");
        else System.out.println("El archivo historialDeAlertas.txt no se ha podido borrar o no existe!!!");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipo;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButtonEnviarIndicadores;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonRegistrarPaciente;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelIdConsulta;
    private javax.swing.JLabel jLabelIdIndicador;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTipoId;
    private javax.swing.JPanel jPanelCardLayout;
    private javax.swing.JPanel jPanelConsultar;
    private javax.swing.JPanel jPanelIndicadores;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelRegistrar;
    private javax.swing.JRadioButton jRadioButtonCC;
    private javax.swing.JRadioButton jRadioButtonPP;
    private javax.swing.JRadioButton jRadioButtonTI;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaConsultas;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldIdConsulta;
    private javax.swing.JTextField jTextFieldIdIndicador;
    private javax.swing.JTextField jTextFieldNombres;
    private javax.swing.JTextPane jTextPaneArea;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        try {

            while (true) {
                //hacemos un ciclo infinito
                try {
                    float ToC = (float) (Math.random() * 7 + 35);
                    int fCardiaca = (int) (Math.random() * 31 + 55);
                    int fRespiratoria = (int) (Math.random() * 31 + 65);
                    appendToPane(jTextPaneArea, "\nEnviando indicadores...\n", Color.blue);
                    appendToPane(jTextPaneArea, "Frecuencia cardiaca: " + fCardiaca+"\n", Color.black);
                    appendToPane(jTextPaneArea, "Frecuencia respiratoria: " + fRespiratoria+"\n", Color.black);
                    appendToPane(jTextPaneArea, "Temperatura " + ToC + " C.\n", Color.black);
                    objetoRemotoServidorAlertas.enviarIndicadores(Integer.parseInt(jTextFieldIdIndicador.getText()), fCardiaca, fRespiratoria, ToC);

                    
                    Thread.sleep(8000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        } catch (RemoteException e) {
            System.out.println("La operacion no se pudo completar, intente nuevamente...");
            System.out.println("Excepcion generada: " + e.getMessage());
        }
    }
    private void appendToPane(JTextPane tp, String msg, Color c)
    {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        int len = tp.getDocument().getLength();
        tp.setCaretPosition(len);
        tp.setCharacterAttributes(aset, false);
        tp.replaceSelection(msg);
    }


}
