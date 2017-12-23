//first change to see the github im writing

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


//sksjdnxmaj





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vikas
 */
@ManagedBean
@SessionScoped
public class User {
private String name;
private String password;
private String output_msg;//only getter method

    public String getOutput_msg() {
        return output_msg;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String login(){
        
        if(name.equals("vikas") && password.equals("1234")){
            output_msg="username and password is correct";
        }
        else if(name.equals("") && password.equals("")){
        output_msg="enter username and password";
    }
        else
        output_msg="name and password is incorrect";
        
    return output_msg;
    }
    
    
}
