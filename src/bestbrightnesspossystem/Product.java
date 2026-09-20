/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bestbrightnesspossystem;

/**
 *
 * @author LENOVO
 */
public class Product {
private int productID;
private String productName;
private double price;
private int quantity;

public Product(int productID, String productName, double price, int quantity){
this.productID = productID;
this.productName = productName;
this.price = price;
this.quantity = quantity;
}
public int getProductID(){
return productID;
}
public String getProductName(){
return productName;
}
public double getprice(){
return price;
}
public int getQuantity(){
return quantity;
} 
public void setProductId(int productID){
this.productID = productID;
}
public void setProductName(String productName){
this.productName = productName;
}
public void setPrice(double price){
this.price = price;
}
public void setProductQuantity(int quantity){
this.quantity = quantity;
}
}
