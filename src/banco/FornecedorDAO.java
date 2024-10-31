package banco;

import fil.fil.fitness.Fornecedor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class FornecedorDAO {
    private Connection getConnection() throws ClassNotFoundException, SQLException {
        // Carrega o driver JDBC do Apache Derby
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        return DriverManager.getConnection(
            "jdbc:derby://localhost:1527/filfil", 
            "filfil", 
            "filfil"
        );
    }

    private void closeConnection(Connection c1) {
        if (c1 != null) {
            try {
                c1.close();
            } catch (SQLException ex) {
                
            }
        }
    }

    public void incluir(Fornecedor fornecedor) {
        Connection c1 = null;
        try {
            c1 = getConnection();
            PreparedStatement st;
            st = c1.prepareStatement(
                    "INSERT INTO FORNECEDOR (NUMFORNECEDOR, NOME, STATUS, TELEFONE) VALUES (?, ?, ?, ?)"
            );
            st.setInt(1, Fornecedor.numFornecedor);
            st.setString(2, Fornecedor.nome);
            st.setString(3, Fornecedor.status);
            st.setInt(4, Fornecedor.telefone);
            st.executeUpdate(); // Executa a inserção
        } catch (ClassNotFoundException | SQLException ex) {
        }
         finally {
            closeConnection(c1); // Fecha a conexão
        }
    }

    public void excluir(int numFornecedor) {
        Connection c1 = null;
        try {
            c1 = getConnection();
            PreparedStatement st = c1.prepareStatement(
                "DELETE FROM FORNECEDOR WHERE NUMFORNECEDOR = ?"
            );
            st.setInt(1, numFornecedor);
            st.executeUpdate(); // Executa a exclusão
        } catch (ClassNotFoundException | SQLException ex) {
        }
       
         finally {
            closeConnection(c1); // Fecha a conexão
        }
    }

    public List<Fornecedor> listar() {
        ArrayList<Fornecedor> fornecedores = new ArrayList<>();
        Connection c1 = null;
        try {
            c1 = getConnection();
            Statement st = c1.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM FORNECEDOR");
            while (rs.next()) {
                fornecedores.add(new Fornecedor(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getInt(4)
                ));
            }
        } catch (ClassNotFoundException | SQLException ex) {
           
            
        }
       
         finally {
            closeConnection(c1); // Fecha a conexão
        }
        return fornecedores; // Retorna a lista de fornecedores
    }
}