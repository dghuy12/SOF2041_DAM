package com.edusys.ui;

import com.edusys.dao.ChuyenDeDAO;
import com.edusys.entity.ChuyenDe;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class ChuyenDeJInternalFrame extends javax.swing.JInternalFrame {

    private int index;
    private ChuyenDeDAO dao;
    private DefaultTableModel model;
    private List<ChuyenDe> list;

    public ChuyenDeJInternalFrame() {
        this.initComponents();

        this.dao = new ChuyenDeDAO();
        this.model = (DefaultTableModel) this.tblChuyenDe.getModel();

        this.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblHinh = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaCD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTenCD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtThoiLuong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtHocPhi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChuyenDe = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("EduSys - Qu???n l?? chuy??n ?????");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("QU???N L?? CHUY??N ?????");

        jLabel2.setText("H??nh logo");

        lblHinh.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 255), null));
        lblHinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhMouseClicked(evt);
            }
        });

        jLabel4.setText("M?? chuy??n ?????");

        jLabel5.setText("T??n chuy??n ?????");

        jLabel6.setText("Th???i l?????ng (gi???)");

        jLabel7.setText("H???c ph??");

        jLabel8.setText("M?? t??? chuy??n ?????");

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane2.setViewportView(txtMoTa);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(486, 618, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(txtMaCD, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                                        .addComponent(txtTenCD)
                                        .addComponent(txtThoiLuong)
                                        .addComponent(txtHocPhi, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMaCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear)
                    .addComponent(btnInsert)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap())
        );

        Tabs.addTab("C???p nh???t", jPanel1);

        tblChuyenDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? CD", "T??n CD", "H???c Ph??", "Th???i L?????ng", "H??nh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChuyenDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChuyenDeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblChuyenDe);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "T??M KI???M", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Search.png"))); // NOI18N
        btnTimKiem.setText("T??m");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimKiem)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tabs.addTab("Danh s??ch", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhMouseClicked
        this.chonAnh();
    }//GEN-LAST:event_lblHinhMouseClicked

    private void tblChuyenDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChuyenDeMouseClicked
        if (evt.getClickCount() == 2) {
            this.index = this.tblChuyenDe.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblChuyenDeMouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if (this.checkT() == true && this.check() == true) {
            this.insert();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (this.check()) {
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

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        this.timKiem();
    }//GEN-LAST:event_btnTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JTable tblChuyenDe;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtMaCD;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtTenCD;
    private javax.swing.JTextField txtThoiLuong;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setResizable(false);
        this.Tabs.setSelectedIndex(1);
        this.fillTable();
        this.index = -1;
        this.updateStatus();
    }

    private void fillTable() {
        this.model.setRowCount(0); // xo?? t???t c??? c??c h??ng tr??n Table
        try {
            this.list = dao.selectAll(); // ?????c d??? li???u t??? CSDL
            for (ChuyenDe cd : list) {
                // th??m m???t h??ng v??o table
                this.model.addRow(new Object[]{cd.getMaCD(), cd.getTenCD(), cd.getHocPhi(), cd.getThoiLuong(), cd.getHinh()});
            }
        } catch (Exception e) {
            MsgBox.alert(this, "L???i truy v???n d??? li???u");
        }
    }

    private void updateStatus() {
        boolean edit = (this.index >= 0);
        boolean first = (this.index == 0);
        boolean last = (this.index == this.tblChuyenDe.getRowCount() - 1);

        // Tr???ng th??i form
        this.txtMaCD.setEditable(!edit);
        this.btnInsert.setEnabled(!edit);
        this.btnUpdate.setEnabled(edit);
        this.btnDelete.setEnabled(edit);

        // Tr???ng th??i ??i???u h?????ng
        this.btnFirst.setEnabled(edit && !first);
        this.btnPrev.setEnabled(edit && !first);
        this.btnNext.setEnabled(edit && !last);
        this.btnLast.setEnabled(edit && !last);
    }

    private void edit() {
        String maCD = (String) this.tblChuyenDe.getValueAt(this.index, 0);
        ChuyenDe cd = this.dao.selectByID(maCD);
        this.setForm(cd);
        this.Tabs.setSelectedIndex(0);
        this.updateStatus();
    }

    private ChuyenDe getForm() {
        ChuyenDe cd = new ChuyenDe();
        cd.setMaCD(this.txtMaCD.getText());
        cd.setTenCD(this.txtTenCD.getText());
        cd.setThoiLuong(Integer.parseInt(this.txtThoiLuong.getText()));
        cd.setHocPhi(Double.parseDouble(this.txtHocPhi.getText()));
        cd.setMoTa(this.txtMoTa.getText());
        cd.setHinh(this.lblHinh.getToolTipText());
        return cd;
    }

    private void setForm(ChuyenDe cd) {
        this.txtMaCD.setText(cd.getMaCD());
        this.txtTenCD.setText(cd.getTenCD());
        this.txtThoiLuong.setText(cd.getThoiLuong() + "");
        this.txtHocPhi.setText(cd.getHocPhi() + "");
        this.txtMoTa.setText(cd.getMoTa());
        try {
            if (cd.getHinh() != null) {
                this.lblHinh.setToolTipText(cd.getHinh());
                this.lblHinh.setIcon(XImage.read(cd.getHinh(), this.lblHinh));
            }
        } catch (IOException e) {
            MsgBox.alert(this, "Hi???n ???nh th???t b???i!");
        }
    }

    private void clearForm() {
        ChuyenDe cd = new ChuyenDe();
        this.setForm(cd);
        this.lblHinh.setIcon(null);
        this.lblHinh.setToolTipText(null);
        this.index = -1;
        this.updateStatus();
    }

    private void insert() {
        ChuyenDe cd = this.getForm();
        try {
            this.dao.insert(cd);
            this.fillTable();
            this.Tabs.setSelectedIndex(1);
            this.clearForm();
            MsgBox.alert(this, "Th??m m???i th??nh c??ng");
        } catch (Exception e) {
            MsgBox.alert(this, "Th??m m???i th???t b???i");
        }
    }

    private void update() {
        ChuyenDe cd = this.getForm();
        try {
            this.dao.update(cd);
            this.fillTable();
            this.Tabs.setSelectedIndex(1);
            MsgBox.alert(this, "C???p nh???t th??nh c??ng");
        } catch (Exception e) {
            MsgBox.alert(this, "C???p nh???t th???t b???i");
        }

    }

    private void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "B???n kh??ng c?? quy???n xo?? chuy??n ?????!");
        } else {
            MsgBox.confirm(this, "B???n th???c s??? mu???n xo?? chuy??n ????? n??y");
            try {
                this.dao.delete(this.txtMaCD.getText());
                this.fillTable();
                this.Tabs.setSelectedIndex(1);
                this.clearForm();
                MsgBox.alert(this, "Xo?? th??nh c??ng");
            } catch (Exception e) {
                MsgBox.alert(this, "Chuy??n ????? n??y ??ang c?? kho?? h???c t???n t???i, vui l??ng kh??ng xo?? chuy??n ????? n??y!");
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
        if (this.index < this.tblChuyenDe.getRowCount() - 1) {
            this.index++;
            this.edit();
        }
    }

    private void last() {
        this.index = this.tblChuyenDe.getRowCount() - 1;
        this.edit();
    }

    private void chonAnh() {
        try {
            JFileChooser jfc = new JFileChooser();
            // m???c ?????nh ch??? ???????c ch???n ???nh
            FileFilter imgFilter = new FileNameExtensionFilter("Image Only", ImageIO.getReaderFileSuffixes());
            jfc.setFileFilter(imgFilter);
            if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = jfc.getSelectedFile();
                XImage.save(file); // l??u h??nh v??o th?? m???c logos
                ImageIcon icon = XImage.read(file.getName(), this.lblHinh); // ?????c h??nh t??? logos
//                Image img = ImageIO.read(file);
                this.lblHinh.setIcon(icon);
                this.lblHinh.setToolTipText(file.getName()); // gi??? t??n h??nh trong tooltip
            }
        } catch (IOException e) {
            MsgBox.alert(this, "Ch???n ???nh th???t b???i!");
        }
    }

    private void fillTimKiem() {
        this.model.setRowCount(0);
        try {
            String maCD = this.txtTimKiem.getText();
            String tenCD = this.txtTimKiem.getText();
            String thoiLuong = this.txtTimKiem.getText();
            String hocPhi = this.txtTimKiem.getText();
            this.list = this.dao.selectByMaCD(maCD, tenCD, thoiLuong, hocPhi);
            for (ChuyenDe cd : list) {
                this.model.addRow(new Object[]{
                    cd.getMaCD(),
                    cd.getTenCD(),
                    cd.getThoiLuong(),
                    cd.getHocPhi(),
                    cd.getHinh()
                });
            }
        } catch (Exception e) {
            MsgBox.alert(this, "L???i truy v???n d??? li???u");
        }
    }

    private void timKiem() {
        this.fillTimKiem();
        this.clearForm();
        this.index = -1;
        this.updateStatus();
    }

    private boolean checkT() {
        if (this.dao.selectByID(this.txtMaCD.getText()) != null) {
            MsgBox.alert(this, "M?? chuy??n ????? t???n t???i");
            this.txtMaCD.requestFocus();
            return false;
        }
        return true;
    }

    private boolean check() {
        //Check m?? chuy??n ?????
        if (this.txtMaCD.getText().isEmpty()) {
            MsgBox.alert(this, "Vui l??ng nh???p m?? chuy??n ?????!");
            this.txtMaCD.requestFocus();
            return false;
        } else if (this.txtMaCD.getText().length() != 5) {
            MsgBox.alert(this, "M?? chuy??n ????? ph???i 5 k?? t???!");
            this.txtMaCD.requestFocus();
            return false;
        }

        //Check t??n chuy??n ?????
        if (this.txtTenCD.getText().isEmpty()) {
            MsgBox.alert(this, "Vui l??ng nh???p t??n chuy??n ?????!");
            this.txtTenCD.requestFocus();
            return false;
        } else if (this.txtTenCD.getText().length() < 3) {
            MsgBox.alert(this, "T??n chuy??n ????? ph???i tr??n 3 k?? t???!");
            this.txtTenCD.requestFocus();
            return false;
        }

        //Check th???i l?????ng
        if (this.txtThoiLuong.getText().isEmpty()) {
            MsgBox.alert(this, "Vui l??ng nh???p th???i l?????ng!");
            this.txtThoiLuong.requestFocus();
            return false;
        }
        int thoiluong;
        try {
            thoiluong = Integer.parseInt(this.txtThoiLuong.getText());
            if (thoiluong < 0) {
                MsgBox.alert(this, "Th???i l?????ng ph???i l???n h??n 0!");
                this.txtThoiLuong.requestFocus();
                return false;
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Th???i l?????ng ph???i l?? s???!");
            this.txtThoiLuong.requestFocus();
            return false;
        }

        //Check h???c ph??
        if (this.txtHocPhi.getText().isEmpty()) {
            MsgBox.alert(this, "Vui l??ng nh???p h???c ph??!");
            this.txtHocPhi.requestFocus();
            return false;
        }
        float hocPhi;
        try {
            hocPhi = Float.parseFloat(this.txtHocPhi.getText());
            if (hocPhi < 0) {
                MsgBox.alert(this, "H???c ph?? ph???i l???n h??n 0!");
                this.txtHocPhi.requestFocus();
                return false;
            }
        } catch (Exception e) {
            MsgBox.alert(this, "H???c ph?? ph???i l?? s???!");
            this.txtHocPhi.requestFocus();
            return false;
        }

        return true;
    }
}
