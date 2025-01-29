package Practice.Crud_OP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataDemo
{
    public void deleteData()
    {
        try
        {
            Connection con = DB_Connection.getConnection();
            PreparedStatement pst = null;

            pst = con.prepareStatement("delete from sanket__I1433 where userId = ?");

            System.out.println("Enter UserId for delete record : ");
            Scanner sc = new Scanner(System.in);
            String uId = sc.next();
            pst.setString(1, uId);

            int res = pst.executeUpdate();

            if (res > 0)
            {
                System.out.println("Record Deleted Successfully");
            }
            else
            {
                System.out.println("Record not Delete");
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
