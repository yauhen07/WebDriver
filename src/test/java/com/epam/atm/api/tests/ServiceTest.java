package com.epam.atm.api.tests;

import com.epam.atm.api.model.User;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ServiceTest {
    private Response response;

    @BeforeTest
    public void intitTest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        response = RestAssured.when().get("/users").andReturn();
    }

    @Test(description = "Check response from /users")
    public void checkStatusCode() {
        System.out.println("Response status line: " + response.getStatusLine());
        Assert.assertEquals(response.getStatusCode(), 200, "Response from /users not 200");
    }

    @Test(description = "Check response type")
    public void checkResponseHeader() {
        String respContentType = response.getContentType();
        System.out.println("Response type: " + respContentType);
        Assert.assertEquals(respContentType, "application/json; charset=utf-8", "Incorect responce type");
    }

    @Test(description = "Check number od users in /users")
    public void checkResponseBody() {
        User[] users = response.getBody().as(User[].class);
        System.out.println("Number of users: " + users.length);
        Assert.assertEquals(users.length, 10, "Number of Users != 10");
    }
}
