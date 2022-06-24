package com.shopcar.shopcar.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTest {

	@Setter(onMethod_ = {@Autowired})
	private DataSource ds;

	@Setter(onMethod_ = {@Autowired})
	private SqlSessionFactory ssf;
	
	private Logger logger = Logger.getLogger(DataSource.class);
	
	@Test
	public void testMybatis() {
		try (SqlSession session = ssf.openSession(); Connection con = ds.getConnection()) {
			logger.info(con);
			logger.info(session);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
