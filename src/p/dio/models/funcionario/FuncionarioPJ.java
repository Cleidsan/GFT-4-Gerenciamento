package p.dio.models.funcionario;

import p.dio.models.endereco.Endereco;

public abstract class FuncionarioPJ {
    private String nome;
    private String documento;
    private Double horasTrabalhadas;
    private Double valorHora;
    private Double valorRenumeracao;
    private Endereco endereco;

    public void calcularRenumeracao() {
        this.valorRenumeracao = this.horasTrabalhadas * this.valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorRenumeracao() {
        return valorRenumeracao;
    }

    public void setValorRenumeracao(Double valorRenumeracao) {
        this.valorRenumeracao = valorRenumeracao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", valorHora=" + valorHora +
                ", valorRenumeracao=" + valorRenumeracao +
                ", endereco=" + endereco +
                '}';
    }
}
