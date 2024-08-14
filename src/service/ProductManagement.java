package service;

import model.*;

import java.util.List;

public interface ProductManagement {
    void addProduct(String productName, double price, boolean hasStock, ProductType type, ProductCategory category);

    List<Product> list();

    List<Product> listByCategory(String categoryName);

    List<Product> listByType(String typeName);
}
