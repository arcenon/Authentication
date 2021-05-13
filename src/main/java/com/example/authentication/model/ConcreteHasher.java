package com.example.authentication.model;

import com.example.authentication.model.dto.Hash;

/**
 * @author Robert Kensen on 10-5-2021
 * @project Authentication
 */
public abstract class ConcreteHasher implements HashFactory {
    protected Hash hash;

    @Override
    public Hash hash(String password) {
        return null;
    }
// TODO: https://dzone.com/articles/java-the-factory-pattern

}
