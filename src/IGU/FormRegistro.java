package IGU;

import Logica.Controladora;
import javax.swing.JOptionPane;


public class FormRegistro extends javax.swing.JFrame {

    public FormRegistro() {
        initComponents();
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblImagenPerrito = new javax.swing.JLabel();
        lblNumeroCliente = new javax.swing.JLabel();
        txtNroCliente = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblRaza = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        lblAlergico = new javax.swing.JLabel();
        cboAlergico = new javax.swing.JComboBox<>();
        lblAtencionEspecial = new javax.swing.JLabel();
        cboAtenicionEspecial = new javax.swing.JComboBox<>();
        lblNombreDueño = new javax.swing.JLabel();
        txtNombreDuenio = new javax.swing.JTextField();
        lblCelDuenio = new javax.swing.JLabel();
        txtCelularDuenio = new javax.swing.JTextField();
        lblObservaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaObservaciones = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Peluquería Canina");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 540, -1));

        lblImagenPerrito.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblImagenPerrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IGU/perrobanho.png"))); // NOI18N
        jPanel1.add(lblImagenPerrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 200, 430));

        lblNumeroCliente.setText("Cliente Nº: ");
        jPanel1.add(lblNumeroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));
        jPanel1.add(txtNroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 240, -1));

        lblNombre.setText("Nombre:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 240, -1));

        lblRaza.setText("Raza:");
        jPanel1.add(lblRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel1.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 240, -1));

        lblColor.setText("Color:");
        jPanel1.add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 240, -1));

        lblAlergico.setText("Alérgico:");
        jPanel1.add(lblAlergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        cboAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sí", "No" }));
        jPanel1.add(cboAlergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 60, -1));

        lblAtencionEspecial.setText("Atención Especial:");
        jPanel1.add(lblAtencionEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        cboAtenicionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sí", "No" }));
        jPanel1.add(cboAtenicionEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 50, -1));

        lblNombreDueño.setText("Nombre Dueño:");
        jPanel1.add(lblNombreDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        jPanel1.add(txtNombreDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 240, -1));

        lblCelDuenio.setText("Cel. Dueño:");
        jPanel1.add(lblCelDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        jPanel1.add(txtCelularDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 240, -1));

        lblObservaciones.setText("Observaciones:");
        jPanel1.add(lblObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        txtAreaObservaciones.setColumns(20);
        txtAreaObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtAreaObservaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 240, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //creo las variables para pasar por parametro los valores cargados en el form
        String nroCliente;
        String nombre;
        String raza;
        String color;
        boolean alergico = false;
        boolean atencionEspecial = false;
        String nombreDuenio;
        String celularDuenio;
        String areaObservaciones;
        String esAlergico; //usado para recuperar el valor del cbo box cboAlergico
        String requiereAtencionEspecial; //usado para recuperar el valor del cboAtencionEspecial
        boolean estaelIdPerro = false; //usado para controlar si el id existe en la bd, para que no de error al intentar guardar un registro nuevo
        
        Controladora controlPerro = new Controladora();
        
        
        nroCliente = txtNroCliente.getText();
        
        //reviso si el nro de cliente esta para evitar que de error la base de datos al intentar guardarlo
        if (controlPerro.verSiEsta(nroCliente)){
            estaelIdPerro = true;
            JOptionPane.showMessageDialog(null, "El nro de cliente " + nroCliente + " ya se encuentra en uso.");
        }
        
        nombre = txtNombre.getText();
        raza = txtRaza.getText();
        color = txtColor.getText();
        nombreDuenio = txtNombreDuenio.getText();
        celularDuenio = txtCelularDuenio.getText();
        areaObservaciones = txtAreaObservaciones.getText();
        
        esAlergico = (String) cboAlergico.getSelectedItem(); //lo convierto en string para guardarlo en esAlergico
       
        //Verifico que se haya seleccionado "Si" o "No" en el combobox de alergias y guardo el resultado, si no se selecciono nada y queda en "-" muestro un mensaje:
        switch(esAlergico){
            case "Sí":
                alergico = true;
                break;
            case "No":
                alergico = false;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Seleccione si " + nombre + " tiene alguna alergia");
                break;
        }
        
        
        requiereAtencionEspecial = (String) cboAtenicionEspecial.getSelectedItem();
         
        //compruebo el valor guardado en el combobox para indicar si requiere atencion especial, muestro un mensaje si no se selecciono "si" o "no":
        switch (requiereAtencionEspecial) { 
            case "Sí":
                atencionEspecial = true;
                break;
            case "No":
                atencionEspecial = false;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Seleccione si " + nombre + " requiere atención especial");
                break;
        }
        
        
        /*verifico que se haya seleccionado "sí" o "no" en los cbo box de atencion especial y 
        de alergia antes de pasar los parametros a la parte lógica. Verifico además que el nro de cliente
        no esté aun en la base de datos para que no de error si se carga repetido
        */
        if((!esAlergico.equals("-")) && (estaelIdPerro != true) && (!requiereAtencionEspecial.equals("-")) ){
                controlPerro.agregarPerro(nroCliente, nombre, raza, color, alergico, atencionEspecial, nombreDuenio, celularDuenio, areaObservaciones);
                JOptionPane.showMessageDialog(null, "Los datos han sido guardados");
                this.limpiar(); //invoco el método que limpia los campos para que se pueda ingresar otro perro
                
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    /*metodo para dejar los campos de texto en blanco. Hecha para poder invocarla 
    desde los botones limpiar y guardar y no tener que repetir el código*/
    private void limpiar(){
        txtNroCliente.setText("");
        txtNombre.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        cboAlergico.setSelectedIndex(0);
        cboAtenicionEspecial.setSelectedIndex(0);
        txtNombreDuenio.setText("");
        txtCelularDuenio.setText("");
        txtAreaObservaciones.setText("");
        }
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cboAlergico;
    private javax.swing.JComboBox<String> cboAtenicionEspecial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAlergico;
    private javax.swing.JLabel lblAtencionEspecial;
    private javax.swing.JLabel lblCelDuenio;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblImagenPerrito;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreDueño;
    private javax.swing.JLabel lblNumeroCliente;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAreaObservaciones;
    private javax.swing.JTextField txtCelularDuenio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNroCliente;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
