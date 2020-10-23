package com.wangxingxing.observe_architect;

/**
 * author : 王星星
 * date : 2020/10/23 20:50
 * email : 1099420259@qq.com
 * description : 具体的目标
 */
public class ConcreteSubject extends Subject {

    /**
     * 目标对象的状态
     */
    private String subjectState;

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        //目标对象的状态发生改变，通知各个观察者
        notifyObservers();
    }

    public String getSubjectState() {
        return subjectState;
    }
}
