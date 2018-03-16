package com.zmy.wechatsell.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 原始开发
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    @GetMapping(value = "/auth")
    public void auth(@RequestParam("code") String code) {
        log.info("进入auth方法");
        log.info("codeL{}",code);

        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxf82672541effbe0e&secret=de59f601c4b564fbf7f90dc7f76d6664&code="+code+"&grant_type=authorization_code";

    }
}
