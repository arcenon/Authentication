package com.example.authentication.model.hashfactory;

import com.example.authentication.model.dto.HashProduct;

/**
 * @author Robert Kensen on 10-5-2021
 * @project Authentication
 */
public abstract class HashCreator {
    // TODO: https://dzone.com/articles/java-the-factory-pattern


    public HashProduct createHashProduct(String password, String pepper, String salt) {
        AlgorithmFactory algorithmFactory = getHashAlgorithm();
        return algorithmFactory.hash(password, pepper, salt);
    }

    public abstract AlgorithmFactory getHashAlgorithm();


}
