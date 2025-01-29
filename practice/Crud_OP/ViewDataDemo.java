package Practice.Crud_OP;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewDataDemo
{
    public void selectDemo()
    {
        try
        {
            java.sql.Connection con = DB_Connection.getConnection();
            String sql = "select * from Sanket__I1433";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            System.out.println("Id\tUserName\tPassword\n");
            while(rs.next())
            {
                int Id = rs.getInt("id");
                String uId = rs.getString("userId");
                String pass = rs.getString("password");

                System.out.println(Id+"\t"+uId+"\t"+pass);
            }
        }
        catch (SQLException e)
        {
        e.printStackTrace();
        }
    }
}
