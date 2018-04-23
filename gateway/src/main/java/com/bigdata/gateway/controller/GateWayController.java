package com.bigdata.gateway.controller;

import com.bigdata.gateway.common.R;
import com.bigdata.gateway.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class GateWayController {

    @Autowired
    private WebService webService;

    @RequestMapping("/api")
    @ResponseBody
    public Object getServiceRes(@RequestParam("params") String request){
        System.out.println(request);
        String serviceName = webService.getWebService();
        if (serviceName == null){
            return R.error("服务未启动");
        }
        StringBuilder url = new StringBuilder("http://").append(serviceName).append(request);
        return webService.getRequestWebService(url.toString());
    }
}
