package com.example.hospital.controller;

import com.example.hospital.entity.Projecttype;
import com.example.hospital.service.ProjectTypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("projectType")
public class ProjectTypeController {
    @Autowired
    private ProjectTypeService projectTypeService;
    /*
     * 查询生产项目大类
     * */
    @RequestMapping("findAllProjecttype")
    @ResponseBody
    public Object ProjecttypeList(Projecttype projecttype, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Projecttype> listAll = projectTypeService.findAllProjecttype(projecttype);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    /*
     * 添加生产项目大类
     * */
    @RequestMapping("addProjecttype")
    @ResponseBody
    public Object addProjecttype(Projecttype projecttype){
        int i1 = projectTypeService.count1(projecttype);
        if(i1==0){
            int i = projectTypeService.addProjecttype(projecttype);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else{
            return projecttype.getProjectName()+"已存在";
        }

    }
    /*
     * 删除生产项目大类
     * */
    @RequestMapping("deleteProjecttype")
    @ResponseBody
    public Object deleteProjecttype(Integer projectId){
        int i = projectTypeService.deleteProjecttype(projectId);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
}
