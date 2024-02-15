/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.util;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import yumxpress.pojo.CustomerPojo;
import yumxpress.pojo.OrderPojo;
import yumxpress.pojo.StaffPojo;



class MyAuthenticator extends Authenticator {

    private String username, password;

    public MyAuthenticator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        PasswordAuthentication pwdAuth = new PasswordAuthentication(this.username, this.password);
        return pwdAuth;
    }

}
public class Mailer {
    private static Properties prop ;
    static{
        prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        
    }
    public static void sendMail(Map<String, String> emailCredentails, StaffPojo staff) throws MessagingException{
        final String username = emailCredentails.get("emailId");
        final String password = emailCredentails.get("securityKey");
        MyAuthenticator myAuth = new MyAuthenticator(username, password);
        Session session = Session.getInstance(prop, myAuth);
        Message message = new MimeMessage(session);
        message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(staff.getEmailId())
        ); 
        String emailSubject = "Staff Details";
        String emailBody = "Dear " + staff.getStaffName() + ",\n"
                + "\n"
                +"I hope this email finds you ewll. I am writing to provide you with the necessary staff details as requested. Please find the infromation below: \n"
                +"\n" 
                +"Staff ID: " + staff.getStaffId() + "\n"
                +"Company Name: " + OwnerProfile.getCompanyName() + "\n"
                +"Email ID: " + staff.getEmailId() + "\n"
                +"Staff password: " + PasswordEncryption.getDecryptedPassword(staff.getPassword()) + "\n"
                + " "
                + "\n"
                +"These details are crucial for internal record-keeping and ensuring efficient communication within the organization. \n"
                + "Best regards, \n"
                +"\n"
                + OwnerProfile.getOwnerName();
        
        message.setSubject(emailSubject);
        message.setText(emailBody);
        Transport.send(message);
    }
     public static void sendMail(Map<String, String> emailCredentails, CustomerPojo customer) throws MessagingException{
        final String username = emailCredentails.get("emailId");
        final String password = emailCredentails.get("securityKey");
        MyAuthenticator myAuth = new MyAuthenticator(username, password);
        Session session = Session.getInstance(prop, myAuth);
        Message message = new MimeMessage(session);
        message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(customer.getEmailId())
        ); 
        String emailSubject = "Welcome to YumXpress App - Your Ultimate Food Ordering Companion!!";
        String emailBody = "Dear " + customer.getCustomerName() + ",\n"
                + "\n"
                +"Welcome to YumXpress App! We're excited to have you as a new member of our food-loving community. \n"
                +"Here are your account details: \n" 
                +"Customer ID: " + customer.getCustomerId() + "\n"
                +"Your Name: " + customer.getCustomerName() + "\n"
                +"Email ID (Login Id): " + customer.getEmailId() + "\n"
                +"Initial password: " + PasswordEncryption.getDecryptedPassword(customer.getPassword()) + "\n"
                + " "
                + "\n"
                +"Happy Hunger!!! \n"
                + "Best regards, \n"
                +"\n"
                +"YumXpress";
        
        message.setSubject(emailSubject);
        message.setText(emailBody);
        Transport.send(message);
    }
    public static void sendMail(Map<String,String> emailCredentails, OrderPojo order) throws MessagingException{
        final String username = emailCredentails.get("emailId");
        final String password = emailCredentails.get("securityKey");
        MyAuthenticator myAuth = new MyAuthenticator(username, password);
        Session session = Session.getInstance(prop, myAuth);
        Message message = new MimeMessage(session);
        message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(UserProfile.getEmailId())
        ); 
        
        double taxRate = 0.075;
        double taxAmt = order.getProductPrice() * taxRate;
        double billAmount = order.getProductPrice() + taxAmt;
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String orderDate = sdf.format(today);
        
        String emailSubject = "Order Confirmation Mail";
        
        String emailBody = "Dear " + order.getCustomerName() + ",\n";
        emailBody += "\n Following are your order details: \n";
        emailBody += "\n Order Id: " + order.getOrderId() + "\n";
        emailBody += "\n Prduct Name: " + order.getProductName() + "\n";
        emailBody += "\n Company: " + order.getCompanyName() + "\n";
        emailBody += "\n Company email: " + order.getCompanyEmailId() + "\n";
        emailBody += "\n Product Price: " + order.getProductPrice() + "\n";
        emailBody += "\n Tax Amount: " + taxAmt + "\n";
        emailBody += "\n Bill Amount: " + billAmount + "\n";
        emailBody += "\n Delivery Staff Name: " + order.getDeliveryStaffName() + "\n";
        emailBody += "\n Please share this OTP with the delivery staff" + "\n";
        emailBody += "\n OTP: " + order.getOtp() + "\n";
        emailBody += "\n Order Date: " + orderDate + "\n";
        emailBody += "\n Thank You For Ordering!!\n\n Happy Hunger";
        message.setSubject(emailSubject);
        message.setText(emailBody);
        Transport.send(message);
    }
}
