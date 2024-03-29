package me.dio.models;

public class Vendedor extends FuncionarioCLT implements CalculoBonificacao {
    private Double valorDaBonificacao;

    @Override
    public void calcularBonificacao(Double porcentagemBonificacao) {
        this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                ", valorBonificacao=" + this.valorDaBonificacao +
                '}';
    }


}
