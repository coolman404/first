package com.example.springboot.service;

import com.example.springboot.entity.CarWashProject;
import com.example.springboot.entity.mapper.CarWashProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CarWashProjectService {
    @Autowired
    public CarWashProjectMapper carwashprojectMapper;
    public  int save(CarWashProject t_washProject)
    {
        if(t_washProject.getWp_id()==null)
        {
            return carwashprojectMapper.insert(t_washProject);
        }else {
           return carwashprojectMapper.update(t_washProject);
        }
    }
    public int delete(CarWashProject t_washProject)
    {
        return carwashprojectMapper.delete(t_washProject);//删除
    }
}
