package cn.geoary.service.impl;

import cn.geoary.bean.User;
import cn.geoary.service.User4ProvideService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class User4ProvideServiceImpl implements User4ProvideService {

    @Override
    public List<User> initUsers() {
        List<User> users = new ArrayList<>();
        List<User> returnUser = new ArrayList<>();
        users.add(new User("1", "张三", "山西省太原市", 10, "暂无备注"));
        users.add(new User("2", "陈奕迅", "中国香港", 45, "香港著名男歌手及演员，曾担任第八至第十届香港演艺人协会副会长"));
        return users;
    }
}
