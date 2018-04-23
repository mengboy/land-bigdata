package com.bigdata.web.controller.recruitment;

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
import com.bigdata.web.domain.JobType;
import com.bigdata.web.domain.Position;
import com.bigdata.web.service.JobTypeService;
import com.bigdata.web.service.PositionService;

@Controller
@RequestMapping("/bigdata/recruitment")
public class WebRecruitmentController {

    @Autowired
    JobTypeService jobTypeService;

    @Autowired
    PositionService positionService;

    @RequestMapping("/type")
    @ResponseBody
    Object getTypes(){
        List<JobType> jobTypes = null;
        try{
            jobTypes = jobTypeService.listJobType(new HashMap<>());
        }catch (Exception e){
            e.printStackTrace();
            return R.error();
        }

        Map<String, Object> map = new HashMap<>();
        map.put("result", jobTypes);
        return R.ok(map);
    }

    @GetMapping("/getWorkPlacesByTypeId/{typeId}")
    @ResponseBody
    Object getWorkPlacesByType(@PathVariable("typeId") Integer typeId){
        List<String> workPlaces = null;
        try{
            workPlaces = positionService.getWorkPlaces(typeId);
        }catch (Exception e){
            e.printStackTrace();
            return R.error();
        }
        Map<String, Object> map = new HashMap<>();
        map.put("results", workPlaces);
        return R.ok(map);
    }

    @GetMapping("/getPositionByPlaceAndTypeId/{workPlace}/{typeId}")
    @ResponseBody
    Object getPositionByPlaceAndTypeId(@PathVariable("workPlace") String workPlace, @PathVariable("typeId") Integer typeId){
        Map<String, Object> params = new HashMap<>();
        params.put("workPlace", workPlace);
        params.put("typeId", typeId);
        List<Position> positions = null;
        try{
            positions = positionService.getPositionByPlace(params);
        }catch (Exception e){
            e.printStackTrace();
            return R.error();
        }
        Map<String, Object> map = new HashMap<>();
        map.put("results", positions);

        return R.ok(map);
    }

    @GetMapping("/getPositionGroupByPlace/{typeId}")
    @ResponseBody
    Object getPositionByPlace(@PathVariable("typeId") Integer typeId){
        List<Position> positions = null;
        List<String> workPlaces = null;
        Map<String, Object> positionsOfworkPlace = new HashMap<>();
        try{
            workPlaces = positionService.getWorkPlaces(typeId);
            if(workPlaces != null){
                for(String workPlace : workPlaces){
                    Map<String, Object> params = new HashMap<>();
                    params.put("workPlace", workPlace);
                    params.put("typeId", typeId);
                    positions = positionService.getPositionByPlace(params);
                    positionsOfworkPlace.put(workPlace, positions);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error();
        }

        Map<String, Object> map = new HashMap<>();
        map.put("results", positionsOfworkPlace);
        return R.ok(map);
    }
}
