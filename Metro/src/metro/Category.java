package metro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Category {
     
    public String color(String start , String end){
        Tickets obj = new Tickets();
        int price = obj.priceCalculation(start ,end);
        String color =null;
        try{
            Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Abdelrahman", "Abdelrahman","Abdelrahman");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Abdelrahman.Category");
            ResultSet results = statement.executeQuery();
            Statement st = connection.createStatement();
            
            if(price == 5){
                String s = "SELECT * FROM Abdelrahman.Category where Colour = 'Yellow'";
                ResultSet rs = st.executeQuery(s);
                if(rs.next())
                    color = rs.getString("Colour"); 
                connection.close();
                return color;
            }
            else if(price == 7){
                String s = "SELECT * FROM Abdelrahman.Category where Colour = 'Green'";
                ResultSet rs = st.executeQuery(s);
                if(rs.next())
                    color = rs.getString("Colour"); 
                connection.close();
                return color;
            }
            else if(price == 10){
                String s = "SELECT * FROM Abdelrahman.Category where Colour = 'Red'";
                ResultSet rs = st.executeQuery(s);
                if(rs.next())
                    color = rs.getString("Colour"); 
                connection.close();
                return color;
            }
        } 
        catch (SQLException ex)
        {
            System.out.println("Error while communicating with the database");
            System.out.println("not Connected");
        }
        return null;
    }
}
