package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperadorDeCaixa;
import me.dio.models.Vendedor;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*Endereco endereco = new Endereco();
        endereco.setRua("Paulo Roberto Delantonia");

        System.out.println(endereco.getRua());*/

        Endereco endereco = new Endereco("Paulo Roberto Delantonia", "Bairro Funcionário", "Parque Lourival");

        System.out.println("-----");

        Vendedor vendedor =  new Vendedor();
        vendedor.setNome("Rafael Ferreira");
        vendedor.setDocumento("333.633.628-70");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);

        vendedor.calcularBonificacao(2d);
        System.out.println(vendedor);

        System.out.println("-----");

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Cilene", "333333", 1500d, endereco);
        System.out.println(operadorDeCaixa);


        Gerente gerente =  new Gerente();
        gerente.setNome("Rafael Mota");
        gerente.setDocumento("333.633.628-70");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calcularRemuneracao();
        gerente.calcularBonificacao(3d);

        System.out.println(gerente);

    }

}