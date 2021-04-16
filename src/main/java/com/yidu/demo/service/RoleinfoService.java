package com.yidu.demo.service;

import com.yidu.demo.entity.Roleinfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Roleinfo)表服务接口
 *
 * @author makejava
 * @since 2021-04-15 08:51:57
 */
@Service
public interface RoleinfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param roleid 主键
     * @return 实例对象
     */
    Roleinfo queryById(Integer roleid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Roleinfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param roleinfo 实例对象
     * @return 实例对象
     */
    Roleinfo insert(Roleinfo roleinfo);

    /**
     * 修改数据
     *
     * @param roleinfo 实例对象
     * @return 实例对象
     */
    Roleinfo update(Roleinfo roleinfo);

    /**
     * 通过主键删除数据
     *
     * @param roleid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer roleid);

}