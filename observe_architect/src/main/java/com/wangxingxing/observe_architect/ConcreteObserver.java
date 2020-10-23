package com.wangxingxing.observe_architect;

/**
 * author : 王星星
 * date : 2020/10/23 20:52
 * email : 1099420259@qq.com
 * description : 具体的观察者
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println("目标对象的状态发生改变，" + ((ConcreteSubject)subject).getSubjectState());
    }
}
