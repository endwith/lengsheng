package com.ptteng.service.impl;

import com.ptteng.dao.RoleManageMapper;
import com.ptteng.model.ModuleManage;
import com.ptteng.model.RoleManage;
import com.ptteng.service.RoleManageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleManageServiceImpl implements RoleManageService {
@Resource
private RoleManageMapper roleManageMapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return roleManageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RoleManage record) {
        return this.roleManageMapper.insert(record);
    }

    @Override
    public int insertSelective(RoleManage record) {
        return this.roleManageMapper.insertSelective(record);
    }
    @Override
    public List<RoleManage> selectAll(){
        return this.roleManageMapper.selectAll();
    }
    @Override
    public RoleManage selectByPrimaryKey(Long id) {
        return this.roleManageMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RoleManage record) {
        return this.roleManageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RoleManage record) {
        return roleManageMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<RoleManage> forSelect(Long a, Long b){
            return this.roleManageMapper.forSelect(a,b);
    }
    @Override
    public  List<RoleManage> select(Long a, Long b,Long id, String role,String founder,String modifier)
    {
        return this.roleManageMapper.select(a,b,id,role,founder,modifier);
    }

    @Override
    public List<ModuleManage> selectById(Long id) {
        return this.roleManageMapper.selectById(id);
    }

    @Override
    public Long selectCount() {
        return this.roleManageMapper.selectCount();
    }

    @Override
    public Long selectCountWithCondition(Long id, String role, String founder, String modifier) {
        return this.roleManageMapper.selectCountWithCondition(id, role, founder, modifier);
    }

}