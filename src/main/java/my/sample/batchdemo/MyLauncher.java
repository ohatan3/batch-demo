package my.sample.batchdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
@EnableScheduling
@RequiredArgsConstructor
public class MyLauncher {

    private final JobLauncher jobLauncher;
    private final Job myJob;

    private JobParameters jobParameters;

    @Scheduled(cron = "*/5 * * * * *")  // 5秒ごとに実行する
    public void launchSampleJob() throws JobExecutionException {
//        this.jobParameters = myJob.getJobParametersIncrementer()
//                .getNext(this.jobParameters);
//        this.jobLauncher.run(this.myJob, this.jobParameters);
        System.out.println("launch");
    }
}
