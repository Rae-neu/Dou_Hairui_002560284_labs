/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;

import java.util.ArrayList;

/**统一管理所有的StudentProfile
 * Directory 负责「装」Profile
 * 「集中存储和管理系统中所有 StudentProfile，对外提供统一的创建 & 查找接口」
 * @author kal bugrara
 */
    public class StudentDirectory {//成员变量
        
    ArrayList<StudentProfile> studentlist; //用来存储所有学生档案对象（StudentProfile）

    
    public StudentDirectory() {//构造方法

     studentlist = new ArrayList(); //创建一个空的ArrayList，方便后面往里放学生档案。

    }

    
    public StudentProfile newStudentProfile(Person p) { //根据传入的Person p，创建一个StudentProfile。

        StudentProfile sp = new StudentProfile(p);
        studentlist.add(sp);//把这份新档案放进studentlist。
        return sp; //返回这份档案对象，方便调用方继续操作。
    }

    public StudentProfile findStudent(String id) { //这是按照ID在学生目录中查找对应学生档案的方法。

        for (StudentProfile sp : studentlist) { //遍历整个studentlist。

            if (sp.isMatch(id)) { 
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
