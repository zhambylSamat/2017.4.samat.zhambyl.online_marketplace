package kz.sdu.project.stand.bean_containers;

import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.Include;
import kz.sdu.project.controller.controller.BeanConfigControllers;
import kz.sdu.project.stand.beans.BeanConfigStand;
import kz.sdu.project.stand.register_stand_impl.BeanConfigRegisterStandImpl;


@BeanConfig
@Include({BeanConfigStand.class, BeanConfigControllers.class, BeanConfigRegisterStandImpl.class})
public class BeanConfigForStandBeanContainer {
}