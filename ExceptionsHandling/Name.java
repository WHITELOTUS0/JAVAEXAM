package ExceptionsHandling;

public class Name {
    static void getName(String name) throws UserNotAuthorized{
        if (!name.equals("Kato")){
            throw new UserNotAuthorized("Invalid UserName, User Not Authorised");
        }
        else{
            System.out.println("Welcome "+name);
        }
    }

    public static void main(String[] args) {
        try{
            getName("Ka");
        }catch(UserNotAuthorized e){
            System.out.println("Error Message" +e.getMessage());
        }
    }
    
}

class UserNotAuthorized extends Exception{
    UserNotAuthorized(String errorMessage){
        super(errorMessage);
    }
}
