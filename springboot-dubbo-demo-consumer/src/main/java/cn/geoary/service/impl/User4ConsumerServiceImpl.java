package cn.geoary.service.impl;

import cn.geoary.bean.User;
import cn.geoary.service.User4ConsumerService;
import cn.geoary.service.User4ProvideService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User4ConsumerServiceImpl implements User4ConsumerService {

    @Reference
    User4ProvideService user4ProvideService;
    @Override
    public User getUserInfoById(String id) {
        User returnUser = new User();
        List<User> users = user4ProvideService.initUsers();
        for (User user: users) {
            if(id.equals(user.getId())){
                returnUser = user;
            }
        }
        return returnUser;
    }

}
