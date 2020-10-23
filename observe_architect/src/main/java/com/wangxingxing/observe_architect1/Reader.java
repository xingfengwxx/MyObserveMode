package com.wangxingxing.observe_architect1;

/**
 * author : 王星星
 * date : 2020/10/23 21:16
 * email : 1099420259@qq.com
 * description :
 */
public class Reader implements Observer {

    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(name + "收到了报纸，打开看看，内容是：" + subject.getContent());
    }
}
