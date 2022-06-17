package cn.nirlin.lab03serialize.controller;

import cn.nirlin.lab03serialize.model.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nielin
 * @date 2022/6/16
 */

@RestController
public class TestController {

    @RequestMapping(value = "test")
    public Object test() {
        return new Test();
    }

}
