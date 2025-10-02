/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 * 关系链：Person → Profile（Student/Admin/Faculty）→ UserAccount
 * @author kal bugrara
 */
public class Person {

    String id;//用来标识人的「唯一标识符」。

    public Person(String id) {

        this.id = id;//创建一个Person对象时必须传入id。
    }

    public String getPersonId() {//Getter方法，返回这个人的ID。
        return id;
    }

    public boolean isMatch(String id) {//判断给定的id是否与这个人的id匹配。
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getPersonId();
    }
}
