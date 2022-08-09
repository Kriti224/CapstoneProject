package Application.Services;

import Application.Models.Credentials;
import Application.Models.Transaction;
import Application.Models.TransferRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.failsafe.internal.util.Assert;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.response.ResponseBody;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TransferServices {

    public String baseUrl = "https://parabank.parasoft.com/parabank/services_proxy/bank";

    public ObjectMapper mapper=new ObjectMapper();

    public void transferAmount(Credentials credentials, TransferRequest transferRequest){

        Map<String,Object> params = mapper.convertValue(transferRequest,Map.class);

        var response = given()
                .auth().basic(credentials.username, credentials.password)
                .params(params)
                .post(baseUrl+"/transfer")
                .then().statusCode(200);

         var responseBody = response.extract().body().asString();
    }

}
