package com.imooc.springquartz.quartz;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zzy on 2017/6/26.
 */
@Component("anotherBean")
public class AnotherBean {
    public void printAnotherMessage(){
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("anotherBean Executes! and the time is: "+ sf.format(date));
    }
}
