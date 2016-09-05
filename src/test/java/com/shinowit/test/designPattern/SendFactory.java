package com.shinowit.test.designPattern;

/**
 * Created by gengtongfei on 2016/9/2.
 */
public class SendFactory {

    public static Sender produce(String type) {

        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型");
            return null;
        }
    }

    public static void main(String[] args) {
        Sender sender = SendFactory.produce("sms");
        sender.send();
        //SendFactory.produce("11");
    }
}
