package Practice.Crud_OP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataDemo
{
    public void updateData()
    {
        try
        {
            Connection con = DB_Connection.getConnection();
            PreparedStatement pst = null;

            pst = con.prepareStatement("Update Sanket__I1433 set password = ? where userId = ?");

            System.out.println("Enter user id for Update Password :");
            Scanner sc = new Scanner(System.in);
            String uId = sc.next();

            System.out.println("Enter new Password : ");
            String pass = sc.next();

            pst.setString(1,pass);
            pst.setString(2,uId);

            int res = pst.executeUpdate();

            if (res > 0)
            {
                System.out.println("Record Updated Successfully");
            }
            else
            {
                System.out.println("Record not Update");
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
