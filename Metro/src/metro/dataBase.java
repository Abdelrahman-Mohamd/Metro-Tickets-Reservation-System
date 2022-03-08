package metro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
public class dataBase {
    //data Base Connection
    public void dbConnection(){
        
        try{
            Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Abdelrahman", "Abdelrahman","Abdelrahman");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Abdelrahman.PassengerAccount");
            ResultSet results = statement.executeQuery();
            System.out.println("Connected");
        } 
        catch (SQLException ex)
        {
            System.out.println("Error while communicating with the database");
            System.out.println("not Connected");
        }
    }
    
    //function to display records from data base
    public void display(){ 
        try  {
       
                Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Abdelrahman", "Abdelrahman","Abdelrahman");
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM Abdelrahman.PassengerAccount");
                ResultSet results = statement.executeQuery();
                while (results.next()) {
        
                    String ID = results.getString("ID");
                    String Name = results.getString("Name");
                    String Email = results.getString("Email");
                    String Password = results.getString("Password");
                    String Job = results.getString("Job");
                    String Age = results.getString("Age");
                    String StartStation = results.getString("StartStation");
                    String EndStation = results.getString("EndStation");
                    String Date = results.getString("Date");
                    System.out.println("ID: " + ID+"\t"+"Name: "+Name+"\t"+"Email: "+Email+"\t"+"Password: "+Password+"\t"+
                                       "Job: "+Job+"\t"+"Age: "+Age+"\t"+"Start Station: "+StartStation
                                       +"\t"+"End Station: "+EndStation+"\t"+"Date: "+Date);
                }
        }  catch (SQLException ex) {
                System.out.println("Error while communicating with the database");
        } 
    }
    

    //function to remove records from data base
    public void remove(int ID)
    {
      try
        {
            Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Abdelrahman", "Abdelrahman","Abdelrahman");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Abdelrahman.PassengerAccount");
            ResultSet results = statement.executeQuery();
            
            String sql = "Delete from Abdelrahman.PassengerAccount where ID ="+ID+" ";
            statement = connection.prepareStatement(sql);
            statement.execute();
            
        }
        catch(SQLException E)
        {
         E.printStackTrace();
        }
      dbConnection();
    }
    //function to insret data in data base
    public void insert(String name, String Email, String password, String job, String age)
    {
      try
        {
            Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Abdelrahman", "Abdelrahman","Abdelrahman");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Abdelrahman.PassengerAccount");
            ResultSet results = statement.executeQuery();      
         PreparedStatement add = connection.prepareStatement("insert into Abdelrahman.PassengerAccount(Name,Email,Password,Job,Age,StartStation,EndStation,Date) values ('"+name+"' , '"+Email+"' , '"+password+"' , '"+job+"' , '"+age+"' , '"+null+"' , '"+null+"' , '"+null+"')");
         int row = add.executeUpdate();        
        }
        catch(SQLException E)
        {
         E.printStackTrace();
        }
        dbConnection();       
    }        

   //function to update records
    public void update(String ID, String name, String Email, String password, String job, String age)
    {
        Integer idd = Integer.parseInt(ID);
        int id = idd;
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Abdelrahman", "Abdelrahman","Abdelrahman");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Abdelrahman.PassengerAccount");
            ResultSet results = statement.executeQuery();
            
            String sql = "Update Abdelrahman.PassengerAccount set PASSWORD='"+password+"'"+",EMAIL= '"+Email+"'"+",NAME = '"+name+
                "'"+",JOB= '"+job+"'"+",AGE= '"+age+"'"+" where ID = "+id +" ";
            statement = connection.prepareStatement(sql);
            statement.execute();
        }
        catch(SQLException E)
        {
         E.printStackTrace();
        }
      dbConnection();
    }
}
    
   