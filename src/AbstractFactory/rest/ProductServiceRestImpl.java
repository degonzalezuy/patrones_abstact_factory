package AbstractFactory.rest;

import AbstractFactory.service.IProductService;

public class ProductServiceRestImpl implements IProductService {
    private static final String[] PRODUCTS = new String[]{"Teclado","Mouse","Monitor"};
    @Override
    public String[] getProducts() {
        System.out.println("RestFul");
        return PRODUCTS;
    }
}
