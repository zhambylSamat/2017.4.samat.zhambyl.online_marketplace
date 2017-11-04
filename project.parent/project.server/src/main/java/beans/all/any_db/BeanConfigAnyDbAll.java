package beans.all.any_db;

import impl.BeanConfigRegisterServerImpl;
import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.BeanScanner;
import kz.greetgo.depinject.core.Include;
import kz.sdu.project.controller.controller.BeanConfigControllers;

@BeanConfig
@BeanScanner
@Include({BeanConfigControllers.class, BeanConfigRegisterServerImpl.class})
public class BeanConfigAnyDbAll {

}
