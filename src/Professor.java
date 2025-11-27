import java.sql.Date;

public class Professor {

    private int id;
    private String nome;
    private int idade;
    private String cpf;
    private String email;
    private String estado;
    private String cidade;
    private Date data_cadastro;
    private Date data_atualizacao;
    private Date data_remocao;

    // Construtor para INSERT
    public Professor(String nome, String email, int idade, String cpf, String estado, String cidade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.cpf = cpf;
        this.estado = estado;
        this.cidade = cidade;
    }

    // Construtor para SELECT e UPDATE
    public Professor(int id, String nome, String email, int idade, String cpf, String estado, String cidade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.cpf = cpf;
        this.estado = estado;
        this.cidade = cidade;
    }

    // Getters
    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public int getIdade() { return idade; }
    public String getCpf() { return cpf; }
    public String getEstado() { return estado; }
    public String getCidade() { return cidade; }
    public Date getData_cadastro() { return data_cadastro; }
    public Date getData_atualizacao() { return data_atualizacao; }
    public Date getData_remocao() { return data_remocao; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public void setData_cadastro(Date data_cadastro) { this.data_cadastro = data_cadastro; }
    public void setData_atualizacao(Date data_atualizacao) { this.data_atualizacao = data_atualizacao; }
    public void setData_remocao(Date data_remocao) { this.data_remocao = data_remocao; }
}
