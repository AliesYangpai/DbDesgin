package org.alie.dbdesgin.db;


/**
 * Created by Alie on 2019/7/16.
 * 所有数据库操作的基类
 * 版本
 */
public interface IBaseDao<T> {
    long insert(T entity);

//    long update(T entity, T where);
//
//    int delete(T where);
//
//    List<T>  query(T where);
//
//    List<T> query(T where,String orderBy,Integer startIndex,Integer limit);
//
//    List<T> query(String sql);
}
