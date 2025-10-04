/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Profiles.Profile;

import java.util.ArrayList;

/**
 *账号的增（new）、查（find）、验证（authenticate）、列出（getAll）的完整闭环。
 *所有用户的账号，不分学生/教师/管理员，全放这里管理。
 * @author kal bugrara
 */
      public class UserAccountDirectory {
    
      ArrayList<UserAccount> useraccountlist ;//一个 ArrayList，用来存放系统中所有的UserAccount对象。
    
      
      public UserAccountDirectory (){
          
       useraccountlist = new ArrayList();//系统启动时，会自动new一个空的账号库，准备接收账号。

    }

    public UserAccount newUserAccount(Profile p, String un, String pw) {

        UserAccount ua = new UserAccount (p,  un,  pw);//绑定一个Profile、用户名和密码。
        useraccountlist.add(ua);//把这个账号存进账号库
        return ua;
    }

    public UserAccount findUserAccount(String id) {

        for (UserAccount ua : useraccountlist) {//遍历所有账号

            if (ua.isMatch(id)) {//看哪个账号的personId等于传入的id
                return ua;
            }
        }
            return null; //not found after going through the whole list
         }
    
    
     public UserAccount AuthenticateUser(String un, String pw) {//用户登录验证

        for (UserAccount ua : useraccountlist) {//遍历所有UserAccount

            if (ua.IsValidUser(un, pw)) {//用每个账号的IsValidUser(un, pw) 方法检查用户名和密码是否匹配。
                return ua;//找到匹配的账号 → 返回这个账号对象
            }
        }
            return null; //not found after going through the whole list
         }   
     
     
     public ArrayList<UserAccount> getUserAccountList()
     {
         return useraccountlist;
     }
}
