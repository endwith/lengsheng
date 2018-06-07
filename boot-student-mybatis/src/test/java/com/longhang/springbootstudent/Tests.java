package com.longhang.springbootstudent;

import com.longhang.model.Student;
import com.longhang.stuService.StuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Tests {
    @Autowired
    private StuService stuService;
    @Test
    public void contextLoads() {

        //System.out.println(stuService.getGetAll());
        System.out.println(stuService.getStuById(35L));
    }

@Test
    public void ss(){
    Student student=new Student(35L,"阿li","3213","dsad","java",null,null,null,true,false,false,null,null);
        stuService.getInsert(student);
}
}
