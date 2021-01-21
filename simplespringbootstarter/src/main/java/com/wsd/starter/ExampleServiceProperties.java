package com.wsd.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description:  2.编写属性类
 * @author: wangshoudao
 * @create: 2021/1/20 9:52
 */
@ConfigurationProperties("example.service")
public class ExampleServiceProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
