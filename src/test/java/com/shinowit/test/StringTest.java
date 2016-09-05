package com.shinowit.test;

import java.util.Iterator;
import java.util.List;

/**
 * Created by gengtongfei on 2016/8/24.
 */
public class StringTest {

    public static String BASEINFO = "Mr.Y";
    public static final int COUNT = 2000000;

    /**
     * 执行一项String赋值测试
     */
    public static void doStringTest() {

        String str = new String(BASEINFO);
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < COUNT / 100; i++) {
            str = str + "miss";
        }
        long endtime = System.currentTimeMillis();
        System.out.println((endtime - starttime)
                + " millis 已经花费用String测试.");
    }

    /**
     * 执行一项StringBuffer赋值测试
     */
    public static void doStringBufferTest() {

        StringBuffer sb = new StringBuffer(BASEINFO);
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            sb = sb.append("miss");
        }
        long endtime = System.currentTimeMillis();
        System.out.println((endtime - starttime)
                + " millis 已经花费用StringBuffer测试.");
    }

    /**
     * 执行一项StringBuilder赋值测试
     */
    public static void doStringBuilderTest() {

        StringBuilder sb = new StringBuilder(BASEINFO);
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            sb = sb.append("miss");
        }
        long endtime = System.currentTimeMillis();
        System.out.println((endtime - starttime)
                + " millis 已经花费用StringBuilder测试.");
    }

    /**
     * 测试StringBuffer遍历赋值结果
     *
     * @param mlist
     */
    public static void doStringBufferListTest(List<String> mlist) {
        StringBuffer sb = new StringBuffer();
        long starttime = System.currentTimeMillis();
        for (String string : mlist) {
            sb.append(string);
        }
        long endtime = System.currentTimeMillis();
        System.out.println(sb.toString() + "buffer cost:"
                + (endtime - starttime) + " millis");
    }

    /**
     * 测试StringBuilder迭代赋值结果
     *
     * @param mlist
     */
    public static void doStringBuilderListTest(List<String> mlist) {
        StringBuilder sb = new StringBuilder();
        long starttime = System.currentTimeMillis();
        for (Iterator<String> iterator = mlist.iterator(); iterator.hasNext(); ) {
            sb.append(iterator.next());
        }

        long endtime = System.currentTimeMillis();
        System.out.println(sb.toString() + "builder cost:"
                + (endtime - starttime) + " millis");
    }

    public static void doStringBufferTest2() {
        long starttime = System.currentTimeMillis();
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT T.ID,T.plan_name,T.plan_amount,T.bid_amount,T.residue_amount,T.progress,T.create_date,");
        sql.append("T.public_date,T.check_time,T.state,T.perCount,T.END_S_TIME,T.plan_type,T.creditor_type,T.creditor_id,");
        sql.append("T.interest_year,T.float_rate,T.period,T.START_S_TIME,T.INVEST_RANGE,T.PAYOFF_TYPE,T.EXIT_WAY,");
        sql.append("T.JOIN_RATE,T.MANGE_RATE,T.EXIT_RATE,T.SERVICE_AGREE_NAME,T.SERVICE_AGREE_URL,");
        sql.append("T.PRODUCT_DESCRIPTION_TITLE,T.PRODUCT_DESCRIPTION_CONTENT,T.PRODUCT_ABSTRACT,T.PRODUCT_PICTURE_LINK,");
        sql.append("T.FLOW_CONTROL,T.LABEL_TAG FROM");
        sql.append("tableName");
        sql.append("T where state not in ('0', '3', '6') order by state asc limit 0, 1");
        for (int i = 0; i <= 1000; i++) {
            sql.append("T where state not in ('0', '3', '6') order by state asc limit 0, 1");
        }
        sql.toString();
        long endtime = System.currentTimeMillis();
        System.out.println((endtime - starttime)
                + " millis 已经花费用StringBuffer测试.");
    }

    public static void doStringTest2() {
        long starttime = System.currentTimeMillis();
        String sql1 = "SELECT T.ID,T.plan_name,T.plan_amount,T.bid_amount,T.residue_amount,T.progress,T.create_date," +
                "T.public_date,T.check_time,T.state,T.perCount,T.END_S_TIME,T.plan_type,T.creditor_type,T.creditor_id," +
                "T.interest_year,T.float_rate,T.period,T.START_S_TIME,T.INVEST_RANGE,T.PAYOFF_TYPE,T.EXIT_WAY," +
                "T.JOIN_RATE,T.MANGE_RATE,T.EXIT_RATE,T.SERVICE_AGREE_NAME,T.SERVICE_AGREE_URL," +

                "T.PRODUCT_DESCRIPTION_TITLE,T.PRODUCT_DESCRIPTION_CONTENT,T.PRODUCT_ABSTRACT,T.PRODUCT_PICTURE_LINK," +

                "T.FLOW_CONTROL,T.LABEL_TAG FROM " +
                "tableName" +
                " T where state not in ('0', '3', '6') order by state asc limit 0, 1";
        for (int i = 0; i <= 1000; i++) {
            sql1 += "T where state not in ('0', '3', '6') order by state asc limit 0, 1";
        }
        long endtime = System.currentTimeMillis();
        System.out.println((endtime - starttime)
                + " millis 已经花费用String测试.");
    }

    public static void main(String[] args) {

        //       doStringTest2();
        //       doStringBufferTest2();
 /*       doStringBuilderTest();

        List<String> list = new ArrayList<String>();
        list.add(" I ");
        list.add(" like ");
        list.add(" BeiJing ");
        list.add(" tian ");
        list.add(" an ");
        list.add(" men ");
        list.add(" . ");

        doStringBufferListTest(list);
        doStringBuilderListTest(list);*/
      /*  Map<String,String> map=new HashMap<String, String>();
        String a=new String("a");
        String b=new String("a");
        //map.put(a,"b");
        //map.put(b,"b");
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());*/
        //System.out.println(a==b);
        //System.out.println(map.get(a));
        //System.out.println(map.get(b));
        int a = 0;
        int j = a++;
        int b = 0;
        int z = ++b;
        System.out.println(j);
        System.out.println(z);
    }
}
