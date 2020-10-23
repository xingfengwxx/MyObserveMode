package com.wangxingxing.observe_architect3;

/**
 * author : 王星星
 * date : 2020/10/23 21:45
 * email : 1099420259@qq.com
 * description :
 */
public class WeatherObserver implements Observer {

    private String job;

    @Override
    public String getJob() {
        return job;
    }

    @Override
    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(job + "收到通知，当前污染级别为：" + subject.getPolluteLevel());
        if (job.equals("监测人员")) {
            System.out.println("老实做记录...");
        } else if (job.equals("预警人员")) {
            System.out.println("做预警...");
        } else if (job.equals("监测部门领导")) {
            System.out.println("包小三...");
        }
    }
}
