package com.cl;

import com.cl.bean.User;
import com.cl.bean.UserExample;
import com.cl.dao.UserMapper;
import com.cl.utils.MysqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author caolin
 * Date  2022/4/23
 */
public class Test {
    UserMapper userMapper;
    SqlSession sqlSession;
    @Before
   public  void before(){
        SqlSessionFactory sqlSessionFactory = MysqlSessionFactory.getSqlSessionFactory();
         sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }
    @org.junit.Test
    public  void find(){
        UserExample userExample = new UserExample();
        userExample.setDistinct(true);
        List<User> users = userMapper.selectByExample(userExample);

        users.forEach(System.out::println);

    }

    @After
    public  void after(){
        sqlSession.commit();
        sqlSession.close();
    }


}
