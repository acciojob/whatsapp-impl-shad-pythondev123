package com.driver;

import java.util.Objects;

public class User {
    private String name;
    private String mobile;

    public User(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }



    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }
    @Override
    public boolean equals(object o){
        if(this== o) return true;
        if(!(o instanceof User)) return false;
        User user= (User) o;
        return Objects.equals(getName(), user.getName()) && Objects.equals(getMobile(), user.getMobile());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getMobile());
    }
}
