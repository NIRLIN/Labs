package cn.nirlin.lab01.factory;

import cn.nirlin.lab01.factory.service.FruitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nielin
 * @date 2022/5/13
 */

@Slf4j
@Component
public class FruitFactory {

    public FruitFactory(Map<String, FruitService> map, LinkedHashMap<String, FruitService> linkedHashMap, List<FruitService> list, ArrayList<FruitService> arrayList) {
        log.info("FruitFactory");
    }

}

