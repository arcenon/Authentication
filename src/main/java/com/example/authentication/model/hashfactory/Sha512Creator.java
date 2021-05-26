package com.example.authentication.model.hashfactory;

import com.example.authentication.model.dto.HashProduct;

/**
 * @author Robert Kensen on 10-5-2021
 * @project Authentication
 * https://docs.oracle.com/javase/8/docs/technotes/guides/security/crypto/CryptoSpec.html#MDEx
 */
public class Sha512Creator extends HashCreator {

    @Override
    public AlgorithmFactory getHashAlgorithm() {
        return new Sha512Algorithm();
    }
}
