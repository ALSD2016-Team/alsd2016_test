package ALSD.CucumberTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;

public class ReceiveMail {
	
	public static String[] check(String host, String storeType, String user, String password) 
		   {
			  String mailContent[] = new String[3];
		      try {

		      //create properties field
		      Properties properties = new Properties();

		      properties.put("mail.pop3.host", host);
		      properties.put("mail.pop3.port", "995");
		      properties.put("mail.pop3.starttls.enable", "true");		      
		      Session emailSession = Session.getDefaultInstance(properties);		      
		  
		      //create the POP3 store object and connect with the pop server
		      Store store = emailSession.getStore("pop3s");

		      store.connect(host, user, password);

		      //create the folder object and open it
		      Folder emailFolder = store.getFolder("INBOX");
		      emailFolder.open(Folder.READ_ONLY);

		      // retrieve the messages from the folder in an array and print it     		    
		      Message message = emailFolder.getMessage(emailFolder.getMessageCount());//emailFolder.getMessages();
		      //System.out.println("Subject: " + message.getSubject());
		      //System.out.println("From: " + message.getFrom()[0]);
		      //System.out.println("Text: " + message.getContent().toString());
		      
		      String sub = message.getSubject();
		      String from = message.getFrom()[0].toString();
		      SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
		      Date date = message.getSentDate();
		      String sentDate = sdFormat.format(date);
		      mailContent[0] = sub;
		      mailContent[1] = from;
		      mailContent[2] = sentDate;	      
		      
		      //close the store and folder objects
		      emailFolder.close(false);
		      store.close();

		      } catch (MessagingException e) {
		         e.printStackTrace();
		      } catch (Exception e) {
		         e.printStackTrace();
		      }
		      
		      return mailContent;
		   }
	
	public static void delete(String host, String storeType, String user, String password) 
	   {
	      try {

	      //create properties field
	      Properties properties = new Properties();

	      properties.put("mail.pop3.host", host);
	      properties.put("mail.pop3.port", "995");
	      properties.put("mail.pop3.starttls.enable", "true");		      
	      Session emailSession = Session.getDefaultInstance(properties);		      
	  
	      //create the POP3 store object and connect with the pop server
	      Store store = emailSession.getStore("pop3s");

	      store.connect(host, user, password);

	      //create the folder object and open it
	      Folder emailFolder = store.getFolder("INBOX");
	      emailFolder.open(Folder.READ_WRITE);

	      // retrieve the messages from the folder in an array and print it		         
	      
	      //Message message = emailFolder.getMessage(emailFolder.getMessageCount());//emailFolder.getMessages();
	      Message[] messages = emailFolder.getMessages();
	      for (int i = 0; i < messages.length; i++) {
	    	    System.out.println("Index: " + i);
	            Message message = messages[i];	            
		        message.setFlag(Flags.Flag.DELETED, true);
	      }
	      
	      //close the store and folder objects
	      emailFolder.close(true);
	      store.close();

	      } catch (MessagingException e) {
	         e.printStackTrace();
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }

}