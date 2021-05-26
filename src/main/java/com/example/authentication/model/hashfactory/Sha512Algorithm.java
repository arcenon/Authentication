package com.example.authentication.model.hashfactory;

import com.example.authentication.model.dto.HashProduct;
import com.example.authentication.model.util.ByteArrayToHexHelper;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Robert Kensen on 13-5-2021
 * @project Authentication
 */
public class Sha512Algorithm implements AlgorithmFactory {
    private final String HASHING_ALGORITHM = "SHA-512";
    private final HashProduct hashProduct;

    public Sha512Algorithm() {
        this.hashProduct = new HashProduct();
    }

    @Override
    public HashProduct hash(String password, String pepper, String salt) {
        hashProduct.usedAlgorithm = HASHING_ALGORITHM;
        hashProduct.randomSalt = salt;
        MessageDigest message = buildMessage(password, pepper);
        hashProduct.hashedPassword = digestMessage(message);
        return hashProduct;
    }

    private MessageDigest buildMessage(String password, String pepper) {
        try {
            MessageDigest md = MessageDigest.getInstance(HASHING_ALGORITHM);
            md.update(password.getBytes(StandardCharsets.UTF_8));
            md.update(pepper.getBytes(StandardCharsets.UTF_8));
            md.update(hashProduct.randomSalt.getBytes(StandardCharsets.UTF_8));
            return md;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new RuntimeException("Cannot compile MessageDigest" +
                    ", Hashing algorithm invalid.");
        }
    }

    private String digestMessage(MessageDigest message) {
        byte[] digest = message.digest();
        return ByteArrayToHexHelper.encodeHexString(digest);
    }
}
