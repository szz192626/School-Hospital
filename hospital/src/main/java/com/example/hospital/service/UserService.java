package com.example.hospital.service;

import com.example.hospital.entity.DataGridView;
import com.example.hospital.entity.Role;
import com.example.hospital.entity.User;

import java.util.List;

public interface UserService {
    //查询所有用户
    List<User> selectAllUser(User user);
    //修改用户
    int updateUser(User user);
    //初始化用户角色
    List<Role> initUserRole(Role role);
    //添加用户
    int addUser(User user);
    //删除用户
    void deleteUser(Integer userid);
    //重置密码
    int resetUserPwd(User user);
    //查询所有用户角色
    DataGridView queryUserRole(Integer userid);
    //修改个人资料
    List<User> updateLogin(User user);
    int editLogin(User user);
    //修改密码
    int editPwd(User user);
    //检查唯一
    int checkUser(User user);
}