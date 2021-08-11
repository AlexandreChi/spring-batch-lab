package com.example;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@EnableBatchProcessing
public class Application {

    public static void main(String args[]){

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:config.xml");

        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("job");

        try {
            JobExecution execution = jobLauncher.run(job, new JobParameters());
            System.out.println("Job Exit Status : "+ execution.getStatus());
        } catch (JobExecutionException e) {
            e.printStackTrace();
        }
    }
}
