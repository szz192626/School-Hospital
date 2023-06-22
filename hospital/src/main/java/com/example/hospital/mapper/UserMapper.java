package com.example.hospital.mapper;


import com.example.hospital.entity.Role;
import com.example.hospital.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selectAllUser(User user);
    int updateUser(User user);
    //查询
    List<Role> initUserRole(Role role);
    //添加用户
    int addUser(User user);
    int deleteUserById(Integer userid);
    int deleteRoleUser(Integer userid);
    //重置密码
    int resetUserPwd(User user);
    //查询所有角色
    List<Role> queryAllRole();
    //按照用户id查询角色
    List<Role> queryRoleById(Integer uid);
    //保存用户和角色
    void insertUserRole(@Param("uid")Integer userid, @Param("rid")Integer rid);


    List<User> updateLogin(User user);
    int editLogin(User user);
    int editPwd(User user);
    //检查唯一
    int checkUser(User user);
}
