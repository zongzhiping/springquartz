package com.imooc.springquartz.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created by zzy on 2017/6/26.
 */
public class FirstScheduledJob extends QuartzJobBean {
    private AnotherBean anotherBean;

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("FirstScheduledJob Executes!");
        this.anotherBean.printAnotherMessage();
    }
}
