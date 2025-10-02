/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;

/**代表这个人是学生
 * Profile 负责「描述一个人是什么角色」
 * @author kal bugrara
 */

    //StudentProfile（是Profile的子类）表示：一个Person拥有学生这个角色。
    public class StudentProfile extends Profile {
    Person person;/*这里重新声明了一个Person person，但其实它已经在父类Profile里有了一个person字段。
    这行其实有点重复，真正用的person是父类Profile的那个。
    */
//    Transcript transcript;
    //   EmploymentHistroy employmenthistory;

    public StudentProfile(Person p) {
        super(p); 
    /*super是一个关键字，用来访问父类构造、属性或方法。
      super() 用在子类构造方法，必须在第一行，调用父类构造。
      super.xxx，访问父类的属性或方法。
        
        */

//        transcript = new Transcript(this);
//        employmenthistory = new EmploymentHistroy();
    }

    @Override
    public String getRole() {//这是Profile类要求子类必须实现的抽象方法。
        return "Student";//告诉系统「这个Profile是学生身份」，登录时会用profile.getRole()判断该用户属于哪个角色。
    }

    public boolean isMatch(String id) { //判断这个Profile里的Person是否匹配传入的id。
        return person.getPersonId().equals(id);
    }

}
