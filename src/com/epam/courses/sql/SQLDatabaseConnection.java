package com.epam.courses.sql;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class SQLDatabaseConnection {
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //DriverManager.registerDriver(new SQLServerDriver());
        Statement st = null;
        ResultSet rs = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost;encrypt=true;databaseName=AdventureWorks2019;user=Sofiia;password=1234Saf7890_;trustServerCertificate=true;";
        Connection con = DriverManager.getConnection(connectionUrl);
        st = con.createStatement();
        rs = st.executeQuery("SELECT LastName FROM Person.Person");
        while (rs.next()) {
            System.out.println(rs.getString("LastName"));
        }

        con.close();




    }

    private static class SQLServerDriver implements Driver {
        @Override
        public Connection connect(String url, Properties info) throws SQLException {
            return null;
        }

        @Override
        public boolean acceptsURL(String url) throws SQLException {
            return false;
        }

        @Override
        public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
            return new DriverPropertyInfo[0];
        }

        @Override
        public int getMajorVersion() {
            return 0;
        }

        @Override
        public int getMinorVersion() {
            return 0;
        }

        @Override
        public boolean jdbcCompliant() {
            return false;
        }

        @Override
        public Logger getParentLogger() throws SQLFeatureNotSupportedException {
            return null;
        }
    }
}
