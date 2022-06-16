package br.com.infnet.academia;

import java.time.LocalDate;

public class Cliente {
    private Long matricula;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private boolean ativo = true;
    private LocalDate dataCadastro = LocalDate.now();

    public Cliente(Long matricula, String nome, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

}
