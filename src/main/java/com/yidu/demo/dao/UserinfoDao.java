package com.yidu.demo.dao;

import com.yidu.demo.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Userinfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-12 14:28:53
 */
@Mapper
@Repository
public interface UserinfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    Userinfo queryById(Integer userid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Userinfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userinfo 实例对象
     * @return 对象列表
     */
    List<Userinfo> queryAll(Userinfo userinfo);

    /**
     * 新增数据
     *
     * @param userinfo 实例对象
     * @return 影响行数
     */
    int insert(Userinfo userinfo);

    /**
     * 修改数据
     *
     * @param userinfo 实例对象
     * @return 影响行数
     */
    int update(Userinfo userinfo);

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 影响行数
     */
    int deleteById(Integer userid);

    Userinfo login(String userName,String userPass);

}