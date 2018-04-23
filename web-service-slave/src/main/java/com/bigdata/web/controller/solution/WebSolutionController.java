package com.bigdata.web.controller.solution;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bigdata.common.utils.R;
import com.bigdata.web.domain.Solution;
import com.bigdata.web.domain.SolutionType;
import com.bigdata.web.service.SolutionService;
import com.bigdata.web.service.SolutionTypeService;

@Controller
@RequestMapping("/bigdata/solution")
public class WebSolutionController {

    @Autowired
    SolutionTypeService solutionTypeService;

    @Autowired
    SolutionService solutionService;

    @GetMapping("/solutions")
    @ResponseBody
    Object solutions(){
        List<Solution> solutions = null;

        try{
            solutions = solutionService.solutions(new HashMap<>());
        }catch (Exception e){
            e.printStackTrace();
            return R.error();
        }

        Map<String, Object> map = new HashMap<>();
        map.put("results", solutions);

        return R.ok(map);
    }

    @GetMapping("/{sid}")
    @ResponseBody
    public Object getNewsById(@PathVariable("sid") Integer sid){
        Solution solution = null;
        try{
            solution = solutionService.getSolutionById(sid);
        }catch (Exception e){
            return R.error();
        }
        Map<String, Object> map = new HashMap<>();
        map.put("solution", solution);
        return R.ok(map);
    }


    @GetMapping("/solutionTypes")
    @ResponseBody
    public Object getSolutionTypes(){
        List<SolutionType> solutionTypes = null;
        try{
            solutionTypes = solutionTypeService.list();
        }catch (Exception e){
            e.printStackTrace();
            return R.error();
        }

        Map<String, Object> map = new HashMap<>();
        map.put("results", solutionTypes);
        return R.ok(map);
    }

}
