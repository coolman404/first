package controller;
import entity.Evaluation;
import entity.mapper.EvaluationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.EvaluationService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/t_evaluation")
public class Evaluationcontroller {
    @Autowired
    private EvaluationMapper evaluationMapper;
    @Autowired
    private EvaluationService evaluationService;
    @PostMapping
    public Integer save(@RequestBody Evaluation t_evaluation)
    {
        //新增更新
        return EvaluationService.save(t_evaluation);
    }
    @GetMapping
    public List<Evaluation> findAll(){//显示所有
        List<Evaluation>all=evaluationMapper.findAll();
        return all;
    }
    @PostMapping
    public Integer delete(@RequestBody Evaluation t_evaluation)
    {
        return evaluationService.delete(t_evaluation);
    }
    @GetMapping("/page")
    //接口路径/t_evaluation/page
    //RequestParam 接收
    //limit 第一个参数=(pageNum -1)*pageSize
    public Map<String,Object> findPage(@RequestParam Integer pageNum,@RequestParam Integer pageSize){
        pageNum=(pageNum-1)*pageSize;
        List<Evaluation> data=evaluationMapper.selectPage(pageNum,pageSize);
        Integer total = evaluationMapper.selectTotal();//查询总条数
        Map<String,Object> res = new HashMap<>();
        System.out.println(data.toString());
        res.put("data",data);
        res.put("total",total);
        return res;
    }

}
