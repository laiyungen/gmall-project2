package com.atguigu.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.ums.entity.Admin;
import com.atguigu.gmall.ums.mapper.AdminMapper;
import com.atguigu.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author lyg
 * @since 2020-03-03
 */
@Service
@Component
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    /**
     * @API
     * @Author lyg
     * @Description 用户登录逻辑实现
     * @Date 2020/3/4 14:10
     * @Param [username, password]
     * @return com.atguigu.gmall.ums.entity.Admin
     **/
    @Override
    public Admin login(String username, String password) {
        // 使用 MD5 对密码进行加密
        String pwd = DigestUtils.md5DigestAsHex(password.getBytes());
        // 使用 mybatisplus 查询对应用户名密码的用户信息
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<Admin>().eq("username", username).eq("password", pwd);
        Admin admin = adminMapper.selectOne(queryWrapper);
        return admin;
    }

    /**
     * @API
     * @Author lyg
     * @Description 用户登录后获取用户的详情信息
     * @Date 2020/3/4 14:43
     * @Param [userName]
     * @return com.atguigu.gmall.ums.entity.Admin
     **/
    @Override
    public Admin getUserInfo(String userName) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<Admin>().eq("username", userName);
        return adminMapper.selectOne(queryWrapper);
    }

    @Override
    public Admin saveUserRegister() {
        return null;
    }


}
