//CMPG 211 Assignment 5
//Hardus Myburgh 40923894 

import java.util.Random;


class ConnectionException extends Exception {
    public ConnectionException() {
        super();
    }

    public ConnectionException(String message) {
        super(message);
    }
}

class ExecutionException extends Exception {
    public ExecutionException() {
        super();
    }

    public ExecutionException(String message) {
        super(message);
    }
}

interface DatabaseIO {
    void createConnection() throws ConnectionException;

    void executeQuery(String query) throws ExecutionException;

    void closeConnection() throws ConnectionException;
}

class Database implements DatabaseIO {
    private String url;
    private String username;
    private String password;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

	@Override
    public void createConnection() throws ConnectionException {
        
    }
	
    @Override
    public void executeQuery(String query) throws ExecutionException {
        if (!"admin".equals(username) || !"admin".equals(password)) {
            throw new ExecutionException("Password or Username is invalid");
        } else {
            System.out.println("Executing query: " + query);
        }
    }
	
	@Override
    public void closeConnection() throws ConnectionException {
        
    }
	
}

class MongoDB extends Database {
    public MongoDB(String url, String username, String password) {
        setUrl(url);
        setUsername(username);
        setPassword(password);
    }

    @Override
    public void createConnection() throws ConnectionException {
        double randNum = Math.random();
        if (randNum < 0.5) {
            throw new ConnectionException("Connection failed for MongoDB");
        } else {
            System.out.println("MongoDB connection created successfully.");
        }
    }

    @Override
    public void closeConnection() throws ConnectionException {
        double randNum = Math.random();
        if (randNum < 0.5) {
            throw new ConnectionException("Closing connection failed for MongoDB");
        } else {
            System.out.println("MongoDB connection closed successfully.");
        }
    }
}

class MYSQL extends Database {
    public MYSQL(String url, String username, String password) {
        setUrl(url);
        setUsername(username);
        setPassword(password);
    }

    @Override
    public void createConnection() throws ConnectionException {
        double randNum = Math.random();
        if (randNum < 0.2) {
            throw new ConnectionException("Connection failed for MYSQL");
        } else {
            System.out.println("MYSQL connection created successfully.");
        }
    }

    @Override
    public void closeConnection() throws ConnectionException {
        double randNum = Math.random();
        if (randNum < 0.2) {
            throw new ConnectionException("Closing connection failed for MYSQL");
        } else {
            System.out.println("MYSQL connection closed successfully.");
        }
    }
}


class SQLServer extends Database {
    public SQLServer(String url, String username, String password) {
        setUrl(url);
        setUsername(username);
        setPassword(password);
    }

    @Override
    public void createConnection() throws ConnectionException {
        double randNum = Math.random();
        if (randNum < 0.7) {
            throw new ConnectionException("Connection failed for SQLServer");
        } else {
            System.out.println("SQLServer connection created successfully.");
        }
    }

    @Override
    public void closeConnection() throws ConnectionException {
        double randNum = Math.random();
        if (randNum < 0.7) {
            throw new ConnectionException("Closing connection failed for SQLServer");
        } else {
            System.out.println("SQLServer connection closed successfully.");
        }
    }
}



