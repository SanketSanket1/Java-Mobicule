package Practice.Crud_OP;

import java.sql.*;
public class DB_Connection
{
    static java.sql.Connection con = null;

    public static java.sql.Connection getConnection()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://10.1.1.196;databaseName=TRAINING_DB","sa","M0b1cule!");
            return con;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
