package com.wangxingxing.observe_architect1;

/**
 * author : 王星星
 * date : 2020/10/23 21:18
 * email : 1099420259@qq.com
 * description :
 */
public class NewsPaper extends Subject {

    private String content;

    public void setContent(String content) {
        this.content = content;
        //通知所有的读者
        notifyObservers();
    }

    @Override
    String getContent() {
        return content;
    }
}
