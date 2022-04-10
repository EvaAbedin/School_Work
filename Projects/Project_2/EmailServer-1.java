
package emailserver;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import static java.util.Objects.isNull;







public class EmailServer
{
    //  This classs is a sample test driver.  You should change the messages and users to make it your own.
    public static void main(String[] args)
    {
        
        System.out.println("*******Welcome to my email server java program******");
   //     MailboxList mailboxOwners = new MailboxList();
        Mailbox sender = MailboxList.GetUserMailbox("Eva");
        Mailbox recipient = MailboxList.GetUserMailbox("Russel");
        Message email = new Message("Russel", "Eva", "Switzerland");
        email.append("What’s the best thing about Switzerland?");
        email.append("I don’t know, but the flag is a big plus.");

        email.print();
        email.send(sender, recipient, email);

        email = new Message("Russel", "Eva",  "Fonts in a Bar");
        email.append("Helvetica and Times New Roman walk into a bar.");
        email.append("Get out of here!” shouts the bartender. “We don’t serve your type.");
        email.print();
        email.send(sender, recipient, email);


        sender = MailboxList.GetUserMailbox("Russel");
        recipient = MailboxList.GetUserMailbox("Eva");
        Message emailResponse = new Message("Eva", "Russel", "Astronaut");
        emailResponse.append("Did you hear about the claustrophobic astronaut?");
        emailResponse.append("He just needed a little space.");
        emailResponse.print();
        emailResponse.send(sender, recipient, emailResponse);
        System.out.println("Inbox:");
        for (Message msg: sender.getMessages()) {
            System.out.println(msg.getMessageHeader());
        }
        System.out.println("Sent:");
        for (Message msg: sender.getSentMessages()) {
            System.out.println(msg.getMessageHeader());
        }

        System.out.println("Inbox:");
        for (Message msg: recipient.getMessages()) {
            System.out.println(msg.getMessageHeader());
        }
        System.out.println("Sent:");
        for (Message msg: recipient.getSentMessages()) {
            System.out.println(msg.getMessageHeader());
        }

    }
}


