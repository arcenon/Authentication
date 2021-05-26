package com.example.authentication.model.hashfactory;

import com.example.authentication.model.dto.HashProduct;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * @author Robert Kensen on 26-5-2021
 * @project Authentication
 */
class Sha512AlgorithmTest {
    private final String GIVEN_PEPPER = "TestUsingPepperString";
    private Sha512Algorithm sha512Algorithm;

    @BeforeEach
    void setUp() {
        sha512Algorithm = new Sha512Algorithm();
    }

    @Test
    void test_sha512_algorithm_returns_valid_hash_1() {
        String givenPassword = "testPassword1";
        String givenSalt = "O04^1Sdq";

        HashProduct whenHashed = sha512Algorithm.hash(givenPassword, GIVEN_PEPPER, givenSalt);

        String thenHashShouldBe = "a2f79683471720e295f87a22121c8fe47ff5a8c85fb27c4dd9a63289f92" +
                "9df20235640c975a4f6cb3c764860e97746012cfe6a92202a8f077f1f0d8450321e2c";

        assertThat(thenHashShouldBe).isIn(whenHashed.hashedPassword);
    }

    @Test
    void test_sha512_algorithm_returns_valid_hash_2() {
        String givenPassword = "nextTestPassword";
        String givenSalt = "hF74I!k%";

        HashProduct whenHashed = sha512Algorithm.hash(givenPassword, GIVEN_PEPPER, givenSalt);

        String thenHashShouldBe = "0c96561635e37ebe465f99f412521fcb79ec0e118382eaf0c252d1ce0eef" +
                "e82968c9835ff9c4cd307daa0e086a3a5689e006e562093ff85b808fdfb872f65a6b";

        assertThat(thenHashShouldBe).isIn(whenHashed.hashedPassword);
    }
}