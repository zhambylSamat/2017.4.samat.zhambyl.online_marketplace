package kz.sdu.project.controller.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.Par;
import kz.greetgo.mvc.annotations.ToJson;
import kz.sdu.project.controller.model.ProductInfo;
import kz.sdu.project.controller.model.ProductListDetails;
import kz.sdu.project.controller.register.ProductRegister;
import kz.sdu.project.controller.utils.Controller;

@Bean
@Mapping("/shop")
public class ProductController implements Controller {
    public BeanGetter<ProductRegister> productRegister;

    @ToJson
    @Mapping("/list")
    public ProductListDetails getList() {
        return productRegister.get().getProductListDetails();
    }

    @ToJson
    @Mapping("/add")
    public ProductListDetails add(@Par("category") String category,
                                  @Par("productName") String productName,
                                  @Par("price") String price,
                                  @Par("phone") String phone,
                                  @Par("description") String description){
        return productRegister.get().setProductListDetails(null, category, productName, Double.parseDouble(price), phone,description);
    }

    @ToJson
    @Mapping("/update")
    public ProductListDetails update(@Par("id") Long id,
                                    @Par("category") String category,
                                    @Par("productName") String productName,
                                    @Par("price") String price,
                                    @Par("phone") String phone,
                                    @Par("description") String description){
        return productRegister.get().setProductListDetails(id, category, productName, Double.parseDouble(price), phone,description);
    }

    @ToJson
    @Mapping("/delete")
    public ProductListDetails delete(@Par("id") Long id){
        return productRegister.get().removeProductListDetails(id);
    }
}
