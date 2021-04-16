package com.yidu.demo.dao;

import com.yidu.demo.entity.Roleinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Roleinfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-15 08:51:57
 */
@Mapper
@Repository
public interface RoleinfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param roleid 主键
     * @return 实例对象
     */
    Roleinfo queryById(Integer roleid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Roleinfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param roleinfo 实例对象
     * @return 对象列表
     */
    List<Roleinfo> queryAll(Roleinfo roleinfo);

    /**
     * 新增数据
     *
     * @param roleinfo 实例对象
     * @return 影响行数
     */
    int insert(Roleinfo roleinfo);

    /**
     * 修改数据
     *
     * @param roleinfo 实例对象
     * @return 影响行数
     */
    int update(Roleinfo roleinfo);

    /**
     * 通过主键删除数据
     *
     * @param roleid 主键
     * @return 影响行数
     */
    int deleteById(Integer roleid);

}