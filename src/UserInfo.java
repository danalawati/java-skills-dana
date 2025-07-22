import java.util.Scanner;

public class UserInfo {

    String name;
    int age;
    String email;
    boolean isActive;

    public static void main(String[] args){
        //System.out.println("Hello World");

        UserInfo user1 = new UserInfo("A", 30,"a@rihal.com",true);
        UserInfo user2 = new UserInfo("B", 22,"b@rihal.com",false);
        UserInfo user3 = new UserInfo("C", 53,"c@rihal.com",true);

        user1.displayInfo();
        user2.displayInfo();
        user3.displayInfo();



    }

    //constructor
    public UserInfo(String name, int age, String email, boolean isActive){
        this.name = name;
        this.age = age;
        this.email = email;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {      // getter for boolean can be named isActive()
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void displayInfo(){
        System.out.print("Name: "+ name);
        System.out.print(" ");
        System.out.print("Age: " + age);
        System.out.print(" ");
        System.out.print("Email: "+ email);
        System.out.print(" ");
        if (isActive){
            System.out.println("Account active");
        } else {
            System.out.println("Account inactive");
        }
    }
}
