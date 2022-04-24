package com.cl.dao;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author caolin
 * Date  2022/4/22
 */
public class MybatisTest {
//    @Test
//    public  void test1() throws IOException {
//        InputStream resourceAsStream = Resources.getResourceAsStream("mybatisconfig.xml");
//
//        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsStream);
//
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        User xw = new User(1, "xw", 26);
//
//        sqlSession.insert("com.cl.userMapper.insertUser",xw);
//        sqlSession.commit();
//        sqlSession.close();
//
//    }

@Test
    public void test1() throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("generator.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
