package org.example.exepmulab;
import java.awt.desktop.SystemSleepEvent;
import java.sql.*;
import java.util.Scanner;

class MainApp {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sys";
        String sql = "select * from persoane";
        Connection connection = DriverManager.getConnection(url, "root", "Allah30023002");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        afisare(statement,"Afisare inainte de adaugare");
        adaugare(connection);
        afisare(statement,"Afisare dupa de adaugare");
        adaugaExcursie(connection);


        connection.close();
        statement.close();
        rs.close();
    }

    public static void adaugare(Connection connection) {
        String sql = "INSERT INTO persoane (nume, varsta) VALUES ( ?, ?)";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numele persoanei: ");
        String nume = scanner.nextLine();
        System.out.println("Introud varsta persoanei: ");
        int varsta = scanner.nextInt();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, nume);
            ps.setInt(2, varsta);

            int nr_randuri = ps.executeUpdate();
            System.out.println("\nNumar randuri afectate de adaugare=" + nr_randuri);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void afisare(Statement statement, String mesaj) {
        String sql = "select * from persoane";
        System.out.println("\n---" + mesaj + "---");
        try (ResultSet rs = statement.executeQuery(sql)) {
            while (rs.next())
                System.out.println("id=" + rs.getInt(1) + ", nume= "
                        + rs.getString(2) + ",varsta=" + rs.getInt(3));
        } catch (SQLException
                e) {
            e.printStackTrace();
        }

    }
    public static void adaugaExcursie(Connection connection) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele persoanei: ");
        String nume = scanner.nextLine();

        if (!verificaPersoanaExistenta(connection, nume)) {
            System.out.println("Persoana nu exista in baza de date. Va rugam adaugati mai intai persoana.");
            return;
        }

        System.out.println("Introduceti destinatia excursiei: ");
        String destinatie = scanner.nextLine();

        System.out.println("Introduceti data excursiei (YYYY-MM-DD): ");
        String anul = scanner.nextLine();

        String sql = "INSERT INTO excursii (destinatia, anul) VALUES (?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, destinatie);
            ps.setString(2, anul);

            int nrRanduriAfectate = ps.executeUpdate();
            System.out.println("Numar randuri afectate de adaugare: " + nrRanduriAfectate);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean verificaPersoanaExistenta(Connection connection, String nume) {
        String sql = "SELECT COUNT(*) AS count FROM persoane WHERE nume = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, nume);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("count");
                return count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static void stergerePersoana(Connection connection,int id){
        String sql = "delete from persoane where id = ?";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1,id);
            int nr_randuri=ps.executeUpdate();
            System.out.println("\nNumar randuri afectate de modificare="+nr_randuri);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

