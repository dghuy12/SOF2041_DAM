package com.edusys.dao;

import com.edusys.entity.NhanVien;
import com.edusys.utils.JdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class NhanVienDAO extends EduSysDAO<NhanVien, String> {

    String INSERT_SQL = "INSERT INTO NhanVien (MaNV, MatKhau, HoTen, Email, VaiTro, TrangThai)VALUES(?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NhanVien SET MatKhau = ?, HoTen = ?, Email = ?, VaiTro = ? WHERE MaNV = ?";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV = ?";

    @Override
    public void insert(NhanVien entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaNV(), entity.getMatKhau(), entity.getHoTen(), entity.getEmail(), entity.isVaiTro(), entity.isTrangThai());
    }

    @Override
    public void update(NhanVien entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getMatKhau(), entity.getHoTen(), entity.getEmail(), entity.isVaiTro(), entity.getMaNV());
    }

    @Override
    public void delete(String key) {
        JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    protected List<NhanVien> selectBySQL(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<NhanVien>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setHoTen(rs.getString("HoTen"));
                nv.setMatKhau(rs.getString("MatKhau"));
                nv.setEmail(rs.getString("Email"));
                nv.setVaiTro(rs.getBoolean("VaiTro"));
                nv.setTrangThai(rs.getBoolean("TrangThai"));

                list.add(nv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectByID(String key) {
        List<NhanVien> list = this.selectBySQL(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<NhanVien> selectHD() {
        String sql = "SELECT * FROM NhanVien WHERE TrangThai = 1";
        return this.selectBySQL(sql);
    }

    public List<NhanVien> selectKHD() {
        String sql = "SELECT * FROM NhanVien WHERE TrangThai = 0";
        return this.selectBySQL(sql);
    }

    public void updateHD(NhanVien entity) {
        String sql = "UPDATE NhanVien SET TrangThai = 1 WHERE MaNV = ?";
        JdbcHelper.update(sql, entity.getMaNV());
    }
    public void updateKHD(NhanVien entity) {
        String sql = "UPDATE NhanVien SET TrangThai = 0 WHERE MaNV = ?";
        JdbcHelper.update(sql, entity.getMaNV());
    }

}
