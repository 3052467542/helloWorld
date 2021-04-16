package com.yidu.demo.service;

import com.yidu.demo.entity.Userinfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Userinfo)表服务接口
 *
 * @author makejava
 * @since 2021-04-12 14:28:53
 */
@Service
public interface UserinfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    Userinfo queryById(Integer userid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Userinfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userinfo 实例对象
     * @return 实例对象
     */
    Userinfo insert(Userinfo userinfo);

    /**
     * 修改数据
     *
     * @param userinfo 实例对象
     * @return 实例对象
     */
    Userinfo update(Userinfo userinfo);

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userid);

    Userinfo login(String userName,String userPass);

}