package com.example.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @notes
 * @autho zph
 * @createTime 2018/6/30 14:52
 */
@RestController(value = "属性API")
@RequestMapping(value = "/v1/attr")
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String listAttr(){
        System.out.println("请求成功");
        return "请求成功!";
    }
}
