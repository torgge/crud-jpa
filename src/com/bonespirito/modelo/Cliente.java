package com.bonespirito.modelo;

import javax.persistence.*;

/**
 * Created by George on 19/07/2016.
 */
@Entity
@SequenceGenerator(name = "SEQ_CLIENTE", sequenceName = "SEQ_CLIENTE", initialValue = 1)
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_CLIENTE")
    private Long codigo;
    private String nome;
    private Integer idade;
    private String sexo;
    private String profissao;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Cliente() {
    }
}
