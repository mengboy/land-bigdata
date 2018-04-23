package com.bigdata.web.controller.news;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.bigdata.common.utils.PageUtils;
import com.bigdata.common.utils.Query;
import com.bigdata.common.utils.R;
import com.bigdata.web.domain.BContentDO;
import com.bigdata.web.domain.NewsType;
import com.bigdata.web.service.BContentService;
import com.bigdata.web.service.NewsService;

@Controller
@RequestMapping("/bigdata/news")
public class NewsCenterController {
    @Autowired
    NewsService newsService;
    @Autowired
    BContentService bContentService;

    /**
     * 获取消息分类
     * @return
     */
    @GetMapping("/types")
    @ResponseBody
    public Object getNewsTypes(){
        List<NewsType> newsTypes = null;
        try{
            newsTypes = newsService.getTypes();
        }catch (Exception e){
            return R.error();
        }
        Map<String, Object> map = new HashMap<>();
        map.put("types", newsTypes);
        return R.ok(map);
    }

    /**
     * 获取首页轮播消息默认6个
     * @return
     */
    @GetMapping("/carousel")
    @ResponseBody
    public Object getCarouselNews(){
        return R.ok();
    }


    /**
     *
     * @param typeId 分类ID
     * @param state 是否包含标题图片（0首页轮播，1非轮播、标题图片非空，2非轮播、标题图片可以为空）
     * @param num 获取数量
     * @return
     */
    @GetMapping("/news/{type}/{state}/{num}")
    @ResponseBody
    public Object getNews(@PathVariable("type") Integer typeId, @PathVariable("state") Integer state,
                          @PathVariable("num") Integer num){

        Map<String, Object> map = new HashMap<>();
        map.put("type", typeId == 0 ? null : typeId);
        map.put("state", state);
        map.put("num", num);

        List<BContentDO> bContentDOS = null;

        try{
            bContentDOS = bContentService.news(map);
        }catch (Exception e){
            e.printStackTrace();
            return R.error();
        }

        Map<String, Object> results = new HashMap<>();
        results.put("results", bContentDOS);
        return R.ok(results);
    }

    /**
     * 分页获取新闻
     * @return
     */
    @RequestMapping("/pages")
    @ResponseBody
    public Object getNewsPages(@RequestParam Map<String, Object> params) {
        // 查询列表数据
        Query query = new Query(params);

        List<BContentDO> bContentList = bContentService.list(query);
        int total = bContentService.count(query);

        PageUtils pageUtils = new PageUtils(bContentList, total);

        return pageUtils;
    }

    /**
     * 根据Id获取单个新闻具体内容
     * @param cid
     * @return
     */
    @GetMapping("/{cid}")
    @ResponseBody
    public Object getNewsById(@PathVariable("cid") Integer cid){
        BContentDO bContentDO = null;
        try{
            bContentDO = bContentService.get((long) cid);
        }catch (Exception e){
            return R.error();
        }
        Map<String, Object> map = new HashMap<>();
        map.put("news", bContentDO);
        return R.ok(map);
    }
}
