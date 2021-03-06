/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfaz;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author braya
 */
public class AgregarTelefono1 extends javax.swing.JInternalFrame {

    private ControladorUsuario ctrlUsuario;
    private ControladorTelefono ctrlTelf;

    private Telefono telefono;

    private VentanaIniciarSesion ventantaInciar;

    /**
     * Creates new form AgregarTelefono
     * @param ctrlUsuario
     * @param ctrlTelf
     */
    public AgregarTelefono1(ControladorUsuario ctrlUsuario, ControladorTelefono ctrlTelf) {
        initComponents();
        this.ctrlUsuario = ctrlUsuario;
        this.ctrlTelf = ctrlTelf;
        this.telefono = new Telefono();
        iniciar();
    }

    public void limpiar() {
        txtcCodigo.setText(String.valueOf(ctrlTelf.obtenerCodigo()));
        formatedTXTNumero.setValue("");
        cbxTipo.setSelectedIndex(0);
        cbxOperadora.setSelectedIndex(0);
    }

    public void cargarTelefonoTablatelf() {
        DefaultTableModel modelo = (DefaultTableModel) tablaTelefono.getModel();
        modelo.setRowCount(0);
        for (Telefono telefono : ctrlTelf.getListaObjetos()) {
            Object[] rowData = {telefono.getCodigo(), telefono.getNumero(), telefono.getTipo(), telefono.getOperadora()};
            modelo.addRow(rowData);
        }
        tablaTelefono.setModel(modelo);
    }

    public void codigoTelefono() {
        System.out.println("Codigo telefono = " + ctrlTelf.obtenerCodigo());
        txtcCodigo.setText(String.valueOf(ctrlTelf.obtenerCodigo()));
    }

    public void botonesEditar() {
        btnAgregar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }

    public void iniciar() {
        btnAgregar.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        codigoLabel = new javax.swing.JLabel();
        numerojLabel2 = new javax.swing.JLabel();
        tipojLabel3 = new javax.swing.JLabel();
        operadorajLabel4 = new javax.swing.JLabel();
        txtcCodigo = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        cbxOperadora = new javax.swing.JComboBox<>();
        formatedTXTNumero = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTelefono = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        codigoLabel.setText("Codigo");

        numerojLabel2.setText("Numero");

        tipojLabel3.setText("Tipo");

        operadorajLabel4.setText("Operadora");

        txtcCodigo.setEditable(false);
        txtcCodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtcCodigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtcCodigo.setText("0");

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "**Seleccione un tipo**", "Casa", "Trabajo", "Movil", "Fax" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });

        cbxOperadora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "**Seleccione una Operadora**", "Claro", "Movistar", "CNT", "Tuenti", "Etapa" }));

        tablaTelefono.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Numero", "Tipo", "Operadora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTelefonoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaTelefono);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar Edicion Telefono");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipojLabel3)
                            .addComponent(codigoLabel)
                            .addComponent(numerojLabel2)
                            .addComponent(operadorajLabel4))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtcCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(formatedTXTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoLabel))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipojLabel3))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numerojLabel2)
                    .addComponent(formatedTXTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(operadorajLabel4)
                    .addComponent(cbxOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        try {
            String item = (String) cbxTipo.getSelectedItem();
            if (item.equals("Casa") || item.equals("Trabajo")) {
                formatedTXTNumero.setFormatterFactory(
                        new javax.swing.text.DefaultFormatterFactory(
                                new javax.swing.text.MaskFormatter("(+593) ##-###-###")
                        ));
            } else if (item.equals("Movil")) {
                formatedTXTNumero.setFormatterFactory(
                        new javax.swing.text.DefaultFormatterFactory(
                                new javax.swing.text.MaskFormatter("(+593) ##-###-####")
                        ));
            } else if (item.equals("Fax")) {
                formatedTXTNumero.setFormatterFactory(
                        new javax.swing.text.DefaultFormatterFactory(
                                new javax.swing.text.MaskFormatter("(+593) ##-###-###")
                        ));
            }
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_cbxTipoActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        codigoTelefono();
        cargarTelefonoTablatelf();
        System.out.println(ctrlUsuario.getSesionIniciada());
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:

        String numero = formatedTXTNumero.getText();
        String tipo = cbxTipo.getSelectedItem().toString();
        String operadora = cbxOperadora.getSelectedItem().toString();

        if (tipo.equals(cbxTipo.getItemAt(0)) || operadora.equals(cbxOperadora.getItemAt(0)) || numero.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Falta campos por llenar");
        } else {
            var newtelf = new Telefono(Integer.valueOf(txtcCodigo.getText()), numero, tipo, operadora);
            ctrlTelf.create(newtelf);
            ctrlUsuario.getSesionIniciada().agregarTelefono(newtelf);
            System.out.println("Telefono agregado === " + ctrlTelf.read(new Telefono(Integer.valueOf(txtcCodigo.getText()), numero, tipo, operadora)));
            JOptionPane.showMessageDialog(null, "Datos agregados correctamente");
            cargarTelefonoTablatelf();
            codigoTelefono();
            limpiar();

        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        String numero = formatedTXTNumero.getText();
        String operadora = cbxOperadora.getSelectedItem().toString();
        String tipo = cbxTipo.getSelectedItem().toString();
        int cod = Integer.valueOf(txtcCodigo.getText());

        if (numero.isEmpty() || tipo.equals(cbxTipo.getItemAt(0)) || operadora.equals(cbxOperadora.getItemAt(0))) {
            JOptionPane.showMessageDialog(this, "Llene todos los requerimientos");
        } else {
            var newTelf = new Telefono(Integer.valueOf(txtcCodigo.getText()), numero, tipo, operadora);
            ctrlTelf.update(newTelf);
            ctrlUsuario.getSesionIniciada().actualizarTelefono(newTelf);
            System.out.println("Telefono actualizado === " + ctrlTelf.read(newTelf));
            JOptionPane.showMessageDialog(this, "Teléfono actualizado con exito");
            cargarTelefonoTablatelf();
            limpiar();

        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tablaTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTelefonoMouseClicked
        // TODO add your handling code here:
        int fila = tablaTelefono.getSelectedRow();

        txtcCodigo.setText(String.valueOf((int) tablaTelefono.getValueAt(fila, 0)));
        formatedTXTNumero.setValue(tablaTelefono.getValueAt(fila, 1).toString());
        cbxTipo.setSelectedItem(tablaTelefono.getValueAt(fila, 2).toString());
        cbxOperadora.setSelectedItem(tablaTelefono.getValueAt(fila, 3).toString());

        botonesEditar();
    }//GEN-LAST:event_tablaTelefonoMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int eliminarConfirmar = JOptionPane.showConfirmDialog(this, "¿Seguro quieres eliminar este telefono?");
        if (eliminarConfirmar == JOptionPane.YES_OPTION) {
            int codigo = Integer.valueOf(txtcCodigo.getText());
            var telefonoEliminar = ctrlTelf.read(ctrlTelf.comprobar(Integer.valueOf(txtcCodigo.getText())));
            ctrlTelf.delete(telefonoEliminar);
            System.out.println("Telefono eliminado == " + telefonoEliminar);
            System.out.println(ctrlTelf.findAll());
            JOptionPane.showMessageDialog(this, "Telefono eliminado exitosamente");
            cargarTelefonoTablatelf();
            limpiar();
            iniciar();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
        iniciar();
    }//GEN-LAST:event_btnCancelarActionPerformed

//    public Usuario devolverUsuario() {
//        for (int i = 0; i < ctrlUsuario.getListaObjetos().size(); i++) {
//            var us = ctrlUsuario.getListaObjetos().get(i);
//            if (ventanaEditar.getTxtCorreo().getText().equals(us.getCorreo())) {
//                return us;
//            }
//        }
//        return null;
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbxOperadora;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JFormattedTextField formatedTXTNumero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel numerojLabel2;
    private javax.swing.JLabel operadorajLabel4;
    private javax.swing.JTable tablaTelefono;
    private javax.swing.JLabel tipojLabel3;
    private javax.swing.JTextField txtcCodigo;
    // End of variables declaration//GEN-END:variables
}
