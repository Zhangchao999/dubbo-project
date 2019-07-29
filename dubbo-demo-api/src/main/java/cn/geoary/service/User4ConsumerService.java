package cn.geoary.service;

import cn.geoary.bean.User;

public interface User4ConsumerService {

    /**
     * 功能描述:
     * 〈获取用户〉
     *
     * @return : java.util.List<cn.geoary.bean.User>
     * @author : zhangc
     * @date : 2019/7/28 14:35
     */
    User getUserInfoById(String id);
}
