package com.edusys.dao;

import com.edusys.entity.HocVien;
import com.edusys.entity.NhanVien;
import com.edusys.utils.JdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class HocVienDAO extends EduSysDAO<HocVien, Integer> {

    String INSERT_SQL = "INSERT INTO HocVien(MaKH,MaNH,Diem)VALUES(?,?,?)";
    String UPDATE_SQL = "UPDATE HocVien SET Diem = ? WHERE MaHV = ?";
    String DELETE_SQL = "DELETE FROM HocVien WHERE MaHV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM HocVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM HocVien WHERE MaHV = ?";

    @Override
    public void insert(HocVien entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaKH(), entity.getMaNH(), entity.getDiem());
    }

    @Override
    public void update(HocVien entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getDiem(), entity.getMaHV());
    }

    @Override
    public void delete(Integer key) {
        JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    protected List<HocVien> selectBySQL(String sql, Object... args) {
        List<HocVien> list = new ArrayList<HocVien>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                HocVien hv = new HocVien();
                hv.setMaHV(rs.getInt("MaHV"));
                hv.setMaKH(rs.getInt("MaKH"));
                hv.setMaNH(rs.getString("MaNH"));
                hv.setDiem(rs.getDouble("Diem"));

                list.add(hv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public List<HocVien> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public HocVien selectByID(Integer key) {
        List<HocVien> list = this.selectBySQL(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<HocVien> selectByKhoaHoc(int maKH) {
        String sql = "SELECT * FROM HocVien WHERE MaKH = ?";
        return this.selectBySQL(sql, maKH);
    }

}
