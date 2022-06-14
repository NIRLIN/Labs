package cn.nirlin.servicetest;

import cn.nirlin.service.ServiceInterface;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author nielin
 * @date 2022/6/14
 */

public class ServiceTest {

    public static void main(String[] args) {
        ServiceLoader<ServiceInterface> loader = ServiceLoader.load(ServiceInterface.class);

        Iterator<ServiceInterface> iterator = loader.iterator();

        for (ServiceInterface serviceInterface : loader) {
            serviceInterface.testServiceInterface();
        }

    }

}
