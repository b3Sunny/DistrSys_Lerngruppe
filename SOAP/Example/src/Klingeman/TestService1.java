package Klingeman;

import java.util.Date;

import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;
 
@WebService
@SOAPBinding(style=Style.RPC)


public class TestService1 {
          
  public String getDate() {
    return new Date().toString();
  }
  
    
  public String reverse(String input){
      return new String ( new StringBuffer(input).reverse() );
  }
     
}