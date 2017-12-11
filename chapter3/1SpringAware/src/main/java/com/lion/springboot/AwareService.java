package com.lion.springboot;


import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by yinxin on 17-12-7.
 */

/*
    实现BeanNameAware、ResourceLoaderAware接口，获得Bean名称和资源加载的服务
    实现ResourceLoaderAware需重写setResourceLoader
    实现BeanNameAware需重写setBeanName
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult() {
        System.out.println("Bean的名称为：" + beanName);

        Resource resource = loader.getResource(
                "classpath:com/lion/springboot/test.txt");
        try {

            System.out.println("ResourceLoader加载的文件内容为: " +
                    IOUtils.toString(resource.getInputStream(), "utf-8"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}