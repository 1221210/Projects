// Install the Java helper library from twilio.com/docs/libraries/java
import javax.swing.JOptionPane;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMStwillo {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "ACa60c82cfe6f7e2a4b6439e1d11004a5f";
    public static final String AUTH_TOKEN =
            "075e32abe2ab48a24d0a1baf11e258e2";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber(JOptionPane.showInputDialog("Enter the phonenumber you want to send the route to.")), // to 
                        new PhoneNumber("+18167998862"), // from
                        "Test Message?")
                .create();
    	//String phoneNumber = JOptionPane.showInputDialog("Enter the phonenumber you want to send the route to.");


        System.out.println(message.getSid());
    }
}
