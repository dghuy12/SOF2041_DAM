package com.edusys.dao;

import com.edusys.entity.ChuyenDe;
import com.edusys.utils.JdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class ChuyenDeDAO extends EduSysDAO<ChuyenDe, String> {

    String INSERT_SQL = "INSERT INTO ChuyenDe (MaCD,TenCD,HocPhi,ThoiLuong,Hinh,MoTa)VALUES(?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE ChuyenDe SET TenCD = ?, HocPhi = ?, ThoiLuong = ?, Hinh = ?, MoTa = ? WHERE MaCD = ?";
    String DELETE_SQL = "DELETE FROM ChuyenDe WHERE MaCD = ?";
    String SELECT_ALL_SQL = "SELECT * FROM ChuyenDe";
    String SELECT_BY_ID_SQL = "SELECT * FROM ChuyenDe WHERE MaCD= ?";

    @Override
    public void insert(ChuyenDe entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaCD(), entity.getTenCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getHinh(), entity.getMoTa());
    }

    @Override
    public void update(ChuyenDe entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getTenCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getHinh(), entity.getMoTa(), entity.getMaCD());
    }

    @Override
    public void delete(String key) {
        JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    protected List<ChuyenDe> selectBySQL(String sql, Object... args) {
        List<ChuyenDe> list = new ArrayList<ChuyenDe>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                ChuyenDe cd = new ChuyenDe();
                cd.setMaCD(rs.getString("MaCD"));
                cd.setTenCD(rs.getString("TenCD"));
                cd.setHocPhi(rs.getDouble("HocPhi"));
                cd.setThoiLuong(rs.getInt("ThoiLuong"));
                cd.setHinh(rs.getString("Hinh"));
                cd.setMoTa(rs.getString("MoTa"));
                list.add(cd);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public List<ChuyenDe> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public ChuyenDe selectByID(String key) {
        List<ChuyenDe> list = this.selectBySQL(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<ChuyenDe> selectByMaCD(String maCD, String tenCD, String thoiLuong, String hocPhi) {
        String sql = "SELECT * FROM CHUYENDE WHERE MACD LIKE ? OR TENCD LIKE ? OR HOCPHI LIKE ? OR THOILUONG LIKE ?";
        return this.selectBySQL(sql, "%" + maCD + "%", "%" + tenCD + "%", "%" + thoiLuong + "%", "%" + hocPhi + "%");
    }

}
