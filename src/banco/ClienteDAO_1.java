package banco;

import fil.fil.fitness.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class ClienteDAO_1 {
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

    public void incluir(Cliente cliente) {
        Connection c1 = null;
        try {
            c1 = getConnection();
            PreparedStatement st = c1.prepareStatement(
                "INSERT INTO CLIENTE (NUMCLIENTE, NOME, CPF, TELEFONE) VALUES (?, ?, ?, ?)"
            );
            st.setInt(1, cliente.numCliente);
            st.setString(2, cliente.nome);
            st.setString(3, cliente.cpf);
            st.setInt(4, cliente.telefone);
            st.executeUpdate(); // Executa a inserção
        } catch (ClassNotFoundException | SQLException ex) {
        }
         finally {
            closeConnection(c1); // Fecha a conexão
        }
    }

    public void excluir(int numCliente) {
        Connection c1 = null;
        try {
            c1 = getConnection();
            PreparedStatement st = c1.prepareStatement(
                "DELETE FROM CLIENTE WHERE NUMCLIENTE = ?"
            );
            st.setInt(1, numCliente);
            st.executeUpdate(); // Executa a exclusão
        } catch (ClassNotFoundException | SQLException ex) {
        }
       
         finally {
            closeConnection(c1); // Fecha a conexão
        }
    }

    public List<Cliente> listar() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Connection c1 = null;
        try {
            c1 = getConnection();
            Statement st = c1.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM CLIENTE");
            while (rs.next()) {
                clientes.add(new Cliente(
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
        return clientes; // Retorna a lista de clientes
    }
}