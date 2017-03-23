package com.kayroc.dao;


import com.kayroc.util.Util;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserDAOImpl implements UserDAO {

    private static final  Map<String, UserDetails> USER_DETAILS;

    static {
        USER_DETAILS = Util.createDummyUserDetails();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails userDetails =  USER_DETAILS.get(username);

        if (userDetails == null) {
            throw new UsernameNotFoundException("User is not found for the username:" + username);
        }
        return USER_DETAILS.get(username);
    }
}
