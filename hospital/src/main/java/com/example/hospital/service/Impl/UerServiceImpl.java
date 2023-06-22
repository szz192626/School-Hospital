package com.example.hospital.service.Impl;

import com.example.hospital.entity.DataGridView;
import com.example.hospital.entity.Role;
import com.example.hospital.entity.User;
import com.example.hospital.mapper.UserMapper;
import com.example.hospital.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UerServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> selectAllUser(User user) {
        return userMapper.selectAllUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public List<Role> initUserRole(Role role) {
        return userMapper.initUserRole(role);
    }
    //添加用户
    @Override
    public int addUser(User user) {

        return userMapper.addUser(user);
    }
    //删除用户
    @Override
    public void deleteUser(Integer userid) {
        //根据id删除用户
        userMapper.deleteUserById(userid);
        //根据id删除该用户所拥有的角色   中间表
        userMapper.deleteRoleUser(userid);

    }

    @Override
    public int resetUserPwd(User user) {
        return userMapper.resetUserPwd(user);
    }

    @Override
    public DataGridView queryUserRole(Integer userid) {
        //按照用户id查询角色
        Integer uid=userid;
        //先查询所有角色
        List<Role> allRole = userMapper.queryAllRole();
        //按照用户id查询角色
        List<Role> userRole = userMapper.queryRoleById(uid);
        //如果allRole角色的id与userRole角色的id相等那么可以查询该用户已有的角色 复选框为true
        List<Map<String,Object>> data=new ArrayList<>();
        for (Role r1 : allRole) {
            Boolean LAY_CHECKED = false;
            for (Role r2 : userRole) {
                if (r1.getRoleid() == r2.getRoleid()) {
                    LAY_CHECKED = true;
                }
            }
            Map<String, Object> map = new HashMap<String, Object>();

            map.put("roleid", r1.getRoleid());
            map.put("rolename", r1.getRolename());
            map.put("roledesc", r1.getRoledesc());
            map.put("LAY_CHECKED", LAY_CHECKED);
            data.add(map);
        }
        return new DataGridView(data);
    }

    @Override
    public List<User> updateLogin(User user) {
        return userMapper.updateLogin(user);
    }

    @Override
    public int editLogin(User user) {
        return userMapper.editLogin(user);
    }

    @Override
    public int editPwd(User user) {
        return userMapper.editPwd(user);
    }

    @Override
    public int checkUser(User user) {
        return userMapper.checkUser(user);
    }
}