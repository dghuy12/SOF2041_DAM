package com.edusys.ui;

import com.edusys.dao.ChuyenDeDAO;
import com.edusys.dao.HocVienDAO;
import com.edusys.dao.KhoaHocDAO;
import com.edusys.dao.NguoiHocDAO;
import com.edusys.entity.ChuyenDe;
import com.edusys.entity.HocVien;
import com.edusys.entity.KhoaHoc;
import com.edusys.entity.NguoiHoc;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XDate;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class HocVienJInternalFrame extends javax.swing.JInternalFrame {

    private ChuyenDeDAO cddao;
    private KhoaHocDAO khdao;
    private NguoiHocDAO nhdao;
    private HocVienDAO hvdao;

    public HocVienJInternalFrame() {
        this.initComponents();

        this.cddao = new ChuyenDeDAO();
        this.khdao = new KhoaHocDAO();
        this.nhdao = new NguoiHocDAO();
        this.hvdao = new HocVienDAO();

        this.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlChuyenDe = new javax.swing.JPanel();
        cbbChuyenDe = new javax.swing.JComboBox<>();
        pnlKhoaHoc = new javax.swing.JPanel();
        cbbKhoaHoc = new javax.swing.JComboBox<>();
        Tabs = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHocVien = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("EduSys - Quản Lý Học Viên");

        pnlChuyenDe.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHUYÊN ĐỀ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        cbbChuyenDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbChuyenDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlChuyenDeLayout = new javax.swing.GroupLayout(pnlChuyenDe);
        pnlChuyenDe.setLayout(pnlChuyenDeLayout);
        pnlChuyenDeLayout.setHorizontalGroup(
            pnlChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChuyenDeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbbChuyenDe, 0, 330, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlChuyenDeLayout.setVerticalGroup(
            pnlChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChuyenDeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbbChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlKhoaHoc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KHOÁ HỌC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        cbbKhoaHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlKhoaHocLayout = new javax.swing.GroupLayout(pnlKhoaHoc);
        pnlKhoaHoc.setLayout(pnlKhoaHocLayout);
        pnlKhoaHocLayout.setHorizontalGroup(
            pnlKhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhoaHocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbbKhoaHoc, 0, 330, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlKhoaHocLayout.setVerticalGroup(
            pnlKhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhoaHocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbbKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblHocVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TT", "Mã HV", "Mã NH", "Họ Tên", "Điểm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHocVien);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Edit.png"))); // NOI18N
        btnUpdate.setText("Cập nhật điểm");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Delete.png"))); // NOI18N
        btnDelete.setText("Xoá khỏi khoá học");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tabs.addTab("HỌC VIÊN", jPanel3);

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NH", "Họ Và Tên", "Giới Tính", "Ngày Sinh", "Điện Thoại", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblNguoiHoc);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Add.png"))); // NOI18N
        btnInsert.setText("Thêm người học");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInsert)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInsert)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tabs.addTab("NGƯỜI HỌC", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlChuyenDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlKhoaHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbChuyenDeActionPerformed
        this.fillCbbKhoaHoc();

    }//GEN-LAST:event_cbbChuyenDeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        this.removeHocVien();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        this.updateDiem();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        this.addHocVien();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        fillTableNguoiHoc();
    }//GEN-LAST:event_txtTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbbChuyenDe;
    private javax.swing.JComboBox<String> cbbKhoaHoc;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlChuyenDe;
    private javax.swing.JPanel pnlKhoaHoc;
    private javax.swing.JTable tblHocVien;
    private javax.swing.JTable tblNguoiHoc;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setResizable(false);
        this.fillCbbChuyenDe();
    }

    private void fillCbbChuyenDe() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) this.cbbChuyenDe.getModel();
        model.removeAllElements();
        List<ChuyenDe> list = this.cddao.selectAll();
        for (ChuyenDe cd : list) {
            model.addElement(cd);
        }
        this.fillCbbKhoaHoc();
    }

    private void fillCbbKhoaHoc() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) this.cbbKhoaHoc.getModel();
        model.removeAllElements();
        ChuyenDe cd = (ChuyenDe) this.cbbChuyenDe.getSelectedItem();
        if (cd != null) {
            List<KhoaHoc> list = this.khdao.selectByChuyenDe(cd.getMaCD());
            for (KhoaHoc kh : list) {
                model.addElement(kh);
            }
            this.fillTableHocVien();
        }
    }

    private void fillTableHocVien() {
        DefaultTableModel model = (DefaultTableModel) this.tblHocVien.getModel();
        model.setRowCount(0);
        KhoaHoc kh = (KhoaHoc) this.cbbKhoaHoc.getSelectedItem();
        if (kh != null) {
            List<HocVien> list = this.hvdao.selectByKhoaHoc(kh.getMaKH());
            for (int i = 0; i < list.size(); i++) {
                HocVien hv = list.get(i);
                String hoTen = this.nhdao.selectByID(hv.getMaNH()).getHoTen();
                model.addRow(new Object[]{i + 1, hv.getMaHV(), hv.getMaNH(), hoTen, hv.getDiem()});
            }
            this.fillTableNguoiHoc();
        }
    }

    private void fillTableNguoiHoc() {
        DefaultTableModel model = (DefaultTableModel) this.tblNguoiHoc.getModel();
        model.setRowCount(0);
        KhoaHoc kh = (KhoaHoc) this.cbbKhoaHoc.getSelectedItem();
        String keyword = this.txtTimKiem.getText();
        List<NguoiHoc> list = this.nhdao.selectNotInCourse(kh.getMaKH(), keyword);
        for (NguoiHoc nh : list) {
            model.addRow(new Object[]{nh.getMaNH(), nh.getHoTen(), nh.isGioiTinh() ? "Nam" : "Nữ",
                nh.getNgaySinh(), nh.getDienThoai(), nh.getEmail()});
        }
    }

    private void addHocVien() {
        KhoaHoc kh = (KhoaHoc) this.cbbKhoaHoc.getSelectedItem();
        for (int row : this.tblNguoiHoc.getSelectedRows()) {
            HocVien hv = new HocVien();
            hv.setMaKH(kh.getMaKH());
            hv.setMaNH(this.tblNguoiHoc.getValueAt(row, 0).toString());
            hv.setDiem(0.00);
            this.hvdao.insert(hv);
        }
        this.fillTableHocVien();
        MsgBox.alert(this, "Thêm học viên thành công ");
        this.Tabs.setSelectedIndex(0);
    }

    private void removeHocVien() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xoá học viên");
        } else {
            if (MsgBox.confirm(this, "Bạn muốn các học viên được chọn không ?")) {
                for (int row : this.tblHocVien.getSelectedRows()) {
                    int maHV = (int) this.tblHocVien.getValueAt(row, 1);
                    this.hvdao.delete(maHV);
                }
                this.fillTableHocVien();
                MsgBox.alert(this, "Xoá học viên thành công!");
            }
        }
    }

    private void updateDiem() {
        for (int i = 0; i < this.tblHocVien.getRowCount(); i++) {
            int maHV = (int) tblHocVien.getValueAt(i, 1);
            HocVien hv = this.hvdao.selectByID(maHV);
            hv.setMaHV(maHV);
            hv.setDiem((Double.parseDouble(this.tblHocVien.getValueAt(i, 4).toString())));
            this.hvdao.update(hv);
        }
        this.fillTableHocVien();
        MsgBox.alert(this, "Cập nhật điểm thành công!");
    }
}
