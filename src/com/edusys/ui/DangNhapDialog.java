package com.edusys.ui;

import com.edusys.dao.NhanVienDAO;
import com.edusys.entity.NhanVien;
import com.edusys.utils.Auth;
import com.edusys.utils.HashingPass;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XImage;
import java.awt.Cursor;

public class DangNhapDialog extends javax.swing.JDialog {

    NhanVienDAO dao;

    public DangNhapDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.initComponents();
        this.init();
        this.dao = new NhanVienDAO();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAnh = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        cbbShow = new javax.swing.JCheckBox();
        lblQuenMK = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - Đăng nhập");

        lblAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/EduSys - icon.png"))); // NOI18N

        jLabel2.setText("Tên đăng nhập");

        txtMaNV.setText("Admin");

        jLabel3.setText("Mật khẩu");

        txtMatKhau.setText("123123");

        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Key.png"))); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Exit.png"))); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });

        cbbShow.setText("Hiện thị mật khẩu");
        cbbShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbShowActionPerformed(evt);
            }
        });

        lblQuenMK.setText("Quên mật khẩu ?");
        lblQuenMK.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblQuenMKMouseMoved(evt);
            }
        });
        lblQuenMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblQuenMKMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDangNhap)
                            .addComponent(cbbShow))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuenMK, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnKetThuc, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(txtMaNV)
                    .addComponent(txtMatKhau))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDangNhap, btnKetThuc});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnh)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbShow)
                            .addComponent(lblQuenMK))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDangNhap)
                            .addComponent(btnKetThuc))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDangNhap, btnKetThuc});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        this.dangNhap();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        this.ketThuc();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void lblQuenMKMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMKMouseMoved
        this.lblQuenMK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblQuenMKMouseMoved

    private void lblQuenMKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMKMousePressed
        QuenMatKhau qmk = new QuenMatKhau(null, true);
        this.setVisible(false);
        qmk.setVisible(true);
    }//GEN-LAST:event_lblQuenMKMousePressed

    private void cbbShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbShowActionPerformed
        this.showPass();    
    }//GEN-LAST:event_cbbShowActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhapDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhapDialog dialog = new DangNhapDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JCheckBox cbbShow;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblQuenMK;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(XImage.getAppIcon());
    }

    private void dangNhap() {
        try {
            String maNV = this.txtMaNV.getText();
            String matKhau = HashingPass.doHashing(new String(this.txtMatKhau.getPassword()));
            NhanVien nv = dao.selectByID(maNV);
            if (nv == null) {
                MsgBox.alert(this, "Sai tên đăng nhập");
            } else if (!matKhau.equals(nv.getMatKhau())) {
                MsgBox.alert(this, "Sai mật khẩu");
            } else {
                if (!nv.isTrangThai()) {
                    MsgBox.alert(this, "Nhân viên " + this.txtMaNV.getText() + " đã nghỉ làm");
                    return;
                }
                Auth.user = nv;
                this.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void ketThuc() {
        if (MsgBox.confirm(this, "Bạn có muốn kết thúc ứng dụng ?")) {
            System.exit(0);
        }
    }
    
    private void showPass(){
        if (this.cbbShow.isSelected()) {
            this.txtMatKhau.setEchoChar((char) 0);
        } else {
            this.txtMatKhau.setEchoChar('*');
        }
    }

}
