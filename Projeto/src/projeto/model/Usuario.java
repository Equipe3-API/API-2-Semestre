package projeto.model;

public class Usuario{
    
    private int id;
    private String nome;
    private String userName;
    private String senha;
    private String email;
    private int funcaoUsuario;
    
    public Usuario(String nome, String userName, String senha, String email, int tipo){
        this.nome = nome;
        this.senha = senha;
        this.funcaoUsuario = tipo;
        this.email = email;
        this.userName = userName;
    }
    
    public Usuario(int id, String nome, String userName, String senha, String email, int tipo){
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.funcaoUsuario = tipo;
        this.email = email;
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public int getFuncaoUsuario() {
        return funcaoUsuario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setFuncaoUsuario(int tipoUsuario) {
        this.funcaoUsuario = tipoUsuario;
    }
    
    
}
