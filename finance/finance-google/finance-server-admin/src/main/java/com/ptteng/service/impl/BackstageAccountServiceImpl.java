package com.ptteng.service.impl;

import com.ptteng.dao.BackstageAccountMapper;
import com.ptteng.model.BackstageAccount;
import com.ptteng.service.BackstageAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BackstageAccountServiceImpl implements BackstageAccountService {
@Resource
 private BackstageAccountMapper backstageAccountMapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.backstageAccountMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BackstageAccount record) {
        return this.backstageAccountMapper.insert(record);
    }

    @Override
    public int insertSelective(BackstageAccount record) {
        return this.backstageAccountMapper.insertSelective(record);
    }
    @Override
    public BackstageAccount selectByPassword(String password){
        return this.backstageAccountMapper.selectByPassword(password);
    }
    @Override
    public BackstageAccount selectByPrimaryKey(Long id) {

        return this.backstageAccountMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<BackstageAccount> selectByAdmin(String admin){
        return this.backstageAccountMapper.selectByAdmin(admin);
    }
    @Override
    public int updateByPrimaryKeySelective(BackstageAccount record) {
        return this.backstageAccountMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BackstageAccount record) {
        return this.backstageAccountMapper.updateByPrimaryKey(record);

    }
    //分页查询
    public List<BackstageAccount> forSelect(Long a, Long b){
        return this.backstageAccountMapper.forSelect(a,b);
    }
    //分页模糊查询
    public List<BackstageAccount> select(Long a,Long b,Long id, String adminRole, String admin, String founder){
        return this.backstageAccountMapper.select(a,b,id,adminRole,admin,founder);
    }

    @Override
    public Long selectCount() {
        return this.backstageAccountMapper.selectCount();
    }

    @Override
    public Long selectCountWithCondition(Long id, String adminRole, String admin, String founder) {
        return this.backstageAccountMapper.selectCountWithCondition(id,adminRole,admin,founder);
    }


}