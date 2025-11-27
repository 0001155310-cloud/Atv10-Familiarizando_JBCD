//Importando bibliotecas para conexão do SQL
import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {

    // 1. Definição das constantes de conexão:
    private static final String URL = "jdbc:mysql://localhost:3306/escola?useSSL=false&serverTimezone=UTC"; // Endereço, porta e nome do banco.
    private static final String USER = "root"; // Usuário do banco.
    private static final String PASSWORD = ""; //Senha (padrão sempre null)

    //Estabelecendo conexão

    //Método de conexão
    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //[i] COnsertando erro de driver não encontrado
            // Tenta estabelecer a conexão usando as credenciais definidas.
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            // Em caso de falha na conexão, lança uma exceção em tempo de execução.
            throw new RuntimeException("Erro ao conectar: " + e.getMessage());
        }
    }
}
