package com.example.springboot.controller;
import com.example.springboot.entity.mapper.CarWashProjectMapper;
import com.example.springboot.entity.CarWashProject;
import com.example.springboot.service.CarWashProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/t_washproject")
public class CarWashProjectcontroller {
    @Autowired
    private CarWashProjectMapper washProjectMapper;
    @Autowired
    private CarWashProjectService carWashProjectService;
    @PostMapping
    public Integer save(@RequestBody CarWashProject t_washproject)
    {
        //新增更新
        return carWashProjectService.save(t_washproject);
    }
    @GetMapping
    public List<CarWashProject> findAll(){//显示所有
        List<CarWashProject>all=washProjectMapper.findAll();
                return all;
    }
    @PostMapping
    public Integer delete(@RequestBody CarWashProject t_washproject)
    {
        return carWashProjectService.delete(t_washproject);
    }
    @GetMapping("/page")
    //接口路径/t_washproject/page
    //RequestParam 接收
    //limit 第一个参数=(pageNum -1)*pageSize
    public Map<String,Object> findPage(@RequestParam Integer pageNum,@RequestParam Integer pageSize){
        pageNum=(pageNum-1)*pageSize;
        List<CarWashProject> data=washProjectMapper.selectPage(pageNum,pageSize);
        Integer total = washProjectMapper.selectTotal();//查询总条数
        Map<String,Object> res = new HashMap<>();
        System.out.println(data.toString());
        res.put("data",data);
        res.put("total",total);
        return res;
    }

}
