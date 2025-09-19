/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Eve Dou
 */
//public 表示公共类，别的地方也可以使用它。
//class  告诉java"我要创建一个新的数据结构"。Address就是数据结构的名字。即“类”（class)，名字叫Address。
//类名的每个单词的首字母都大写，变量名第一个单词首字母小写后面单词首字母大写。
//String 表示数据的类型是字符串
public class Address {
   String streetName;
   String unitName;
   String city;
   String zipCode;
//上面几行是变量（variables)，在类里面也叫做字段（fields)或属性（attributes）。
//可以理解为在Address这个类里保存了一个完整地址的“几个小格子”。

//接下来用到的是方法（method)，用来访问和修改这些属性。
//下面这个是一个getter方法：
//①：名字是getStreetName,获取街道名字。get+StreetName来获取streetName这个属性，之所以S大写是因为小驼峰命名法（第一个单词小写，后面单词的首字母大写。）
//②return streetName是要把这个方法的结果交出去，“把对象内部的值交给调用方法的外部代码”。
//③这样别人就可以通过 变量名.getStreetName() 来得到这个街道名字。
    public String getStreetName() {
        return streetName;
    }

//下面的是一个setter方法，目的把传进来的值保存到类里面。
//void表示这个方法没有返回值，只需要执行这个方法，不需要把任何东西交给调用它的人。
//括号里的（String streetName）表示调用这个方法的时候，必须传进来一个字符串。
//左侧的this.streetName指的是类里面的属性，右侧streetName表示方法括号里传进来的参数。
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
   
   
}
