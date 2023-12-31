/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author deepakviswanadh
 */
public class OrderItem {
    Product product;
    double salesprices;
    int quantity;

    public OrderItem(Product product, double salesprices, int quantity) {
        this.product = product;
        this.salesprices = salesprices;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getSalesprices() {
        return salesprices;
    }

    public void setSalesprices(double salesprices) {
        this.salesprices = salesprices;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString(){
        return this.product.toString();
    }
}
