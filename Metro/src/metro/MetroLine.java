package metro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

public class MetroLine {
    dataBase obj=new dataBase();
    
    //functio to get the order of station
    public String orderOFStation(String station){
        String order = null ;
        try{
            Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Abdelrahman", "Abdelrahman","Abdelrahman");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Abdelrahman.Stations");
            ResultSet results = statement.executeQuery();
            Statement st = connection.createStatement();
      
            String s = "SELECT * FROM Abdelrahman.Stations where stationName ='"+station+"' ";
            ResultSet rs = st.executeQuery(s);
            if(rs.next())
                order = rs.getString("stationOrder"); 

            connection.close();
        }
        catch(SQLException E){
            E.printStackTrace();
        }
        return order ;
    }
    
    //function to calulate number of stations per line
    public int numberOfStations(String start , String end){
        String startOrder =  orderOFStation(start);
        char[] startArr= new char[startOrder.length()];
        startArr=startOrder.toCharArray();
        String startTemp = startOrder.substring(2,4);
        
        String endOrder = orderOFStation(end);
        char[] endArr= new char[endOrder.length()];
        endArr=endOrder.toCharArray();
        String endTemp = endOrder.substring(2,4);
       
        if(startArr[0] == endArr[0]){
            int startNum = Integer.parseInt(startTemp);
            int endNum = Integer.parseInt(endTemp);
            return Math.abs(endNum - startNum)+1;
        }
        else{
            //System.out.println("Error");
            return -1;
        }
    }
    
    
    
}
