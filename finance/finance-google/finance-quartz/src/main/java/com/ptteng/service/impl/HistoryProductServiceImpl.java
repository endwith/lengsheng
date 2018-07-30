package com.ptteng.service.impl;

import com.ptteng.dao.HistoryProductMapper;
import com.ptteng.model.HistoryProduct;
import com.ptteng.service.HistoryProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class HistoryProductServiceImpl implements HistoryProductService {
  @Resource
  private HistoryProductMapper historyProductMapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return historyProductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HistoryProduct record) {
        return this.historyProductMapper.insert(record);
    }

    @Override
    public int insertSelective(HistoryProduct record) {
        return historyProductMapper.insertSelective(record);
    }

    @Override
    public HistoryProduct selectByPrimaryKey(Long id) {
        return historyProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HistoryProduct record) {
        return historyProductMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HistoryProduct record) {
        return historyProductMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<HistoryProduct> selectAllByUserId(Long userId, Long a, Long b) {
        return this.historyProductMapper.selectAllByUserId(userId,a,b);
    }

    @Override
    public List<HistoryProduct> selectByUserId(Long  userId) {
        return this.historyProductMapper.selectByUserId(userId);
    }

    @Override
    public List<HistoryProduct> selectUserProductByUserId(Long userId) {
        return this.historyProductMapper.selectUserProductByUserId(userId);
    }

    @Override
    public Long selectCount(Long userId) {
        return this.historyProductMapper.selectCount(userId);
    }
    @Override
    public List<Map> selectByProduct(String product, Long a, Long b) {
        return this.historyProductMapper.selectByProduct(product,a,b);
    }

    @Override
    public Long selectByProductCount(String product) {
        return this.historyProductMapper.selectByProductCount(product);
    }


}