package com.hello.world.demo.constant;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author jing.ji
 * @date 2018/8/2
 */
@Component
@Data
@ConfigurationProperties(prefix = "myconfig")//前缀
@PropertySource(value = "classpath:myconfig.yml")
public class DemoProperties {

    @Value("${name}")
    private String name;

    @Value("${test}")
    private String test;

   @Value("${spring.datasource.url}")
    private  String url;

}
