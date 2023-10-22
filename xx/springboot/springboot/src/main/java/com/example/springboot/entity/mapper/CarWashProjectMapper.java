package com.example.springboot.entity.mapper;
import java.util.*;
import com.example.springboot.entity.CarWashProject;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CarWashProjectMapper {

    @Select("select * from t_washproject")
    List<CarWashProject> findAll();
    @Insert("INSERT INTO t_washproject(wp_name,cw_image,price,wp_description) VALUES" +
            "(#{wp_name},#{cw_image},#{price},#{wp_description)")
    int insert(CarWashProject t_washproject);
    @Update("update t_washproject set wp_name=#{wp_name},cw_image=#{cw_image},price=#{price}," +
            "wp_description=#{wp_description} where wp_id=#{wp_id}")
    int update(CarWashProject t_washproject);
    @Delete("delete from t_washproject where wp_name=#{wp_name},cw_image=#{cw_image},price=#{price}"+
            "wp_description=#{wp_description}")
    int delete(CarWashProject t_washproject);

    @Select("select * from t_washproject limit #{pageNum},#{pageSize}")
    List<CarWashProject>selectPage(Integer pageNum,Integer pageSize);
    @Select("select count(*) from t_washproject")
    Integer selectTotal();
}
