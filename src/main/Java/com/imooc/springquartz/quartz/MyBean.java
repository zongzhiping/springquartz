package com.imooc.springquartz.quartz;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zzy on 2017/6/26.
 */
@Component("myBean")
public class MyBean {
    public void printMessage(){
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("MyBean Executes! and The time is: "+sf.format(date));
    }
}
