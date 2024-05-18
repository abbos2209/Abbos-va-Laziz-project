package uz.app.hotel.service_class;

import uz.app.hotel.database.DB;
import uz.app.hotel.entity.User;
import uz.app.hotel.service.AuthService;

import java.io.ObjectOutputStream;
import java.util.Objects;

import static uz.app.hotel.Utill.Utill.*;
public class Auth implements AuthService {
       static DB db = DB.getInstance();
    @Override
    public void signUp() {
        System.out.println("enter username");
        String username = strScanner.nextLine();
        System.out.println("enter password");
        String password = strScanner.nextLine();
        for (User user : db.getUsers()) {
            if (Objects.equals(user.getUsername(),username)){
                System.out.println("User already exists");
                break;
            }
        }
    }

    @Override
    public void signIn() {
        System.out.println("enter username");
        String username = strScanner.nextLine();
        System.out.println("enter password");
        String password = strScanner.nextLine();
        for (User user : db.getUsers()) {
            if (Objects.equals(user.getUsername(),user) && Objects.equals(user.getPassword(),password)) {
                db.setCurrentUser(user);
                break;
            }}
    }
}
