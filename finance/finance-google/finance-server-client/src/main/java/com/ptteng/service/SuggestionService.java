package com.ptteng.service;

import com.ptteng.model.Suggestion;

import java.util.List;


public interface SuggestionService {
    int deleteByPrimaryKey(Long id);

    int insert(Suggestion record);

    int insertSelective(Suggestion record);
    Suggestion selectByUserId(Long userId);
    Suggestion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Suggestion record);

    int updateByPrimaryKey(Suggestion record);
    List<Suggestion> forSelect(Long a, Long b);

    List<Suggestion> select(Long a, Long b, Long id, String suggeContent, String adviser, String phone);
    List<Object> selectSuggeByRead(Long userId, Long b);
    long selectSuggeNoReadCount(Long id);

    List<Object> selectSuggeContentById(Long id);
    Long selectCount();
    Long selectCountWithCondition(Long id, String suggeContent, String adviser, String phone);
}
