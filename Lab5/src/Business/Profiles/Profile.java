/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;

/**是所有角色（Student/Admin/Faculty）的“共同蓝图”
 * 强制子类实现getRole()
 * 保存对应的Person信息
 * 提供基本匹配和查询能力
 *关系链：Person(人)→Profile(抽象类)→StudentProfile / EmployeeProfile / FacultyProfile（子类，具体实现）→UserAccount（账号，绑定 Profile）
 * @author kal bugrara
 */

/*abstract表示这是一个「不能直接 new 出来」的抽象类。
  它相当于定义了所有角色（Profile）必须具备的共同结构。
*/
public abstract class Profile {
    Person person;//绑定这个 Profile 对应的“人”。
    
     public Profile(Person p){//所有Profile必须绑定一个Person。
        person = p;
        
    }
   
     /* 这是抽象方法，没有方法体，必须由子类去实现。
        它的作用是：强制子类告诉系统「我是谁」。*/
     public abstract String getRole();
    
     
    //拿到绑定的Person对象。
    public Person getPerson(){
        return person;
    }
     
        //检查这个Profile是否属于指定Person。
        public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

}
