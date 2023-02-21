package com.example.demospringdatacassandra.cassandra.repository;

import org.springframework.data.cassandra.core.query.Query;

import java.io.Serializable;
import java.util.List;

/**
 * @Project Name: demo-all
 * @File Name: BaseRepository
 * @Date: 2023/2/17 23:28
 * @author: wb04
 * 业务中文描述:
 * Copyright (c) 2023,All Rights Reserved.
 */
public interface BaseRepository<T> {
    /**
     * 按主键查询
     *
     * @param id
     * @return
     */
    T getById(Serializable id);

    /**
     * 按条件查询对象
     *
     * @param query
     * @return
     */
    T getObj(Query query);

    /**
     * 按条件查询列表
     *
     * @param query
     * @return
     */
    List<T> listObjs(Query query);
//    /**
//     * 分页查询
//     * @param pagination
//     * @param query
//     * @return
//     */
//    Slice<T> pageObjs(Pagination pagination, Query query);
}
