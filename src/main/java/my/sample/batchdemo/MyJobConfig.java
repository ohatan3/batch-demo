package my.sample.batchdemo;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Sample with v5
@Configuration
public class MyJobConfig {

    private final MyStepConfig

    @Bean
    public Job myJob(JobRepository jobRepository, Step step) {
//        System.out.println("myJob");
        return new JobBuilder("myJob", jobRepository)
                .start(step)
                .build();
    }

}