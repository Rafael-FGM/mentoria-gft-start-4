package me.dio.models;

import me.dio.models.Endereco;
import me.dio.models.FuncionarioCLT;

public class OperadorDeCaixa extends FuncionarioCLT {
    public OperadorDeCaixa() {
    }

    public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getRua() +
                '}';
    }
}
