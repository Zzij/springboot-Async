package com.zz.zbcf.controller;

import com.zz.zbcf.entity.PressKeyReq;
import com.zz.zbcf.entity.PressKeyResp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PressKeyController {
    @PostMapping("/pk")
    public PressKeyResp getPK(PressKeyReq req){
        PressKeyResp resp = new PressKeyResp();
        resp.setResult("success");
        resp.setMessage("");
        return resp;
    }
}
