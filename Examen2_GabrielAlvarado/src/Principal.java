
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gabriel Alvarado
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        popub = new javax.swing.JPopupMenu();
        Remover = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        Agregar = new javax.swing.JMenuItem();
        popub2 = new javax.swing.JPopupMenu();
        Agregar2 = new javax.swing.JMenuItem();
        borrar2 = new javax.swing.JMenuItem();
        tab_1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        a_codigo = new javax.swing.JTextField();
        a_marca = new javax.swing.JTextField();
        a_precio = new javax.swing.JTextField();
        a_camioneta = new javax.swing.JRadioButton();
        a_Pickup = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        a_fecha = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Arbol = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mostracion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox();

        Remover.setText("Remover");
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });
        popub.add(Remover);

        Salir.setText("Salir");
        popub.add(Salir);

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        popub.add(Agregar);

        Agregar2.setText("Agregar a favoritos");
        Agregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar2ActionPerformed(evt);
            }
        });
        popub2.add(Agregar2);

        borrar2.setText("Eliminar del Arbol");
        popub2.add(borrar2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_1MouseClicked(evt);
            }
        });
        tab_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Codigo");
        tab_1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setText("Marca");
        tab_1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 177, -1, -1));

        jLabel4.setText("Modelo");
        tab_1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 233, -1, -1));

        jLabel5.setText("Precio");
        tab_1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 333, -1, -1));
        tab_1.add(a_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 152, -1));

        a_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_marcaActionPerformed(evt);
            }
        });
        tab_1.add(a_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 174, 152, -1));
        tab_1.add(a_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 152, -1));

        a_camioneta.setText("Camioneta");
        a_camioneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_camionetaActionPerformed(evt);
            }
        });
        tab_1.add(a_camioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 229, -1, -1));

        a_Pickup.setText("PickUp");
        a_Pickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_PickupActionPerformed(evt);
            }
        });
        tab_1.add(a_Pickup, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        jLabel7.setText("fecha");
        tab_1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 283, -1, -1));
        tab_1.add(a_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 280, 130, 20));

        getContentPane().add(tab_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 320, 410));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Inventario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 150, -1));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        Arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        Arbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArbolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Arbol);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 330, 380));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostracion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "FECHA", "MODELO", "PRECIO"
            }
        ));
        jScrollPane2.setViewportView(mostracion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 356, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 400, 260));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Detalle del vehiculo favorito seleccionado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, -1, 20));

        jLabel9.setText("Favoritos");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, -1, -1));

        combobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboboxItemStateChanged(evt);
            }
        });
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });
        getContentPane().add(combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_marcaActionPerformed

    private void a_PickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_PickupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_PickupActionPerformed

    private void a_camionetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_camionetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_camionetaActionPerformed

    private void tab_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_1MouseClicked
        if (evt.isMetaDown()) {
           
                popub.show(evt.getComponent(), evt.getX(), evt.getY());
            
        }
    }//GEN-LAST:event_tab_1MouseClicked

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        a_codigo.setText("");
        a_marca.setText("");
        a_precio.setText("");
        a_fecha.setDate(null);
    }//GEN-LAST:event_RemoverActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
  
                
        String codigo = "", marca = "", modelo = "";
        Date fecha = null;
        int precio = 0;
     
            codigo = a_codigo.getText();
            marca = a_marca.getText();
            if (a_camioneta.isSelected()) {
                modelo = "Camioneta";
            } else {
                modelo = "PickUp";
            }
            fecha = a_fecha.getDate();
            precio = Integer.parseInt(a_precio.getText());
            ListVehiculos.add(new Vehiculo(codigo,marca, modelo, fecha, precio));
            
        DefaultTreeModel m = (DefaultTreeModel) Arbol.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode nodo_persona;
        nodo_persona = new DefaultMutableTreeNode(new Vehiculo(codigo,marca, modelo, fecha, precio));
        DefaultMutableTreeNode año;
        DefaultMutableTreeNode mes;
        DefaultMutableTreeNode Dia;
        año = new DefaultMutableTreeNode(new SimpleDateFormat("YYYY").format(new Date()));
        mes = new DefaultMutableTreeNode(new SimpleDateFormat("MM").format(new Date()));
        Dia = new DefaultMutableTreeNode(new SimpleDateFormat("dd").format(new Date()));
        nodo_persona.add(año);
        año.add(mes);
        mes.add(Dia);
        raiz.add(nodo_persona);
        m.reload();


    }//GEN-LAST:event_AgregarActionPerformed

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        for (Vehiculo t : ListVehiculos) {
            if (t instanceof Vehiculo) {
                model.addElement(t);
            }
            combobox.setModel(model);
        }


    }//GEN-LAST:event_comboboxActionPerformed

    private void Agregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar2ActionPerformed
    DefaultComboBoxModel model = new DefaultComboBoxModel();

        for (Vehiculo t : ListVehiculos) {
            if (t instanceof Vehiculo) {
                model.addElement(t);
            }
         
        }
           combobox.setModel(model);
    }//GEN-LAST:event_Agregar2ActionPerformed

    private void ArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArbolMouseClicked
    if (evt.isMetaDown())
    {
        popub2.show(evt.getComponent(), evt.getX(), evt.getY());
    }
    }//GEN-LAST:event_ArbolMouseClicked

    private void comboboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboboxItemStateChanged
        DefaultTableModel model = (DefaultTableModel)mostracion.getModel();
        if (evt.getStateChange()==2) {
            
            for (Vehiculo t : ListVehiculos) {
                
             Object[]fila={t.getCodigo(),t.getFecha(),t.getMarca(),t.getModelo(),t.getPrecio()};
            }
           
           
        }
    }//GEN-LAST:event_comboboxItemStateChanged

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Agregar;
    private javax.swing.JMenuItem Agregar2;
    private javax.swing.JTree Arbol;
    private javax.swing.JMenuItem Remover;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JRadioButton a_Pickup;
    private javax.swing.JRadioButton a_camioneta;
    private javax.swing.JTextField a_codigo;
    private com.toedter.calendar.JDateChooser a_fecha;
    private javax.swing.JTextField a_marca;
    private javax.swing.JTextField a_precio;
    private javax.swing.JMenuItem borrar2;
    private javax.swing.JComboBox combobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable mostracion;
    private javax.swing.JPopupMenu popub;
    private javax.swing.JPopupMenu popub2;
    private javax.swing.JPanel tab_1;
    // End of variables declaration//GEN-END:variables
ArrayList<Vehiculo> ListVehiculos = new ArrayList();
}