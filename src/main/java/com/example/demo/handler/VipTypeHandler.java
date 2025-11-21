package com.example.demo.handler;

import com.example.demo.entity.VipType;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.*;

public class VipTypeHandler extends BaseTypeHandler<VipType> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, VipType parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, parameter.getCode());
    }

    @Override
    public VipType getNullableResult(ResultSet rs, String columnName) throws SQLException {
        int code = rs.getInt(columnName);
        return VipType.fromCode(code);
    }

    @Override
    public VipType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        int code = rs.getInt(columnIndex);
        return VipType.fromCode(code);
    }

    @Override
    public VipType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        int code = cs.getInt(columnIndex);
        return VipType.fromCode(code);
    }
}
