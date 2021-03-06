package projeto.connection.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projeto.Main;
import projeto.model.Projeto;

public class ProjetoDAO {
     public void createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS projetos(id int AUTO_INCREMENT, descricao text, nome varchar(30) not null, idcliente int, PRIMARY KEY (id), foreign key(idcliente) references usuarios(id)) DEFAULT CHARSET=utf8;";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.execute();
        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }
     
    public void addProjetoToDatabase(Projeto projeto){
        String sql = "INSERT INTO projetos(nome,descricao,idcliente) VALUES (?,?,?);";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.setString(1, projeto.getNome());
            statement.setString(2, projeto.getDescricao());
            statement.setInt(3, projeto.getIdCliente());
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void editar(Projeto projeto){
        String sql = "UPDATE projetos SET nome=?, descricao=? WHERE id=?";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.setString(1, projeto.getNome());
            statement.setString(2, projeto.getDescricao());
            statement.setInt(3, projeto.getId());
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void deleteProjeto(int idprojeto){
        String sql = "DELETE FROM projetos WHERE id = ?;";
        Main.getManager().getmColeDAO().deleteMensagemPorProjetoFromDatabase(idprojeto);
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.setInt(1, idprojeto);

            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public List<Projeto> getTodosProjetos(){
        List<Projeto> lista = new ArrayList<>();
        String sql = "SELECT * FROM projetos;";
       
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Projeto projeto = new Projeto(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("descricao"),
                        resultSet.getInt("idcliente")
                );
                
                lista.add(projeto);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return lista;
    }

    public List<Projeto> getProjetosPorNome(String nome){
        List<Projeto> projetos = new ArrayList<>();

        
        String sql = "SELECT * FROM projetos where nome like '%" + nome + "%'";
       
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Projeto projeto = new Projeto(
                            resultSet.getInt("id"),
                            resultSet.getString("nome"),
                            resultSet.getString("descricao"),
                            resultSet.getInt("idcliente")
                );
                projetos.add(projeto);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return projetos;
    }
    
        public List<Projeto> getProjetosPorCliente(int idCliente){
        List<Projeto> projetos = new ArrayList<>();

        
        String sql = "SELECT * FROM projetos where idcliente like '%" + idCliente + "%'";
       
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Projeto projeto = new Projeto(
                            resultSet.getInt("id"),
                            resultSet.getString("nome"),
                            resultSet.getString("descricao"),
                            idCliente
                );
                projetos.add(projeto);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return projetos;
    }

    public Projeto getProjetoPorID(int id){
        
        String sql = "SELECT * FROM projetos where id = ?;";
       
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                return new Projeto(
                            resultSet.getInt("id"),
                            resultSet.getString("nome"),
                            resultSet.getString("descricao"),
                            resultSet.getInt("idcliente")
                );
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return null;
    }
}
