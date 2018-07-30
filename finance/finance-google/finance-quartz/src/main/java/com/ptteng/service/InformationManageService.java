package com.ptteng.service;

import com.ptteng.model.InformationManage;

import java.util.List;


public interface InformationManageService {
    int deleteByPrimaryKey(Long id);

    int insert(InformationManage record);

    int insertSelective(InformationManage record);

    InformationManage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InformationManage record);

    int updateByPrimaryKey(InformationManage record);

    List<InformationManage> forSelect(Long a, Long b);

    List<InformationManage> select(Long a, Long b, String inforTitle, Integer inforStatus, String founder, Long sendBeginTime, Long sendEndTime);
    //映射子查询获取读取和未读取的信息
    List<Object> selectInforByRead(Long userId, Long b);
    //映射先去messageRelation表查询出已经读取id 用数组再去infor表读取的信息
    List<Object> selectInforByReadList(List<Long> inforId, Long b);

    List<Object> selectContent(Long id);
    Long selectCount();
    Long selectCountWithCondition(String inforTitle, Integer inforStatus, String founder, Long sendBeginTime, Long sendEndTime);
    List<InformationManage> selectAll();
}