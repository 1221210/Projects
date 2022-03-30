
package netbeanstosqlexamplpe;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class NetBeansToSQLExample {

	public static void main(String[] args) {
        
       final String DATABASE_URL = "jdbc:mysql://localhost:3306/dogadoptions";
       final String SELECT_QUERY = "SELECT d.breed, d.age, d.weight, "+
               "FROM dogs AS d ";
       
       try
       {
           Connection connection = DriverManager.getConnection(DATABASE_URL, "root", "yoast");
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
           {
               ResultSetMetaData metaData = resultSet.getMetaData();
               int numberOfColumns = metaData.getColumnCount();
               System.out.printf("Some Dogs from DogAdpotions: %n%n");
               
               for (int i = 1; 1< numberOfColumns; i++)
                   System.out.printf("%-8s\t", metaData.getColumnName(i));
               System.out.println();
               
               while (resultSet.next())
               {
                   for (int i = 1; i<= numberOfColumns; i++)
                       System.out.printf("%-8s\t", resultSet.getObject(i));
                      System.out.println();
               }
           }
          }
           catch (SQLException sqlException)
                   {
                   sqlException.printStackTrace();
                   }
       }

}


