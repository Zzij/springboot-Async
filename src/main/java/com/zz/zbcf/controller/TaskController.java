package com.zz.zbcf.controller;

import com.zz.zbcf.entity.TaskData;
import com.zz.zbcf.entity.TaskReq;
import com.zz.zbcf.entity.TaskResp;
import com.zz.zbcf.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class TaskController {

    public Logger logger = LoggerFactory.getLogger(TaskController.class);

    @Autowired
    private TaskService taskService;

    @PostMapping("/task")
    public TaskResp getTask(TaskReq req){
        TaskResp resp = new TaskResp();
        TaskData data = new TaskData();
        data.setAddress("上海");
        data.setTaskType("追尾");
        resp.setData(data.toString());
        resp.setResult("0");
        logger.info("111");
        return resp;
    }


    @PostMapping("/num")
    public String TaskNum(TaskReq req){
        taskService.num(req.getTaskId());
        return "200";
    }
}
