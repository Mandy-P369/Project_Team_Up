/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Staff;

/**
 *
 * @author Ayush
 */
import java.sql.*;

public class connect {

    Connection con;
    Statement s;
    ResultSet rs;
    public void getConnect() {
        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "AAYUSH", "PATERIYA");
            s = con.createStatement();
        } catch (Exception e) {
            System.out.println("the error is" + e);
        }
    }
}
