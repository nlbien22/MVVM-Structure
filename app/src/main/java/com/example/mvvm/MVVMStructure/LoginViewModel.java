package com.example.mvvm.MVVMStructure;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

import com.example.mvvm.BR;

public class LoginViewModel extends BaseObservable {

    private String email;
    private String passwords;
    public ObservableField<String> messageLogin = new ObservableField<>();
    public ObservableField<Boolean> isShowMessage = new ObservableField<>();
    public ObservableField<Boolean> isSuccess = new ObservableField<>();

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }
    @Bindable
    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
        notifyPropertyChanged(BR.passwords);
    }

    public void onClickLogin(){
        User user = new User(getEmail(), getPasswords());
        isShowMessage.set(true);
        if( user.isValidEmail() && user.isValidPasswords()){
            isSuccess.set(true);
            messageLogin.set("Login Success!");
        }else{
            isSuccess.set(false);
            messageLogin.set("Email or Passwords Invalid!!");
        }
    }


}
