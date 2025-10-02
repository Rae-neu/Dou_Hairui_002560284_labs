/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;//因为等会儿要用到Person参数创建FacultyProfile。
import java.util.ArrayList;

/**
 *
 * @author Eve Dou
 */
    public class FacultyDirectory {
    ArrayList<FacultyProfile>facultylist;//一个列表，存放系统里所有教师的Profile。作用：集中保存，后面好新增、查找、遍历。
    
    public FacultyDirectory(){
      facultylist = new ArrayList();//创建一个空的“档案柜”，准备开始往里放教师档案。
    }
    
    public FacultyProfile newFacultyProfile(Person p){//新建并登记一个教师档案。
        FacultyProfile fp = new FacultyProfile(p);//为这个人生成一份“教师身份档案”。
        facultylist.add(fp);//把这份档案放进“教师档案柜”。
        return fp;//把新档案返回给调用者。
    }
    
    public FacultyProfile findFaculty(String id){//按ID查找教师档案。
        for(FacultyProfile fp : facultylist){//遍历facultylist。
            if(fp.isMatch(id)){//isMatch(id)来自Profile（父类）：本质就是比较 fp.getPerson().getPersonId().equals(id)。
            return fp;
        }
     }
        return null;
    }
}
