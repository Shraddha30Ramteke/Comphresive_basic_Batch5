package Packag_comp;

import org.junit.Test;

import io.restassured.RestAssured;

public class RestAssured_Class {
	
	
	@Test
    public void testPositiveResponse() {
        RestAssured
            .given()
                .when()
                .get("https://restcountries.com/v3.1/lang/spanish")
                .then()
                .assertThat()
                .statusCode(200);
    }
	
}
