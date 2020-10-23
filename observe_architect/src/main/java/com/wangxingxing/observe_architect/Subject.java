package com.wangxingxing.observe_architect;

import java.util.ArrayList;
import java.util.List;

/**
 * author : 王星星
 * date : 2020/10/23 19:42
 * email : 1099420259@qq.com
 * description : 目标
 */
public class Subject {

    /**
     * 观察者（订阅者）列表
     */
    private List<Observer> mObservers = new ArrayList<>();

    /**
     * 注册观察者
     * @param observer
     */
    public void attach(Observer observer) {
        mObservers.add(observer);
    }

    /**
     * 取消注册
     * @param observer
     */
    public void detach(Observer observer) {
        mObservers.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     */
    protected void notifyObservers() {
        for (Observer observer : mObservers) {
            observer.update(this);
        }
    }

}
