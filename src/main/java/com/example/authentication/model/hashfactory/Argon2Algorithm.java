package com.example.authentication.model.hashfactory;

import com.example.authentication.model.dto.HashProduct;

/**
 * @author Robert Kensen on 13-5-2021
 * @project Authentication
 */
public class Argon2Algorithm implements AlgorithmFactory {

    @Override
    public HashProduct hash(String password, String pepper, String salt) {
        return null;
    }
}
