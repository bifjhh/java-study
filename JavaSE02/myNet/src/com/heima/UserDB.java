package com.heima;

import java.util.ArrayList;
import java.util.List;

public class UserDB {
    private static List<User> users = new ArrayList<User>(  );

    static {
        users.add( new User( "bifjhh", "123" ) );
        users.add( new User( "xiaoming", "123" ) );
        users.add( new User( "xiaohong", "123" ) );
        users.add( new User( "xiaobai", "123" ) );
    }

    public static List<User> getUsers() {
        return users;
    }
}
