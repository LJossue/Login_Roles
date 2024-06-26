/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import java.awt.Color;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import logica.Controladora;
import logica.Usuario;

/**
 *
 * @author leand
 */
public class PrincipalUser extends javax.swing.JFrame {
Controladora control;
Usuario usr;
int xMouse, yMouse;
    /**
     * Creates new form PrincipalAdmin
     * @param control
     */
    public PrincipalUser(Controladora control, Usuario usr) {
        initComponents();
        this.control = control;
        this.usr = usr;
        txtNombreUser.setOpaque(false);
   tblUsuarios.setOpaque(false);
    setTableHeaderColor(tblUsuarios, new Color(110, 156,180), java.awt.Color.WHITE);

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
        txtNombreUser = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblRefrescar = new javax.swing.JLabel();
        panelBarra = new javax.swing.JPanel();
        barraX = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(861, 522));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ADMINISTRADOR DE USUARIOS");

        txtNombreUser.setEditable(false);
        txtNombreUser.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        txtNombreUser.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreUser.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNombreUser.setBorder(null);

        jScrollPane.setBackground(new java.awt.Color(0, 153, 0));
        jScrollPane.setForeground(new java.awt.Color(51, 255, 0));

        tblUsuarios.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblUsuarios.setGridColor(new java.awt.Color(0, 0, 0));
        tblUsuarios.setOpaque(false);
        jScrollPane.setViewportView(tblUsuarios);

        jPanel5.setBackground(new java.awt.Color(201, 33, 45));
        jPanel5.setPreferredSize(new java.awt.Dimension(120, 40));

        lblSalir.setBackground(new java.awt.Color(201, 33, 45));
        lblSalir.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("Salir");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.setOpaque(true);
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(201, 33, 45));

        lblRefrescar.setBackground(new java.awt.Color(102, 102, 102));
        lblRefrescar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblRefrescar.setForeground(new java.awt.Color(255, 255, 255));
        lblRefrescar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRefrescar.setText("Refrescar");
        lblRefrescar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRefrescar.setOpaque(true);
        lblRefrescar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRefrescarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRefrescarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRefrescarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombreUser, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

        panelBarra.setOpaque(false);
        panelBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelBarraMouseDragged(evt);
            }
        });
        panelBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBarraMousePressed(evt);
            }
        });

        barraX.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        barraX.setForeground(new java.awt.Color(0, 0, 0));
        barraX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        barraX.setText("X");
        barraX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barraX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        barraX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barraXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                barraXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                barraXMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBarraLayout = new javax.swing.GroupLayout(panelBarra);
        panelBarra.setLayout(panelBarraLayout);
        panelBarraLayout.setHorizontalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraLayout.createSequentialGroup()
                .addGap(0, 820, Short.MAX_VALUE)
                .addComponent(barraX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraX, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(panelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoMenu.png"))); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 861, 522));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 this.txtNombreUser.setText(usr.getNombreUsuario());
 
 cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void barraXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraXMouseClicked
        this.dispose();
    }//GEN-LAST:event_barraXMouseClicked

    private void barraXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraXMouseEntered

        barraX.setBackground(new Color (201,33,45));
        barraX.setForeground(Color.WHITE);
        barraX.setOpaque(true);
    }//GEN-LAST:event_barraXMouseEntered

    private void barraXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraXMouseExited
        barraX.setForeground(Color.BLACK);
        barraX.setOpaque(false);
    }//GEN-LAST:event_barraXMouseExited

    private void panelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelBarraMouseDragged

    private void panelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelBarraMousePressed

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
this.dispose();
LoginInicial pantalla = new LoginInicial();
pantalla.setVisible(true);
pantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered

        lblSalir.setBackground(new Color (201,67,62));
        lblSalir.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setBackground(new Color (201,33,45));
        lblSalir.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblRefrescarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefrescarMouseClicked
       cargarTabla();
    }//GEN-LAST:event_lblRefrescarMouseClicked

    private void lblRefrescarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefrescarMouseEntered
        lblRefrescar.setBackground(new Color (153,153,153));
        lblRefrescar.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblRefrescarMouseEntered

    private void lblRefrescarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefrescarMouseExited
        lblRefrescar.setBackground(new Color (102,102,102));
        lblRefrescar.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblRefrescarMouseExited

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barraX;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblRefrescar;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtNombreUser;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
         //definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel(){
          
            //que fila y columna no sean editables
            @Override
            public boolean isCellEditable (int row, int column){
              return false;
          }  
        };
        
        //establecemos los nombres de las columnas
        String titulos[] = {"Id", "Usuario", "Rol"};
        modeloTabla.setColumnIdentifiers(titulos);
        
   
    //carga de los datos desde la base de datos
    List<Usuario> listaUsuarios = control.traerUsuarios();
    
    //recorrer la lista y mostrar cada uno de los elementos en la tabla
    if(listaUsuarios != null){
        for(Usuario usu : listaUsuarios){
            Object[] objeto = {usu.getId(), usu.getNombreUsuario(), usu.getRol().getNombreRol()};
        
        modeloTabla.addRow(objeto);
        }
    }
    tblUsuarios.setModel(modeloTabla);
    
    }
     // Método para personalizar el color del encabezado de la tabla
    public static void setTableHeaderColor(JTable table, java.awt.Color background, java.awt.Color foreground) {
        JTableHeader header = table.getTableHeader();
        header.setBackground(background);
        header.setForeground(foreground);
    }
}
