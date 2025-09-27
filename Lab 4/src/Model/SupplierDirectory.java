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
public class SupplierDirectory {
    //成员变量supplierList，类型是ArrayList<Suppplier>，用来存放多个Supplier对象。
    private ArrayList<Supplier>supplierList;
    
    public SupplierDirectory(){
    //在 new SupplierDirectory()时，自动创建一个空的supplierList列表。
        supplierList = new ArrayList<Supplier>();
    }

    //Getter方法，返回整个supplierList。
    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }
    
    public Supplier addSupplier(){
    /*创建一个新的空供应商对象s，把s加入到supplierList。
    返回这个对象s，调用者可以继续设置供应商信息。*/
        Supplier s = new Supplier();
        supplierList.add(s);
        return s;
    }
    
    public void removeSupplier(Supplier s){
    //remove方法必须有参数：传入要删除的Supplier对象s，从列表中移除它。
        supplierList.remove(s);
    }
    
    
    public Supplier searchSupplier(String keyWord){
    /*使用增强for循环遍历整个supplierList。
     每次循环，局部变量s（类型为Supplier）代表当前正在检查的供应商对象。
     如果找到s的supplyName和传入的keyword完全相同，就返回这个s。
     如果遍历结束没有找到，返回null。
        */
        for(Supplier s : supplierList){
            if(keyWord.equals(s.getSupplyName())){
                return s;
            }
                
         }
              
          return null;
    }
    
    
}
