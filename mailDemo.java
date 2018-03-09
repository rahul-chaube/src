
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Properties;
import java.util.Scanner;
import javax.mail.*;
import javax.mail.internet.*;
import javax.naming.AuthenticationException;

class Mailer {
    public static void send(String from,String password,String to,String sub,String msg){
        //Get properties object
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        //get Session
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from,password);
                    }
                });


        boolean isAuthenticated=false;
        //compose message
        try {
            System.out.println(" Step 1 ");
            MimeMessage message = new MimeMessage(session);
            System.out.println(" Step 2 ");
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            System.out.println(" Step 3 ");
            message.setSubject(sub);
            System.out.println(" Step 4 ");
            message.setText(msg);
            System.out.println(" Step 5 ");
            //send message
            Transport.send(message);
            isAuthenticated=true;
            System.out.println("message sent successfully");
        } catch (MessagingException e) {
            isAuthenticated=false;
//            throw new RuntimeException(e);

        }
        System.out.println(" User is Authenticated "+isAuthenticated);

    }
}

public class mailDemo {
    public static void main(String[] args) {
//        Mailer.send("rahulrkumar7@gmail.com","Rahul@08976898022","rahulrkumar7@gmail.com","hello javatpoint","How r u?");
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port","587");
        //get Session

        Session session = Session.getDefaultInstance(props);
        Transport transport;
        while (true) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter Email Address ");
            String userName=scanner.nextLine();
            System.out.println("Enter password ");
            String passwd=scanner.nextLine();
            try {
                transport = session.getTransport("smtp");
                transport.connect("smtp.gmail.com", userName,
                        passwd);
                transport.close();
                System.out.println("SuccessFull");
                //Authentication success
            } catch (Exception e) {
                System.out.println("Session Failed "+e.getMessage());
//                if(e.getMessage().split(" ")[0].equals("535-5.7.8"))
//                {
//                    System.out.println("Login Failed");
//                }
//                else if (e.getMessage().split(" ")[0].equals("534-5.7.17"))
//                {
//                    System.out.println("Login Successful with exception ");
//                }
//            e.printStackTrace();
            }
        }
    }
}
