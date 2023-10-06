public class Account {
    private String email; 
    private String password; 
    private String country; 
    private int age; 
    
    Account() {
    }

    Account(String email, String password, String country, int age){
        this.email = email; 
        this.password = password; 
        this.country = country; 
        this.age = age; 

        System.out.println("Output : " +  this.email + " " + this.age  + " " + this.country);
    }


    public static Account login(String email, String password){
        // API and validate user credentials
        Account account = new Account(email, password, "CA", 12);
        return account; 
    }

    public static Account register(String email, String password, String country, int age){

        // API call to register this account
        Account account = new Account(email, password, country, age);
        return account; 
    }

    public void resetPassword(String newPassword) {
        // API call to reset password
    }

}
