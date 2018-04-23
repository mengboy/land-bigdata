package com.bigdata.web.controller.datadownload;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bigdata.common.utils.PageUtils;
import com.bigdata.common.utils.Query;
import com.bigdata.web.domain.DataDownload;
import com.bigdata.web.service.DataDownloadService;

@Controller
@RequestMapping("/bigdata/dataDown")
public class WebDataDownload {

    @Autowired
    DataDownloadService dataDownloadService;

    @GetMapping("/datas")
    @ResponseBody
    Object getDatas(@RequestParam Map<String, Object> params){
        // 查询列表数据
        Query query = new Query(params);

        List<DataDownload> bContentList = dataDownloadService.getDataDownloads(query);
        int total = dataDownloadService.count(query);

        PageUtils pageUtils = new PageUtils(bContentList, total);

        return pageUtils;
    }

}
