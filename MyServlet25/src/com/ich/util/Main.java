package com.ich.util;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.TransactionIsolationLevel;

import com.ich.dao.UserDAOImpl;
import com.ich.entity.Person;
import com.ich.entity.User;

/**
 * @author Ich
 * @summary None
 * @createTime 2020年10月25日下午3:26:00
 * @version 1.0.0
 * @ProjectURL https://github.com/ich-official/MyJ2EEDemoGit
 * @Contact_Me ich_official@163.com
 * @update None
 */
public class Main {
	public static void main(String[] args) throws SQLException, IOException {
		//Connection conn=DBUtil.getConnection();
		//System.out.print(conn);
		//conn.close();
		int sum=0;
		for(int i=1;i<=365;i++) {
			//66795
			sum+=i;
		}
		System.out.println();
		
		//TestMyBatis();
	}
	
	
	
	public static void TestMyBatis() throws IOException {
		Reader reader= Resources.getResourceAsReader("com/ich/xml/conf.xml");	//找到mybatis配置文件
		SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(reader);	//创建一个sqlSessionFactory
		SqlSession session= sqlSessionFactory.openSession();	//打开数据库连接，获取SqlSession（=JDBC的connection）
		//----开始操作数据库----
		String statement="com.ich.xml.personMapper.queryPersonById";	//personMapper中namespace+id的组合
		Person p=session.selectOne(statement,2);	//根据配置文件，Object可以被转成Person（xml里设定的）
		System.out.println("name:"+p.getName());
		session.close();	//关闭连接
		
		
		
		
		
		
		
	}
}
