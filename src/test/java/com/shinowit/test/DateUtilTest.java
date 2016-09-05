package com.shinowit.test;


import com.shinowit.tools.DateUtils;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by gengtongfei on 2016/8/24.
 */
public class DateUtilTest extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
                this.join(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                System.out.println(this.getName() + ":" + DateUtils.parse("2013-05-24 06:02:20"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new DateUtilTest().start();
        }
        Map<String, String> map = new HashMap<String, String>();
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
    }

}
