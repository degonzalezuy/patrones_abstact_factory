package AbstractFactory.impl;

import AbstractFactory.service.IEmployeeService;
import AbstractFactory.service.IProductService;

public interface IServiceStackAbstractFactory {
    public IEmployeeService getEmployeeService();
    public IProductService getProductsService();
}
