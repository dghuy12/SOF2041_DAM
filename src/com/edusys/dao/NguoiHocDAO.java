package com.edusys.dao;

import com.edusys.entity.NguoiHoc;
import com.edusys.utils.JdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class NguoiHocDAO extends EduSysDAO<NguoiHoc, String> {

    String INSERT_SQL = "INSERT INTO NguoiHoc(MaNH,HoTen,NgaySinh,GioiTinh,DienThoai,Email,GhiChu,MaNV,NgayDK)VALUES(?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NguoiHoc SET HoTen = ?, NgaySinh = ?, GioiTinh = ?, DienThoai = ?, Email = ?, GhiChu = ?, "
            + "MaNV = ?, NgayDK = ? WHERE MaNH = ?";
    String DELETE_SQL = "DELETE FROM NguoiHoc WHERE MaNH = ?";
    String SELECT_ALL_SQL = "SELECT * FROM NguoiHoc";
    String SELECT_BY_ID_SQL = "SELECT * FROM NguoiHoc WHERE MaNH = ?";

    @Override
    public void insert(NguoiHoc entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaNH(), entity.getHoTen(), entity.getNgaySinh(), entity.isGioiTinh(), entity.getDienThoai(),
                entity.getEmail(), entity.getGhiChu(), entity.getMaNV(), entity.getNgayDK());
    }

    @Override
    public void update(NguoiHoc entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getHoTen(), entity.getNgaySinh(), entity.isGioiTinh(), entity.getDienThoai(),
                entity.getEmail(), entity.getGhiChu(), entity.getMaNV(), entity.getNgayDK(), entity.getMaNH());
    }

    @Override
    public void delete(String key) {
        JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    protected List<NguoiHoc> selectBySQL(String sql, Object... args) {
        List<NguoiHoc> list = new ArrayList<NguoiHoc>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                NguoiHoc nh = new NguoiHoc();
                nh.setMaNH(rs.getString("MaNH"));
                nh.setHoTen(rs.getString("HoTen"));
                nh.setNgaySinh(rs.getDate("NgaySinh"));
                nh.setGioiTinh(rs.getBoolean("GioiTinh"));
                nh.setDienThoai(rs.getString("DienThoai"));
                nh.setEmail(rs.getString("Email"));
                nh.setGhiChu(rs.getString("GhiChu"));
                nh.setMaNV(rs.getString("MaNV"));
                nh.setNgayDK(rs.getDate("NgayDK"));
                list.add(nh);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public List<NguoiHoc> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public NguoiHoc selectByID(String key) {
        List<NguoiHoc> list = this.selectBySQL(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<NguoiHoc> selectByKeyword(String maNH, String hoTen, String email, String dienThoai) {
        String sql = "SELECT * FROM NguoiHoc WHERE MaNH LIKE ? OR HoTeN LIKE ? OR Email LIKE ? OR DienThoai LIKE ?";
        return this.selectBySQL(sql, "%" + maNH + "%", "%" + hoTen + "%", "%" + email + "%", "%" + dienThoai + "%");
    }

    public List<NguoiHoc> selectNotInCourse(int maKH, String keyword) {
        String sql = "SELECT * FROM NguoiHoc WHERE HoTen LIKE ? AND "
                + "MaNH NOT IN (SELECT MaNH FROM HocVien WHERE MaKH = ?)";
        return this.selectBySQL(sql, "%" + keyword + "%", maKH);
    }

}
