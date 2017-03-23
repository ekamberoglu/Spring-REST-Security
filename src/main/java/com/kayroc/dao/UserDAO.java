package com.kayroc.dao;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDAO {

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}

