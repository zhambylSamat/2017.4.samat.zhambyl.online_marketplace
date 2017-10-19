package kz.sdu.project.stand.launcher;

import kz.greetgo.depinject.Depinject;
import kz.greetgo.depinject.gen.DepinjectUtil;
import kz.sdu.project.stand.bean_containers.StandBeanContainer;
import kz.sdu.project.stand.util.Modules;

public class LaunchStandServer {
    public static void main(String[] args) throws Exception {
        new LaunchStandServer().run();
    }

    public void run() throws Exception {
        DepinjectUtil.implementAndUseBeanContainers("kz.sdu.project.stand",
                Modules.standDir() + "/build/src_bean_container");

        StandBeanContainer container= Depinject.newInstance(StandBeanContainer.class);

        container.standServer().start().join();
    }
}
