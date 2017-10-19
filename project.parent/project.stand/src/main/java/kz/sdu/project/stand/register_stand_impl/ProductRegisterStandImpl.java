package kz.sdu.project.stand.register_stand_impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.sdu.project.controller.model.ProductInfo;
import kz.sdu.project.controller.model.ProductListDetails;
import kz.sdu.project.controller.register.ProductRegister;
import kz.sdu.project.stand.register_stand_impl.db.Db;
import kz.sdu.project.stand.register_stand_impl.model.ProductDTO;

@Bean
public class ProductRegisterStandImpl implements ProductRegister {

    public BeanGetter<Db> db;
    private Long local_id;

    @Override
    public ProductListDetails getProductListDetails() {
        ProductListDetails ret = new ProductListDetails();

        db.get().productStorage.values().forEach(val->{
            ProductInfo tmpVal = new ProductInfo();
            tmpVal.description = val.description;
            tmpVal.productName = val.productName;
            tmpVal.price = val.price;
            tmpVal.category = val.category;
            tmpVal.phone = val.phone;
            ret.productInfoList.add(tmpVal);
        });

        return ret;
    }

    @Override
    public ProductListDetails setProductListDetails(Long id, String category, String productName, Double price, String phone, String description) {
        ProductDTO tmpVal = new ProductDTO();
        local_id = (id == null) ? (Long) db.get().productSeq.getAndIncrement() : id;
        tmpVal.category = category;
        tmpVal.productName = productName;
        tmpVal.price = price;
        tmpVal.phone = phone;
        tmpVal.description = description;
        db.get().productStorage.put(local_id, tmpVal);
        return getProductListDetails();
    }

    @Override
    public ProductListDetails removeProductListDetails(Long id) {
        db.get().productStorage.remove(id);
        return getProductListDetails();
    }
}
