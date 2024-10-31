package banco;

import fil.fil.fitness.ModaAcademia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class ModaAcademiaDAO {
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

    public void incluir(ModaAcademia modaaccademia) {
        Connection c1 = null;
        try {
            c1 = getConnection();
            PreparedStatement st;
            st = c1.prepareStatement(
                    "INSERT INTO MODAACADEMIA (NUMROUPA, TAMANHO, COR, PREÇO, QUANTIDADEDISPONIVEL, STATUS, TIPOROUPA, MATERIAL) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
            );
            st.setInt(1, ModaAcademia.numRoupa);
            st.setString(2, ModaAcademia.tamanho);
            st.setString(3, ModaAcademia.cor);
            st.setfloat(4, ModaAcademia.preço);
            st.setInt(5, ModaAcademia.quantidadeDisponivel);
            st.setString(6, ModaAcademia.statusEstoque);
            st.setString(7, ModaAcademia.tipoRoupa);
            st.setString(8, ModaAcademia.material);
            st.executeUpdate(); // Executa a inserção
        } catch (ClassNotFoundException | SQLException ex) {
        }
         finally {
            closeConnection(c1); // Fecha a conexão
        }
    }

    public void excluir(int numRoupa) {
        Connection c1 = null;
        try {
            c1 = getConnection();
            PreparedStatement st = c1.prepareStatement(
                "DELETE FROM MODAACADEMIA WHERE NUMROUPA = ?"
            );
            st.setInt(1, numRoupa);
            st.executeUpdate(); // Executa a exclusão
        } catch (ClassNotFoundException | SQLException ex) {
        }
       
         finally {
            closeConnection(c1); // Fecha a conexão
        }
    }

    public List<ModaAcademia> listar() {
        ArrayList<ModaAcademia> roupasacademia = new ArrayList<>();
        Connection c1 = null;
        try {
            c1 = getConnection();
            Statement st = c1.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM MODAACADEMIA");
            while (rs.next()) {
                roupasacademia.add(new ModaAcademia(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getFloat(4),
                    rs.getInt(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8)
                ));
            }
        } catch (ClassNotFoundException | SQLException ex) {
           
            
        }
       
         finally {
            closeConnection(c1); // Fecha a conexão
        }
        return roupasacademia; // Retorna a lista de roupas de academia
    }
}