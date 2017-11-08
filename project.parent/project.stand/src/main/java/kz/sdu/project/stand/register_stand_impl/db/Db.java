package kz.sdu.project.stand.register_stand_impl.db;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.HasAfterInject;
import kz.sdu.project.controller.model.SessionInfo;
import kz.sdu.project.stand.register_stand_impl.model.LinkStorageDTO;
import kz.sdu.project.stand.register_stand_impl.model.ProductDTO;
import kz.sdu.project.stand.register_stand_impl.model.UserDTO;
import kz.sdu.project.stand.util.StandCommonConstant;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Bean
public class Db implements HasAfterInject {
    Long local_id;

    public final Map<Long, ProductDTO> productStorage = new HashMap<>();
    public final Map<Long, UserDTO> userStorage = new HashMap<>();

    public Map<String, SessionInfo> sessionStorage = new HashMap<String, kz.sdu.project.controller.model.SessionInfo>();
    public Map<Long, String> genNumberStorage = new HashMap<>();
    public final Map<Long,LinkStorageDTO> linkStorage = new HashMap<>();
    public Map<String, StandCommonConstant> tmpConfig = new HashMap<>();

    public final AtomicLong productSeq = new AtomicLong(0);
    public final AtomicLong userSeq = new AtomicLong(0);

    @Override
    public void afterInject() throws Exception {
        prepareData();
    }

    private void prepareData() {
//        -----------------------users---------------------------------
        UserDTO user_1 = new UserDTO();
        user_1.role = "admin";
        user_1.firstName = "Zhambyl";
        user_1.lastName = "Samat";
        user_1.password = "admin";
        user_1.username = "z.s";
        local_id = (Long)userSeq.getAndIncrement();
        user_1.userId = local_id;
        user_1.registered = true;
        userStorage.put(local_id,user_1);

        UserDTO user_2 = new UserDTO();
        user_2.role = "user";
        user_2.firstName = "Nurbol";
        user_2.lastName = "Madenov";
        user_2.password = "123";
        user_2.username = "uu";
        local_id = (Long)userSeq.getAndIncrement();
        user_2.userId = local_id;
        user_2.registered = true;
        userStorage.put(local_id,user_2);
//------------------------------Products--------------------------------------
        ProductDTO product1 = new ProductDTO();
        product1.category = "computers";
        product1.phone = "+77074105268";
        product1.price = 300000d;
        product1.productName = "DELL Inspiron 15";
        product1.description = "Some descriptoin about DELL Inspiron 15";
        local_id = (Long) productSeq.getAndIncrement();
        productStorage.put(local_id, product1);

        ProductDTO product2 = new ProductDTO();
        product2.category = "computers";
        product2.phone = "+77074105268";
        product2.price = 300000d;
        product2.productName = "Lenovo";
        product2.description = "Some descriptoin about Lenovo";
        local_id = (Long) productSeq.getAndIncrement();
        productStorage.put(local_id, product2);

    }
}