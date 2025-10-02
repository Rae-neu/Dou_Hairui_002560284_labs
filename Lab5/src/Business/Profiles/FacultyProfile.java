/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;

/**
 *
 * @author Eve Dou
 */
public class FacultyProfile  extends Profile{//继承父类→自动拥有：person属性、getPerson()方法、isMatch()方法
    
    public FacultyProfile(Person p){
        super(p);
    }
    
    @Override 
        public String getRole(){ //getRole()不属于“继承后直接使用”的那类方法，它属于必须由子类来“实现（override）”的抽象方法。
        return "Faculty";
    }
        
        public boolean isMatch(String id){ //重复写了一遍父类逻辑，但严格来说没必要。
            return person.getPersonId().equals(id);
        }
        //子类里的方法会「覆盖」父类的同名方法，这叫**重写（override）**
        //如果没写@Override，编译器也会当它是覆盖，只不过不会帮助检查拼写错误。
}
