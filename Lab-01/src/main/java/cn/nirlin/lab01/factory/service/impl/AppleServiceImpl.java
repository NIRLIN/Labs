package cn.nirlin.lab01.factory.service.impl;

import cn.nirlin.lab01.factory.service.FruitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author nielin
 * @date 2022/5/13
 */

@Slf4j
@Service
public class AppleServiceImpl implements FruitService {

    @Override
    public void eatFruit() {
        log.info("削皮或不削皮-->吃");
    }
}
