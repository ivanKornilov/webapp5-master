package lesson25;

import java.lang.reflect.Field;
import java.sql.* ;
import com.mysql.jdbc.Driver;
import java.io.*;

import java.util.Date;

/**
 * Kornilov
 * 25.03.2016
 */

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        System.out.println(new Date());
        Contact c = new Contact(ContactType.HOME_PHONE,"121313");


        Link l = new Link("fgfg","fgfgg");
        Field f = Link.class.getDeclaredField("url");
        f.setAccessible(true);
        System.out.println(f.get(l));
      /*
        Connection c = null ;

        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            c = DriverManager.getConnection("jdbc:mysql://localhost/resume", "root", "SI543nue");

            Statement s = c.createStatement() ;
            ResultSet rs = null;

            rs = s.executeQuery("SELECT * FROM resume.resumelist");

            System.out.println("\nName: ");
            System.out.println("---------------------------- ");
            String str=new String();

            while( rs.next() )
            {
                str=rs.getString("FIO");
                System.out.println(str);
            }

            rs.close(); rs=null;

            c.close();
        }
        catch (SQLException ex)
        {    System.out.println("SQLException caught");
            System.out.println("---");
            while ( ex != null ){
                System.out.println("Message   : " + ex.getMessage());
                System.out.println("SQLState  : " + ex.getSQLState());
                System.out.println("ErrorCode : " + ex.getErrorCode());
                System.out.println("---");
                ex = ex.getNextException();
            }
        }
        catch (Exception ex)
        {    System.out.println("Other Error in Main.");    }
*/
    }
}