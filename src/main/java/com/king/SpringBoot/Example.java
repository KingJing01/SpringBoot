package com.king.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * SpringBoot  Demo 
 * @ClassName: Example 
 * @Description:  
 * @author king
 * @date 2018/3/23 10:40:06
 */
//@RestController = @Controller + @ResponseBody  
@RestController
@EnableAutoConfiguration
public class Example {
	
	@RequestMapping(value="/")
	String example() {
		return "Hello world ！";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Example.class, args);
	}
  /**
   * 启动 SpringBoot
   * 1. run as ---> java application
   * 
   * 2. maven 打成jar包   cmd  运行  java -jar xxxx.jar
   * 
   * 3. 项目根目录   mvn spring-boot:run
   */
}
