/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tccisabela;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionManager {

    private static ConnectionManager CM;
    private static ConnectionFactory CR;

    private ConnectionManager() {
        ConnectionManager.CR = new JDBCPostgreSQLConnection();
    }

    public static ConnectionManager getInstance() {
        if (CM == null) {
            CM = new ConnectionManager();
        }

        return CM;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        return ConnectionManager.CR.getConnection();
    }
}
