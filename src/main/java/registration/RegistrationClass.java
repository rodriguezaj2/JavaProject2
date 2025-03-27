package registration;

public class RegistrationClass {
    private String email;
    private String userName;
    private String password;

    public void enterEmail(String email){
        this.email=email;
        if(email.isEmpty()||!email.endsWith("@yahoo.com")){
            if(email.isEmpty()){
                System.out.println("Please enter an email");
            } else if (!email.endsWith("@yahoo.com")) {
                System.out.println("Email must end with yahoo.com");
            }
        }else{
            System.out.println("Email set successfully");
        }
    }

    public void enterUserName(String userName){
        this.userName=userName;
        if(userName.isEmpty()||userName.length()<7){
            if(userName.isEmpty()){
                System.out.println("Please enter a username");
            } else if (userName.length()<7) {
                System.out.println("Username must be longer than 6 characters");
            }
        }else{
            System.out.println("Username set successfully");
        }
    }
    public void enterPassword(String password){
        this.password=password;
        if(password.isEmpty()||password.length()<7||password.contains(userName)){
            if(password.isEmpty()){
                System.out.println("Please enter a password");
            } else if (password.length()<7){
                System.out.println("Password must be longer than 6 characters");
            } else if (password.contains(userName)) {
                System.out.println("Password cannot contain username");
            }
        }else{
            System.out.println("Password set successfully");
        }
    }

}
