/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Eve Dou
 */
public class ProductCatalog {
    /*声明一个成员变量productCatalog，类型是ArrayList<Product>。
      ArrayList<Product>：列表里放的是Product类型的对象*/
    private ArrayList<Product>productCatalog;
    
    public ProductCatalog(){
    //初始化productCatalog，创建一个新的空列表，准备接受产品。
    productCatalog = new ArrayList<Product>();
}
    //提供一个getter方法，让外部可以读取产品列表。
   public ArrayList<Product> getProductCatalog(){
       return productCatalog;
   } 
   
   public Product addProduct(){
    /*创建一个新的产品对象p，把p放进product
   public Product addProduct(){
    /*创建一个新的产品对象p，把p放进prCatalog列表里。
      把p返回给调用者，方便外面继续对它设置属性。*/
        Product p = new Product();
        productCatalog.add(p);
        return p;
   }
   
   public void removeProduct(Product p){
       productCatalog.remove(p);
   }
   
   public Product searchProduct(int id){
    /*用增强for循环来遍历列表。
      每次循环，局部变量p表示当前正在检查的Product对象。
      如果局部变量p的ID等于传进来的id，就返回p。
      如果遍历完找不到，就返回null。
       */
       for(Product p : productCatalog){
           if(p.getId() == id){
               return p;
           }
       }
       return null;
   }
   
   public int getProudctCount(){
    /*productCatalog.size()是ArrayList自带的方法，返回列表长度。
      size()表示当前实际有几个元素，比如：数一数productCatalog这个货架上目前有几件商品。*/
       return productCatalog.size();
   }
}

