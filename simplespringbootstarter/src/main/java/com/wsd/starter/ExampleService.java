package com.wsd.starter;

/**
 * @description:  1.编写service类
 * @author: wangshoudao
 * @create: 2021/1/20 9:51
 */
public class ExampleService {
    private String prefix;
    private String suffix;

    public ExampleService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }
    public String wrap(String word) {
        return prefix + word + suffix;
    }
}
