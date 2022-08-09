package ParabankTest;

import Application.Models.Credentials;
import Application.Models.TransferRequest;
import Application.Services.TransferServices;
import org.testng.annotations.Test;

public class ParabankAPITest {

 @Test
 public void transferFundsViaAPITest1(){
  Credentials credentials=new Credentials();
  TransferRequest transferRequest=new TransferRequest(12345,12456,100);
  TransferServices transferServices=new TransferServices();
  transferServices.transferAmount(credentials,transferRequest);
 }

 @Test
 public void transferFundsViaAPITest2(){
  Credentials credentials=new Credentials();
  TransferRequest transferRequest=new TransferRequest(12456,12567,500);
  TransferServices transferServices=new TransferServices();
  transferServices.transferAmount(credentials,transferRequest);
 }

 @Test
 public void transferFundsViaAPITest3(){
  Credentials credentials=new Credentials();
  TransferRequest transferRequest=new TransferRequest(12345,12456,1000000);
  TransferServices transferServices=new TransferServices();
  transferServices.transferAmount(credentials,transferRequest);
 }

}
