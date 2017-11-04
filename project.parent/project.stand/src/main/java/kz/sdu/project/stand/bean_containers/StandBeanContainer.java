package kz.sdu.project.stand.bean_containers;

import kz.greetgo.depinject.core.BeanContainer;
import kz.greetgo.depinject.core.Include;
import kz.sdu.project.stand.beans.StandServer;
import kz.sdu.project.stand.register_stand_impl.MainScheduler;
import kz.sdu.project.stand.register_stand_impl.MyConfig;
import kz.sdu.project.stand.register_stand_impl.MyTask;

@Include(BeanConfigForStandBeanContainer.class)
public interface StandBeanContainer extends BeanContainer {
    StandServer standServer();

    MyConfig myConfig();

    MainScheduler getMainScheduler();

    MyTask myTask();
}