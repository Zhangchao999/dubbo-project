package cn.geoary;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext(new String("provider.xml"));
        ioc.start();
        System.out.println("启动完成，按任意键退出");
        System.in.read();
    }
}
