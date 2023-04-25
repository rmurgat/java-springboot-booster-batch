package com.hanygen.helloworldbatch.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldJobExecutionListener implements JobExecutionListener {
    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("before starting the Job - [job name:]" + jobExecution.getJobInstance().getJobName());
        System.out.println("before starting the job - [execution context:]" + jobExecution.getExecutionContext().toString());
    }

    @Override
    public void afterJob(JobExecution jobExecution) {

    }
}
