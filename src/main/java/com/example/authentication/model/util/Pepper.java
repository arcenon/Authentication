package com.example.authentication.model.util;

/**
 * @author Robert Kensen on 13-5-2021
 * @project Authentication
 */
public class Pepper {
    // TODO: Create vault system for storing secrets
    // https://dzone.com/articles/managing-secrets-with-vault
    // https://cheatsheetseries.owasp.org/cheatsheets/Password_Storage_Cheat_Sheet.html
    private final static String PEPPER = "NeverStorePepperInPlainText";

    public static String getPepper() {
        return PEPPER;
    }
}
