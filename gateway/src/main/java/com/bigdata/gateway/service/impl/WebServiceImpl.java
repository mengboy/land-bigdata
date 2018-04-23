package com.bigdata.gateway.service.impl;
import com.bigdata.gateway.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class WebServiceImpl implements WebService{
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Override public String getWebService() {
        List<String> serviceNameList = discoveryClient.getServices();

        Iterator<String> stringIterator = serviceNameList.iterator();
        while (stringIterator.hasNext()){
            String serviceName = stringIterator.next();
            if ("gateway-service".equals(serviceName)){
                stringIterator.remove();
                break;
            }
        }

        if(serviceNameList.size() > 0){
            Random random = new Random();
            return serviceNameList.get(random.nextInt(serviceNameList.size()));
        }else {
            return null;
        }
    }

    @Override public Object getRequestWebService(String url) {
        return restTemplate.getForEntity(url, Object.class);
    }
}
