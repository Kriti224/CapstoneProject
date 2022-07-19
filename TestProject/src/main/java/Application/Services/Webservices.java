package Application.Services;

import static io.restassured.RestAssured.given;

public class Webservices {
    public static void resetParaBankApp() throws InterruptedException {
        given().post("https://parabank.parasoft.com/parabank/services/bank/initializeDB").then().statusCode(204);
        Thread.sleep(5000);

    }
}
