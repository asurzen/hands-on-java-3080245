package bank;
import java.util.Scanner;

import javax.security.auth.login.LoginException;
public class Menu {
  private Scanner scanner;

  public static void main(String[] args){
    System.out.println("Welcome to Toy Bank");
    Menu menu = new Menu();
    menu.scanner = new Scanner(System.in);
    Customer customer = menu.authenticateUser();


    menu.scanner.close();
  }

  private Customer authenticateUser(){
    System.out.println("Please Enter Your Username: ");
    String username = scanner.next();

    System.out.println("Please Enter Your Password");
    String password = scanner.next();
    Customer customer = null;
    try{
      customer = Authenticator.login(username, password);
    }catch(LoginException e){
      System.out.println("There was ana error!!!");
      //e.printStackTrace();
    }
    return customer;
  }
}
