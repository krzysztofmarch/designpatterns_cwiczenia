package factory;

import factory.authentication.Authentication;
import factory.authentication.EmailAuthentication;
import factory.authentication.SMSAuthentication;

public class Main {

    public static void main(String[] args) {
        AuthenticationFactory factory = new AuthenticationFactory();
        Authentication authentication = factory.getAuthentication(AuthenticationType.EMAIL);
        authentication.authenticate();
        authentication = factory.getAuthentication(AuthenticationType.SMS);
        authentication.authenticate();

        Authentication authenticationSMS = new SMSAuthentication();
        Authentication authenticationEMAIL = new EmailAuthentication();

        System.out.println();
        authenticationSMS.authenticate();
        authenticationEMAIL.authenticate();
    }
}
