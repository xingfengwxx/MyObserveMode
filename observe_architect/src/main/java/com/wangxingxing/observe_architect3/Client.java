package com.wangxingxing.observe_architect3;

/**
 * author : 王星星
 * date : 2020/10/23 21:48
 * email : 1099420259@qq.com
 * description :
 */
public class Client {

    public static void main(String[] args) {

        //目标
        AirSubject subject = new AirSubject();

        //观察者
        WeatherObserver observer1 = new WeatherObserver();
        observer1.setJob("监测人员");

        WeatherObserver observer2 = new WeatherObserver();
        observer2.setJob("预警人员");

        WeatherObserver observer3 = new WeatherObserver();
        observer3.setJob("监测部门领导");

        //订阅
        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        subject.setPolluteLevel(0);
        subject.setPolluteLevel(1);
        subject.setPolluteLevel(2);
    }
}
