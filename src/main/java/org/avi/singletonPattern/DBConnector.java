package org.avi.singletonPattern;

public class DBConnector {

    private static DBConnector connector;

    public DBConnector() {
    }

    // Double Locking
    public DBConnector getInstance() {
        if(connector == null) {
            synchronized (DBConnector.class) {
                if(connector == null) {
                    connector = new DBConnector();
                }
            }
        }
        return connector;
    }
}
