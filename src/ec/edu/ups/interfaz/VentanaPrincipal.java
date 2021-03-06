/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfaz;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.modelo.Usuario;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author braya
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    //ventanas
    private VentanaRegistrarUsuario ventanaRegistrar;
    private VentanaIniciarSesion ventanaIniciar;
    private EditarUsuario ventanaEditarUsuario;
    private AgregarTelefono1 ventantaAgregarTelf;
    private TelefonosporUsuario1 telefonoPorUsuario;
    //mvc
    private ControladorUsuario ctrlUsuario;
    private ControladorTelefono ctrlTelefono;
    //
    private Usuario usuario;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        menuItemCerrar.setVisible(false);
        menuGestionar.setVisible(false);
        //instanciar controladores
        ctrlUsuario = new ControladorUsuario();
        ctrlTelefono = new ControladorTelefono();
        //instanciar ventanas
        ventanaIniciar = new VentanaIniciarSesion(ctrlUsuario,this);
        ventanaRegistrar = new VentanaRegistrarUsuario(ctrlUsuario);
        ventanaEditarUsuario = new EditarUsuario(ctrlUsuario, this);
        ventantaAgregarTelf = new AgregarTelefono1(ctrlUsuario, ctrlTelefono);
        telefonoPorUsuario = new TelefonosporUsuario1(ctrlUsuario, ctrlTelefono);
        
        this.setExtendedState(MAXIMIZED_HORIZ);
        this.setExtendedState(MAXIMIZED_VERT);
    }
    
    public JMenu getMenuAgenda() {
        return menuGestionar;
    }

    public JMenuItem getMenuItemCerrar() {
        return menuItemCerrar;
    }

    public JMenuItem getMenuItemIniciarSesion() {
        return menuItemIniciarSesion;
    }

    public JMenuItem getMenuItemListarUs() {
        return menuItemListarUs;
    }

    public JMenuItem getMenuItemRegistar() {
        return menuItemRegistar;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuMenu = new javax.swing.JMenu();
        menuItemIniciarSesion = new javax.swing.JMenuItem();
        menuItemRegistar = new javax.swing.JMenuItem();
        menuItemListarUs = new javax.swing.JMenuItem();
        menuItemCerrar = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();
        menuGestionar = new javax.swing.JMenu();
        menuItemtTelefono = new javax.swing.JMenuItem();
        menuItemUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

        menuMenu.setMnemonic('f');
        menuMenu.setText("Menu");

        menuItemIniciarSesion.setMnemonic('o');
        menuItemIniciarSesion.setText("Iniciar Sesion");
        menuItemIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIniciarSesionActionPerformed(evt);
            }
        });
        menuMenu.add(menuItemIniciarSesion);

        menuItemRegistar.setMnemonic('s');
        menuItemRegistar.setText("Registrar");
        menuItemRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistarActionPerformed(evt);
            }
        });
        menuMenu.add(menuItemRegistar);

        menuItemListarUs.setMnemonic('a');
        menuItemListarUs.setText("Listar telefonos del usuario");
        menuItemListarUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarUsActionPerformed(evt);
            }
        });
        menuMenu.add(menuItemListarUs);

        menuItemCerrar.setText("Cerrar Sesion");
        menuItemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarActionPerformed(evt);
            }
        });
        menuMenu.add(menuItemCerrar);

        menuItemSalir.setMnemonic('x');
        menuItemSalir.setText("Exit");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuMenu.add(menuItemSalir);

        menuBar.add(menuMenu);

        menuGestionar.setMnemonic('e');
        menuGestionar.setText("Gestionar");

        menuItemtTelefono.setMnemonic('t');
        menuItemtTelefono.setText("Tefonos");
        menuItemtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemtTelefonoActionPerformed(evt);
            }
        });
        menuGestionar.add(menuItemtTelefono);

        menuItemUsuario.setText("Usuario");
        menuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuarioActionPerformed(evt);
            }
        });
        menuGestionar.add(menuItemUsuario);

        menuBar.add(menuGestionar);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void menuItemIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIniciarSesionActionPerformed
        desktopPane.add(ventanaIniciar);
        ventanaIniciar.setVisible(true);
    }//GEN-LAST:event_menuItemIniciarSesionActionPerformed

    private void menuItemRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistarActionPerformed
        desktopPane.add(ventanaRegistrar);
        ventanaRegistrar.setVisible(true);
    }//GEN-LAST:event_menuItemRegistarActionPerformed

    private void menuItemtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemtTelefonoActionPerformed
        desktopPane.add(ventantaAgregarTelf);
        ventantaAgregarTelf.setVisible(true);
    }//GEN-LAST:event_menuItemtTelefonoActionPerformed

    private void menuItemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarActionPerformed
        // TODO add your handling code here:
        menuItemIniciarSesion.setVisible(true);
        menuItemRegistar.setVisible(true);
        getMenuAgenda().setVisible(false);
    }//GEN-LAST:event_menuItemCerrarActionPerformed

    private void menuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUsuarioActionPerformed
        this.abrir(ventanaEditarUsuario);
    }//GEN-LAST:event_menuItemUsuarioActionPerformed

    private void menuItemListarUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarUsActionPerformed
        // TODO add your handling code here:
        desktopPane.add(telefonoPorUsuario);
        telefonoPorUsuario.setVisible(true);
    }//GEN-LAST:event_menuItemListarUsActionPerformed
    
    public void abrir(JInternalFrame frame){
//        this.desktopPane.add(frame);
        this.desktopPane.add(frame);
        frame.setVisible(true);
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuGestionar;
    private javax.swing.JMenuItem menuItemCerrar;
    private javax.swing.JMenuItem menuItemIniciarSesion;
    private javax.swing.JMenuItem menuItemListarUs;
    private javax.swing.JMenuItem menuItemRegistar;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenuItem menuItemUsuario;
    private javax.swing.JMenuItem menuItemtTelefono;
    private javax.swing.JMenu menuMenu;
    // End of variables declaration//GEN-END:variables

}
