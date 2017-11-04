package kz.greetgo.project.server.test.util;

import beans.all.any_db.BeanConfigAnyDbAll;
import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.Include;

@BeanConfig
@Include({BeanConfigAnyDbAll.class})
public class BeanConfigMainServerPostrgresTest {
}
