public class MailService {
    public void sendMail(){
        connect();
        authenticate();
        // Send email
        disconnect();
    }
    private void connect(){
        System.out.println("Connect");
    }

    private void disconnect(){
        System.out.println("Disconnect");
    }

    private void authenticate(){
        System.out.println("Authenticate");
    }
}
