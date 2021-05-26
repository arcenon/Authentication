package com.example.authentication.model.hashfactory;

import com.example.authentication.model.dto.HashProduct;

/**
 * @author Robert Kensen on 10-5-2021
 * @project Authentication
 */
public interface AlgorithmFactory {

    HashProduct hash(String password, String pepper, String salt);
}
