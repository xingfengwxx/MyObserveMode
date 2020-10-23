# 观察者模式 

- 定义：当一个对象的状态发生改变时，所有依赖于它的订阅者都会收到通知 
- 本质：触发联动 

![img_1.png](http://ww1.sinaimg.cn/large/0073bao7gy1gjyjbdtmc4j30s30aewgg.jpg)

- 场景：订报纸 
- 不使用观察者，怎么办？会轮询，开销很大Subject，目标对象，被多个观察者观察，提供对观察者的注册和订阅，当目标对象的状态发生改变，所有的订阅者都会被通知到 
- Observer，观察者，目标通知时对应的更新方法，会进行相应的业务处理 
- ConcreteSubject，具体的目标对象 
- ConcreteObserver，具体的观察者 

## Java对于观察者模式的支持 

- java.util.Observable、java.util.Observer 

## 场景：雾霾检测，区别对待观察者 

- 正常情况下，监测人员做记录 
- 轻度污染，监测人员做记录，通知预警人员 
- 高度污染，监测人员做记录，通知预警人员，通知监测领导 

## EditText.addTextChangedListener