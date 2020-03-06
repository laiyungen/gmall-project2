package com.atguigu.gmall.ums.service;

import com.atguigu.gmall.ums.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author lyg
 * @since 2020-03-03
 */
public interface AdminService extends IService<Admin> {

    // 用户登录逻辑
    Admin login(String username, String password);

    // 用户详情逻辑
    Admin getUserInfo(String userName);

    // 用户注册逻辑
    Admin saveUserRegister();
}
