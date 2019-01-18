package com.zz.zbcf.service;


import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class TaskService {

    @Async
    public void num(String task) {
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 100000; j++) {

            }
        }
        System.out.println("111");
    }
}
