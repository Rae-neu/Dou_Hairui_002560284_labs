/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *新建一个Person并保存→按照ID查找人员。
 * @author kal bugrara
 */
      public class PersonDirectory {
    
      ArrayList<Person> personlist ;//这是一个动态数组（ArrayList），用来存放系统中的所有Person对象。
    
     
      
      public PersonDirectory (){//【构造方法】的名字必须和类名完全一致，没有返回值（连void都不写），它会在我new一个对象的时候自动执行。
          
       personlist = new ArrayList();

    }
      
      
      
    public Person newPerson(String id) {

        Person p = new Person(id); //创建一个新的Person对象。
        personlist.add(p); //把这个Person加入人员名单。
        return p; //把这个新建的人返回，方便接下来创建Profile。
    }

    
    
    public Person findPerson(String id) {

        for (Person p : personlist) { //遍历personlist

            if (p.isMatch(id)) { //调用p.isMatch(id)比对id
                return p; //找到就返回对应的Person
            }
        }
            return null; //not found after going through the whole list
         }
    
}
