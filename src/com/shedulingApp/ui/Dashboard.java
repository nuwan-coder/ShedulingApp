
package com.shedulingApp.ui;

import com.shedulingApp.model.MyTableModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Nuwan S Karunarathna
 */
public class Dashboard extends javax.swing.JFrame {
    
    public Dashboard() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);//this method set jframe full screen
        tbl_employee.setModel(new MyTableModel());//this will set new table model
        theadAndColomnCustomize();//customermize employee table head
    }
    
    //customise employee table header
    private void theadAndColomnCustomize(){
        JTableHeader thead = tbl_employee.getTableHeader();
        thead.setForeground(new Color(45, 45, 48));
        thead.setBackground(new Color(173, 179, 179));
        thead.setFont(new Font("Segoe Ui Symbol",Font.BOLD,18));
        thead.setSize(0,40);
        
        ((DefaultTableCellRenderer) tbl_employee.getTableHeader().getDefaultRenderer())
            .setHorizontalAlignment(JLabel.CENTER); // header to center
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tbl_employee.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tbl_employee.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tbl_employee.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tbl_employee.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tbl_employee.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        tbl_employee.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_main = new javax.swing.JPanel();
        pnl_header = new javax.swing.JPanel();
        pnl_button = new javax.swing.JPanel();
        btn_cancel = new javax.swing.JLabel();
        btn_minimize = new javax.swing.JLabel();
        lbl_header = new javax.swing.JLabel();
        pnl_footer = new javax.swing.JPanel();
        lbl_footer = new javax.swing.JLabel();
        pnl_body = new javax.swing.JPanel();
        jsp_01 = new javax.swing.JScrollPane();
        tbl_employee = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(45, 45, 48));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 500));

        pnl_main.setBackground(new java.awt.Color(45, 45, 48));

        pnl_header.setBackground(new java.awt.Color(37, 37, 38));
        pnl_header.setPreferredSize(new java.awt.Dimension(171, 100));

        pnl_button.setBackground(new java.awt.Color(37, 37, 38));

        btn_cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shedulingApp/ui/img/cancel_25px.png"))); // NOI18N
        btn_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancel.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelMouseClicked(evt);
            }
        });

        btn_minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shedulingApp/ui/img/minimize_window_25pxdf.png"))); // NOI18N
        btn_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minimize.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_buttonLayout = new javax.swing.GroupLayout(pnl_button);
        pnl_button.setLayout(pnl_buttonLayout);
        pnl_buttonLayout.setHorizontalGroup(
            pnl_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_buttonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_buttonLayout.setVerticalGroup(
            pnl_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lbl_header.setFont(new java.awt.Font("Segoe UI Symbol", 1, 28)); // NOI18N
        lbl_header.setForeground(new java.awt.Color(255, 255, 255));
        lbl_header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_header.setText("Sheduling App");

        javax.swing.GroupLayout pnl_headerLayout = new javax.swing.GroupLayout(pnl_header);
        pnl_header.setLayout(pnl_headerLayout);
        pnl_headerLayout.setHorizontalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_headerLayout.setVerticalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addComponent(pnl_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_header, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_footer.setBackground(new java.awt.Color(37, 37, 38));

        lbl_footer.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        lbl_footer.setForeground(new java.awt.Color(255, 255, 255));
        lbl_footer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_footer.setText("© Developed by Nuwan sandeepa");
        lbl_footer.setToolTipText("");

        javax.swing.GroupLayout pnl_footerLayout = new javax.swing.GroupLayout(pnl_footer);
        pnl_footer.setLayout(pnl_footerLayout);
        pnl_footerLayout.setHorizontalGroup(
            pnl_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_footerLayout.setVerticalGroup(
            pnl_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_footer, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        lbl_footer.getAccessibleContext().setAccessibleName("© Developed by Nuwan Sandeepa");

        pnl_body.setBackground(new java.awt.Color(45, 45, 48));

        tbl_employee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbl_employee.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        tbl_employee.setForeground(new java.awt.Color(45, 45, 48));
        tbl_employee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_employee.setGridColor(new java.awt.Color(173, 179, 179));
        tbl_employee.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_employee.setRowHeight(40);
        tbl_employee.setSelectionBackground(new java.awt.Color(32, 77, 109));
        tbl_employee.setShowVerticalLines(false);
        tbl_employee.getTableHeader().setReorderingAllowed(false);
        jsp_01.setViewportView(tbl_employee);
        if (tbl_employee.getColumnModel().getColumnCount() > 0) {
            tbl_employee.getColumnModel().getColumn(0).setResizable(false);
            tbl_employee.getColumnModel().getColumn(1).setResizable(false);
            tbl_employee.getColumnModel().getColumn(2).setResizable(false);
            tbl_employee.getColumnModel().getColumn(3).setResizable(false);
            tbl_employee.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout pnl_bodyLayout = new javax.swing.GroupLayout(pnl_body);
        pnl_body.setLayout(pnl_bodyLayout);
        pnl_bodyLayout.setHorizontalGroup(
            pnl_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jsp_01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        pnl_bodyLayout.setVerticalGroup(
            pnl_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jsp_01, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_mainLayout = new javax.swing.GroupLayout(pnl_main);
        pnl_main.setLayout(pnl_mainLayout);
        pnl_mainLayout.setHorizontalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addComponent(pnl_footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_mainLayout.setVerticalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseClicked
        //this method exit the application
        System.exit(0);
    }//GEN-LAST:event_btn_cancelMouseClicked

    private void btn_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseClicked
        //this method minize the application
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btn_minimizeMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_cancel;
    private javax.swing.JLabel btn_minimize;
    private javax.swing.JScrollPane jsp_01;
    private javax.swing.JLabel lbl_footer;
    private javax.swing.JLabel lbl_header;
    private javax.swing.JPanel pnl_body;
    private javax.swing.JPanel pnl_button;
    private javax.swing.JPanel pnl_footer;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JPanel pnl_main;
    private javax.swing.JTable tbl_employee;
    // End of variables declaration//GEN-END:variables
}
