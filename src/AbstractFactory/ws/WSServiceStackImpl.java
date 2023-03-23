package AbstractFactory.ws;

import AbstractFactory.impl.IServiceStackAbstractFactory;
import AbstractFactory.service.IEmployeeService;
import AbstractFactory.service.IProductService;

public class WSServiceStackImpl implements IServiceStackAbstractFactory {
    @Override
    public IEmployeeService getEmployeeService() {
        return new EmployeeServiceWSImpl();
    }

    @Override
    public IProductService getProductsService() {
        return new ProductServiceWSImpl();
    }
}
