package com.example.mvvm.MVVMStructure;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;

public class User {

    private String email;
    private String passwords;

    public User(String email, String passwords) {
        this.email = email;
        this.passwords = passwords;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public boolean isValidEmail(){
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public boolean isValidPasswords(){
        return !TextUtils.isEmpty(passwords) && passwords.length() >= 6;
    }
}
