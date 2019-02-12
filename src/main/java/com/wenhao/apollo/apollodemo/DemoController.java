package com.wenhao.apollo.apollodemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${zhangshangconfig:default}")
    private String zhangshanconfig;

    @RequestMapping(" ")
    public String getZhangshanconfig() {
        return zhangshanconfig;
    }


}
