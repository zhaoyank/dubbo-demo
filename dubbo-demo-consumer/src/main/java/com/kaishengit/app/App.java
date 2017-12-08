package com.kaishengit.app;

import com.kaishengit.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author zhao
 */
public class App {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dubbo-consumer.xml");
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入:");

        String text = scanner.next();
        demoService.sayHello(text);

        System.in.read();
    }

}
