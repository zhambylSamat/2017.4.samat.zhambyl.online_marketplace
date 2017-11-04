package kz.sdu.project.stand.register_stand_impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.scheduling.FromConfig;
import kz.greetgo.scheduling.HasScheduled;
import kz.greetgo.scheduling.Scheduled;

import java.io.File;
import java.io.IOException;

@Bean
public class MyTask implements HasScheduled {

    @FromConfig("Paramter ....")
    @Scheduled("parallel repeat every 10 sec after pause in 17 sec")
    public void doAJob() throws IOException {
        File file = new File(""+System.getProperty("user.home")+"/project.d/"+System.currentTimeMillis());
        File parentFile = file.getParentFile();
        if(!parentFile.exists())
            parentFile.mkdirs();
        file.createNewFile();
    }

    @Scheduled("23:00")
    public void task2(){
//         do nothing
    }
}
