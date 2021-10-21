package com.edusys.ui;

import com.edusys.dao.KhoaHocDAO;
import com.edusys.dao.ThongKeDAO;
import com.edusys.entity.KhoaHoc;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XImage;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ThongKeJInternalFrame extends javax.swing.JInternalFrame {

    private KhoaHocDAO khdao;
    private ThongKeDAO tkdao;

    public ThongKeJInternalFrame(int index) {
        this.initComponents();

        this.khdao = new KhoaHocDAO();
        this.tkdao = new ThongKeDAO();
        this.selectTab(index);
        this.init();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbbKhoaHoc = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangDiem = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        abc = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        xy = new javax.swing.JScrollPane();
        tblDiemChuyenDe = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbbNam = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("EduSys - Tổng Hợp Thống Kê");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("TỔNG HỢP THỐNG KÊ");

        jLabel2.setText("KHOÁ HỌC:");

        cbbKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbKhoaHocActionPerformed(evt);
            }
        });

        tblBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NH", "Họ Và Tên", "Điểm", "Xếp Loại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBangDiem);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbbKhoaHoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbbKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("BẢNG ĐIỂM", jPanel1);

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Năm", "Số NH", "ĐK Sớm Nhất", "ĐK Muộn Nhất"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        abc.setViewportView(tblNguoiHoc);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abc, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abc, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("NGƯỜI HỌC", jPanel2);

        tblDiemChuyenDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chuyên Đề", "SL HV", "Điểm TN", "Điểm CN", "Điểm TB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        xy.setViewportView(tblDiemChuyenDe);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xy, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xy, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("ĐIỂM CHUYÊN ĐỀ", jPanel3);

        jLabel3.setText("NĂM:");

        cbbNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNamActionPerformed(evt);
            }
        });

        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chuyên Đề", "Số KH", "Số HV", "D. Thu", "HP. TN", "HP. CN", "HP. TP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblDoanhThu);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cbbNam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("DOANH THU", jPanel4);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/excel.png"))); // NOI18N
        jButton1.setText("Xuất Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(tabs))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbNamActionPerformed
        fillTableDoanhThu();
    }//GEN-LAST:event_cbbNamActionPerformed

    private void cbbKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbKhoaHocActionPerformed
        this.fillTableBangDiem();
    }//GEN-LAST:event_cbbKhoaHocActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.xuatExcel();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane abc;
    private javax.swing.JComboBox cbbKhoaHoc;
    private javax.swing.JComboBox<Object> cbbNam;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblBangDiem;
    private javax.swing.JTable tblDiemChuyenDe;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblNguoiHoc;
    private javax.swing.JScrollPane xy;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setResizable(false);

        if (!Auth.isManager()) {
            this.tabs.remove(3);
        }

        this.fillCbbKhoaHoc();
        this.fillTableBangDiem();
        this.fillTableNguoiHoc();
        this.fillTableDiemChuyenDe();
        this.fillCbbNam();
        this.fillTableDoanhThu();

    }

    public void selectTab(int index) {
        this.tabs.setSelectedIndex(index);
    }

    private void fillCbbKhoaHoc() {
        this.cbbKhoaHoc.removeAllItems();
        List<KhoaHoc> list = this.khdao.selectAll();
        for (KhoaHoc kh : list) {
            this.cbbKhoaHoc.addItem(kh);
        }
    }

    private void fillTableBangDiem() {
        DefaultTableModel tblModel = (DefaultTableModel) this.tblBangDiem.getModel();
        tblModel.setRowCount(0);
        KhoaHoc kh = (KhoaHoc) this.cbbKhoaHoc.getSelectedItem();
        if (kh != null) {
            List<Object[]> list = this.tkdao.getBangDiem(kh.getMaKH());
            for (Object[] row : list) {
                double diem = (double) row[2];
                tblModel.addRow(new Object[]{row[0], row[1], diem, getXepLoai(diem)});
            }
        }
    }

    private void fillTableNguoiHoc() {
        DefaultTableModel model = (DefaultTableModel) this.tblNguoiHoc.getModel();
        model.setRowCount(0);
        List<Object[]> list = this.tkdao.getLuongNguoiHoc();
        for (Object[] row : list) {
            model.addRow(row);
        }
    }

    private void fillTableDiemChuyenDe() {
        DefaultTableModel model = (DefaultTableModel) this.tblDiemChuyenDe.getModel();
        model.setRowCount(0);
        List<Object[]> list = this.tkdao.getDiemChuyenDe();
        for (Object[] row : list) {
            model.addRow(new Object[]{row[0], row[1], row[2], row[3], String.format("%.1f", row[4])});
        }
    }

    private void fillCbbNam() {
        this.cbbNam.removeAllItems();
        List<Integer> list = this.khdao.selectYears();
        for (Integer year : list) {
            this.cbbNam.addItem(year + "");
        }
    }

    private void fillTableDoanhThu() {
        DefaultTableModel tblModel = (DefaultTableModel) this.tblDoanhThu.getModel();
        tblModel.setRowCount(0);
        int nam = Integer.parseInt(this.cbbNam.getSelectedItem().toString());
        List<Object[]> list = this.tkdao.getDoanhThu(nam);
        for (Object[] row : list) {
            tblModel.addRow(row);
        }
    }

    private String getXepLoai(double diem) {
        if (diem < 5) {
            return "Chưa đạt";
        }
        if (diem < 6.5) {
            return "Trung bình";
        }
        if (diem < 7.5) {
            return "Khá";
        }
        if (diem < 9) {
            return "Giỏi";
        }
        return "Xuất sắt";
    }

    private void openFile(String file) {
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    private void xuatExcel() {
        DefaultTableModel model = (DefaultTableModel) this.tblBangDiem.getModel();
        JFileChooser jfc = new JFileChooser("documents");
        int result = jfc.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                File newFile = jfc.getSelectedFile();
                newFile = new File(newFile.toString() + ".xlsx");
                XSSFWorkbook xwb = new XSSFWorkbook();
                XSSFSheet Diemsheep = xwb.createSheet("Thống kê điểm");
                XSSFRow row = Diemsheep.createRow((short) 0);
                XSSFCell h;
                for (int i = 0; i < model.getColumnCount(); i++) {
                    h = row.createCell((short) i);
                    h.setCellValue(model.getColumnName(i));
                }

                XSSFRow row1;
                XSSFCell a1;
                XSSFCell a2;
                XSSFCell a3;
                XSSFCell a4;
                for (int i = 0; i < model.getRowCount(); i++) {
                    row1 = Diemsheep.createRow((short) i + 1);
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        a1 = row1.createCell((short) j);
                        a1.setCellValue(model.getValueAt(i, j).toString());
                    }
                }

                model = (DefaultTableModel) this.tblNguoiHoc.getModel();
                XSSFSheet NguoiHocsheep = xwb.createSheet("Thống kế người học");
                row = NguoiHocsheep.createRow((short) 0);
                for (int i = 0; i < model.getColumnCount(); i++) {
                    h = row.createCell((short) i);
                    h.setCellValue(model.getColumnName(i));
                }
                for (int i = 0; i < model.getRowCount(); i++) {
                    row1 = NguoiHocsheep.createRow((short) i + 1);
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        a1 = row1.createCell((short) j);
                        a1.setCellValue(model.getValueAt(i, j).toString());
                    }
                }

                model = (DefaultTableModel) this.tblDiemChuyenDe.getModel();
                XSSFSheet ChuyenDesheep = xwb.createSheet("Thống kê điểm chuyên đề");
                row = ChuyenDesheep.createRow((short) 0);
                for (int i = 0; i < model.getColumnCount(); i++) {
                    h = row.createCell((short) i);
                    h.setCellValue(model.getColumnName(i));
                }
                for (int i = 0; i < model.getRowCount(); i++) {
                    row1 = ChuyenDesheep.createRow((short) i + 1);
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        a1 = row1.createCell((short) j);
                        a1.setCellValue(model.getValueAt(i, j).toString());
                    }
                }

                model = (DefaultTableModel) this.tblDoanhThu.getModel();
                XSSFSheet DoanhThusheep = xwb.createSheet("Thống kê doanh thu");
                row = DoanhThusheep.createRow((short) 0);
                for (int i = 0; i < model.getColumnCount(); i++) {
                    h = row.createCell((short) i);
                    h.setCellValue(model.getColumnName(i));
                }
                for (int i = 0; i < model.getRowCount(); i++) {
                    row1 = DoanhThusheep.createRow((short) i + 1);
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        a1 = row1.createCell((short) j);
                        a1.setCellValue(model.getValueAt(i, j).toString());
                    }
                }

                FileOutputStream file = new FileOutputStream(newFile.getAbsoluteFile().getPath());
                xwb.write(file);
                xwb.close();
                file.close();
                MsgBox.alert(this, "Xuất tệp thành công");
                openFile(newFile.toString());
            } catch (Exception e) {
                MsgBox.alert(this, "Xuất tệp thất bại");
            }
        }
    }
}
