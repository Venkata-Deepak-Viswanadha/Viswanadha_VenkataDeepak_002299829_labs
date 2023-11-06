/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import java.util.*;
import javax.swing.ImageIcon;

/**
 *
 * @author deepakviswanadha
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ImageIcon logoImage=null;

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    

    public void setId(int id) {
        this.id = id;
    }
    private List<Feature> features= new ArrayList<>();

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public Feature addNewFeature(){
        Feature newFeat = new Feature();
        features.add(newFeat);
        return newFeat;
    }
    
    public List<Feature> getFeatures() {
        return features;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
