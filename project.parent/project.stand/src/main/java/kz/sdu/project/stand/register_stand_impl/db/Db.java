package kz.sdu.project.stand.register_stand_impl.db;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.HasAfterInject;
import kz.sdu.project.stand.register_stand_impl.model.ProductDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Bean
public class Db implements HasAfterInject {
    Long local_id;

    public final Map<Long, ProductDTO> productStorage = new HashMap<>();

    public final AtomicLong productSeq = new AtomicLong(0);

    @Override
    public void afterInject() throws Exception {
        prepareData();
    }

    private void prepareData() {
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