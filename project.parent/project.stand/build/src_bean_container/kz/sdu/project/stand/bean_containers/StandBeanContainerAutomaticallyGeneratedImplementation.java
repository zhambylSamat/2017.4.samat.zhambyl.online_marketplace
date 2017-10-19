package kz.sdu.project.stand.bean_containers;
public final class StandBeanContainerAutomaticallyGeneratedImplementation implements kz.sdu.project.stand.bean_containers.StandBeanContainer{

  private final java.lang.Object forSynchronizedBlocks = new java.lang.Object();

  //
  // Bean container methods
  //

  @java.lang.Override
  public kz.sdu.project.stand.beans.StandServer standServer() {
    return getter_native_StandServer_6.get();
  }

  //
  // Bean creations
  //

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.controller.controller.ProductController> cachedValue_native_ProductController_1 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.controller.controller.ProductController> getter_native_ProductController_1 = this::get_native_ProductController_1;
  private kz.sdu.project.controller.controller.ProductController get_native_ProductController_1 () {
    {
      kz.sdu.project.controller.controller.ProductController x = cachedValue_native_ProductController_1.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.controller.controller.ProductController x = cachedValue_native_ProductController_1.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.controller.controller.ProductController localValue = new kz.sdu.project.controller.controller.ProductController();
        localValue.productRegister = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.controller.register.ProductRegister>)(java.lang.Object)getter_native_ProductRegisterStandImpl_8;
        cachedValue_native_ProductController_1.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.beans.CrossOriginFilterRegistration> cachedValue_native_CrossOriginFilterRegistration_2 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.beans.CrossOriginFilterRegistration> getter_native_CrossOriginFilterRegistration_2 = this::get_native_CrossOriginFilterRegistration_2;
  private kz.sdu.project.stand.beans.CrossOriginFilterRegistration get_native_CrossOriginFilterRegistration_2 () {
    {
      kz.sdu.project.stand.beans.CrossOriginFilterRegistration x = cachedValue_native_CrossOriginFilterRegistration_2.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.beans.CrossOriginFilterRegistration x = cachedValue_native_CrossOriginFilterRegistration_2.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.beans.CrossOriginFilterRegistration localValue = new kz.sdu.project.stand.beans.CrossOriginFilterRegistration();
        cachedValue_native_CrossOriginFilterRegistration_2.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.beans.JettyControllersRegistration> cachedValue_native_JettyControllersRegistration_3 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.beans.JettyControllersRegistration> getter_native_JettyControllersRegistration_3 = this::get_native_JettyControllersRegistration_3;
  private kz.sdu.project.stand.beans.JettyControllersRegistration get_native_JettyControllersRegistration_3 () {
    {
      kz.sdu.project.stand.beans.JettyControllersRegistration x = cachedValue_native_JettyControllersRegistration_3.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.beans.JettyControllersRegistration x = cachedValue_native_JettyControllersRegistration_3.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.beans.JettyControllersRegistration localValue = new kz.sdu.project.stand.beans.JettyControllersRegistration();
        localValue.controllerList = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.project.controller.utils.Controller>>)(java.lang.Object)getter_ref_list_Controller_10;
        localValue.views = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.mvc.interfaces.Views>)(java.lang.Object)getter_native_StandProjectViews_5;
        cachedValue_native_JettyControllersRegistration_3.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.beans.PrintRequestParamsRegistration> cachedValue_native_PrintRequestParamsRegistration_4 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.beans.PrintRequestParamsRegistration> getter_native_PrintRequestParamsRegistration_4 = this::get_native_PrintRequestParamsRegistration_4;
  private kz.sdu.project.stand.beans.PrintRequestParamsRegistration get_native_PrintRequestParamsRegistration_4 () {
    {
      kz.sdu.project.stand.beans.PrintRequestParamsRegistration x = cachedValue_native_PrintRequestParamsRegistration_4.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.beans.PrintRequestParamsRegistration x = cachedValue_native_PrintRequestParamsRegistration_4.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.beans.PrintRequestParamsRegistration localValue = new kz.sdu.project.stand.beans.PrintRequestParamsRegistration();
        cachedValue_native_PrintRequestParamsRegistration_4.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.beans.StandProjectViews> cachedValue_native_StandProjectViews_5 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.beans.StandProjectViews> getter_native_StandProjectViews_5 = this::get_native_StandProjectViews_5;
  private kz.sdu.project.stand.beans.StandProjectViews get_native_StandProjectViews_5 () {
    {
      kz.sdu.project.stand.beans.StandProjectViews x = cachedValue_native_StandProjectViews_5.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.beans.StandProjectViews x = cachedValue_native_StandProjectViews_5.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.beans.StandProjectViews localValue = new kz.sdu.project.stand.beans.StandProjectViews();
        cachedValue_native_StandProjectViews_5.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.beans.StandServer> cachedValue_native_StandServer_6 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.beans.StandServer> getter_native_StandServer_6 = this::get_native_StandServer_6;
  private kz.sdu.project.stand.beans.StandServer get_native_StandServer_6 () {
    {
      kz.sdu.project.stand.beans.StandServer x = cachedValue_native_StandServer_6.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.beans.StandServer x = cachedValue_native_StandServer_6.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.beans.StandServer localValue = new kz.sdu.project.stand.beans.StandServer();
        localValue.webAppContextRegistrations = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.project.stand.util.WebAppContextRegistration>>)(java.lang.Object)getter_ref_list_WebAppContextRegistration_11;
        localValue.afterInject();
        cachedValue_native_StandServer_6.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.beans.Utf8FilterRegistration> cachedValue_native_Utf8FilterRegistration_7 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.beans.Utf8FilterRegistration> getter_native_Utf8FilterRegistration_7 = this::get_native_Utf8FilterRegistration_7;
  private kz.sdu.project.stand.beans.Utf8FilterRegistration get_native_Utf8FilterRegistration_7 () {
    {
      kz.sdu.project.stand.beans.Utf8FilterRegistration x = cachedValue_native_Utf8FilterRegistration_7.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.beans.Utf8FilterRegistration x = cachedValue_native_Utf8FilterRegistration_7.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.beans.Utf8FilterRegistration localValue = new kz.sdu.project.stand.beans.Utf8FilterRegistration();
        cachedValue_native_Utf8FilterRegistration_7.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.register_stand_impl.ProductRegisterStandImpl> cachedValue_native_ProductRegisterStandImpl_8 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.register_stand_impl.ProductRegisterStandImpl> getter_native_ProductRegisterStandImpl_8 = this::get_native_ProductRegisterStandImpl_8;
  private kz.sdu.project.stand.register_stand_impl.ProductRegisterStandImpl get_native_ProductRegisterStandImpl_8 () {
    {
      kz.sdu.project.stand.register_stand_impl.ProductRegisterStandImpl x = cachedValue_native_ProductRegisterStandImpl_8.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.register_stand_impl.ProductRegisterStandImpl x = cachedValue_native_ProductRegisterStandImpl_8.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.register_stand_impl.ProductRegisterStandImpl localValue = new kz.sdu.project.stand.register_stand_impl.ProductRegisterStandImpl();
        localValue.db = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.register_stand_impl.db.Db>)(java.lang.Object)getter_native_Db_9;
        cachedValue_native_ProductRegisterStandImpl_8.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.register_stand_impl.db.Db> cachedValue_native_Db_9 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.register_stand_impl.db.Db> getter_native_Db_9 = this::get_native_Db_9;
  private kz.sdu.project.stand.register_stand_impl.db.Db get_native_Db_9 () {
    {
      kz.sdu.project.stand.register_stand_impl.db.Db x = cachedValue_native_Db_9.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.register_stand_impl.db.Db x = cachedValue_native_Db_9.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.register_stand_impl.db.Db localValue = new kz.sdu.project.stand.register_stand_impl.db.Db();
        localValue.afterInject();
        cachedValue_native_Db_9.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  //
  // Bean references
  //

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.project.controller.utils.Controller>> getter_ref_list_Controller_10 = this::get_ref_list_Controller_10;
  private java.util.List<kz.sdu.project.controller.utils.Controller> get_ref_list_Controller_10() {
    java.util.List<kz.sdu.project.controller.utils.Controller> list = new java.util.ArrayList<>();
    list.add(getter_native_ProductController_1.get());
    return list;
  }

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.project.stand.util.WebAppContextRegistration>> getter_ref_list_WebAppContextRegistration_11 = this::get_ref_list_WebAppContextRegistration_11;
  private java.util.List<kz.sdu.project.stand.util.WebAppContextRegistration> get_ref_list_WebAppContextRegistration_11() {
    java.util.List<kz.sdu.project.stand.util.WebAppContextRegistration> list = new java.util.ArrayList<>();
    list.add(getter_native_CrossOriginFilterRegistration_2.get());
    list.add(getter_native_JettyControllersRegistration_3.get());
    list.add(getter_native_PrintRequestParamsRegistration_4.get());
    list.add(getter_native_Utf8FilterRegistration_7.get());
    return list;
  }
  
  //
  // Getter creations
  //
}
