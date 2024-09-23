package com.github.woxox.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnector {

    private static String ID = "";
    private static String PASSWORD = "";

    public final Connection getConnection() throws Exception {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://3.36.243.233:3306/StockMarketDB", ID, PASSWORD);
        } catch (Exception e) {
            System.out.println("[DbConnector.getConnection] SQLException" + e.toString());
            throw new Exception("[DbConnector.getConnection] SQLException");
        }

        return con;
    }

}
