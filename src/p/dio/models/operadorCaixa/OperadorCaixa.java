package p.dio.models.operadorCaixa;

import p.dio.models.endereco.Endereco;
import p.dio.models.funcionario.FuncionarioCLT;

public class OperadorCaixa extends FuncionarioCLT {
    public OperadorCaixa() {
    }

    public OperadorCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    @Override
    public String toString() {
        return "OperadorCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getRua() +
                '}';
    }
}
