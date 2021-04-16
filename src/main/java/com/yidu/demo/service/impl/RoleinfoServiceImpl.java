package com.yidu.demo.service.impl;

import com.yidu.demo.entity.Roleinfo;
import com.yidu.demo.dao.RoleinfoDao;
import com.yidu.demo.service.RoleinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Roleinfo)表服务实现类
 *
 * @author makejava
 * @since 2021-04-15 08:51:57
 */
@Service("roleinfoService")
public class RoleinfoServiceImpl implements RoleinfoService {
    @Resource
    private RoleinfoDao roleinfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param roleid 主键
     * @return 实例对象
     */
    @Override
    public Roleinfo queryById(Integer roleid) {
        return this.roleinfoDao.queryById(roleid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Roleinfo> queryAllByLimit(int offset, int limit) {
        return this.roleinfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param roleinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Roleinfo insert(Roleinfo roleinfo) {
        this.roleinfoDao.insert(roleinfo);
        return roleinfo;
    }

    /**
     * 修改数据
     *
     * @param roleinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Roleinfo update(Roleinfo roleinfo) {
        this.roleinfoDao.update(roleinfo);
        return this.queryById(roleinfo.getRoleid());
    }

    /**
     * 通过主键删除数据
     *
     * @param roleid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer roleid) {
        return this.roleinfoDao.deleteById(roleid) > 0;
    }
}