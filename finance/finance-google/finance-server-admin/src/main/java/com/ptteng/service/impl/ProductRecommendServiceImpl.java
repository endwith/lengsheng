package com.ptteng.service.impl;

import com.ptteng.dao.ProductRecommendMapper;
import com.ptteng.model.Product;
import com.ptteng.model.ProductRecommend;
import com.ptteng.service.ProductRecommendService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class ProductRecommendServiceImpl implements ProductRecommendService {
@Resource
private ProductRecommendMapper productRecommendMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return productRecommendMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProductRecommend record) {
        return this.productRecommendMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductRecommend record) {
        return productRecommendMapper.insertSelective(record);
    }

    @Override
    public ProductRecommend selectByPrimaryKey(Long id) {
        return productRecommendMapper.selectByPrimaryKey(id);
    }
    @Override
    public  List<ProductRecommend> selectByStatus(Integer type,Integer recommendStatus,Integer bannerStatus){
        return this.productRecommendMapper.selectByStatus( type,recommendStatus, bannerStatus);
    }
    @Override
    public int updateByPrimaryKeySelective(ProductRecommend record) {
        return productRecommendMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductRecommend record) {
        return productRecommendMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ProductRecommend> forSelect(Long a, Long b, Integer type) {
        return this.productRecommendMapper.forSelect(a,b,type);
    }

    @Override
    public List<Product> select(Long a, Long b, Integer type, Long id, String title, String product, String founder, String modifier) {
        return this.productRecommendMapper.select(a,b,type,id,title,product,founder,modifier);
    }

    @Override
    public Long selectCount(Integer type) {
        return this.productRecommendMapper.selectCount(type);
    }

    @Override
    public Long selectCountWithCondition(Integer type, Long id, String title, String product, String founder, String modifier) {
        return this.productRecommendMapper.selectCountWithCondition(type,id,title,product,founder,modifier);
    }


}