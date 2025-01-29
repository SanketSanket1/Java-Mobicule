package Practice.Crud_OP;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDataDemo
{
    public void insertData()
    {
        try
        {
            PreparedStatement pst = null;

            java.sql.Connection con = DB_Connection.getConnection();

            pst = con.prepareStatement("insert into Sanket__I1433 (userId,password) values (?,?)");

            System.out.println("Enter User Id :");
            Scanner sc = new Scanner(System.in);
            String uId = sc.next();

            System.out.println("Enter Password");
            String pass = sc.next();

            pst.setString(1,uId);
            pst.setString(2,pass);

            int res = pst.executeUpdate();

            if (res > 0)
            {
                System.out.println("Record Inserted");
            }
            else
            {
                System.out.println("Record not Inserted");
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
