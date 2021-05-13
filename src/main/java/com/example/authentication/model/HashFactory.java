package com.example.authentication.model;

import com.example.authentication.model.dto.Hash;

/**
 * @author Robert Kensen on 10-5-2021
 * @project Authentication
 */
public interface HashFactory {

    public abstract Hash hash(String password);
}
