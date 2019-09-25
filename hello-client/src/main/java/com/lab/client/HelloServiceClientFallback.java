package com.lab.client;

import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author chenrong
 * @Date 2019-09-24 17:52
 **/
// @Component
public class HelloServiceClientFallback implements HelloServerClient {

    @Override
    public String helloServer() {
        return null;
    }
}
