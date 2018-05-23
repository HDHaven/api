package cn.sunrun.haven.api.repository;

import java.util.UUID;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.sunrun.haven.api.domain.Column;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-repository.xml" })
public class ColumnRepositoryTest {
//	private static final Logger log = LoggerFactory.getLogger(ColumnRepositoryTest.class);
	
	@Resource
	private ColumnRepository columnRepository;
	
	@Test
	public void testInsert() {
		Column column = new Column();
		column.setId(UUID.randomUUID().toString().replace("-", ""));
		column.setName("TestColumn");
		column.setDescription("测试数据库表字段");
		column.setEnable(Boolean.TRUE);
		columnRepository.insert(column);
		System.err.println(column);
	}
	
	@Test
	public void test() {
		System.err.println("WTF");
	}
	
}
