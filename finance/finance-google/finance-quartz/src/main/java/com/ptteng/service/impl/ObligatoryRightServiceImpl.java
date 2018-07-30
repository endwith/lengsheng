package com.ptteng.service.impl;

import com.ptteng.dao.ObligatoryRightMapper;
import com.ptteng.model.ObligatoryRight;
import com.ptteng.model.Trade;
import com.ptteng.service.ObligatoryRightService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Service
public class ObligatoryRightServiceImpl implements ObligatoryRightService {
@Resource
private ObligatoryRightMapper obligatoryRightMapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return obligatoryRightMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ObligatoryRight record) {
        return this.obligatoryRightMapper.insert(record);
    }

    @Override
    public int insertSelective(ObligatoryRight record) {
        return obligatoryRightMapper.insertSelective(record);
    }

    @Override
    public ObligatoryRight selectByPrimaryKey(Long id) {
        return obligatoryRightMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ObligatoryRight record) {
        return obligatoryRightMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ObligatoryRight record) {
        return obligatoryRightMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ObligatoryRight> forSelect(Long a, Long b) {
        return this.obligatoryRightMapper.forSelect(a,b);
    }

    @Override
    public List<ObligatoryRight> select(Long a, Long b, Long id, String company, String corporate, Integer status) {
        return this.obligatoryRightMapper.select(a,b,id,company,corporate,status);
    }

    @Override
    public int updateById(Long obligatoryId, BigDecimal matchingAmount) {
        return this.obligatoryRightMapper.updateById(obligatoryId,matchingAmount);
    }

    @Override
    public Long selectCount() {
        return this.obligatoryRightMapper.selectCount();
    }

    @Override
    public Long selectCountWithCondition() {
        return this.obligatoryRightMapper.selectCountWithCondition();
    }

    @Override
    public List<Trade> getTrade(long id) {
        return obligatoryRightMapper.getTrade(id);
    }
}