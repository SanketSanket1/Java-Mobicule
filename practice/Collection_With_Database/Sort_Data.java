package Practice.Crud_OP.Collection_With_Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Person3 implements Comparable<Person3>
{
    int id;
    String uId,pass;

    public Person3(int id, String uId, String pass)
    {
        this.id = id;
        this.uId = uId;
        this.pass = pass;
    }

    public String toString()
    {
        return "person{id = "+id+"UserName '"+uId+" Password '"+pass+"}";
    }

    public int compareTo(Person3 p)
    {

        //commented code is sort element by id
//        if(id == p.id) {
//            return 0;
//        }
//        else if (id > p.id)
//        {
//            return 1;
//        }
//        else
//        {
//            return -1;
//        }

        //below return statement return value on basis of compair userId
        return uId.compareTo(p.uId);
    }
}

public class Sort_Data
{
    static Connection con = null;
    static Statement st = null;
    static ResultSet rs = null;

    public void sortId()
    {
            List<Person3> list = new LinkedList<>();

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

                    list.add(new Person3(id,uId,pass));
                }
                System.out.println(list);
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }

        Collections.sort(list);

        for(Person3 p : list)
        {
            System.out.println(p);
        }
    }
}
