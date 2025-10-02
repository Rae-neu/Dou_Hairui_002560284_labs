/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Business;
import Business.Person.Person;

import java.util.ArrayList;

/**统一管理所有的EmployeeProfile
 * Directory 负责「装」Profile
 * @author kal bugrara
 */
public class EmployeeDirectory {

    Business business; //保存Business实例的引用，将目录与整个系统绑定起来。
    ArrayList<EmployeeProfile> employeelist; //存放所有员工（管理员）的档案对象。

    public EmployeeDirectory(Business d) {//构造方法接收一个Business d参数，因为管理员的行为往往需要对整个系统Business进行管理。

        business = d;
        employeelist = new ArrayList();

    }

    public EmployeeProfile newEmployeeProfile(Person p) {

        EmployeeProfile sp = new EmployeeProfile(p); //用传进来的Person创建一个新的EmployeeProfile。
        employeelist.add(sp); // 加入employeelist
        return sp; // 返回这个profile
    }

    public EmployeeProfile findEmployee(String id) {

        for (EmployeeProfile sp : employeelist) { //遍历employeelist

            if (sp.isMatch(id)) { //判断是否找到对应Person。
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
