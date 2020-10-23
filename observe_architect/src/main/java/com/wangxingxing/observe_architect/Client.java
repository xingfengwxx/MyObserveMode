package com.wangxingxing.observe_architect;

/**
 * author : 王星星
 * date : 2020/10/23 20:54
 * email : 1099420259@qq.com
 * description :
 */
public class Client {
    public static void main(String[] args) {
        //目标
        ConcreteSubject subject = new ConcreteSubject();

        //订阅者
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        //注册
        subject.attach(observer1);
        subject.attach(observer2);

        subject.setSubjectState("恢复单身啦");

        System.out.println("-----------------------");

        //取消订阅
        subject.detach(observer1);

        subject.setSubjectState("空窗期...");
    }
}
