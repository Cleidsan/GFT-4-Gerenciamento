package p.dio.models.gerente;

import p.dio.models.bonus.Bonificacao;
import p.dio.models.funcionario.FuncionarioPJ;

public class Gerente extends FuncionarioPJ implements Bonificacao {
    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorRenumeracao() * (porcentagemBonificacao/100) + 100d);
    }
    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRenumeracao=" + super.getValorRenumeracao() +
                ", endereco=" + super.getEndereco().getComplemento() +
                ", valorBonificacao=" + this.valorBonificacao +
                '}';
    }
}
