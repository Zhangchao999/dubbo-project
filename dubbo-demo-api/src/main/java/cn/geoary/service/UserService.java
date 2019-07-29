package cn.geoary.service;

import cn.geoary.bean.User;

import java.util.List;

public interface UserService {
    /**
     * 功能描述:
     * 〈通过用户编号 获取用户信息〉
     *
     * @param id  用户编号
     * @return : java.util.List<cn.geoary.bean.User>
     * @author : zhangc
     * @date : 2019/7/28 14:06
     */
    List<User> getUserInfoById(String id);
}
