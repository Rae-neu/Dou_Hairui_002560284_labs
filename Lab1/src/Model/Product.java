/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Eve Dou
 */
//前四个属性是字符串，后面两个属性是对象。
//类里不仅可以存文字/数字，还可以存另一个类。
public class Product {
    String name;
    String description;
    String availNum;
    String price;
    Address manufactureAddress;
//↑这行代码表示：每一个Product对象都有一个生产地址manufactureAddress，而这个生产地址本身是一个Address类的对象。
    Address shippingAddress;
//因为产品具有“地址”属性，“地址”本身是一个独立的类，所以用组合的形式包含进来。
//好处：①Address可以被多个类使用。 ②结构清晰，Product负责产品，Address负责地址。③更改地址信息，只需要改Address类。
            
//构造方法的作用：在创建对象的时候自动执行，用来给对象做初始化。
//构造方法什么时候执行？：在写 Product p = new Product();时。
//左侧Product是类名，p是变量名。
//new的意思是创建新的对象，Product()指调用Product类的构造方法，生成一个新的产品对象。
    public Product(){
    manufactureAddress = new Address();
    shippingAddress = new Address();
    }
//根据Address类创建新的地址对象，把分别创建的地址对象放进manufactureAddress、shippingAddress里。

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailNum() {
        return availNum;
    }

    public void setAvailNum(String availNum) {
        this.availNum = availNum;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    //getManufactureAddress是方法名，表示“获取生产地址”。
    //返回值：Address意味着这个方法会“返回一个Address类型的对象”。
    //方法体：return manufactureAddress;是把manufactureAddress这个变量返回出去。
    public Address getManufactureAddress() {
        return manufactureAddress;
    }

    public void setManufactureAddress(Address manufactureAddress) {
        this.manufactureAddress = manufactureAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
    
   