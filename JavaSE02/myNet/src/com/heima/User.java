package com.heima;

import java.util.Objects;

public class User {
    private String name;
    private String pwd;

    public User() {
        super();
    }
    public User(String name, String pwd) {
        super();
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals( name, user.name ) &&
                Objects.equals( pwd, user.pwd );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
