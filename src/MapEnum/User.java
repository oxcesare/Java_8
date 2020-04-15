/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapEnum;

import java.lang.reflect.Method;

/**
 *
 * @author Supaada-q214
 */
public class User {

    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail(User user) throws Exception {
        Method emailGetter = User.class.getMethod("getEmail");
        String result = (String) emailGetter.invoke(user);
        return result;
    }

    public static void main(String[] args) {
        User user = new User();
        System.out.println("" + user.getEmail());
    }
}
