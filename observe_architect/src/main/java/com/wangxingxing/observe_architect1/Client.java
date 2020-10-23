package com.wangxingxing.observe_architect1;

/**
 * author : 王星星
 * date : 2020/10/23 21:20
 * email : 1099420259@qq.com
 * description :
 */
public class Client {

    public static void main(String[] args) {
        //目标对象（报纸）
        NewsPaper newsPaper = new NewsPaper();

        //观察者（读者）
        Reader reader1 = new Reader("尼古拉斯赵四");
        Reader reader2 = new Reader("旋涡刘能");

        //订阅报纸
        newsPaper.attach(reader1);
        newsPaper.attach(reader2);

        newsPaper.detach(reader1);

        //目标对象状态发生改变了
        newsPaper.setContent("最新一期火影村晨报，漩涡鸣人当上火影了");
    }
}
