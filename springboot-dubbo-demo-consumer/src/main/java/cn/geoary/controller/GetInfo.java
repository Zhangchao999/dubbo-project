package cn.geoary.controller;

import cn.geoary.bean.User;
import cn.geoary.service.User4ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GetInfo {

    @Autowired
    User4ConsumerService user4ConsumerService;

    @ResponseBody
    @RequestMapping("/getUserInfo")
    public User getUserinfo(@RequestParam("userid") String id){
        return user4ConsumerService.getUserInfoById(id);
    }
}
