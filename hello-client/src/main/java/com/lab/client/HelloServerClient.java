package com.lab.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description TODO
 * @Author chenrong
 * @Date 2019-09-24 17:50
 **/
@FeignClient(value = "hello-server")
public interface HelloServerClient {

    @GetMapping(value = "/rest/hello/server")
    String helloServer();
}
