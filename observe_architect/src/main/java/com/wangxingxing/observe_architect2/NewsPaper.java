package com.wangxingxing.observe_architect2;


/**
 * author : 王星星
 * date : 2020/10/23 21:25
 * email : 1099420259@qq.com
 * description : 报纸，具体的目标（使用Java API实现观察者模式）
 */
public class NewsPaper extends java.util.Observable {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //必须调用这个，不然不生效，详情见源码
        setChanged();
        //推模式
        notifyObservers(content);
    }
}
