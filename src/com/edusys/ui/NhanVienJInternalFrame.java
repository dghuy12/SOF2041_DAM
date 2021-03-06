package com.edusys.ui;

import com.edusys.dao.NhanVienDAO;
import com.edusys.entity.NhanVien;
import com.edusys.utils.Auth;
import com.edusys.utils.HashingPass;
import com.edusys.utils.MsgBox;
import java.awt.event.MouseEvent;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class NhanVienJInternalFrame extends javax.swing.JInternalFrame {

    private int index;
    private NhanVienDAO dao;
    private DefaultTableModel model;
    private List<NhanVien> list;

    public NhanVienJInternalFrame() {
        this.initComponents();

        this.model = (DefaultTableModel) this.tblNhanVien.getModel();
        this.dao = new NhanVienDAO();

        this.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        popupMenu = new javax.swing.JPopupMenu();
        puUpdate = new javax.swing.JMenuItem();
        lblTitle = new javax.swing.JLabel();
        Tabs = new javax.swing.JTabbedPane();
        pnlEdit = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        lblMatKhau = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        lblXacNhanMK = new javax.swing.JLabel();
        txtXacNhanMK = new javax.swing.JPasswordField();
        lblHoTen = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        lblVaiTro = new javax.swing.JLabel();
        rdoTP = new javax.swing.JRadioButton();
        rdoNV = new javax.swing.JRadioButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        pnlList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        btnNhanVienCu = new javax.swing.JButton();
        btnNhanVienCu1 = new javax.swing.JButton();

        puUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/refresh-option.png"))); // NOI18N
        puUpdate.setText("updateTrangThai");
        puUpdate.setToolTipText("");
        puUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puUpdateActionPerformed(evt);
            }
        });
        popupMenu.add(puUpdate);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("EduSys - Qu???n L?? Nh??n Vi??n");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 255));
        lblTitle.setText("QU???N L?? NH??N VI??N QU???N TR???");

        lblMaNV.setText("M?? nh??n vi??n");

        lblMatKhau.setText("M???t kh???u");

        lblXacNhanMK.setText("X??c nh???n m???t kh???u");

        lblHoTen.setText("H??? v?? t??n");

        lblVaiTro.setText("Vai tr??");

        buttonGroup1.add(rdoTP);
        rdoTP.setText("Tr?????ng ph??ng");

        buttonGroup1.add(rdoNV);
        rdoNV.setText("Nh??n vi??n");

        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Save.png"))); // NOI18N
        btnInsert.setText("Th??m");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Edit.png"))); // NOI18N
        btnUpdate.setText("S???a");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Delete.png"))); // NOI18N
        btnDelete.setText("Xo??");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Add.png"))); // NOI18N
        btnClear.setText("M???i");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/previous.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/rewind.png"))); // NOI18N
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/forward.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/next.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        jLabel1.setText("Email");

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtXacNhanMK, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addComponent(lblMaNV)
                    .addComponent(lblMatKhau)
                    .addComponent(lblXacNhanMK)
                    .addComponent(lblHoTen)
                    .addComponent(jLabel1)
                    .addComponent(lblVaiTro)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(rdoTP)
                        .addGap(18, 18, 18)
                        .addComponent(rdoNV))
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(btnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast))
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addComponent(txtMaNV))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEditLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClear, btnDelete, btnInsert, btnUpdate});

        pnlEditLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFirst, btnLast, btnNext, btnPrev});

        pnlEditLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmail, txtHoTen, txtMatKhau, txtXacNhanMK});

        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMaNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblXacNhanMK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtXacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHoTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVaiTro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoNV)
                    .addComponent(rdoTP))
                .addGap(18, 18, 18)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear)
                    .addComponent(btnInsert)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEditLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmail, txtHoTen, txtMaNV, txtMatKhau, txtXacNhanMK});

        Tabs.addTab("C???P NH???T", pnlEdit);

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? NV", "M???t Kh???u", "H??? V?? T??n", "Email", "Vai Tr??", "Tr???ng Th??i"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        btnNhanVienCu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Unknown person.png"))); // NOI18N
        btnNhanVienCu.setText("Nh??n vi??n c??");
        btnNhanVienCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienCuActionPerformed(evt);
            }
        });

        btnNhanVienCu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/User.png"))); // NOI18N
        btnNhanVienCu1.setText("Nh??n vi??n hi???n t???i");
        btnNhanVienCu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienCu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlListLayout = new javax.swing.GroupLayout(pnlList);
        pnlList.setLayout(pnlListLayout);
        pnlListLayout.setHorizontalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(pnlListLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(btnNhanVienCu1)
                .addGap(18, 18, 18)
                .addComponent(btnNhanVienCu)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        pnlListLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnNhanVienCu, btnNhanVienCu1});

        pnlListLayout.setVerticalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNhanVienCu1)
                    .addComponent(btnNhanVienCu))
                .addGap(23, 23, 23))
        );

        Tabs.addTab("DANH S??CH", pnlList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        if (evt.getClickCount() == 2) {
            this.index = this.tblNhanVien.getSelectedRow();
            this.edit();
            this.role();
        }
        if (Auth.isManager()) {
            if (evt.getButton() == MouseEvent.BUTTON3) {
                this.popupMenu.show(this, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if (this.checkT() == true && this.check() == true) {
            this.insert();
        }

    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (this.check() == true) {
            this.update();
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        this.delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        this.prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        this.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        this.last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNhanVienCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienCuActionPerformed
        this.fillNhanVienCu();
    }//GEN-LAST:event_btnNhanVienCuActionPerformed

    private void btnNhanVienCu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienCu1ActionPerformed
        this.fillNhanVienHienTai();
    }//GEN-LAST:event_btnNhanVienCu1ActionPerformed

    private void puUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puUpdateActionPerformed
        this.trangThai();
    }//GEN-LAST:event_puUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNhanVienCu;
    private javax.swing.JButton btnNhanVienCu1;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JLabel lblXacNhanMK;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlList;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JMenuItem puUpdate;
    private javax.swing.JRadioButton rdoNV;
    private javax.swing.JRadioButton rdoTP;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtXacNhanMK;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setResizable(false);
        this.Tabs.setSelectedIndex(1);
        this.rdoNV.setSelected(true);
        this.fillNhanVienHienTai();
        this.index = -1;
        this.updateStatus();

    }

    private void fillNhanVienHienTai() {
        this.model.setRowCount(0); // xo?? t???t c??? c??c h??ng tr??n Table
        try {
            this.list = dao.selectHD(); // ?????c d??? li???u t??? CSDL
            for (NhanVien nv : list) {
                // th??m m???t h??ng v??o table
                this.model.addRow(new Object[]{nv.getMaNV(), nv.unShowPass(nv.getMatKhau()), nv.getHoTen(), nv.getEmail(),
                    nv.isVaiTro() ? "Tr?????ng Ph??ng" : "Nh??n Vi??n", nv.isTrangThai() ? "??ang ho???t ?????ng" : "Kh??ng ho???t ?????ng"});
            }
        } catch (Exception e) {
            MsgBox.alert(this, "L???i truy v???n d??? li???u");
        }
    }

    private void fillNhanVienCu() {
        this.model.setRowCount(0); // xo?? t???t c??? c??c h??ng tr??n Table
        try {
            this.list = dao.selectKHD(); // ?????c d??? li???u t??? CSDL
            for (NhanVien nv : list) {
                // th??m m???t h??ng v??o table
                this.model.addRow(new Object[]{nv.getMaNV(), nv.unShowPass(nv.getMatKhau()), nv.getHoTen(), nv.getEmail(),
                    nv.isVaiTro() ? "Tr?????ng Ph??ng" : "Nh??n Vi??n", nv.isTrangThai() ? "??ang ho???t ?????ng" : "Kh??ng ho???t ?????ng"});
            }
        } catch (Exception e) {
            MsgBox.alert(this, "L???i truy v???n d??? li???u");
        }
    }

    private void updateStatus() {
        boolean edit = (this.index >= 0);
        boolean first = (this.index == 0);
        boolean last = (this.index == tblNhanVien.getRowCount() - 1);

        // Tr???ng th??i form
        this.txtMaNV.setEditable(!edit);
        this.btnInsert.setEnabled(!edit);
        this.btnUpdate.setEnabled(edit);
        this.btnDelete.setEnabled(edit);

        // Tr???ng th??i ??i???u h?????ng
        this.btnFirst.setEnabled(edit && !first);
        this.btnPrev.setEnabled(edit && !first);
        this.btnNext.setEnabled(edit && !last);
        this.btnLast.setEnabled(edit && !last);

        // Tr???ng th??i c??c role
        this.txtMatKhau.setEditable(true);
        this.txtXacNhanMK.setEditable(true);
        this.txtHoTen.setEditable(true);
        this.txtEmail.setEditable(true);
        if (!Auth.isManager()) {
            this.rdoNV.setEnabled(true);
            this.rdoTP.setEnabled(false);
        } else {
            this.rdoTP.setEnabled(true);
            this.rdoNV.setEnabled(true);
        }
    }

    private void edit() {
        String maNV = (String) this.tblNhanVien.getValueAt(this.index, 0);
        NhanVien nv = this.dao.selectByID(maNV);
        this.setForm(nv);
        this.Tabs.setSelectedIndex(0);
        this.updateStatus();
    }

    private NhanVien getForm() {
        try {
            NhanVien nv = new NhanVien();
            nv.setMaNV(this.txtMaNV.getText());
            nv.setMatKhau(HashingPass.doHashing(new String(this.txtMatKhau.getPassword())));
            nv.setHoTen(this.txtHoTen.getText());
            nv.setEmail(this.txtEmail.getText());
            nv.setVaiTro(this.rdoTP.isSelected());
            nv.setTrangThai(true);
            return nv;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private void setForm(NhanVien nv) {
        this.txtMaNV.setText(nv.getMaNV());
        this.txtMatKhau.setText(nv.getMatKhau());
        this.txtXacNhanMK.setText(nv.getMatKhau());
        this.txtHoTen.setText(nv.getHoTen());
        this.txtEmail.setText(nv.getEmail());
        this.rdoTP.setSelected(nv.isVaiTro());
        this.rdoNV.setSelected(!nv.isVaiTro());
    }

    private void clearForm() {
        NhanVien nv = new NhanVien();
        this.setForm(nv);
        this.txtXacNhanMK.setText("");
        this.index = -1;
        this.updateStatus();

    }

    private void insert() {
        try {
            NhanVien nv = this.getForm();
            String matKhau2 = HashingPass.doHashing(new String(this.txtXacNhanMK.getPassword()));
            if (!matKhau2.equals(nv.getMatKhau())) {
                MsgBox.alert(this, "X??c nh???n m???t kh???u kh??ng ????ng");
                this.txtXacNhanMK.requestFocus();
            } else {
                try {
                    this.dao.insert(nv);
                    this.fillNhanVienHienTai();
                    this.Tabs.setSelectedIndex(1);
                    this.clearForm();
                    MsgBox.alert(this, "Th??m m???i th??nh c??ng");
                } catch (Exception e) {
                    MsgBox.alert(this, "Th??m m???i th???t b???i");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void update() {
        try {
            NhanVien nv = this.getForm();
            String matKhau2 = HashingPass.doHashing(new String(this.txtXacNhanMK.getPassword()));
            if (!matKhau2.equals(nv.getMatKhau())) {
                MsgBox.alert(this, "X??c nh???n m???t kh???u kh??ng ????ng");
                this.txtXacNhanMK.requestFocus();
            } else {
                try {
                    this.dao.update(nv);
                    this.fillNhanVienHienTai();
                    this.Tabs.setSelectedIndex(1);
                    this.txtXacNhanMK.setText("");
                    MsgBox.alert(this, "C???p nh???t th??nh c??ng");
                } catch (Exception e) {
                    e.printStackTrace();
                    MsgBox.alert(this, "C???p nh???t th???t b???i");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "B???n kh??ng c?? quy???n xo?? nh??n vi??n !");
        } else {
            String maNV = this.txtMaNV.getText();
            if (maNV.equals(Auth.user.getMaNV())) {
                MsgBox.alert(this, "B???n kh??ng ???????c xo?? ch??nh b???n !");
            } else if (MsgBox.confirm(this, "B???n th???c s??? mu???n xo?? nh??n vi??n n??y")) {
                try {
                    this.dao.delete(maNV);
                    this.fillNhanVienHienTai();
                    this.Tabs.setSelectedIndex(1);
                    this.clearForm();
                    MsgBox.alert(this, "Xo?? th??nh c??ng");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xo?? th???t b???i");
                }
            }
        }
    }

    private void first() {
        this.index = 0;
        this.edit();
    }

    private void prev() {
        if (this.index > 0) {
            this.index--;
            this.edit();
        }
    }

    private void next() {
        if (this.index < this.tblNhanVien.getRowCount() - 1) {
            this.index++;
            this.edit();
        }
    }

    private void last() {
        this.index = tblNhanVien.getRowCount() - 1;
        this.edit();
    }

    private void role() {
        if (!Auth.isManager() || this.tblNhanVien.getValueAt(index, 5).equals("Kh??ng ho???t ?????ng")) {
            this.txtMatKhau.setEditable(false);
            this.txtXacNhanMK.setEditable(false);
            this.txtHoTen.setEditable(false);
            this.txtEmail.setEditable(false);
            this.btnUpdate.setEnabled(false);
            this.rdoNV.setEnabled(false);
            this.rdoTP.setEnabled(false);
        } else {
            this.txtMatKhau.setEditable(false);
            this.txtXacNhanMK.setEditable(false);
            this.txtHoTen.setEditable(true);
            this.txtEmail.setEditable(true);
            this.rdoNV.setEnabled(true);
            this.rdoTP.setEnabled(true);
        }

    }

    private void trangThai() {
        this.index = this.tblNhanVien.getSelectedRow();
        if (this.index < 0) {
            MsgBox.alert(this, "B???n ch??a ch???n d??ng n??o tr??n table");
        } else {
            if (this.tblNhanVien.getValueAt(this.index, 5).equals("??ang ho???t ?????ng")) {
                NhanVien nv = new NhanVien();
                nv.setMaNV((String) this.tblNhanVien.getValueAt(this.index, 0));
                this.dao.updateKHD(nv);
                this.fillNhanVienCu();
                MsgBox.alert(this, "C???p nh???t tr???ng th??i nh??n vi??n th??nh c??ng");
            } else if (this.tblNhanVien.getValueAt(this.index, 5).equals("Kh??ng ho???t ?????ng")) {
                NhanVien nv = new NhanVien();
                nv.setMaNV((String) this.tblNhanVien.getValueAt(this.index, 0));
                this.dao.updateHD(nv);
                this.fillNhanVienHienTai();
                MsgBox.alert(this, "C???p nh???t tr???ng th??i nh??n vi??n th??nh c??ng");
            }
        }

    }

    private boolean checkT() {
        if (this.dao.selectByID(this.txtMaNV.getText()) != null) {
            MsgBox.alert(this, "M?? nh??n vi??n ???? t???n t???i");
            this.txtMaNV.requestFocus();
            return false;
        }
        return true;
    }

    private boolean check() {
        // Check m?? nv
        if (this.txtMaNV.getText().isEmpty()) {
            MsgBox.alert(this, "Vui l??ng nh???p m?? nh??n vi??n!");
            this.txtMaNV.requestFocus();
            return false;
        } else if (this.txtMaNV.getText().length() < 3) {
            MsgBox.alert(this, "M?? nh??n vi??n ph???i nhi???u h??n 3 k?? t???");
            this.txtMaNV.requestFocus();
            return false;
        }

        // Check m???t kh???u
        if (this.txtMatKhau.getPassword().length == 0) {
            MsgBox.alert(this, "Vui l??ng nh???p m???t kh???u!");
            this.txtMatKhau.requestFocus();
            return false;
        } else if (this.txtMatKhau.getPassword().length < 3) {
            MsgBox.alert(this, "M???t kh???u ph???i d??i h??n 3 k?? t???");
            this.txtMatKhau.requestFocus();
            return false;
        }

        // Check x??c nh???n m???t kh???u
        if (this.txtXacNhanMK.getPassword().length == 0) {
            MsgBox.alert(this, "Vui l??ng x??c nh???n m???t kh???u!");
            this.txtXacNhanMK.requestFocus();
            return false;
        }

        // Check h??? t??n
        if (this.txtHoTen.getText().isEmpty()) {
            MsgBox.alert(this, "Vui l??ng nh???p h??? v?? t??n!");
            this.txtHoTen.requestFocus();
            return false;
        }

        // Check email
        String reEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        if (this.txtEmail.getText().isEmpty()) {
            MsgBox.alert(this, "Vui l??ng nh???p Email!");
            this.txtEmail.requestFocus();
            return false;
        } else if (!this.txtEmail.getText().matches(reEmail)) {
            MsgBox.alert(this, "Email kh??ng ????ng ?????nh d???ng");
            this.txtEmail.requestFocus();
            return false;
        }
        return true;
    }

}
