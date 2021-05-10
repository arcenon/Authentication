package com.example.authentication.model.jdbc;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Robert Kensen on 10-5-2021
 * @project Authentication
 */

@SpringBootTest
public class JDBCDriverTest {
    private static Connection connection;

    @BeforeAll
    static void setUp() {
        String sqlUrl = "jdbc:mariadb://192.168.178.250:3306/authentication";
        String sqlUser = "demoUser";
        String sqlPassword = "neverStorePasswordsInSourceCode";
        try {
            connection = DriverManager.getConnection(sqlUrl, sqlUser, sqlPassword);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Test
    void assert_connection_is_available() {
        assertThat(connection).isNotNull();
    }

    @AfterAll
    static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
