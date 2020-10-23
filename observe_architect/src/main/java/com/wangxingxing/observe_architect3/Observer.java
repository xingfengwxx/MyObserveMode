package com.wangxingxing.observe_architect3;

/**
 * author : 王星星
 * date : 2020/10/23 21:35
 * email : 1099420259@qq.com
 * description : 观察者
 */
public interface Observer {
    void setJob(String job);

    String getJob();

    /**
     * 更新（当目标对象的状态发生改变时，这个方法会被调用）
     * @param subject 目标对象，方便获取相应的目标对象的状态
     */
    void update(Subject subject);
}
