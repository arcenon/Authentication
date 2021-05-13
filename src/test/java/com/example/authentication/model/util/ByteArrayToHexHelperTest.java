package com.example.authentication.model.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * @author Robert Kensen on 12-5-2021
 * @project Authentication
 */
class ByteArrayToHexHelperTest {

    @Test
    void test_byte_array_returns_hexadecimal() {
        byte[] byteArray1 = {2, 4, 8, 15};
        byte[] byteArray2 = {16, 127, -128, -1};

        String expected1 = "0204080f";
        String expected2 = "107f80ff";

        String actual1 = ByteArrayToHexHelper.encodeHexString(byteArray1);
        String actual2 = ByteArrayToHexHelper.encodeHexString(byteArray2);

        assertThat(expected1).isEqualTo(actual1);
        assertThat(expected2).isEqualTo(actual2);
    }
}