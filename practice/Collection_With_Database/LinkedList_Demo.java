package Practice.Crud_OP.Collection_With_Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

class Person2{
    int id;
    String uId,pass;

    public Person2(int id,String uId,String pass)
    {
        this.id = id;
        this.uId = uId;
        this.pass = pass;
    }
    public String toString()
    {
        return "person{id = "+id+"UserName '"+uId+" Password '"+pass+"}";
    }
}

public class LinkedList_Demo
{
    static Connection con = null;
    static Statement st = null;
    static ResultSet rs = null;

    public void getData()
    {
        List<Person2> list = new LinkedList<>();

        try
        {
            con = DB_Connection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from sanket__I1433");

            while (rs.next())
            {
                int id = rs.getInt("id");
                String uId = rs.getString("userId");
                String pass = rs.getString("password");

                list.add(new Person2(id,uId,pass));
            }
            System.out.println(list);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
            if(con != null || st != null || rs != null)
            {
                Cleaner_Code.clean();
            }
        }
    }
}
