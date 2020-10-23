package com.wangxingxing.observe_architect3;

/**
 * author : 王星星
 * date : 2020/10/23 21:38
 * email : 1099420259@qq.com
 * description :
 */
public class AirSubject extends Subject {

    private int polluteLevel;

    @Override
    public void notifyObservers() {
        for (Observer observer : mObservers) {
            //正常情况下，监测人员做记录
            //轻度污染，监测人员做记录，通知预警人员
            //高度污染，监测人员做记录，通知预警人员，通知监测领导
            if (polluteLevel >= 0) {
                if ("监测人员".equals(observer.getJob())) {
                    observer.update(this);
                }
            }

            if (polluteLevel >= 1) {
                if ("预警人员".equals(observer.getJob())) {
                    observer.update(this);
                }
            }

            if (polluteLevel >= 2) {
                if ("监测部门领导".equals(observer.getJob())) {
                    observer.update(this);
                }
            }
        }
    }

    public void setPolluteLevel(int polluteLevel) {
        this.polluteLevel = polluteLevel;
        //污染级别发送改变，通知订阅者
        notifyObservers();
    }

    @Override
    public int getPolluteLevel() {
        return polluteLevel;
    }
}
