package Practice.Crud_OP.Collection_With_Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

class Person1
{
    int id;
    String uId,pass;
    public Person1(int id, String uId, String pass)
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

public class Stack_Demo
{
    static Connection con;
    static Statement st ;
    static ResultSet rs ;

    public void getData()
    {
        Set<Person1> set = new HashSet<>();

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

                set.add(new Person1(id,uId,pass));
            }
            System.out.println(set);
        } catch (Exception e) {
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
