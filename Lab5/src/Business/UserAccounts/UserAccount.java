/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Profiles.Profile;
//依赖于 Profile类（抽象父类）来知道账号对应的是哪类用户（Student / Faculty / Admin）


/**
 *把 Profile（用户身份）和账号（用户名 + 密码）绑定在一起，从而支持后面的登录验证、权限判断、界面跳转。
 * @author kal bugrara
 */
public class UserAccount {
    
    Profile profile;//这个账号对应的用户身份（比如 StudentProfile、FacultyProfile）
    String username;
    String password;
    
    public UserAccount (Profile profile, String un, String pw){
         username = un;//绑定用户名
         password = pw;//绑定密码
         this.profile = profile;//绑定Profile

    }

    public String getPersonId(){
        return profile.getPerson().getPersonId();//从Profile→Person→PersonId取ID。
    }
    public String getUserLoginName(){
        return username;//返回用户名，主要在UI或调试时显示账号名称用。
    }

        public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;//判断当前这个UserAccount是否对应传入的Person ID。
        return false;
    }
        public boolean IsValidUser(String un, String pw){
        
            if (username.equalsIgnoreCase(un) && password.equals(pw)) return true;//登录按钮来验证用户名/密码是否匹配。
            else return false;
        
        }
        
        public String getRole(){//登录成功后判断是Admin/Student/Faculty。
            return profile.getRole();
        }
        
        public Profile getAssociatedPersonProfile(){//拿到Profile详细信息。
            return profile;
        }
        
    @Override
        public String toString(){
            
            return getUserLoginName();
        }
        
}

