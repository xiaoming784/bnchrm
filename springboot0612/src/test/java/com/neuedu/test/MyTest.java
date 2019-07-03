/*
package com.neuedu.test;

import com.neuedu.App;
import com.neuedu.pojo.Dept;
import com.neuedu.pojo.Emp;
import com.neuedu.service.DeptService;
import com.neuedu.service.TableService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class MyTest {
    @Resource
    TableService tableService;

    @Test
    public void handler(){
        for(int i=1;i<=100;i++){
            Emp emp = new Emp();
            */
/*dept.setName("部门"+i);
            dept.setType(1);
            dept.setActive(1);
            dept.setCreateDate(new Date());
            dept.setDescription("部门描述");
            dept.setFax("1383838438");
            dept.setPhone("022-12345678");
            dept.setParentId(0);*//*

            emp.setName("员工"+i);
            emp.setSex(1);
            emp.setBirthday(new Date());
            emp.setIdCard("1301251885"+i);
            emp.setDept(1);
            emp.setJob(1);
            emp.setCreateData(new Date());
            emp.setJobDate(new Date());
            emp.setWorkType(1);
            emp.setSource(1);
            emp.setPolitic(1);
            emp.setFolk("汉");
            emp.setNativePlace("老牛沟");
            emp.setPhone("188234"+i);
            emp.setEmail(i+"@qq.com");
            emp.setHeight(156);
            emp.setBlood(1);
            emp.setMarriage(1);
            emp.setBirthPlace("西天");
            emp.setHouse("地狱");
            emp.setDegree(3);
            emp.setDiploma(2);
            emp.setSchool("西天女子学院");
            emp.setSpical("造飞机");
            emp.setGraduateDate(new Date());
            emp.setTrialBegin(new Date());
            emp.setTrialEnd(new Date());
            emp.setResults(0);
            tableService.add(emp);
        }
    }
}
*/
