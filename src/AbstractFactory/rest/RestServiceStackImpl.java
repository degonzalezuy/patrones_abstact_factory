package AbstractFactory.rest;

import AbstractFactory.impl.IServiceStackAbstractFactory;
import AbstractFactory.service.IEmployeeService;
import AbstractFactory.service.IProductService;

public class RestServiceStackImpl implements IServiceStackAbstractFactory {

    @Override
    public IEmployeeService getEmployeeService() {
        return new EmployeeServiceRestImpl();
    }

    @Override
    public IProductService getProductsService() {
        return new ProductServiceRestImpl();
    }
}
