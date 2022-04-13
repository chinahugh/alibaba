package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceFallback implements Service {

    @Value("${server.port}")
    private Integer port;
    /**
     * 熔断降级后执行方法
     * @param str
     * @return
     */
    @Override
    public String echo(String str) {
        return "Hello Nacos Discovery " + str+" server port : "+port;
    }
}
