package com.longhang.stuService.impl;


import com.longhang.model.Student;
import com.longhang.stuDao.StuDao;
import com.longhang.stuService.StuService;
import com.longhang.util.Jedis;
import org.apache.log4j.Logger;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class StuServiceImpl implements StuService {
   private static Logger logger=Logger.getLogger("StuServiceImpl.class");
    @Resource
    private StuDao stuDao;
    @Resource
    private Jedis jedis;
    @Cacheable(value = "getStuById", condition = "#id!=null") //每次执行都会执行方法，无论缓存里是否有值，同时使用新的返回值的替换缓存中的值
    public Student getStuById(Long id) {
        //判断id缓存是否存在
        if(jedis.jedisPool().getResource().get(String.valueOf(id))==null){
           if (this.stuDao.select(id)==null)
           { jedis.jedisPool().getResource().setex(String.valueOf(id),5*60*60,"&&");
              logger.info("你好");
               return null;
           }else {
            logger.info("你好1");
               return this.stuDao.select(id);}
        } else
            logger.info("你好2");
            return null;
    }
    @CacheEvict(value = {"getStuById","getGetAll"},allEntries = true)
    public void getInsert(Student student) {
        //判断缓存中是否有对应id的击穿key值的缓存，如果有，删除
        if(jedis.jedisPool().getResource().get(String.valueOf(student.getId()))!=null)
            jedis.jedisPool().getResource().setex(String.valueOf(student.getId()),1,"&&");
        this.stuDao.insert(student);
    }

    @CacheEvict(value = {"getStuById","getGetAll"},allEntries = true)//删除缓存
    public boolean getUpdate(Student student) {
        return this.stuDao.update(student);
    }
    @CacheEvict(value = {"getStuById","getGetAll"},allEntries = true)
    public boolean getDelete(Long id) {
        return this.stuDao.delete(id);
    }
    @Cacheable("getGetAll") //标注该方法查询的结果进入缓存，再次访问时直接读取缓存中的数据
    public List<Student> getGetAll() {
        logger.info("你好");
        return this.stuDao.getAll();
    }
    public List<Student> getGetAllExcellent() {
        return this.stuDao.getAllExcellent();
    }
    public Student getStu(Student student) {
        return this.stuDao.selects(student);
    }
    public int getGetCount(){return this.stuDao.getCount();}
    public int getGetCountG(){return stuDao.getCountG();}
    public int getGetMajor(String major) {
        return this.stuDao.getMajor(major);
    }
    public String[] getGetPicture() {
        return this.stuDao.getPicture();
    }





}