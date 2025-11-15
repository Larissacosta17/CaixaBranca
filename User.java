package login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement; //  'java.sql.Statement' estava separado

public class User { // <<-- ERA: ( , AGORA É: {

    public Connection conectarBD() {
        Connection conn = null;
        try {
            // O nome do driver moderno é esse (é sem .newInstance())
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            // Aqui era 'mysq1' (com o número 1), o certo é 'mysql' (com L)
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            
            conn = DriverManager.getConnection(url);
            
        } catch (Exception e) {}
        return conn;
    }

    public String nome = "";
    public boolean result = false;

    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        
        
        sql += "select nome from usuarios ";
        sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + ";"; 
        
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
            // Faltava fechar as coisas
            rs.close();
            st.close();
            conn.close();

        } catch (Exception e) {}
        return result;
    }
} // <<-- ERA: ) , AGORA É: }