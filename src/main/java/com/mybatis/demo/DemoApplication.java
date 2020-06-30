package com.mybatis.demo;

import com.mybatis.demo.entity.Pet;
import com.mybatis.demo.mapper.PetMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * @author fattyca1
 */
public class DemoApplication {

	public static void main(String[] args)throws Exception {
		String confLocation = "mybatis-conf.xml";

		Reader reader = Resources.getResourceAsReader(confLocation);

		// 1. 通过配置文件构建 SqlSessionFactory
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);

		// 2. openSession
		SqlSession sqlSession = sessionFactory.openSession();

		// 3. 给Mapper接口生成对应的的代理类。
		PetMapper petMapper = sqlSession.getMapper(PetMapper.class);

		// 4. 调用方法
		Pet pet = petMapper.selectByName("zhangsan");

		System.out.println(pet);
	}

}
