
package itson.org.ghosttracks.utilerias;

import itson.org.ghosttracks.controladores.ControladorPreventas;
import itson.org.ghosttracks.dtos.FiltroProductoDTO;
import itson.org.ghosttracks.dtos.ProductoDTO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oliro
 */
public class DialogBuscadorProducto extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DialogBuscadorProducto.class.getName());

    private final ControladorPreventas controlador;
    private ProductoDTO productoSeleccionado;
    
    public DialogBuscadorProducto(java.awt.Frame parent, boolean modal, ControladorPreventas controlador) {
        super(parent, modal);
        this.controlador = controlador;
        initComponents();
        this.setLocationRelativeTo(parent);
        this.cargarDatos(new FiltroProductoDTO()); // Pasamos un nuevo FiltroProductoDTO vacio para traer todos los registros
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRedondeado1 = new itson.org.ghosttracks.utilerias.PanelRedondeado();
        textFieldRedondeado1 = new itson.org.ghosttracks.utilerias.TextFieldRedondeado();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnSeleccionar = new itson.org.ghosttracks.utilerias.BotonRedondeado();
        btnDescartar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscador de productos");

        jPanel1.setBackground(new java.awt.Color(237, 229, 222));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 675));

        panelRedondeado1.setBackground(new java.awt.Color(217, 217, 217));
        panelRedondeado1.setForeground(new java.awt.Color(217, 217, 217));

        textFieldRedondeado1.setText("Nombre de un producto");
        textFieldRedondeado1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldRedondeado1.setPreferredSize(new java.awt.Dimension(200, 30));

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(150, 30));

        javax.swing.GroupLayout panelRedondeado1Layout = new javax.swing.GroupLayout(panelRedondeado1);
        panelRedondeado1.setLayout(panelRedondeado1Layout);
        panelRedondeado1Layout.setHorizontalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(textFieldRedondeado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelRedondeado1Layout.setVerticalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldRedondeado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tblProductos.setBackground(new java.awt.Color(217, 217, 217));
        tblProductos.setForeground(new java.awt.Color(0, 0, 0));
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Nombre", "Artista", "Tipo", "Stock", "Estado", "ProductoDTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setResizable(false);
            tblProductos.getColumnModel().getColumn(1).setResizable(false);
            tblProductos.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblProductos.getColumnModel().getColumn(2).setResizable(false);
            tblProductos.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(3).setResizable(false);
            tblProductos.getColumnModel().getColumn(4).setResizable(false);
            tblProductos.getColumnModel().getColumn(5).setResizable(false);
            tblProductos.getColumnModel().getColumn(6).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        btnSeleccionar.setBackground(new java.awt.Color(230, 94, 7));
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSeleccionar.addActionListener(this::btnSeleccionarActionPerformed);

        btnDescartar.setBackground(new java.awt.Color(0, 0, 0));
        btnDescartar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDescartar.setForeground(new java.awt.Color(0, 0, 0));
        btnDescartar.setText("Descartar");
        btnDescartar.setContentAreaFilled(false);
        btnDescartar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDescartar.addActionListener(this::btnDescartarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDescartar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelRedondeado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelRedondeado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDescartar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ProductoDTO mostrar() {
        this.setVisible(true);
        return productoSeleccionado;
    }
    
    private void cargarDatos(FiltroProductoDTO filtro) {
        List<ProductoDTO> productos = controlador.consultarProductos(filtro);
        llenarTabla(productos);
    }
    
    private void llenarTabla(List<ProductoDTO> productos) {
        
        DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
        modelo.setRowCount(0);
        
        for (ProductoDTO producto : productos) {
            
            Object[] fila = new Object[7]; 

            fila[0] = producto.getFolio(); // Folio
            fila[1] = producto.getNombre(); // Nombre del producto
            fila[2] = producto.getArtista(); // Artista
            fila[3] = producto.getTipoProducto().name(); // Tipo de producto
            fila[4] = producto.getStock(); // Stock del producto
            fila[5] = producto.getEstado().name(); // Estado del producto
            fila[6] = producto;
            
            modelo.addRow(fila);
            
        }
        
    }
    
    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        
        int filaSeleccionada = tblProductos.getSelectedRow();
        
        if (filaSeleccionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(
                this, 
                "Por favor, seleccione un producto de la tabla.", 
                "Advertencia", 
                javax.swing.JOptionPane.WARNING_MESSAGE
            );
            return; 
        }

        this.productoSeleccionado = (ProductoDTO) tblProductos.getValueAt(filaSeleccionada, 6);
        this.dispose();
        
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarActionPerformed
        this.productoSeleccionado = null;
        this.dispose();
    }//GEN-LAST:event_btnDescartarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescartar;
    private itson.org.ghosttracks.utilerias.BotonRedondeado btnSeleccionar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private itson.org.ghosttracks.utilerias.PanelRedondeado panelRedondeado1;
    private javax.swing.JTable tblProductos;
    private itson.org.ghosttracks.utilerias.TextFieldRedondeado textFieldRedondeado1;
    // End of variables declaration//GEN-END:variables
}
