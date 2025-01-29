package Practice.Crud_OP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      while (true)
      {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n1 -> View All Records\n" +
                "2 -> Insert Record into Database\n" +
                "3 -> Update Record into Database\n" +
                "4 ->Delete Record into Database\n" +
                "5 ->Exit\n");

        System.out.println("Enter your Choice : ");
        int ch = sc.nextInt();
          System.out.println();

        switch (ch) {
            case 1:
                new ViewDataDemo().selectDemo();
                break;
            case 2:
                new InsertDataDemo().insertData();
                break;
            case 3:
                new UpdateDataDemo().updateData();

                break;
            case 4:
                new DeleteDataDemo().deleteData();
                break;
            case 5:
                System.exit(1);
                break;
            default:
                System.out.println("Invalid Choice!!! Please enter valid choice(between 1 to 4)");
        }
    }
}

}