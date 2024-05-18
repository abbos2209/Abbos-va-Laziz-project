import uz.app.hotel.service_class.Auth;

import static uz.app.hotel.Utill.Utill.*;
public class Main
{
    static Auth auth = new Auth();
    public static void main(String[] args) {
            while (true){
                System.out.println("""
                        0 -> exit
                        1 -> sign in
                        2 -> sign up
                        """);
                switch (intScanner.nextInt()){
                    case 0 -> {
                        System.out.println("bye");
                        return;
                    }
                    case 1 -> {
                        auth.signIn();
                    }
                    case 2 -> {
                        auth.signUp();
                    }
                }
            }
    }
}
