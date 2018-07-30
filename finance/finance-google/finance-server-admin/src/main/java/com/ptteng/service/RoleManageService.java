package com.ptteng.service;

import com.ptteng.model.ModuleManage;
import com.ptteng.model.RoleManage;

import java.util.List;


public interface RoleManageService {
    int deleteByPrimaryKey(Long id);

    int insert(RoleManage record);

    int insertSelective(RoleManage record);

    RoleManage selectByPrimaryKey(Long id);
    List<RoleManage> selectAll();
    int updateByPrimaryKeySelective(RoleManage record);

    int updateByPrimaryKey(RoleManage record);
    List<RoleManage> forSelect(Long a, Long b);
    List<RoleManage> select(Long a, Long b, Long id, String role, String founder, String modifier);
    List<ModuleManage>  selectById(Long id);
    Long selectCount();
    Long selectCountWithCondition(Long id,String role,String founder,String modifier);

}