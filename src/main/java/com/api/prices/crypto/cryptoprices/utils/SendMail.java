package com.api.prices.crypto.cryptoprices.utils;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {
	
	public static void sendMail(double price) {
        Properties props = new Properties();
        
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                         protected PasswordAuthentication getPasswordAuthentication() 
                         {
                               return new PasswordAuthentication("vinicius.pereiradeoliveira@gmail.com", "***");
                         }
                    });
        
        session.setDebug(true);
        try {

              Message message = new MimeMessage(session);
              message.setFrom(new InternetAddress("vinicius.pereiradeoliveira@gmail.com"));

              Address[] toUser = InternetAddress 
                         .parse("vinicius.pereiradeoliveira@gmail.com");  
              message.setRecipients(Message.RecipientType.TO, toUser);
              message.setSubject("Send email with new price");
              message.setText("New price is: $"+price);
            
              Transport.send(message);
              System.out.println("Sending mail completed!!!");
         } catch (MessagingException e) {
              throw new RuntimeException(e);
        }
  }
	
}
