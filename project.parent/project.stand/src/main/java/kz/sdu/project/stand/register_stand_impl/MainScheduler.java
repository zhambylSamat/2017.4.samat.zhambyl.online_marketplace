package kz.sdu.project.stand.register_stand_impl;

import kz.greetgo.depinject.Depinject;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.gen.DepinjectUtil;
import kz.greetgo.scheduling.ExecutionPool;
import kz.greetgo.scheduling.Scheduler;
import kz.greetgo.scheduling.TaskCollector;
import kz.greetgo.scheduling.Task;

import java.util.List;

@Bean
public class MainScheduler {

    private Scheduler scheduler = null;

    public void startSchedulers(MyTask myTask){
        if(scheduler != null) return;

        String configDir = System.getProperty("user.home") + "/project.d";
        TaskCollector taskCollector = new TaskCollector(configDir);

//        MyTask myTask = DepinjectUtil.implementAndUseBeanContainers(Stand);

//        taskCollector.collect(myTask.class);

        taskCollector.collect(myTask);

        List<Task> tasks = taskCollector.getTasks();

        scheduler = new Scheduler(tasks, ExecutionPool.poolsForTasks(tasks));
        scheduler.startup();
    }

}
