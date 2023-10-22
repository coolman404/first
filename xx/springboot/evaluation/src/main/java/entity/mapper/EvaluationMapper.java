package entity.mapper;

import java.util.*;

import entity.Evaluation;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EvaluationMapper {

    @Select("select * from t_evaluation")
    List<Evaluation> findAll();
    @Insert("INSERT INTO t_evaluation(a_id,rating,content,createtime) VALUES" +
            "(#{a_id},#{rating},#{content},#{createtime)")
    int insert(Evaluation t_evaluation);
    @Update("update t_evaluation set a_id=#{a_id},rating=#{rating},content=#{content}," +
            "createtime=#{createtime} where e_id=#{e_id}")
    int update(Evaluation t_evaluation);
    @Delete("delete from t_evaluation where a_id=#{a_id},rating=#{rating},content=#{content}"+
            "createtime=#{createtime}")
    int delete(Evaluation t_evaluation);
    @Select("select * from t_evaluation limit #{pageNum},#{pageSize}")
    List<Evaluation>selectPage(Integer pageNum,Integer pageSize);
    @Select("select count(*) from t_evaluation")
    Integer selectTotal();
}
