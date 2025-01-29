 package Practice.Crud_OP.Collection_With_Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

class Person
{
    String uId;
    String pass;

    Person(String uId,String pass)
    {

            this.uId = uId;
            this.pass = pass;
    }

    public String toString()
    {
        return "person{UserId = '" + uId + "' Password = " + pass + "}\n";
    }
}

class Map_Demo
{
    static Connection con = null;
    static Statement st = null;
    static ResultSet rs = null;

    public void getData()
    {
        Map<Integer,Person> map = new HashMap<>();

        try
        {
            con = DB_Connection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from Sanket__I1433");

            while (rs.next())
            {
                int id = rs.getInt("id");
                String uId = rs.getString("userId");
                String pass = rs.getString("password");

                map.put(id,new Person(uId,pass));
            }

            System.out.println(map);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
//        finally
//        {
//            if(con != null || st != null || rs != null)
//            {
//                Cleaner_Code.clean();
//            }
//        }
    }
}
