package com.niit.DAO;

import java.util.List;

import proj.niit.model.product;

public interface productDAO {

public boolean addProduct(product product);
public boolean deleteProduct(product product);
public boolean updateProduct(product product);
public List<product> listProducts();
public product getProduct();

}
