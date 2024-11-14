package MyApp.src.JavaFundamentals;


import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your username: ");
        String myUser;
//        System.out.print("Enter your username: ");
        String myPass;

        int i = 0;

        boolean isExisting;


        String[] username = {"Jherico", "Rigel-kun", "Bebekoi"};
        String[] password = {"jherico123", "rigel123", "bebekoi123"};


        do {
            isExisting = false;

            if(i >= username.length){
                System.out.println("Retry next time!");
                break;
            }

            System.out.print("Enter your username: ");
            myUser = sc.nextLine();
            System.out.print("Enter your password: ");
            myPass = sc.nextLine();


            if (username[i].equalsIgnoreCase(myUser) && password[i].equalsIgnoreCase(myPass)) {
                System.out.println("Welcome, " + username[i]);
                isExisting = true;

            } else {
                System.out.println("Accout not Found! \n");
            }



            i++;

        } while (!isExisting);

    }
}

