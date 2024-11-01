/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241030;

import java.util.function.Function;

/**
 *
 * @author Admin
 */

class User {
    String name;
    String email;
    String password;
    
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}

class Member {
    String name;
    String email;
    
    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Member [name=" + name + ", email=" + email + "]";
    }
}

public class Examle2 {
    public static void main(String[] args) {
        Function<User, Member> mapUserToMember = u -> new Member(u.name, u.email);
        User user = new User("Hieu", "nvh@gmail.com", "123456");
        Member member = mapUserToMember.apply(user);
        System.out.println(member);
    }
}
