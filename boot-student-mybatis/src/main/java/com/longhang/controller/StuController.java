package com.longhang.controller;

import com.longhang.model.Student;
import com.longhang.stuService.StuService;
import com.longhang.util.Jedis;
import com.longhang.util.OOSUtil;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
public class StuController {
    org.slf4j.Logger logger = LoggerFactory.getLogger(StuController.class);

    @Resource
    private StuService stu;
    @Autowired
    private Jedis jedis;
    @Resource
    private OOSUtil oosUtil;


    @RequestMapping("/myTest")
    public String myTest(){
        return "test";
    }
    @RequestMapping("/totest")
    public String to(MultipartFile upPicture) throws IOException {
        InputStream inputStream = upPicture.getInputStream();
        return "上传成功";
    }

    /**
     *
     * 数据迁移工具
     *
     * */
    @RequestMapping("/qianyi")
    public String qianyi(){
        return "qinayi";
    }




    /**
     * 跳转添加
     */
    @RequestMapping("/POST")
    public String toAddStu() {
        return "addStu";
    }
    /**
     * 跳转
     */
    @RequestMapping("/GET")
    public String toQueryStu() {
        return "message";
    }
    /**
     * 新增学生
     */
    @RequestMapping(value = "/student",method = RequestMethod.POST)
    public String addStu(HttpServletRequest request, Student student, MultipartFile upPicture) throws IOException {
        // logger.info("图片路径:::"+upPicture);
        System.out.println( request.getParameter("name"));
        System.out.println("学生**************"+student);
        String fileName=null;
//        if(upPicture!=null) {
//            InputStream inputStream = upPicture.getInputStream();
//            //判断域名所属，对应存储那个云
//            if (oosUtil.getEndpoint().equals("oss-cn-shenzhen.aliyuncs.com")) {
//                fileName = oosUtil.uploadOSS(inputStream);
//            } else {
//                fileName = oosUtil.qiniu(inputStream);
//            }
//        }
        logger.info("add student : "+student.toString());
        if (student != null) {
            //把图片的名字作为picture字段储存
            student.setPicture(fileName);
            Long start=System.currentTimeMillis();
            logger.info(student.toString());
            //设置创建时间
            student.setCreate_at(start);
            System.out.println("学生:::"+student.toString());
            stu.getInsert(student);
            Long end=System.currentTimeMillis();
            logger.info("the db run time : "+(end-start));
        }
        return "redirect:/students";
    }

    /**
     * 获取学生
     *
     * @param id
     * @param
     * @param model
     * @return
     */
    @RequestMapping(value = "/json/student",method =RequestMethod.GET)
    public String getStu1(@RequestParam Long id, Student student, Model model) {
//        if (stu.getStuById(id)!=null){
        logger.info("query id : "+id);
        Long start=System.currentTimeMillis();
        Student student1=stu.getStu(student);
        Long end=System.currentTimeMillis();
        logger.info("the db run time : "+(end-start));
        model.addAttribute("student",student1);
        logger.info("student massage : "+student.toString());
        return "stuJson";
//        else
//            return "error";
    }
    @RequestMapping(value = "/student/{id}",method =RequestMethod.GET)
    public String getStu(@PathVariable Long id, Model model) {
        logger.info("query id : "+id);
        model.addAttribute("student", stu.getStuById(id));
        return "message";
    }
    /**
     * 根据id删除
     *
     * @param id
     * @param
     * @param
     */
    @RequestMapping(value = "/student/{id}",method = RequestMethod.DELETE)
    public String deleteStu(@PathVariable Long id, Model model) {
        logger.info("delete id : "+ id);
        Long start=System.currentTimeMillis();
        stu.getDelete(id);
        Long end=System.currentTimeMillis();
        logger.info("the db run time : "+(end-start));
        return "redirect:/students";
    }
    /**
     * 查询所有
     *
     * @param
     * @param
     * @return
     */
    @RequestMapping("students")
    public ModelAndView getAllStu()  {
            List<Student> students = stu.getGetAll();
        logger.info("我来了"+students.toString());
        ModelAndView modelAndView = new ModelAndView("/all");
        modelAndView.addObject("studentList", students);
        return modelAndView;
    }
    /**
     * 查询所有json
     *
     * @param
     * @param
     * @return
     */
    @RequestMapping("/json/students")
    @ResponseBody
    public List<Student> getAllStuOne()  {
        logger.info(stu.getGetAll().toString());
          return  stu.getGetAll();

    }



}
