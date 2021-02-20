package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 这个 ImportResorce已经不推荐采用这种注入方式
 */
//要用这个bean.xml文件必须使用ImportResource这个注解来注入，然后MyAppConfig那个配置类就可以不用了
//@ImportResource(locations = {"classpath:springdemo1.beans.xml"})
@SpringBootApplication
public class PropertiesBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertiesBootApplication.class, args);
	}

}
