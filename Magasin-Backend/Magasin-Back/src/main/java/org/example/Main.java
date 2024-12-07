package org.example;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            GestionProduit gestionProduit = new GestionProduit();
            gestionProduit.gererProduit(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}