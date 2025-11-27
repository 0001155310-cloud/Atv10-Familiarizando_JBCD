import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {

    // CREATE
    public void inserir(Professor professor) {
        String sql = "INSERT INTO professores (nome, idade, cpf, email, estado, cidade) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, professor.getNome());
            stmt.setInt(2, professor.getIdade());
            stmt.setString(3, professor.getCpf());
            stmt.setString(4, professor.getEmail());
            stmt.setString(5, professor.getEstado());
            stmt.setString(6, professor.getCidade());

            stmt.executeUpdate();
            System.out.println("Professor inserido com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao inserir professor: " + e.getMessage());
        }
    }


    // READ ALL
    public List<Professor> listar() {
        List<Professor> lista = new ArrayList<>();
        String sql = "SELECT * FROM professores";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Professor p = new Professor(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getInt("idade"),
                        rs.getString("cpf"),
                        rs.getString("estado"),
                        rs.getString("cidade")
                );

                lista.add(p);
            }

        } catch (Exception e) {
            System.out.println("Erro ao listar professores: " + e.getMessage());
        }

        return lista;
    }


    // UPDATE
    public void atualizar(Professor professor) {
        String sql = "UPDATE professores SET nome=?, idade=?, cpf=?, email=?, estado=?, cidade=? "
                + "WHERE id=?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, professor.getNome());
            stmt.setInt(2, professor.getIdade());
            stmt.setString(3, professor.getCpf());
            stmt.setString(4, professor.getEmail());
            stmt.setString(5, professor.getEstado());
            stmt.setString(6, professor.getCidade());
            stmt.setInt(7, professor.getId());

            stmt.executeUpdate();
            System.out.println("Professor atualizado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao atualizar professor: " + e.getMessage());
        }
    }


    // DELETE
    public void deletar(int id) {
        String sql = "DELETE FROM professores WHERE id=?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

            System.out.println("Professor deletado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao deletar professor: " + e.getMessage());
        }
    }
}
