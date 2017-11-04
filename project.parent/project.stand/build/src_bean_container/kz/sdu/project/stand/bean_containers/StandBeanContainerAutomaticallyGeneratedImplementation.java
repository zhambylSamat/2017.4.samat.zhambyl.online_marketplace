package kz.sdu.project.stand.bean_containers;
public final class StandBeanContainerAutomaticallyGeneratedImplementation implements kz.sdu.project.stand.bean_containers.StandBeanContainer{

  private final java.lang.Object forSynchronizedBlocks = new java.lang.Object();

  //
  // Bean container methods
  //

  @java.lang.Override
  public kz.sdu.project.stand.register_stand_impl.MainScheduler getMainScheduler() {
    return getter_native_MainScheduler_17.get();
  }

  @java.lang.Override
  public kz.sdu.project.stand.register_stand_impl.MyConfig myConfig() {
    return getter_native_MyConfig_18.get();
  }

  @java.lang.Override
  public kz.sdu.project.stand.register_stand_impl.MyTask myTask() {
    return getter_native_MyTask_20.get();
  }

  @java.lang.Override
  public kz.sdu.project.stand.beans.StandServer standServer() {
    return getter_native_StandServer_14.get();
  }

  //
  // Bean creations
  //

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.email.EmailSender> cachedValue_native_EmailSender_1 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.email.EmailSender> getter_native_EmailSender_1 = this::get_native_EmailSender_1;
  private kz.greetgo.email.EmailSender get_native_EmailSender_1 () {
    {
      kz.greetgo.email.EmailSender x = cachedValue_native_EmailSender_1.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.email.EmailSender x = cachedValue_native_EmailSender_1.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.email.EmailSender localValue = getter_native_SendEmailServerFactory_9.get().createEmailSendersServer();
        cachedValue_native_EmailSender_1.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.email.EmailSenderController> cachedValue_native_EmailSenderController_2 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.email.EmailSenderController> getter_native_EmailSenderController_2 = this::get_native_EmailSenderController_2;
  private kz.greetgo.email.EmailSenderController get_native_EmailSenderController_2 () {
    {
      kz.greetgo.email.EmailSenderController x = cachedValue_native_EmailSenderController_2.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.email.EmailSenderController x = cachedValue_native_EmailSenderController_2.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.email.EmailSenderController localValue = getter_native_SendEmailServerFactory_9.get().createEmailSenderControllerServer();
        cachedValue_native_EmailSenderController_2.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.controller.controller.AuthController> cachedValue_native_AuthController_3 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.controller.controller.AuthController> getter_native_AuthController_3 = this::get_native_AuthController_3;
  private kz.sdu.project.controller.controller.AuthController get_native_AuthController_3 () {
    {
      kz.sdu.project.controller.controller.AuthController x = cachedValue_native_AuthController_3.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.controller.controller.AuthController x = cachedValue_native_AuthController_3.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.controller.controller.AuthController localValue = new kz.sdu.project.controller.controller.AuthController();
        localValue.userRegister = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.controller.register.AuthRegister>)(java.lang.Object)getter_native_AuthRegisterStandImpl_16;
        cachedValue_native_AuthController_3.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.controller.controller.CheckRegistartion> cachedValue_native_CheckRegistartion_4 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.controller.controller.CheckRegistartion> getter_native_CheckRegistartion_4 = this::get_native_CheckRegistartion_4;
  private kz.sdu.project.controller.controller.CheckRegistartion get_native_CheckRegistartion_4 () {
    {
      kz.sdu.project.controller.controller.CheckRegistartion x = cachedValue_native_CheckRegistartion_4.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.controller.controller.CheckRegistartion x = cachedValue_native_CheckRegistartion_4.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.controller.controller.CheckRegistartion localValue = new kz.sdu.project.controller.controller.CheckRegistartion();
        localValue.userRegisterBeanGetter = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.controller.register.UserRegister>)(java.lang.Object)getter_native_UserRegisterStandImpl_23;
        cachedValue_native_CheckRegistartion_4.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.controller.controller.EmailSendController> cachedValue_native_EmailSendController_5 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.controller.controller.EmailSendController> getter_native_EmailSendController_5 = this::get_native_EmailSendController_5;
  private kz.sdu.project.controller.controller.EmailSendController get_native_EmailSendController_5 () {
    {
      kz.sdu.project.controller.controller.EmailSendController x = cachedValue_native_EmailSendController_5.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.controller.controller.EmailSendController x = cachedValue_native_EmailSendController_5.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.controller.controller.EmailSendController localValue = new kz.sdu.project.controller.controller.EmailSendController();
        localValue.userRegisterBeanGetter = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.controller.register.UserRegister>)(java.lang.Object)getter_native_UserRegisterStandImpl_23;
        cachedValue_native_EmailSendController_5.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.controller.controller.ProductController> cachedValue_native_ProductController_6 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.controller.controller.ProductController> getter_native_ProductController_6 = this::get_native_ProductController_6;
  private kz.sdu.project.controller.controller.ProductController get_native_ProductController_6 () {
    {
      kz.sdu.project.controller.controller.ProductController x = cachedValue_native_ProductController_6.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.controller.controller.ProductController x = cachedValue_native_ProductController_6.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.controller.controller.ProductController localValue = new kz.sdu.project.controller.controller.ProductController();
        localValue.productRegister = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.controller.register.ProductRegister>)(java.lang.Object)getter_native_ProductRegisterStandImpl_21;
        cachedValue_native_ProductController_6.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.controller.controller.SessionController> cachedValue_native_SessionController_7 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.controller.controller.SessionController> getter_native_SessionController_7 = this::get_native_SessionController_7;
  private kz.sdu.project.controller.controller.SessionController get_native_SessionController_7 () {
    {
      kz.sdu.project.controller.controller.SessionController x = cachedValue_native_SessionController_7.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.controller.controller.SessionController x = cachedValue_native_SessionController_7.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.controller.controller.SessionController localValue = new kz.sdu.project.controller.controller.SessionController();
        localValue.sessionRegister = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.controller.register.SessionRegister>)(java.lang.Object)getter_native_SessionRegisterStandImpl_22;
        cachedValue_native_SessionController_7.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.controller.controller.UserRegistration> cachedValue_native_UserRegistration_8 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.controller.controller.UserRegistration> getter_native_UserRegistration_8 = this::get_native_UserRegistration_8;
  private kz.sdu.project.controller.controller.UserRegistration get_native_UserRegistration_8 () {
    {
      kz.sdu.project.controller.controller.UserRegistration x = cachedValue_native_UserRegistration_8.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.controller.controller.UserRegistration x = cachedValue_native_UserRegistration_8.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.controller.controller.UserRegistration localValue = new kz.sdu.project.controller.controller.UserRegistration();
        localValue.userRegisterBeanGetter = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.controller.register.UserRegister>)(java.lang.Object)getter_native_UserRegisterStandImpl_23;
        cachedValue_native_UserRegistration_8.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.bean_containers.SendEmailServerFactory> cachedValue_native_SendEmailServerFactory_9 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.bean_containers.SendEmailServerFactory> getter_native_SendEmailServerFactory_9 = this::get_native_SendEmailServerFactory_9;
  private kz.sdu.project.stand.bean_containers.SendEmailServerFactory get_native_SendEmailServerFactory_9 () {
    {
      kz.sdu.project.stand.bean_containers.SendEmailServerFactory x = cachedValue_native_SendEmailServerFactory_9.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.bean_containers.SendEmailServerFactory x = cachedValue_native_SendEmailServerFactory_9.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.bean_containers.SendEmailServerFactory localValue = new kz.sdu.project.stand.bean_containers.SendEmailServerFactory();
        cachedValue_native_SendEmailServerFactory_9.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.beans.CrossOriginFilterRegistration> cachedValue_native_CrossOriginFilterRegistration_10 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.beans.CrossOriginFilterRegistration> getter_native_CrossOriginFilterRegistration_10 = this::get_native_CrossOriginFilterRegistration_10;
  private kz.sdu.project.stand.beans.CrossOriginFilterRegistration get_native_CrossOriginFilterRegistration_10 () {
    {
      kz.sdu.project.stand.beans.CrossOriginFilterRegistration x = cachedValue_native_CrossOriginFilterRegistration_10.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.beans.CrossOriginFilterRegistration x = cachedValue_native_CrossOriginFilterRegistration_10.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.beans.CrossOriginFilterRegistration localValue = new kz.sdu.project.stand.beans.CrossOriginFilterRegistration();
        cachedValue_native_CrossOriginFilterRegistration_10.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.beans.JettyControllersRegistration> cachedValue_native_JettyControllersRegistration_11 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.beans.JettyControllersRegistration> getter_native_JettyControllersRegistration_11 = this::get_native_JettyControllersRegistration_11;
  private kz.sdu.project.stand.beans.JettyControllersRegistration get_native_JettyControllersRegistration_11 () {
    {
      kz.sdu.project.stand.beans.JettyControllersRegistration x = cachedValue_native_JettyControllersRegistration_11.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.beans.JettyControllersRegistration x = cachedValue_native_JettyControllersRegistration_11.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.beans.JettyControllersRegistration localValue = new kz.sdu.project.stand.beans.JettyControllersRegistration();
        localValue.controllerList = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.project.controller.utils.Controller>>)(java.lang.Object)getter_ref_list_Controller_25;
        localValue.views = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.mvc.interfaces.Views>)(java.lang.Object)getter_native_StandProjectViews_13;
        cachedValue_native_JettyControllersRegistration_11.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.beans.PrintRequestParamsRegistration> cachedValue_native_PrintRequestParamsRegistration_12 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.beans.PrintRequestParamsRegistration> getter_native_PrintRequestParamsRegistration_12 = this::get_native_PrintRequestParamsRegistration_12;
  private kz.sdu.project.stand.beans.PrintRequestParamsRegistration get_native_PrintRequestParamsRegistration_12 () {
    {
      kz.sdu.project.stand.beans.PrintRequestParamsRegistration x = cachedValue_native_PrintRequestParamsRegistration_12.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.beans.PrintRequestParamsRegistration x = cachedValue_native_PrintRequestParamsRegistration_12.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.beans.PrintRequestParamsRegistration localValue = new kz.sdu.project.stand.beans.PrintRequestParamsRegistration();
        cachedValue_native_PrintRequestParamsRegistration_12.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.beans.StandProjectViews> cachedValue_native_StandProjectViews_13 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.beans.StandProjectViews> getter_native_StandProjectViews_13 = this::get_native_StandProjectViews_13;
  private kz.sdu.project.stand.beans.StandProjectViews get_native_StandProjectViews_13 () {
    {
      kz.sdu.project.stand.beans.StandProjectViews x = cachedValue_native_StandProjectViews_13.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.beans.StandProjectViews x = cachedValue_native_StandProjectViews_13.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.beans.StandProjectViews localValue = new kz.sdu.project.stand.beans.StandProjectViews();
        cachedValue_native_StandProjectViews_13.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.beans.StandServer> cachedValue_native_StandServer_14 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.beans.StandServer> getter_native_StandServer_14 = this::get_native_StandServer_14;
  private kz.sdu.project.stand.beans.StandServer get_native_StandServer_14 () {
    {
      kz.sdu.project.stand.beans.StandServer x = cachedValue_native_StandServer_14.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.beans.StandServer x = cachedValue_native_StandServer_14.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.beans.StandServer localValue = new kz.sdu.project.stand.beans.StandServer();
        localValue.webAppContextRegistrations = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.project.stand.util.WebAppContextRegistration>>)(java.lang.Object)getter_ref_list_WebAppContextRegistration_26;
        localValue.afterInject();
        cachedValue_native_StandServer_14.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.beans.Utf8FilterRegistration> cachedValue_native_Utf8FilterRegistration_15 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.beans.Utf8FilterRegistration> getter_native_Utf8FilterRegistration_15 = this::get_native_Utf8FilterRegistration_15;
  private kz.sdu.project.stand.beans.Utf8FilterRegistration get_native_Utf8FilterRegistration_15 () {
    {
      kz.sdu.project.stand.beans.Utf8FilterRegistration x = cachedValue_native_Utf8FilterRegistration_15.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.beans.Utf8FilterRegistration x = cachedValue_native_Utf8FilterRegistration_15.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.beans.Utf8FilterRegistration localValue = new kz.sdu.project.stand.beans.Utf8FilterRegistration();
        cachedValue_native_Utf8FilterRegistration_15.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.register_stand_impl.AuthRegisterStandImpl> cachedValue_native_AuthRegisterStandImpl_16 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.register_stand_impl.AuthRegisterStandImpl> getter_native_AuthRegisterStandImpl_16 = this::get_native_AuthRegisterStandImpl_16;
  private kz.sdu.project.stand.register_stand_impl.AuthRegisterStandImpl get_native_AuthRegisterStandImpl_16 () {
    {
      kz.sdu.project.stand.register_stand_impl.AuthRegisterStandImpl x = cachedValue_native_AuthRegisterStandImpl_16.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.register_stand_impl.AuthRegisterStandImpl x = cachedValue_native_AuthRegisterStandImpl_16.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.register_stand_impl.AuthRegisterStandImpl localValue = new kz.sdu.project.stand.register_stand_impl.AuthRegisterStandImpl();
        localValue.db = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.register_stand_impl.db.Db>)(java.lang.Object)getter_native_Db_24;
        cachedValue_native_AuthRegisterStandImpl_16.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.register_stand_impl.MainScheduler> cachedValue_native_MainScheduler_17 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.register_stand_impl.MainScheduler> getter_native_MainScheduler_17 = this::get_native_MainScheduler_17;
  private kz.sdu.project.stand.register_stand_impl.MainScheduler get_native_MainScheduler_17 () {
    {
      kz.sdu.project.stand.register_stand_impl.MainScheduler x = cachedValue_native_MainScheduler_17.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.register_stand_impl.MainScheduler x = cachedValue_native_MainScheduler_17.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.register_stand_impl.MainScheduler localValue = new kz.sdu.project.stand.register_stand_impl.MainScheduler();
        cachedValue_native_MainScheduler_17.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.register_stand_impl.MyConfig> cachedValue_native_MyConfig_18 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.register_stand_impl.MyConfig> getter_native_MyConfig_18 = this::get_native_MyConfig_18;
  private kz.sdu.project.stand.register_stand_impl.MyConfig get_native_MyConfig_18 () {
    {
      kz.sdu.project.stand.register_stand_impl.MyConfig x = cachedValue_native_MyConfig_18.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.register_stand_impl.MyConfig x = cachedValue_native_MyConfig_18.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.register_stand_impl.MyConfig localValue = getter_native_MyConfigFactory_19.get().getMyConfig();
        cachedValue_native_MyConfig_18.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.register_stand_impl.MyConfigFactory> cachedValue_native_MyConfigFactory_19 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.register_stand_impl.MyConfigFactory> getter_native_MyConfigFactory_19 = this::get_native_MyConfigFactory_19;
  private kz.sdu.project.stand.register_stand_impl.MyConfigFactory get_native_MyConfigFactory_19 () {
    {
      kz.sdu.project.stand.register_stand_impl.MyConfigFactory x = cachedValue_native_MyConfigFactory_19.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.register_stand_impl.MyConfigFactory x = cachedValue_native_MyConfigFactory_19.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.register_stand_impl.MyConfigFactory localValue = new kz.sdu.project.stand.register_stand_impl.MyConfigFactory();
        cachedValue_native_MyConfigFactory_19.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.register_stand_impl.MyTask> cachedValue_native_MyTask_20 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.register_stand_impl.MyTask> getter_native_MyTask_20 = this::get_native_MyTask_20;
  private kz.sdu.project.stand.register_stand_impl.MyTask get_native_MyTask_20 () {
    {
      kz.sdu.project.stand.register_stand_impl.MyTask x = cachedValue_native_MyTask_20.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.register_stand_impl.MyTask x = cachedValue_native_MyTask_20.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.register_stand_impl.MyTask localValue = new kz.sdu.project.stand.register_stand_impl.MyTask();
        cachedValue_native_MyTask_20.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.register_stand_impl.ProductRegisterStandImpl> cachedValue_native_ProductRegisterStandImpl_21 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.register_stand_impl.ProductRegisterStandImpl> getter_native_ProductRegisterStandImpl_21 = this::get_native_ProductRegisterStandImpl_21;
  private kz.sdu.project.stand.register_stand_impl.ProductRegisterStandImpl get_native_ProductRegisterStandImpl_21 () {
    {
      kz.sdu.project.stand.register_stand_impl.ProductRegisterStandImpl x = cachedValue_native_ProductRegisterStandImpl_21.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.register_stand_impl.ProductRegisterStandImpl x = cachedValue_native_ProductRegisterStandImpl_21.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.register_stand_impl.ProductRegisterStandImpl localValue = new kz.sdu.project.stand.register_stand_impl.ProductRegisterStandImpl();
        localValue.db = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.register_stand_impl.db.Db>)(java.lang.Object)getter_native_Db_24;
        cachedValue_native_ProductRegisterStandImpl_21.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.register_stand_impl.SessionRegisterStandImpl> cachedValue_native_SessionRegisterStandImpl_22 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.register_stand_impl.SessionRegisterStandImpl> getter_native_SessionRegisterStandImpl_22 = this::get_native_SessionRegisterStandImpl_22;
  private kz.sdu.project.stand.register_stand_impl.SessionRegisterStandImpl get_native_SessionRegisterStandImpl_22 () {
    {
      kz.sdu.project.stand.register_stand_impl.SessionRegisterStandImpl x = cachedValue_native_SessionRegisterStandImpl_22.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.register_stand_impl.SessionRegisterStandImpl x = cachedValue_native_SessionRegisterStandImpl_22.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.register_stand_impl.SessionRegisterStandImpl localValue = new kz.sdu.project.stand.register_stand_impl.SessionRegisterStandImpl();
        localValue.db = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.register_stand_impl.db.Db>)(java.lang.Object)getter_native_Db_24;
        cachedValue_native_SessionRegisterStandImpl_22.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.register_stand_impl.UserRegisterStandImpl> cachedValue_native_UserRegisterStandImpl_23 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.register_stand_impl.UserRegisterStandImpl> getter_native_UserRegisterStandImpl_23 = this::get_native_UserRegisterStandImpl_23;
  private kz.sdu.project.stand.register_stand_impl.UserRegisterStandImpl get_native_UserRegisterStandImpl_23 () {
    {
      kz.sdu.project.stand.register_stand_impl.UserRegisterStandImpl x = cachedValue_native_UserRegisterStandImpl_23.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.register_stand_impl.UserRegisterStandImpl x = cachedValue_native_UserRegisterStandImpl_23.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.register_stand_impl.UserRegisterStandImpl localValue = new kz.sdu.project.stand.register_stand_impl.UserRegisterStandImpl();
        localValue.db = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.register_stand_impl.db.Db>)(java.lang.Object)getter_native_Db_24;
        localValue.emailSenderBeanGetter = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.email.EmailSender>)(java.lang.Object)getter_native_EmailSender_1;
        localValue.emailSenderControllerBeanGetter = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.email.EmailSenderController>)(java.lang.Object)getter_native_EmailSenderController_2;
        cachedValue_native_UserRegisterStandImpl_23.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.stand.register_stand_impl.db.Db> cachedValue_native_Db_24 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.stand.register_stand_impl.db.Db> getter_native_Db_24 = this::get_native_Db_24;
  private kz.sdu.project.stand.register_stand_impl.db.Db get_native_Db_24 () {
    {
      kz.sdu.project.stand.register_stand_impl.db.Db x = cachedValue_native_Db_24.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.stand.register_stand_impl.db.Db x = cachedValue_native_Db_24.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.stand.register_stand_impl.db.Db localValue = new kz.sdu.project.stand.register_stand_impl.db.Db();
        localValue.afterInject();
        cachedValue_native_Db_24.set(localValue);
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

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.project.controller.utils.Controller>> getter_ref_list_Controller_25 = this::get_ref_list_Controller_25;
  private java.util.List<kz.sdu.project.controller.utils.Controller> get_ref_list_Controller_25() {
    java.util.List<kz.sdu.project.controller.utils.Controller> list = new java.util.ArrayList<>();
    list.add(getter_native_AuthController_3.get());
    list.add(getter_native_CheckRegistartion_4.get());
    list.add(getter_native_EmailSendController_5.get());
    list.add(getter_native_ProductController_6.get());
    list.add(getter_native_SessionController_7.get());
    list.add(getter_native_UserRegistration_8.get());
    return list;
  }

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.project.stand.util.WebAppContextRegistration>> getter_ref_list_WebAppContextRegistration_26 = this::get_ref_list_WebAppContextRegistration_26;
  private java.util.List<kz.sdu.project.stand.util.WebAppContextRegistration> get_ref_list_WebAppContextRegistration_26() {
    java.util.List<kz.sdu.project.stand.util.WebAppContextRegistration> list = new java.util.ArrayList<>();
    list.add(getter_native_CrossOriginFilterRegistration_10.get());
    list.add(getter_native_JettyControllersRegistration_11.get());
    list.add(getter_native_PrintRequestParamsRegistration_12.get());
    list.add(getter_native_Utf8FilterRegistration_15.get());
    return list;
  }
  
  //
  // Getter creations
  //
}
