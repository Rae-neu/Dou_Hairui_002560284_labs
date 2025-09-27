/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.ImageIcon;

/**
 *
 * @author Eve Dou
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
 
    
    public Supplier(){
    /*创建一个新的ProductCatalog对象，赋给productCatalog成员变量。
      即每个供应商一出世就自动带了一个自己的空产品目录*/
        productCatalog = new ProductCatalog();
    }

    //用于获取和修改供应商名字。
    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    //没有setter方法，因为只是希望外部通过这个目录来【增删查】产品，并不希望直接替换掉整个产品目录。
    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }
    
    @Override
    public String toString(){
        return supplyName;
    }
    
}