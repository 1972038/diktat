package com.David.util;
/**
 * @author David (1972038)
 */
import java.sql.SQLException;
import java.util.List;

public interface DaoService<T> {
    List<T> fetchAll() throws SQLException, ClassCastException;
    int deleteData (T t)throws  SQLException, ClassNotFoundException;
    int addData(T t) throws SQLException, ClassNotFoundException;
    int updateData(T t) throws SQLException, ClassNotFoundException;
}
