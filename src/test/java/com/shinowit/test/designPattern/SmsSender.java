package com.shinowit.test.designPattern;

/**
 * Created by gengtongfei on 2016/9/2.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender");
    }
}
