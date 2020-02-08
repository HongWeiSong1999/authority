package com.hws.authority;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hws.authority.dao.UserDao;
import com.hws.authority.model.SysPermission;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorityApplicationTests {

    @Resource
    UserDao dao ;

    @Test
    public void testJson() {

    }

}
