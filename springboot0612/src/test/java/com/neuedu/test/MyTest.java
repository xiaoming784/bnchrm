package com.neuedu.test;

import com.neuedu.App;
import com.neuedu.pojo.Dept;
import com.neuedu.service.DeptService;
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
    DeptService deptService;

    @Test
    public void handler(){
        for(int i=1;i<=100;i++){
            Dept dept = new Dept();
            dept.setDeptName("部门"+i);
            dept.setType(1);
            dept.setActive(1);
            dept.setCreateDate(new Date());
            dept.setDescription("部门描述");
            dept.setFax("1383838438");
            dept.setPhone("022-12345678");
            dept.setParentId(0);
            deptService.add(dept);
        }
    }
}
