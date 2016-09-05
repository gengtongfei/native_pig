package com.shinowit.test;

/**
 * Created by gengtongfei on 2016/9/1.
 */
public class SingleClassTest {

    //内部类的单例模式
  /*  private SingleClassTest(){};
    private static class SingletonFactory{
        private static SingleClassTest singleton=new SingleClassTest();
    }
    public static SingleClassTest getSingleton(){
        return SingletonFactory.singleton;
    }*/

    //普通的单例模式(线程不安全)
    private SingleClassTest() {
    }

    ;
    private static SingleClassTest singleton = null;

    /*public static SingleClassTest getSingleton(){
        if(null==singleton){
            singleton=new SingleClassTest();
        }
        return singleton;
    }*/
    //加同步的方式-1
    public static SingleClassTest getSingleton() {
        if (null == singleton) {
            synchronized (singleton) {
                singleton = new SingleClassTest();
            }
        }
        return singleton;
    }

    //加同步的方式-2
    public synchronized static SingleClassTest getSingleton2() {
        if (null == singleton) {
            singleton = new SingleClassTest();
        }
        return singleton;
    }


}
