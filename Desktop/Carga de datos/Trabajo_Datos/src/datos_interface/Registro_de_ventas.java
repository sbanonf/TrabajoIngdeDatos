/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos_interface;

import ClasesPrincipales.Cliente;
import ClasesPrincipales.PRODUCTO;
import ClasesPrincipales.Pedido_Cliente;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JannPier
 */
public class Registro_de_ventas extends javax.swing.JFrame {
    public static String url = "jdbc:oracle:thin:@localhost:1521:XE";
    public static String usuario = "system";
    public static String password = "admin";
    DefaultTableModel modelo = new DefaultTableModel();
    int totalproducto=0;
    Cliente encontrado;
    /**
     * Creates new form Registro_de_ventas
     */
    public Registro_de_ventas() {    
        initComponents();
        this.setLocation(200,300);
        this.setLocationRelativeTo(null);
        modelo.addColumn("Codigo Producto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Linea");
        modelo.addColumn("Precio_Unitario");
        modelo.addColumn("Modelo");
        this.jTable2.setModel(modelo);
    }
    public Registro_de_ventas(DefaultTableModel modelo, int tp){
        initComponents();
        this.setLocation(200,300);
        this.setLocationRelativeTo(null);
        this.modelo=modelo;
        this.jTable2.setModel(this.modelo);
        this.totalproducto=tp;
        String total = String.valueOf(this.totalproducto);
        this.jTextFieldTotalpedi.setText(total);
    }
    /*public static String[] AgregarProducto(DefaultTableModel modelo,PRODUCTO pr){
    }*/
    
    public Registro_de_ventas(DefaultTableModel modelo){
        initComponents();
        this.setLocation(200,300);
        this.setLocationRelativeTo(null);
        this.modelo=modelo;
        this.jTable2.setModel(this.modelo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDni = new javax.swing.JTextField();
        jTextFieldTotalpedi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE VENTAS");
        jLabel1.setToolTipText("");
        jLabel1.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("DNI:");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Metodo de Pago:");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setText("Nombre del empleado:");

        jTextFieldDni.setToolTipText("");

        jTextFieldTotalpedi.setEditable(false);
        jTextFieldTotalpedi.setBackground(java.awt.Color.lightGray);
        jTextFieldTotalpedi.setToolTipText("");
        jTextFieldTotalpedi.setEnabled(false);

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton2.setText("Nuevo Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton3.setText("SELECCIONAR PRODUCTO");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 204, 255));
        jButton4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton4.setText("ELIMINAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 204, 255));
        jButton5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton5.setText("REGISTRAR VENTA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setText("Resumen de venta");

        jButton6.setBackground(new java.awt.Color(153, 204, 255));
        jButton6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton6.setText("REGRESAR");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setText("Total de pedido:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VISA", "MASTERCARD", "EFECTIVO" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARNOLD", "ERIN", "WALLIE", "FIORELLA" }));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo_Producto", "Nombre", "Precio Unitario", "Linea"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(57, 57, 57)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTotalpedi, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTotalpedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Producto rgventaproduc = new Producto(this.modelo, this.totalproducto);
        rgventaproduc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int pos = this.jTable2.getSelectedRow();
        int col=3;
        String valor = this.jTable2.getModel().getValueAt(pos, col).toString();
        this.totalproducto= this.totalproducto - Integer.parseInt(valor);
        this.jTextFieldTotalpedi.setText(String.valueOf(this.totalproducto));
        this.modelo.removeRow(pos);
        this.jTable2.setModel(this.modelo);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String empleado= (String)this.jComboBox2.getSelectedItem();
        String pago= (String)this.jComboBox1.getSelectedItem();
        if(empleado.equals("ARNOLD")){
            try {
                    Connection conn = DriverManager.getConnection(url, usuario, password);;
                    Pedido_Cliente pedido = new Pedido_Cliente(pago,this.encontrado.getDNI(),1);
                    java.sql.Date sqlDate= java.sql.Date.valueOf(pedido.getFECHA());
                    String sql = "INSERT INTO PEDIDO_CLIENTE VALUES(?, ?, ?,?,?)";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setInt(1,pedido.getCOD_PEDIDO());
                    pst.setDate(2,sqlDate);
                    pst.setString(3,pago);
                    pst.setInt(4,this.encontrado.getDNI());
                    pst.setInt(5,pedido.getCOD_EMPLEADO());
                    pst.executeUpdate();
                    pst.close();
                    conn.close();
                    JOptionPane.showMessageDialog(null,"Pedido Creado exitosamente");
                    try {
                         Connection conn2 = DriverManager.getConnection(url, usuario, password);
                         for (int i=0; i<this.jTable2.getRowCount();i++){
                            if(this.jTable2.getModel().getValueAt(i, 4).toString().equalsIgnoreCase("Personalizado")==false){
                                int cod_prod = Integer.parseInt(this.jTable2.getModel().getValueAt(i,0 ).toString());
                                String cod_comercial= "C1";
                                String sql2 = "INSERT INTO PUEDE_SER_COMERCIAL VALUES(?, ?, ?,?)";
                                PreparedStatement pst2 = conn2.prepareStatement(sql2);
                                pst2.setInt(1,pedido.getCOD_PEDIDO());
                                pst2.setInt(2,cod_prod);
                                pst2.setString(3,cod_comercial);
                                pst2.setInt(4,1);
                                pst2.executeUpdate();
                                pst2.close();
                                conn2.close();
                            }
                            else{
                                int cod_prod = Integer.parseInt(this.jTable2.getModel().getValueAt(i,0 ).toString());
                                String cod_personalizado="P1";
                                String sql2 = "INSERT INTO PUEDE_SER_PERSONALIZADO VALUES(?, ?, ?,?)";
                                PreparedStatement pst2 = conn2.prepareStatement(sql2);
                                pst2.setInt(1,pedido.getCOD_PEDIDO());
                                pst2.setInt(2,cod_prod);
                                pst2.setString(3,cod_personalizado);
                                pst2.setInt(4,1);
                                pst2.executeUpdate();
                                pst2.close();
                                conn2.close();
                                System.out.println("Creado Puede_seR_PERSONALZIADO");
                               }
                         }
                         
                        } catch (SQLException ex) {
                            Logger.getLogger(Registro_de_ventas.class.getName()).log(Level.SEVERE, null, ex);
                        }
            } catch (SQLException ex) {
                Logger.getLogger(Registro_de_ventas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else if(empleado.equals("ERIN")){
            try {
                    Connection conn = DriverManager.getConnection(url, usuario, password);;
                    Pedido_Cliente pedido = new Pedido_Cliente(pago,this.encontrado.getDNI(),2);
                    java.sql.Date sqlDate= java.sql.Date.valueOf(pedido.getFECHA());
                    String sql = "INSERT INTO PEDIDO_CLIENTE VALUES(?, ?, ?,?,?)";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setInt(1,pedido.getCOD_PEDIDO());
                    pst.setDate(2,sqlDate);
                    pst.setString(3,pago);
                    pst.setInt(4,this.encontrado.getDNI());
                    pst.setInt(5,pedido.getCOD_EMPLEADO());
                    pst.executeUpdate();
                    pst.close();
                    conn.close();
                    JOptionPane.showMessageDialog(null,"Pedido Creado exitosamente");
                    try {
                         Connection conn2 = DriverManager.getConnection(url, usuario, password);
                         for (int i=0; i<this.jTable2.getRowCount();i++){
                            if(this.jTable2.getModel().getValueAt(i, 4).toString().equalsIgnoreCase("Personalizado")==false){
                                int cod_prod = Integer.parseInt(this.jTable2.getModel().getValueAt(i,0 ).toString());
                                String cod_comercial= "C1";
                                String sql2 = "INSERT INTO PUEDE_SER_COMERCIAL VALUES(?, ?, ?,?)";
                                PreparedStatement pst2 = conn2.prepareStatement(sql2);
                                pst2.setInt(1,pedido.getCOD_PEDIDO());
                                pst2.setInt(2,cod_prod);
                                pst2.setString(3,cod_comercial);
                                pst2.setInt(4,1);
                                pst2.executeUpdate();
                                pst2.close();
                                conn2.close();
                            }
                            else{
                                int cod_prod = Integer.parseInt(this.jTable2.getModel().getValueAt(i,0 ).toString());
                                String cod_personalizado="P1";
                                String sql2 = "INSERT INTO PUEDE_SER_PERSONALIZADO VALUES(?, ?, ?,?)";
                                PreparedStatement pst2 = conn2.prepareStatement(sql2);
                                pst2.setInt(1,pedido.getCOD_PEDIDO());
                                pst2.setInt(2,cod_prod);
                                pst2.setString(3,cod_personalizado);
                                pst2.setInt(4,1);
                                pst2.executeUpdate();
                                pst2.close();
                                conn2.close();
                                System.out.println("Creado Puede_seR_PERSONALZIADO");
                               }
                         }
                        } catch (SQLException ex) {
                            Logger.getLogger(Registro_de_ventas.class.getName()).log(Level.SEVERE, null, ex);
                        }
            } catch (SQLException ex) {
                Logger.getLogger(Registro_de_ventas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(empleado.equals("WALLIE")){
            try {
                    Connection conn = DriverManager.getConnection(url, usuario, password);;
                    Pedido_Cliente pedido = new Pedido_Cliente(pago,this.encontrado.getDNI(),3);
                    java.sql.Date sqlDate= java.sql.Date.valueOf(pedido.getFECHA());
                    String sql = "INSERT INTO PEDIDO_CLIENTE VALUES(?, ?, ?,?,?)";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setInt(1,pedido.getCOD_PEDIDO());
                    pst.setDate(2,sqlDate);
                    pst.setString(3,pago);
                    pst.setInt(4,this.encontrado.getDNI());
                    pst.setInt(5,pedido.getCOD_EMPLEADO());
                    pst.executeUpdate();
                    pst.close();
                    conn.close();
                    JOptionPane.showMessageDialog(null,"Pedido Creado exitosamente");
                    try {
                         Connection conn2 = DriverManager.getConnection(url, usuario, password);
                         for (int i=0; i<this.jTable2.getRowCount();i++){
                            if(this.jTable2.getModel().getValueAt(i, 4).toString().equalsIgnoreCase("Personalizado")==false){
                                int cod_prod = Integer.parseInt(this.jTable2.getModel().getValueAt(i,0 ).toString());
                                String cod_comercial= "C1";
                                String sql2 = "INSERT INTO PUEDE_SER_COMERCIAL VALUES(?, ?, ?,?)";
                                PreparedStatement pst2 = conn2.prepareStatement(sql2);
                                pst2.setInt(1,pedido.getCOD_PEDIDO());
                                pst2.setInt(2,cod_prod);
                                pst2.setString(3,cod_comercial);
                                pst2.setInt(4,1);
                                pst2.executeUpdate();
                                pst2.close();
                                conn2.close();
                            }
                            else{
                                int cod_prod = Integer.parseInt(this.jTable2.getModel().getValueAt(i,0 ).toString());
                                String cod_personalizado="P1";
                                String sql2 = "INSERT INTO PUEDE_SER_PERSONALIZADO VALUES(?, ?, ?,?)";
                                PreparedStatement pst2 = conn2.prepareStatement(sql2);
                                pst2.setInt(1,pedido.getCOD_PEDIDO());
                                pst2.setInt(2,cod_prod);
                                pst2.setString(3,cod_personalizado);
                                pst2.setInt(4,1);
                                pst2.executeUpdate();
                                pst2.close();
                                conn2.close();
                                System.out.println("Creado Puede_seR_PERSONALZIADO");
                               }
                         }
                        } catch (SQLException ex) {
                            Logger.getLogger(Registro_de_ventas.class.getName()).log(Level.SEVERE, null, ex);
                        }
            } catch (SQLException ex) {
                Logger.getLogger(Registro_de_ventas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                    Connection conn = DriverManager.getConnection(url, usuario, password);;
                    Pedido_Cliente pedido = new Pedido_Cliente(pago,this.encontrado.getDNI(),4);
                    java.sql.Date sqlDate= java.sql.Date.valueOf(pedido.getFECHA());
                    String sql = "INSERT INTO PEDIDO_CLIENTE VALUES(?, ?, ?,?,?)";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setInt(1,pedido.getCOD_PEDIDO());
                    pst.setDate(2,sqlDate);
                    pst.setString(3,pago);
                    pst.setInt(4,this.encontrado.getDNI());
                    pst.setInt(5,pedido.getCOD_EMPLEADO());
                    pst.executeUpdate();
                    pst.close();
                    conn.close();
                    JOptionPane.showMessageDialog(null,"Pedido Creado exitosamente");
                    try {
                         Connection conn2 = DriverManager.getConnection(url, usuario, password);
                         for (int i=0; i<this.jTable2.getRowCount();i++){
                            if(this.jTable2.getModel().getValueAt(i, 4).toString().equalsIgnoreCase("Personalizado")==false){
                                int cod_prod = Integer.parseInt(this.jTable2.getModel().getValueAt(i,0 ).toString());
                                String cod_comercial= "C1";
                                String sql2 = "INSERT INTO PUEDE_SER_COMERCIAL VALUES(?, ?, ?,?)";
                                PreparedStatement pst2 = conn2.prepareStatement(sql2);
                                pst2.setInt(1,pedido.getCOD_PEDIDO());
                                pst2.setInt(2,cod_prod);
                                pst2.setString(3,cod_comercial);
                                pst2.setInt(4,1);
                                pst2.executeUpdate();
                                pst2.close();
                                conn2.close();
                            }
                            else{
                                int cod_prod = Integer.parseInt(this.jTable2.getModel().getValueAt(i,0 ).toString());
                                String cod_personalizado="P1";
                                String sql2 = "INSERT INTO PUEDE_SER_PERSONALIZADO VALUES(?, ?, ?,?)";
                                PreparedStatement pst2 = conn2.prepareStatement(sql2);
                                pst2.setInt(1,pedido.getCOD_PEDIDO());
                                pst2.setInt(2,cod_prod);
                                pst2.setString(3,cod_personalizado);
                                pst2.setInt(4,1);
                                pst2.executeUpdate();
                                pst2.close();
                                conn2.close();
                                System.out.println("Creado Puede_seR_PERSONALZIADO");
                               }
                         }
                        } catch (SQLException ex) {
                            Logger.getLogger(Registro_de_ventas.class.getName()).log(Level.SEVERE, null, ex);
                        }
            } catch (SQLException ex) {
                Logger.getLogger(Registro_de_ventas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        Ingreso regingreso = new Ingreso();
        regingreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(this.jTextFieldDni.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Por favor, Ingrese el dni del cliente");
        }else{
            try {
               int dni = Integer.parseInt(this.jTextFieldDni.getText());
               Connection conn = DriverManager.getConnection(url, usuario, password);
               String sql = "SELECT * FROM CLIENTE WHERE DNI = "+ dni;
               PreparedStatement pst = conn.prepareStatement(sql);
               ResultSet rs = pst.executeQuery();
               String cnombre="";
               int dnic=dni;
               String direccionc="";
               int numeroc=0;
               boolean resultado=false;
               while(rs.next()){
                   resultado=true;
                   cnombre = rs.getString("NOMBRE");
                   dnic = Integer.parseInt(rs.getString("DNI"));
                   direccionc = rs.getString("DIRECCION");
                   numeroc= Integer.parseInt(rs.getString("NUMERO_CONTACTO"));
               }
               if(!resultado){
                JOptionPane.showMessageDialog(null,"No existe el cliente en la base de datos ");
               }else{
                this.encontrado=new Cliente(dnic,cnombre,numeroc,direccionc);
                JOptionPane.showMessageDialog(null,"El cliente "+this.encontrado.getNOMBRE()+" Fue Seleccionado");
               }
               rs.close();
               pst.close();    
               conn.close();
            } catch (SQLException ex) {
               Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CLIENTE ni = new CLIENTE(this.modelo,this.totalproducto);
        ni.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro_de_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_de_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_de_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_de_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_de_ventas().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldTotalpedi;
    // End of variables declaration//GEN-END:variables
}
