package com.wangxingxing.observe_architect2;

import java.util.Observable;
import java.util.Observer;

/**
 * author : 王星星
 * date : 2020/10/23 21:29
 * email : 1099420259@qq.com
 * description : 读者，具体的观察者
 */
public class Reader implements Observer {

    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object state) {
        //System.out.println(this.name+"收到了报纸，打开看看，内容是："+((NewsPaper)o).getContent());

        System.out.println(name + "收到了报纸，打开看看，内容是：" + state);
    }
}
