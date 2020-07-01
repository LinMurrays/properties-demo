package demo.demo;

import demo.demo.javaBean.Person;
import demo.demo.javaBean.Person2;
import demo.demo.javaBean.Person3;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class demoApplicationTests {
	@Autowired
     Person person;
	@Autowired
     Person2 person2;
	@Autowired
     Person3 person3;

	@Autowired
	ApplicationContext ioc;

	/**
	 * 这个方法是手动注入上下文加载来测试手动注入配置文件，bean
	 */


	@Test
	public void testHelloService(){
		boolean b = ioc.containsBean("helloService");
		System.out.println(b);
	}


	@Test
	void contextLoads() {
		System.out.println(person.toString());

		System.out.println(person2.toString());

		System.out.println(person3.toString());
	}



}
