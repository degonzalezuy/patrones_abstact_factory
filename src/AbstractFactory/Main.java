package AbstractFactory;

import AbstractFactory.impl.IServiceStackAbstractFactory;
import AbstractFactory.impl.ServiceStackAbstractFactory;
import AbstractFactory.service.IEmployeeService;
import AbstractFactory.service.IProductService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IServiceStackAbstractFactory factory = ServiceStackAbstractFactory.createServiceFactory();
        IEmployeeService employeeService = factory.getEmployeeService();
        IProductService productService = factory.getProductsService();

        System.out.println("EmployeeService class> "
            + employeeService.getClass().getCanonicalName());
        System.out.println("ProductService class >"
            + productService.getClass().getCanonicalName());

        System.out.println("getEmployee > "
            + Arrays.toString(employeeService.getEmployee()));

        System.out.println("getProduct > "
            + Arrays.toString(productService.getProducts()));
    }
}