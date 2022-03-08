package metro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PassengerAccount {
    //Object from dataBase
    dataBase object = new dataBase();

    //Email 
     public int ValidEmail(String Email){
        char[] arr = new char[Email.length()];
        if (Email.endsWith("@gmail.com") || Email.endsWith("@yahoo.com") || Email.endsWith("@hotmail.com"))
        {
            arr = Email.toCharArray();
            if (Character.isLetter(arr[0]))
            {
                return 1;  
               
            }
            else
            {
                //System.out.println("Error: the Email must start with letter");  
                return -1;  
            }
        }
        else 
        {
            //System.out.println("Error: the Email must end with @gmail.com"); 
            return -1;   
        }
    }
    
    //Password
    public int ValidPassword(String Password){
        char[] x;
        int check1 = 0, check2 = 0, check3 = 0;
        if (Password.length() > 6)
        {    
            x = Password.toCharArray();
            for (int i = 0; i < x.length; i++)
            {
                if (Character.isLowerCase(x[i])) 
                    check1 = 1; 
                if (Character.isUpperCase(x[i]))
                    check2 = 1; 
                if (Character.isDigit(x[i]))
                    check3 = 1;
            }
            if ((check1 >= 1) && (check2 >= 1) && (check3 >= 1))  //GUI
                return 1;  //GUI
            else
            {
                //System.out.println("Error: the password must contains at least one small letter or upper letter or number");
                return -1;  //GUI
            }
        } 
        else 
        { 
            //System.out.println("Error: the number of element must be more than 6");  //GUI
            return -1; //GUI
        }    
    }
    
    //Registeration
    public int registeration(String name ,String Email, String Password, String age, String job){
        int check1 = ValidEmail(Email);
        int check2=ValidPassword(Password);
        if(check1 == 1 && check2==1){
            object.insert(name, Email, Password, job, age);
            return 1;
        }
        else 
            return -1;
    }
    
    //function to check if email is alredy in database
    public int checkEmail(String Email){
        String selectEmail=null;
        try{
            Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Abdelrahman", "Abdelrahman","Abdelrahman");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Abdelrahman.PassengerAccount");
            ResultSet results = statement.executeQuery();
            Statement st = connection.createStatement();
      
            String s = "SELECT * FROM Abdelrahman.PassengerAccount where Email ='"+Email+"' ";
            ResultSet rs = st.executeQuery(s);
            if(rs.next())
               selectEmail = rs.getString("Email"); 
                //System.out.println(selectEmail);
            connection.close();
        }
        catch(SQLException E){
            E.printStackTrace();
        }
        if(Email.equals(selectEmail))
            return 1;
        else
            return -1;
    }
    
    //function to check if password is alredy in database
    public int checkPassword(String Password){
        String selectPassword=null;
        try{
            Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Abdelrahman", "Abdelrahman","Abdelrahman");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Abdelrahman.PassengerAccount");
            ResultSet results = statement.executeQuery();
            Statement st = connection.createStatement();
      
            String s = "SELECT * FROM Abdelrahman.PassengerAccount where Password ='"+Password+"' ";
            ResultSet rs = st.executeQuery(s);
            if(rs.next())
               selectPassword = rs.getString("Password"); 
                //System.out.println(selectPassword);
            connection.close();
        }
        catch(SQLException E){
            E.printStackTrace();
        }
        if(Password.equals(selectPassword))
            return 1;
        else
            return -1;
    }
    //login
    public int login(String Email, String password){
        int returnEmail = checkEmail(Email);
        int returnPassword = checkPassword(password);
        if(returnEmail == 1 && returnPassword == 1)
            return 1;
        else 
            return -1;
    }
    //Update
    public int UpdateAccount(String ID, String name ,String Email, String password, String age, String job){
        int check1 = ValidEmail(Email);
        int check2=ValidPassword(password);
        if(check1 == 1 && check2==1){
            object.update(ID, name, Email, password, job, age);
            return 1;
        }
        else 
            return -1;
    }
    
}
