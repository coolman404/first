package service;
import entity.Evaluation;
import entity.mapper.EvaluationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EvaluationService {
    @Autowired
    public static EvaluationMapper evaluationMapper;
    public static int save(Evaluation t_evaluation)
    {
        if(t_evaluation.getA_id()==null)
        {
            return evaluationMapper.insert(t_evaluation);
        }else {
            return evaluationMapper.update(t_evaluation);
        }
    }
    public int delete(Evaluation t_evaluation)
    {
        return evaluationMapper.delete(t_evaluation);//删除
    }
}
