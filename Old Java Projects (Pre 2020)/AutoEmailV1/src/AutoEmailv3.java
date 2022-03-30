import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.PasswordAuthentication;

public class AutoEmailv3 {

	public static void main(String[] args) {
		// email begin
		final String username = "gamers1835@gmail.com"; // sender username
		final String password = "iansps31"; // sender password
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.host", "smtp.gmail.com");// smtp google server address
		props.put("mail.smtp.port", "587"); // smtp ports for google servers
		
		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);// used for account authentication
			}
		});
		
		try { 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("gamers1835@gmail.com")); // from email address
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse("gamers1836@gmail.com")); // to email address
			message.setSubject("My Experimental email"); // message subject
			message.setContent("https://www.google.com/maps/dir/7207+East+133rd+Terrace,+Grandview,+MO+64030-3344,+USA/901+Northeast+3+Street,+Blue+Springs,+MO/2000+Northwest+Ashton+Drive,+Blue+Springs,+MO/38.9795982,-94.5243489/Sky+Zone+Trampoline+Park/Lee's+Summit/James+A.+Reed+Memorial+Wildlife+Area/@38.9549067,-94.454311,12z/data=!4m39!4m38!1m5!1m1!1s0x87c0dd97b69d8e37:0x848d92dbe9cacfcd!2m2!1d-94.5086519!2d38.881576!1m5!1m1!1s0x87c11a5b47b8ba69:0x3be392beece8089c!2m2!1d-94.2601359!2d39.025529!1m5!1m1!1s0x87c11ba4f7a6af03:0x20c5defe84ed6ad3!2m2!1d-94.2883363!2d39.0265766!1m0!1m5!1m1!1s0x87c11e593066396b:0x6b581f15f1eec26d!2m2!1d-94.359823!2d38.963522!1m5!1m1!1s0x87c0dff6a8b596fd:0x8d2c2e9a007b187!2m2!1d-94.3821724!2d38.9108408!1m5!1m1!1s0x87c12184dd3ec4a1:0x2a3c6dd3ebf91c8!2m2!1d-94.3380409!2d38.8913413!3e2 "
					, "text/html; charset=utf-8");//sets the content body of the email
			Transport.send(message);// send message
			
			System.out.println("Message Successfully sent.");
			
		} catch (MessagingException e) {
			throw new RuntimeException(e); // if email is invalid
		}
 // end of experimental code
	}

}
