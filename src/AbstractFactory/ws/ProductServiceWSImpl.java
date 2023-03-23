package AbstractFactory.ws;

import AbstractFactory.service.IProductService;

public class ProductServiceWSImpl implements IProductService {
 private static final String[] PRODUCTS = new String[]{"Refresco", "Jugo", "Fruta"};

    @Override
    public String[] getProducts() {
        System.out.println("WebServices");
        return PRODUCTS;
    }
}
