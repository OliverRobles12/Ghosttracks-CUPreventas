
package itson.org.ghosttracks.presentacion.preventas;

import itson.org.ghosttracks.controladores.ControladorPreventas;
import itson.org.ghosttracks.dtos.NuevaPreventaDTO;
import itson.org.ghosttracks.dtos.ProductoDTO;
import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author oliro
 */
public class PantallaNuevaPreventa extends javax.swing.JPanel {

    private final ControladorPreventas controlador;
    private ProductoDTO productoSeleccionado;
    private byte[] imagenSeleccionada = new byte[0];
    
    public PantallaNuevaPreventa(ControladorPreventas controlador) {
        this.controlador = controlador;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedor = new javax.swing.JPanel();
        panelRedondeado1 = new itson.org.ghosttracks.utilerias.PanelRedondeado();
        dtpFechaPublicacion = new com.github.lgooddatepicker.components.DateTimePicker();
        dpFechaLanzamiento = new com.github.lgooddatepicker.components.DatePicker();
        dpFechaProcesado = new com.github.lgooddatepicker.components.DatePicker();
        lblFechaPublicacion = new javax.swing.JLabel();
        lblFechaLanzamineto = new javax.swing.JLabel();
        lblFechaProcesado = new javax.swing.JLabel();
        txtPrecioPreventa = new itson.org.ghosttracks.utilerias.TextFieldRedondeado();
        lblNotaPreventa = new javax.swing.JLabel();
        txtStockAsignado = new itson.org.ghosttracks.utilerias.TextFieldRedondeado();
        lblStockAsignado = new javax.swing.JLabel();
        lblPrecioPreventa = new javax.swing.JLabel();
        lblStockAsignado1 = new javax.swing.JLabel();
        btnBuscarImagen = new itson.org.ghosttracks.utilerias.BotonRedondeado();
        lblNombreImagen = new javax.swing.JLabel();
        lblPreview = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaNota = new javax.swing.JTextArea();
        lblImagen = new javax.swing.JLabel();
        lblNombreProducto = new javax.swing.JLabel();
        lblFolioProducto = new javax.swing.JLabel();
        lblPrecioProducto = new javax.swing.JLabel();
        btnRegistrar = new itson.org.ghosttracks.utilerias.BotonRedondeado();
        btnDescartar = new javax.swing.JButton();
        btnBuscarArticulo = new itson.org.ghosttracks.utilerias.BotonRedondeado();

        panelContenedor.setBackground(new java.awt.Color(237, 229, 222));

        panelRedondeado1.setBackground(new java.awt.Color(217, 217, 217));
        panelRedondeado1.setForeground(new java.awt.Color(217, 217, 217));

        dtpFechaPublicacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dtpFechaPublicacion.setPreferredSize(new java.awt.Dimension(250, 25));

        dpFechaLanzamiento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dpFechaLanzamiento.setPreferredSize(new java.awt.Dimension(250, 25));

        dpFechaProcesado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dpFechaProcesado.setPreferredSize(new java.awt.Dimension(250, 25));

        lblFechaPublicacion.setBackground(new java.awt.Color(0, 0, 0));
        lblFechaPublicacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblFechaPublicacion.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaPublicacion.setText("Fecha publicacion");

        lblFechaLanzamineto.setBackground(new java.awt.Color(0, 0, 0));
        lblFechaLanzamineto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblFechaLanzamineto.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaLanzamineto.setText("Fecha lanzamiento");

        lblFechaProcesado.setBackground(new java.awt.Color(0, 0, 0));
        lblFechaProcesado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblFechaProcesado.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaProcesado.setText("Fecha procesado");

        txtPrecioPreventa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrecioPreventa.setPreferredSize(new java.awt.Dimension(250, 30));

        lblNotaPreventa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNotaPreventa.setForeground(new java.awt.Color(0, 0, 0));
        lblNotaPreventa.setText("Nota preventa");

        txtStockAsignado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtStockAsignado.setPreferredSize(new java.awt.Dimension(250, 30));

        lblStockAsignado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblStockAsignado.setForeground(new java.awt.Color(0, 0, 0));
        lblStockAsignado.setText("Stock asignado");

        lblPrecioPreventa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPrecioPreventa.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioPreventa.setText("Precio preventa");

        lblStockAsignado1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblStockAsignado1.setForeground(new java.awt.Color(0, 0, 0));
        lblStockAsignado1.setText("Imagen caratula");

        btnBuscarImagen.setBackground(new java.awt.Color(230, 94, 7));
        btnBuscarImagen.setText("Buscar ");
        btnBuscarImagen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBuscarImagen.setPreferredSize(new java.awt.Dimension(100, 25));
        btnBuscarImagen.addActionListener(this::btnBuscarImagenActionPerformed);

        lblNombreImagen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNombreImagen.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreImagen.setText("...");

        lblPreview.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPreview.setForeground(new java.awt.Color(0, 0, 0));
        lblPreview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreview.setText("Preview");

        txtAreaNota.setColumns(20);
        txtAreaNota.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAreaNota.setRows(5);
        jScrollPane1.setViewportView(txtAreaNota);

        lblImagen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblImagen.setForeground(new java.awt.Color(0, 0, 0));
        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen.setText("Imagen");
        lblImagen.setPreferredSize(new java.awt.Dimension(125, 125));

        lblNombreProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreProducto.setText("Nombre producto");

        lblFolioProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblFolioProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblFolioProducto.setText("Folio: PROD-1234");

        lblPrecioProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPrecioProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioProducto.setText("Precio: $1234");

        btnRegistrar.setBackground(new java.awt.Color(230, 94, 7));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRegistrar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        btnDescartar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDescartar.setForeground(new java.awt.Color(0, 0, 0));
        btnDescartar.setText("Descartar");
        btnDescartar.setBorderPainted(false);
        btnDescartar.setContentAreaFilled(false);
        btnDescartar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDescartar.addActionListener(this::btnDescartarActionPerformed);

        btnBuscarArticulo.setBackground(new java.awt.Color(230, 94, 7));
        btnBuscarArticulo.setText("Buscar articulo");
        btnBuscarArticulo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBuscarArticulo.setPreferredSize(new java.awt.Dimension(150, 25));
        btnBuscarArticulo.addActionListener(this::btnBuscarArticuloActionPerformed);

        javax.swing.GroupLayout panelRedondeado1Layout = new javax.swing.GroupLayout(panelRedondeado1);
        panelRedondeado1.setLayout(panelRedondeado1Layout);
        panelRedondeado1Layout.setHorizontalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado1Layout.createSequentialGroup()
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDescartar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado1Layout.createSequentialGroup()
                                .addGap(0, 9, Short.MAX_VALUE)
                                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                                        .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dtpFechaPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblFechaPublicacion))
                                        .addGap(27, 27, 27)
                                        .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblFechaLanzamineto)
                                            .addComponent(dpFechaLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                                                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblNombreProducto)
                                                    .addComponent(lblFolioProducto))
                                                .addGap(18, 18, 18)
                                                .addComponent(lblPrecioProducto))
                                            .addComponent(btnBuscarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNotaPreventa)
                                    .addComponent(txtPrecioPreventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrecioPreventa))
                                .addGap(18, 18, 18)
                                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                                        .addComponent(lblStockAsignado)
                                        .addGap(153, 153, 153))
                                    .addComponent(txtStockAsignado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)
                        .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFechaProcesado)
                            .addComponent(dpFechaProcesado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStockAsignado1)
                            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                                .addComponent(btnBuscarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreImagen))
                            .addComponent(lblPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        panelRedondeado1Layout.setVerticalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                        .addComponent(lblNombreProducto)
                        .addGap(18, 18, 18)
                        .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFolioProducto)
                            .addComponent(lblPrecioProducto))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaPublicacion)
                    .addComponent(lblFechaLanzamineto)
                    .addComponent(lblFechaProcesado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtpFechaPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpFechaLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpFechaProcesado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrecioPreventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                        .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStockAsignado)
                            .addComponent(lblPrecioPreventa)
                            .addComponent(lblStockAsignado1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnBuscarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNombreImagen))
                            .addComponent(txtStockAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(lblNotaPreventa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDescartar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(panelRedondeado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(panelRedondeado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarArticuloActionPerformed
        ProductoDTO producto = this.controlador.buscarArticulo();
        if (producto != null) {
            this.cargarProducto(producto);
        }
    }//GEN-LAST:event_btnBuscarArticuloActionPerformed

    private void btnDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarActionPerformed
        this.controlador.irPantallaPreventas();
    }//GEN-LAST:event_btnDescartarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        NuevaPreventaDTO nuevaPreventa = validarCampos();
        if (nuevaPreventa != null) {
            this.controlador.registrarPreventa(nuevaPreventa);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarImagenActionPerformed
        seleccionarImagenCaratula();
    }//GEN-LAST:event_btnBuscarImagenActionPerformed

    private void cargarProducto(ProductoDTO producto) {
        this.productoSeleccionado = producto;
        String nombre = String.format("%s - %s", producto.getNombre(), producto.getTipoProducto().name().toLowerCase());
        lblNombreProducto.setText(nombre); // Agregamos el nombre - tipo producto
        String folio = String.format("Folio: %s", producto.getFolio());
        lblFolioProducto.setText(folio);
        String precio = String.format("Precio: $%.2f", producto.getPrecio());
        lblPrecioProducto.setText(precio);
        
        try {
            String nombreArchivo = producto.getImgProducto();
            
            String ruta = "/imgCatalogo/" + nombreArchivo;
            
            if (ruta != null && !ruta.isEmpty()) {
                java.net.URL urlImagenLocal = getClass().getResource(ruta);
                
                if (urlImagenLocal != null) {
                    java.awt.Image imagenOriginal = javax.imageio.ImageIO.read(urlImagenLocal);
                    
                    java.awt.Image imagenEscalada = imagenOriginal.getScaledInstance(125, 125, java.awt.Image.SCALE_SMOOTH);
                    
                    lblImagen.setIcon(new javax.swing.ImageIcon(imagenEscalada));
                    lblImagen.setText(""); // Limpiamos placeHolder
                } else {
                    throw new Exception("Ruta no encontrada: " + ruta);
                }
            }
        } catch (Exception e) {
            lblImagen.setIcon(null);
            lblImagen.setText("Imagen no disp.");
        }
        
    }
    
    private NuevaPreventaDTO validarCampos() {
        
        // Validar producto 
        if (productoSeleccionado == null) {
            controlador.mostrarMensaje("Es necesario seleccionar un producto.", true);
        }
        
        LocalDateTime fechaPublicacion = dtpFechaPublicacion.getDateTimeStrict();
        LocalDate fechaLanzamientoRaw = dpFechaLanzamiento.getDate(); 
        LocalDate fechaProcesadoRaw = dpFechaProcesado.getDate();
        
        // Validar fechas que no sean nulas (Antes de convertir a LocalDateTime)
        if (fechaPublicacion == null || fechaLanzamientoRaw == null || fechaProcesadoRaw == null) {
            controlador.mostrarMensaje("Todas las fechas son obligatorias.", true);
            return null;
        }
        
        LocalDateTime fechaLanzamiento = fechaLanzamientoRaw.atStartOfDay();
        LocalDateTime fechaProcesado = fechaProcesadoRaw.atStartOfDay();
        
        // Validar precio
        float precio;
        try {
            String precioTxt = txtPrecioPreventa.getText().trim();
            precio = Float.parseFloat(precioTxt);
            if (precio <= 0) {
                controlador.mostrarMensaje("El precio debe ser mayor a 0.", true);
                return null;
            }
        } catch (NumberFormatException e) {
            controlador.mostrarMensaje("El precio debe ser un número decimal válido.", true);
            return null;
        }
        
        // Validar stock
        int stock;
        try {
            stock = Integer.parseInt(txtStockAsignado.getText().trim());
            if (stock <= 0) {
                controlador.mostrarMensaje("El stock debe ser mayor a 0.", true);
                return null;
            }
        } catch (NumberFormatException e) {
            controlador.mostrarMensaje("El stock debe ser un número entero válido.", true);
            return null;
        }

        // Validar nota
        String nota = txtAreaNota.getText().trim();
        if (nota.isEmpty()) {
            controlador.mostrarMensaje("La nota de preventa no puede estar vacía.", true);
            return null;
        }
        
        // Construir NuevaPreventaDTO
        NuevaPreventaDTO dto = new NuevaPreventaDTO(
                null,                  // folio nulo
                fechaPublicacion,      // fechaPublicacion
                fechaLanzamiento,      // fechaLanzamiento
                fechaProcesado,        // fechaProcesado
                null,                  // estado nulo 
                stock,                 // stockAsignado
                precio,                // precio
                nota,                  // nota
                imagenSeleccionada,    // imagen (byte[]) 
                productoSeleccionado   // productoDTO
        );
        
        return dto;
        
    }

    private void seleccionarImagenCaratula() {
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar Carátula del Producto");

        // Agregamos un filtro de los archivos visibles para el usuario
        FileNameExtensionFilter filtroFormatos = new FileNameExtensionFilter(
            "Imágenes (JPG, JPEG, PNG)", "jpg", "jpeg", "png"
        );
        fileChooser.setFileFilter(filtroFormatos);
        fileChooser.setAcceptAllFileFilterUsed(false); // Desactivamos opcion mostrar todos los archivos

        // Abrimos la ventana
        int seleccion = fileChooser.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();

            long limiteMaximoBytes = 4 * 1024 * 1024; 

            // Validamos el tamaño del archivo
            if (archivoSeleccionado.length() > limiteMaximoBytes) {
                JOptionPane.showMessageDialog(this, 
                    "El archivo es demasiado grande. El tamaño máximo permitido es de 2 MB.", 
                    "Archivo excedido", 
                    JOptionPane.WARNING_MESSAGE);
                return; // Rompe la ejecucion para no cargar el archivo
            }

            // Verificamos nuevamente el formato
            String nombreArchivo = archivoSeleccionado.getName().toLowerCase();
            if (!nombreArchivo.endsWith(".jpg") && !nombreArchivo.endsWith(".jpeg") && !nombreArchivo.endsWith(".png")) {
                JOptionPane.showMessageDialog(this, 
                    "Formato no válido. Asegúrate de que termine en .jpg, .jpeg o .png.", 
                    "Formato incorrecto", 
                    JOptionPane.ERROR_MESSAGE);
                return; // Rompe la ejecución
            }

            // Cargamos la caratula rescalandola a las dimenciones del JLabel
            try {
                
                // Convertimos el archivo a un arreglo de bytes
                this.imagenSeleccionada = Files.readAllBytes(archivoSeleccionado.toPath());
                
                ImageIcon iconoOriginal = new ImageIcon(archivoSeleccionado.getAbsolutePath());
                int ancho = lblPreview.getWidth();
                int alto = lblPreview.getHeight();

                // Validar que el label tenga un tamaño visible antes de escalar
                if (ancho > 0 && alto > 0) {
                    Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
                    lblPreview.setIcon(new ImageIcon(imagenEscalada));
                    lblPreview.setText(""); // Borramos el placeholder
                }
                
                // Opcional: Guarda la ruta absoluta en una variable global para cuando le den a "Registrar"
                // stringRutaImagenGlobal = archivoSeleccionado.getAbsolutePath();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, 
                    "Error al procesar la imagen", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private itson.org.ghosttracks.utilerias.BotonRedondeado btnBuscarArticulo;
    private itson.org.ghosttracks.utilerias.BotonRedondeado btnBuscarImagen;
    private javax.swing.JButton btnDescartar;
    private itson.org.ghosttracks.utilerias.BotonRedondeado btnRegistrar;
    private com.github.lgooddatepicker.components.DatePicker dpFechaLanzamiento;
    private com.github.lgooddatepicker.components.DatePicker dpFechaProcesado;
    private com.github.lgooddatepicker.components.DateTimePicker dtpFechaPublicacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaLanzamineto;
    private javax.swing.JLabel lblFechaProcesado;
    private javax.swing.JLabel lblFechaPublicacion;
    private javax.swing.JLabel lblFolioProducto;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombreImagen;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblNotaPreventa;
    private javax.swing.JLabel lblPrecioPreventa;
    private javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JLabel lblPreview;
    private javax.swing.JLabel lblStockAsignado;
    private javax.swing.JLabel lblStockAsignado1;
    private javax.swing.JPanel panelContenedor;
    private itson.org.ghosttracks.utilerias.PanelRedondeado panelRedondeado1;
    private javax.swing.JTextArea txtAreaNota;
    private itson.org.ghosttracks.utilerias.TextFieldRedondeado txtPrecioPreventa;
    private itson.org.ghosttracks.utilerias.TextFieldRedondeado txtStockAsignado;
    // End of variables declaration//GEN-END:variables
}
