package p.dio.models.vendedor;

import p.dio.models.bonus.Bonificacao;
import p.dio.models.funcionario.FuncionarioCLT;

public class Vendedor extends FuncionarioCLT implements Bonificacao {
    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = this.valorSalario * (porcentagemBonificacao/100);
    }
    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getBairro() +
                ", valorBonificacao=" + this.valorBonificacao +
                '}';
    }


}
