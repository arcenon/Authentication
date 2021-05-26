package com.example.authentication.model;

import com.example.authentication.model.dto.HashProduct;
import com.example.authentication.model.hashfactory.HashCreator;
import com.example.authentication.model.util.Pepper;
import com.example.authentication.model.util.SaltGenerator;

/**
 * @author Robert Kensen on 26-5-2021
 * @project Authentication
 */
public class HashService {
    private final String password;
    private final String pepper;
    private final String salt;
    private final HashCreator hashingAlgorithm;

    // Constructor meant for login purposes
    public HashService(String password, String pepper, String salt, HashCreator hashingAlgorithm) {
        this.password = password;
        this.pepper = pepper;
        this.salt = salt;
        this.hashingAlgorithm = hashingAlgorithm;
    }

    // Constructor meant for registration purposes
    public HashService(String password, HashCreator hashingAlgorithm) {
        this(password, Pepper.getPepper(), SaltGenerator.getRandomSalt(), hashingAlgorithm);
    }

    public HashProduct hashCredentials() {
        return hashingAlgorithm.createHashProduct(this.password, this.pepper, this.salt);
    }
}
