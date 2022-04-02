package entities;

import java.util.List;

public class Profissional {

    private Integer IdProfissional;
    private String nome;
    private String cpf;
    private String telefone;
    private List<Servico> servicos;

    public Profissional() {
    }

    public Profissional(Integer idProfissional, String nome, String cpf, String telefone) {
        IdProfissional = idProfissional;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Profissional(Integer idProfissional, String nome, String cpf, String telefone, List<Servico> servicos) {
        IdProfissional = idProfissional;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.servicos = servicos;
    }

    public Integer getIdProfissional() {
        return IdProfissional;
    }

    public void setIdProfissional(Integer idProfissional) {
        IdProfissional = idProfissional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    @Override
    public String toString() {
        return "Profissional{" +
                "IdProfissional=" + IdProfissional +
                ", nome='" + nome +
                ", cpf='" + cpf +
                ", telefone='" + telefone +
                ", servicos=" + servicos +
                '}';
    }
}


