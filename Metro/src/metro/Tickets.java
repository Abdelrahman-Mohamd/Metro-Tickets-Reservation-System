package metro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Tickets {
    
    //return price of tickets
    public int priceCalculation(String start , String end){
        MetroLine obj = new MetroLine();
        int numberOfStations = obj.numberOfStations(start, end);
        if(numberOfStations <= 9)
            return 5;
        else if(numberOfStations <= 16)
            return 7;
        //if(numberOfStations > 16)
        else 
            return 10;  
    }
    
    //
    private boolean check(String CVV,String number, String endDate){
        int c1 = 0 , c2 = 0, c3 = 0;
        char[] x;
        x = CVV.toCharArray();
        for (int i = 0; i < CVV.length(); i++)
            if(CVV.length() == 3 && Character.isDigit(x[i]))
                c1 =1;
        x = number.toCharArray();
        for (int i = 0; i < number.length(); i++)
            if(number.length() == 16 && Character.isDigit(x[i]))
                c2 =1;
        if(endDate.length() == 5)
            c3=1;
        if(c1 == 1 && c2 == 1 && c3 == 1)
            return true;
        else
            return false;
    }
    
    //function for credit card

    public int insertCreditCard( String CVV,String number, String endDate)
    {
        boolean f_check = check(CVV, number, endDate);
        if(f_check == true)
        {
            dataBase obj = new dataBase();
            try
            {
                Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Abdelrahman", "Abdelrahman","Abdelrahman");
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM Abdelrahman.CreditCard");
                ResultSet results = statement.executeQuery();      
                PreparedStatement add = connection.prepareStatement("insert into Abdelrahman.CreditCard(Numberr,EndDate,CVV) values ('"+number+"' , '"+endDate+"' ,'"+CVV+"' )");
                int row = add.executeUpdate();        
            }
            catch(SQLException E)
            {
                E.printStackTrace();
            } 
            obj.dbConnection();
            return 1;
    }        
        else
        return -1;
    }
}
//Select count(*) from "table name"
//SELECT Abdelrahman.PASSENGERACCOUNT.ID
//FROM Abdelrahman.PASSENGERACCOUNT
//INNER JOIN Abdelrahman.CREDITCARD
//ON Abdelrahman.PASSENGERACCOUNT.ID = Abdelrahman.CREDITCARD.ID;
//SELECT Abdelrahman.PASSENGERACCOUNT.ID FROM Abdelrahman.PASSENGERACCOUNT INNER JOIN Abdelrahman.CREDITCARD ON Abdelrahman.PASSENGERACCOUNT.ID = Abdelrahman.CREDITCARD.ID