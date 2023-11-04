/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import Business.*;

/**
 *
 * @author deepakviswanadh
 */
public class GenerateSuppliers {
    public static SupplierDirectory generateData(){
         SupplierDirectory supplierDirectory = new SupplierDirectory();

        // Create the first supplier (Walmart)
        Supplier walmart = supplierDirectory.addSupplier();
        walmart.setSupplyName("Walmart");
        ProductCatalog walmartCatalog = walmart.getProductCatalog();

        // Add electronic products to Walmart's catalog
        Product laptop = walmartCatalog.addProduct();
        laptop.setId(1);
        laptop.setName("Laptop");
        laptop.setPrice(800);
        Feature feature1 = laptop.addNewFeature();
        feature1.setName("Processor");
        feature1.setValue("Intel Core i7");
        Feature feature2 = laptop.addNewFeature();
        feature2.setName("RAM");
        feature2.setValue("16GB");
        
        Product smartphone = walmartCatalog.addProduct();
        smartphone.setId(2);
        smartphone.setName("Smartphone");
        smartphone.setPrice(400);
        Feature feature3 = smartphone.addNewFeature();
        feature3.setName("Operating System");
        feature3.setValue("Android");
        Feature feature4 = smartphone.addNewFeature();
        feature4.setName("Screen Size");
        feature4.setValue("6 inches");

        // Create the second supplier (Best Buy)
        Supplier bestBuy = supplierDirectory.addSupplier();
        bestBuy.setSupplyName("Best Buy");
        ProductCatalog bestBuyCatalog = bestBuy.getProductCatalog();

        // Add electronic products to Best Buy's catalog
        Product TV = bestBuyCatalog.addProduct();
        TV.setId(3);
        TV.setName("Television");
        TV.setPrice(1000);
        Feature feature5 = TV.addNewFeature();
        feature5.setName("Screen Size");
        feature5.setValue("55 inches");
        Feature feature6 = TV.addNewFeature();
        feature6.setName("Resolution");
        feature6.setValue("4K Ultra HD");

        // Create the third supplier (Newegg)
        Supplier newEgg = supplierDirectory.addSupplier();
        newEgg.setSupplyName("Newegg");
        ProductCatalog newEggCatalog = newEgg.getProductCatalog();

        // Add electronic products to Newegg's catalog
        Product gamingLaptop = newEggCatalog.addProduct();
        gamingLaptop.setId(4);
        gamingLaptop.setName("Gaming Laptop");
        gamingLaptop.setPrice(1500);
        Feature feature7 = gamingLaptop.addNewFeature();
        feature7.setName("Graphics Card");
        feature7.setValue("NVIDIA GeForce RTX 3080");
        Feature feature8 = gamingLaptop.addNewFeature();
        feature8.setName("Display Refresh Rate");
        feature8.setValue("144Hz");
        
         return supplierDirectory;
    }
}
