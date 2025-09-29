/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.swing.ImageIcon;

/**
 *
 * @author EveDou
 */
public class Supplier {
    //三行成员变量，供应商名字、Logo图和产品目录。
    private String supplyName;
    private ProductCatalog productCatalog;
    private ImageIcon logoImage;
    
    //用于访问或修改供应商的logo图片。
    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    
    public Supplier() {
        productCatalog = new ProductCatalog();
    }
    //用于获取和修改供应商名字。
    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }
   
    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }
    
    
    @Override
    public String toString() {
        return supplyName;
    }
    
}
