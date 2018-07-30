package com.ptteng.dao;

import com.ptteng.model.ModuleManage;
import com.ptteng.model.RoleManage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoleManageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RoleManage record);

    int insertSelective(RoleManage record);

    RoleManage selectByPrimaryKey(Long id);
    List<RoleManage> selectAll();
    int updateByPrimaryKeySelective(RoleManage record);

    int updateByPrimaryKey(RoleManage record);
    List<RoleManage> forSelect(@Param("a") Long a, @Param("b") Long b);
    List<RoleManage> select(@Param("a") Long a, @Param("b") Long b, @Param("id") Long id, @Param("role") String role, @Param("founder") String founder, @Param("modifier") String modifier);
    Long selectCount();
    Long selectCountWithCondition(@Param("id") Long id, @Param("role") String role, @Param("founder") String founder, @Param("modifier") String modifier);
    List<ModuleManage>  selectById(long id);
}