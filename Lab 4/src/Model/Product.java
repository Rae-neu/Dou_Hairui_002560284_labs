/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Eve Dou
 */
public class Product {
    private String name;
    private int price;
    private int id;
    /*创建一个私有的、【静态的】且是整数类型的名为count的变量，初始化为0。
      【静态的】意味着count这个变量存在于Product整个类本身，而不是某一个具体的对象，所有Product对象共享这一个count。*/
    private static int count = 0;
    
    /*每创建一个新产品，count就+1，然后把这个新count赋值给这个产品的id。
      ++是自增运算符，count++等价于count = count+1。*/
    public Product(){
        count++;
        id = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    //没有setId()，因为ID是自动分配的，不希望被外部修改。
    
    
    /*String是返回值类型，这个方法执行完以后，会返回一个字符串类型的数据。
      toString是方法名表示这是把对象转换成字符串的方法
      @Override表示正在重写父类的**方法*/
    @Override
    public String toString(){
        return name;
    }
}
