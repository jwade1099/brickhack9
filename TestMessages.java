import com.twilio.Twilio; 
import com.twilio.converter.Promoter; 
import com.twilio.rest.api.v2010.account.Message; 
import com.twilio.type.PhoneNumber;

import com.*;



import java.net.URI; 
import java.math.BigDecimal; 
 
public class TestMessages { 
    // Find your Account Sid and Token at twilio.com/console 
    public static final String ACCOUNT_SID = "ACdd06ff9ca7da6eaedb768a5dd4c7f7e5"; 
    public static final String AUTH_TOKEN = "[AuthToken]"; 
 
    public static void main(String[] args) { 
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN); 
        Message message = Message.creator( 
                new com.twilio.type.PhoneNumber("+12035229300"),  
                "MGb481aac496437e29572748b2682a6501", 
                "Hello, Do you want to use trello or nah? Personally im okay without it. buzzed af off of this bang rn.")      
            .create(); 
 
        System.out.println(message.getSid()); 
    } 
}