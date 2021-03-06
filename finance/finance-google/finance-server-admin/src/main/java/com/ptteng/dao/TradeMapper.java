package com.ptteng.dao;

import com.ptteng.model.Trade;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface TradeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Trade record);

    int insertSelective(Trade record);

    Trade selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);

    List<Object> matchSelect(@Param("id") Long id, @Param("a") Long a, @Param("b") Long b);

    List<Object> limitMatchSelect(@Param("id") Long id, @Param("loanTerm") Long loanTerm, @Param("repayTime") Long repayTime, @Param("matchingAmount") BigDecimal matchingAmount);

    int updateByTradeId(@Param("tradeId") Long tradeId, @Param("toBeMatched") BigDecimal toBeMatched);

    List<Trade> selectByUserId(@Param("userId") Long userId, @Param("a") int a, @Param("b") int b);

    int updateStatusByID(@Param("id") Long id, @Param("status") int status);
    //分页查询
    List<Trade> forReturnInterest(@Param("a") Long a, @Param("b") Long b);
    //分页查询
    List<Trade> forReturnPrincipal(@Param("a") Long a, @Param("b") Long b);
    Long selectReturnPrincipal();
    Long selectReturnInterest();
    Trade selectByInvestmentContractId(@Param("investmentContractId") Long investmentContractId);
}