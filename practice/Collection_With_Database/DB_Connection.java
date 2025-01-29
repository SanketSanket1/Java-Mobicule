package Practice.Crud_OP.Collection_With_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.StringTokenizer;

public class DB_Connection
{
    static Connection con = null;
    public static Connection getConnection()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://10.1.1.196;databaseName=TRAINING_DB","sa","M0b1cule!");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
