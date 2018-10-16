package lab10;

import java.sql.*;

public class mydatabaseDemo {
    private Connection connect(){
        String path = "jdbc:sqlite:D:\\360411760006\\src\\lab10\\myDatabase.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(path);
            System.out.println("Databeas is Connected.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Can't connect to Detabeas.");
        }
        return conn;

    }//connedt

    private void readData(){
        String sql = "select * from student";
        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            //loop
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                        rs.getString("frstname") + "\t" +
                        rs.getString("lastname") + "\t" +
                        rs.getInt("age"));
            }//while
        }catch (SQLException e) {
            e.printStackTrace();
        }

    //readData

    }//readData


    public static void main(String[] args) {
        mydatabaseDemo myDB = new mydatabaseDemo();
        myDB.readData();






    }//main






}//class
