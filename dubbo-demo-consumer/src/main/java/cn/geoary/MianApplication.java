package cn.geoary;

import cn.geoary.bean.User;
import cn.geoary.service.User4ConsumerService;
import cn.geoary.service.User4ProvideService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;
public class MianApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
        ioc.start();
        User4ProvideService user4ProvideService = (User4ProvideService) ioc.getBean("user4ProvideService");
        List<User> users = user4ProvideService.initUsers();
        System.out.println("获取到一批用户信息");
        for (User user: users) {
            System.out.println(user);
        }
        System.out.println("成功获取");
        User4ConsumerService user4ConsumerService = ioc.getBean(User4ConsumerService.class);
        User user = user4ConsumerService.getUserInfoById("1");
        System.out.println("用户编号为1的用户信息是：");
        System.out.println(user);
        System.in.read();
    }
}
