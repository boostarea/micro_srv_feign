package com.lab;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author chenrong
 * @Date 2019-09-24 16:45
 **/
@RestController
@RequestMapping("rest/hello/server")
public class HelloResource {

    @Value("${server.port}")
    private int port;

    @GetMapping
    public String exec() {
        return "Hello World! (server port " + port + "). ";
    }
}
