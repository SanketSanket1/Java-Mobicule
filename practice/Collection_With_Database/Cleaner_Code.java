package Practice.Crud_OP.Collection_With_Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cleaner_Code
{
    static Connection con;
    static Statement st;
    static ResultSet rs;
    public static void clean()
    {

            try {
                con.close();
                st.close();
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }
}
