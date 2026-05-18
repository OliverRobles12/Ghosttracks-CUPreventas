
package itson.org.ghosttracks.presentacion.preventas;

import itson.org.ghosttracks.controladores.ControladorPreventas;
import itson.org.ghosttracks.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.dtos.PreventaDTO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oliro
 */
public class PantallaPreventas extends javax.swing.JPanel {

    private final ControladorPreventas controlador;
    
    public PantallaPreventas(ControladorPreventas controlador) {
        this.controlador = controlador;
        initComponents();
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenido = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPreventas = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnSolicitudes = new javax.swing.JButton();
        btnCrearPreventa = new javax.swing.JButton();
        btnGenerarPDF = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1100, 675));

        pnlContenido.setBackground(new java.awt.Color(237, 229, 222));
        pnlContenido.setPreferredSize(new java.awt.Dimension(1100, 675));

        tblPreventas.setBackground(new java.awt.Color(217, 217, 217));
        tblPreventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Folio", "Producto", "Tipo", "Stock", "Publicación", "Procesado", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPreventas);
        if (tblPreventas.getColumnModel().getColumnCount() > 0) {
            tblPreventas.getColumnModel().getColumn(0).setResizable(false);
            tblPreventas.getColumnModel().getColumn(1).setResizable(false);
            tblPreventas.getColumnModel().getColumn(2).setResizable(false);
            tblPreventas.getColumnModel().getColumn(3).setResizable(false);
            tblPreventas.getColumnModel().getColumn(4).setResizable(false);
            tblPreventas.getColumnModel().getColumn(5).setResizable(false);
            tblPreventas.getColumnModel().getColumn(6).setResizable(false);
        }

        btnEditar.setText("Editar");
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        btnSolicitudes.setText("Ver solicitudes");
        btnSolicitudes.addActionListener(this::btnSolicitudesActionPerformed);

        btnCrearPreventa.setText("Abrir preventa");
        btnCrearPreventa.addActionListener(this::btnCrearPreventaActionPerformed);

        btnGenerarPDF.setText("Generar PDF");

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCrearPreventa)
                    .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlContenidoLayout.createSequentialGroup()
                            .addComponent(btnGenerarPDF)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar)
                            .addGap(18, 18, 18)
                            .addComponent(btnSolicitudes))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btnCrearPreventa)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolicitudes)
                    .addComponent(btnEditar)
                    .addComponent(btnGenerarPDF))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearPreventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPreventaActionPerformed
        controlador.irPantallaNuevaPreventa();
    }//GEN-LAST:event_btnCrearPreventaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        controlador.irPantallaEditarPreventa();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSolicitudesActionPerformed

    private void cargarDatos() {
        List<PreventaDTO> preventas = controlador.consultarPreventas(new FiltroPreventaDTO());
        llenarTabla(preventas);
    }
    
    private void llenarTabla(List<PreventaDTO> preventas) {
        DefaultTableModel modelo = (DefaultTableModel) tblPreventas.getModel();
        modelo.setRowCount(0);
        
        for (PreventaDTO preventa : preventas) {
            
            Object[] fila = new Object[7]; 

            fila[0] = preventa.getFolioPreventa(); // Folio
            // TODO ver si unimos el nombre y el tipo en un campo
            fila[1] = preventa.getProducto().getNombre(); // Nombre producto TipoProducto(); // Tipo producto
            fila[3] = String.format("%d/%d", preventa.getStock(), preventa.getStockAsignado()); // Stock actual y stock asignado
            fila[4] = preventa.getFechaPublicacion(); // Fecha publicación de la preventa
            fila[5] = preventa.getFechaProcesado(); // Fecha para procesar las solicitudes
            fila[6] = preventa.getEstado(); // Estado actual de la preventa
            
            modelo.addRow(fila);
            
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearPreventa;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JButton btnSolicitudes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JTable tblPreventas;
    // End of variables declaration//GEN-END:variables
}
