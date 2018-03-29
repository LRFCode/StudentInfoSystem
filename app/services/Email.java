package services;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import com.amazonaws.services.simpleemail.model.*;

import java.util.Date;

public class Email
{
    public static void sendEmail(Date date)
    {
        String sender = "woodrowliddell@gmail.com";
        String receiver = "woodrowliddell@gmail.com";

        String subject = "About your child's performance";

        String htmlBody = "Your student has 2 zeros currently. Please assist them in turning in those assignments.";

        String textBody = "Your student has 2 zeros currently. Please assist them in turning in those assignments.";

        try
        {
            AmazonSimpleEmailService client = AmazonSimpleEmailServiceClientBuilder
                    .standard()
                    .withRegion(Regions.US_EAST_1)
                    .build();

            SendEmailRequest request = new SendEmailRequest()
                    .withDestination(
                            new Destination().withToAddresses(receiver))
                    .withMessage(new Message()
                            .withBody(new Body()
                                    .withHtml(new Content()
                                            .withCharset("UTF-8").withData(htmlBody))
                                    .withText(new Content()
                                            .withCharset("UTF-8").withData(textBody)))
                            .withSubject(new Content()
                                    .withCharset("UTF-8").withData(subject)))
                    .withSource(sender);

            client.sendEmail(request);
            System.out.println("Email sent");
        }
        catch(Exception e)
        {
            System.out.println("Error sending email: " + e.getMessage());
        }

    }
}