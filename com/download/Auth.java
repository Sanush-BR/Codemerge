package com.download;
import java.net.*;


public class Auth extends Authenticator{
    protected PasswordAuthentication getPasswordAuthentication(){
        
        String username = "prakashshivaji.gaikwad";
        String password = "Prakash#4u";

        return new PasswordAuthentication(username,password.toCharArray());
    }
}
