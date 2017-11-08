package kz.sdu.project.stand.launcher;

import kz.greetgo.depinject.Depinject;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.depinject.gen.DepinjectUtil;
import kz.sdu.project.stand.bean_containers.StandBeanContainer;
import kz.sdu.project.stand.register_stand_impl.MainScheduler;
import kz.sdu.project.stand.register_stand_impl.MyConfig;
import kz.sdu.project.stand.register_stand_impl.db.Db;
import kz.sdu.project.stand.util.Modules;
import kz.sdu.project.stand.util.StandCommonConstant;
public class LaunchStandServer {
    public static void main(String[] args) throws Exception {
        new LaunchStandServer().run();
    }

    public void run() throws Exception {
        DepinjectUtil.implementAndUseBeanContainers("kz.sdu.project.stand",
                Modules.standDir() + "/build/src_bean_container");
        DepinjectUtil.implementAndUseBeanContainers("kz.sdu.project.server",
                Modules.standDir() + "/build/src_bean_container");

//        MyConfig myConfig = Depinject.newInstance(MyConfig.class);

        StandBeanContainer container= Depinject.newInstance(StandBeanContainer.class);


        MainScheduler mainScheduler = container.getMainScheduler();
        mainScheduler.startSchedulers(container.myTask());

        MyConfig myConfig = container.myConfig();

        System.out.println(myConfig.accountPassword());

        container.standServer().start().join();
//        BeanGetter<Db> db;
//        StandCommonConstant setDefaultConfig = new StandCommonConstant(myConfig.loginAccount(), myConfig.accountPassword(), myConfig.needToSendEmail());
//        db.get().tmpConfig.put("default_account_config",setDefaultConfig);
    }
}
