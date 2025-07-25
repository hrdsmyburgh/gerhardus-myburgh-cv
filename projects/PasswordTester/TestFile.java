//CMPG 211 Assignment 5
//Hardus Myburgh 40923894 

public class TestFile {
    public static void main(String[] args) {
        
        MongoDB mongoDB = new MongoDB("mongodb://localhost", "admin", "admin");
        try {
            mongoDB.createConnection();
            mongoDB.executeQuery("SELECT * FROM collection");
            mongoDB.closeConnection();
        } catch (ConnectionException | ExecutionException e) {
            e.printStackTrace();
        }

        MYSQL mysql = new MYSQL("jdbc:mysql://localhost", "admin", "admin");
        try {
            mysql.createConnection();
            mysql.executeQuery("SELECT * FROM table");
            mysql.closeConnection();
        } catch (ConnectionException | ExecutionException e) {
            e.printStackTrace();
        }
 
        SQLServer sqlServer = new SQLServer("jdbc:sqlserver://localhost", "admin", "admin");
        try {
            sqlServer.createConnection();
            sqlServer.executeQuery("SELECT * FROM table");
            sqlServer.closeConnection();
        } catch (ConnectionException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}