package banco;

import fil.fil.fitness.ModaPraia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class ModaPraiaDao {
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

    public void incluir(ModaPraia modapraia) {
        Connection c1 = null;
        try {
            c1 = getConnection();
            PreparedStatement st;
            st = c1.prepareStatement(
                    "INSERT INTO MODAPRAIA (NUMROUPA, TAMANHO, COR, PREÇO, QUANTIDADEDISPONIVEL, STATUS, ESTAMPA, MATERIAL,TIPOROUPA ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"
            );
            st.setInt(1, ModaPraia.numRoupa);
            st.setString(2, ModaPraia.tamanho);
            st.setString(3, ModaPraia.cor);
            st.setfloat(4, ModaPraia.preço);
            st.setInt(5, ModaPraia.quantidadeDisponivel);
            st.setString(6, ModaPraia.statusEstoque);
            st.setString(7, ModaPraia.estampa);
            st.setString(8, ModaPraia.tipoRoupa);
            st.setString(9, ModaPraia.material);
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
                "DELETE FROM MODAPRAIA WHERE NUMROUPA = ?"
            );
            st.setInt(1, numRoupa);
            st.executeUpdate(); // Executa a exclusão
        } catch (ClassNotFoundException | SQLException ex) {
        }
       
         finally {
            closeConnection(c1); // Fecha a conexão
        }
    }

    public List<ModaPraia> listar() {
        ArrayList<ModaPraia> roupaspraia = new ArrayList<>();
        Connection c1 = null;
        try {
            c1 = getConnection();
            Statement st = c1.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM MODAPRAIA");
            while (rs.next()) {
                roupaspraia.add(new ModaPraia(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getFloat(4),
                    rs.getInt(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9)
                ));
            }
        } catch (ClassNotFoundException | SQLException ex) {
           
            
        }
       
         finally {
            closeConnection(c1); // Fecha a conexão
        }
        return roupaspraia; // Retorna a lista de roupas de praia
    }
}