/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;

/**代表这个人是管理员
 * Profile 负责「描述一个人是什么角色」
 * @author kal bugrara
 */
public class EmployeeProfile extends Profile {



    public EmployeeProfile(Person p) {//定义子类自己的构造方法，规定这个类在创建时必须要提供Person参数。
        
        super(p); //调用父类Profile的构造方法，让父类先完成父类部分的初始化（比如保存 person）。

    }
    
    @Override
    public String getRole(){
        return  "Admin";//返回"Admin"，用来标识当前Profile的角色类型。
    }

}