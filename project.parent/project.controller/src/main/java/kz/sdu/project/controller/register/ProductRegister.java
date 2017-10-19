package kz.sdu.project.controller.register;

import kz.sdu.project.controller.model.ProductListDetails;

public interface ProductRegister {
    ProductListDetails getProductListDetails();

    ProductListDetails setProductListDetails(Long id, String category, String productName, Double price, String phone, String description);

    ProductListDetails removeProductListDetails(Long id);
}
