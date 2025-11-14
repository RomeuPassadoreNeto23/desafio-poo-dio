package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFinal = dataInicio.plusDays(45);
    private Set<Dev> devsINscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public Set<Dev> getDevsINscritos() {
        return devsINscritos;
    }

    public void setDevsINscritos(Set<Dev> devsINscritos) {
        this.devsINscritos = devsINscritos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicio, bootcamp.dataInicio) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsINscritos, bootcamp.devsINscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicio, dataFinal, devsINscritos, conteudos);
    }
}
