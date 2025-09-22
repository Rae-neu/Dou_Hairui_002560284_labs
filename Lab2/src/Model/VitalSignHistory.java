/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

//ArrayList是Java提供的动态数组类。有了它就可以存放一堆VitalSign对象（类似一个“清单”）。
import java.util.ArrayList;

/**
 *
 * @author Eve Dou
 */
//这里定义了一个类VitalSignHistory。
//VitalSignHistory 是自己写的类，它专门用来管理病人体征的历史记录。它里面有一个成员变量：history，类型就是 ArrayList<VitalSign>。
//history是VitalSignHistory这个类里面的成员变量。
public class VitalSignHistory {
//alt+enter - import
    
    //history → 变量名（就是这个列表的名字）。history 只是一个变量，它的数据类型是 ArrayList<VitalSign>
    //ArrayList<VitalSign> → 类型（一个 Java 提供的“动态数组/列表”类，专门用来存放很多个 VitalSign 对象）
    //ArrayList 是 Java 自带的类，通用的，可以存任何东西，比如 ArrayList<String>、ArrayList<Integer>。
    //相当于一个列表，每一项都是一个病人的体征（VitalSign）。
    ArrayList<VitalSign>history;
    //VitalSignHistory 类里 包含了 一个 ArrayList<VitalSign> 变量（叫 history）。
    //history 负责真正保存数据，而 VitalSignHistory 负责对这些数据进行管理（比如新增、删除）。
    
    
    //类名在表象上和构造方法一样，但是类名是来告诉对象长什么样，构造方法是真的要去造一个对象。
    //构造方法在调用时一定会带（）
    //VitalSignHistory()是一个构造方法。
    //构造方法的作用:当你 new VitalSignHistory()时，系统会自动执行里面的内容。
    //history 是 VitalSignHistory 类的成员变量。history 的 数据类型是 ArrayList<VitalSign>
    //this.history = new ArrayList<>()，创建一个新的、空的ArrayList，用来存放体征。
    public VitalSignHistory(){
        this.history = new ArrayList<>();
    }


// alt+ins
    // getHistory();是一个getter方法，用来把history里面的内容拿出来。
    // ArrayList<VitalSign>说明这个方法返回的是一个装着VitalSign的ArrayList。
    // return history; → 把这个成员变量的引用返回出去。
    //history是一个ArrayList<VitalSign>，里面存的就是一条一条VitalSign。
    public ArrayList<VitalSign> getHistory() {
        return history;
    }
    //VitalSignHistory = 一个病历夹
    //history = 病历夹里面的文件夹（专门装很多张体征记录单）
    //ArrayList<VitalSign> = 文件夹本身，它可以装很多张 VitalSign（体征单）
    //getHistory() = 把文件夹拿出来给你

    
    //返回类型是 void，表示这个方法不需要返回任何东西。
    //setHistory(...)是方法名，setXXX() 表示“设置某个属性”。
    //ArrayList<VitalSign> history是方法参数，用这个方法时，需要传进来一个 ArrayList<VitalSign> 对象。
    //this. 表示“这个对象自己的成员变量”。所以 this.history 就是 VitalSignHistory 类里的那个成员变量。
    //右边的 history是方法参数，也叫局部变量。它是外部传进来的一个 ArrayList<VitalSign>。
    public void setHistory(ArrayList<VitalSign> history) {
        this.history = history;
    }
    //这个方法的作用就是：把别人传进来的 ArrayList<VitalSign> 赋值给当前对象的 history 成员变量。
    
    //public VitalSign addNewVital(){↓
    //VitalSign是返回类型，表示这个方法结束时会交出去一个VitalSign对象。
    //addNewVital是方法名，新增加一条体征的意思。
    //()是参数列表，这里是空的，说明调用它时不需要传入参数。
    //{...}是方法体，大括号之间是方法真正执行的代码。
    
    //在VitalSign a = new VitalSign();里，↓
    //左侧的VitalSign是变量类型（局部变量要放什么类型的值）
    //a是变量名，我给这条新体征起的临时的名字。
    //=是赋值，把右边创建出来的对象存到左边的变量里。
    //new在内存里创建新对象。
    //VitalSign()，构造方法调用。用VitalSign类的构造器创建对象（这里用的是无参构造器）。
    //这行的作用是在内存中新建了一条空白的体征记录，临时名字叫a。
    
    //history.add(a);
    //history是本类VitalSignHistory的成员变量，类型是ArrayList<VitalSign>。
    //.点号表示对这个对象调用它的方法或者访问它的成员。
    //add是Arraylist的方法名，意思“把一个元素加进来”。
    //(a)是实参，要加进去的那个元素，就是刚创建的a。
    //这行的作用是把新体征a放进history这个列表保存起来。
    
    //return a;
    //return返回，把某个值交给方法的调用者，同时结束这个方法。
    //a是要返回的对象，就是刚创建并加入列表的记录。
    //这行的作用是把刚加入列表的那条体征记录交回去，方便调用方继续给它填数据（比如设置日期、体温等）。
    public VitalSign addNewVital(){
        VitalSign a = new VitalSign();
        history.add(a);
        return a;
    }
    
    //方法名用小驼峰命名法，一般是动词+名词，清楚表达做了什么事。
    //deleteVitalSign:方法名，“删除一条体征”的意思。
    //（VitalSign vs）是参数列表，调用时必须传入一条要删除的体征对象。VitalSign是参数类型，vs是参数的名字。
    //history是那条体征列表ArrayList<>
    //.调用方法
    //remove：ArrayList的删除方法。
    //(vs)要删除的就是这个参数vs。
    //这行的作用：在history这个列表里面找到这条体征vs并把它移除。
    public void deleteVitalSign(VitalSign vs){
     history.remove(vs); 
    }
}