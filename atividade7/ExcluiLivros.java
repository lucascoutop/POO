package br.com.newton.atividade7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExcluiLivros {
    public void excluirLivro(int idLivro) {
        String sql = "DELETE FROM Livros WHERE id = ?";

        try (Connection connection = ConexaoDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idLivro);
            statement.executeUpdate();
            System.out.println("Livro excluído com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

