package p.dio;

import p.dio.models.endereco.Endereco;
import p.dio.models.gerente.Gerente;
import p.dio.models.operadorCaixa.OperadorCaixa;
import p.dio.models.vendedor.Vendedor;

public class Main {
    public static void main(String[] args) {
        Endereco enderecovendedorCLT = new Endereco("Rua do vendedor","Complemento do vendedor","Bairro do vendedor");
        Endereco enderecogerentePJ = new Endereco("Rua do gerente","Complemento do gerente","Bairro do gerente");
        Endereco enderecooperadorCaixa = new Endereco("Rua do operador do Caixa","Complemento do operador do Caixa","Bairro do operador do Caixa");

        System.out.println(enderecovendedorCLT.getRua() + ", " + enderecovendedorCLT.getComplemento() + ", "  + enderecovendedorCLT.getBairro());
        System.out.println(enderecogerentePJ.getRua() + ", " + enderecogerentePJ.getComplemento() + ", "  + enderecogerentePJ.getBairro());
        System.out.println(enderecooperadorCaixa.getRua() + ", " + enderecooperadorCaixa.getComplemento() + ", "  + enderecooperadorCaixa.getBairro());


        System.out.println("---***---***---");


        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Freire");
        vendedor.setDocumento("152.251.365.24");
        vendedor.setEndereco(enderecovendedorCLT);
        vendedor.setValorSalario(1000d);

        vendedor.calculaBonificacao(2d);

        System.out.println(vendedor);

        System.out.println("---***---***---");

        OperadorCaixa operadorCaixa1 = new OperadorCaixa("Lukin","156.485.452.61",1000d,enderecooperadorCaixa);

        System.out.println(operadorCaixa1);

        System.out.println("---***---***---");

        Gerente gerente = new Gerente();
        gerente.setNome("Adao");
        gerente.setDocumento("785.456.950.15");
        gerente.setEndereco(enderecogerentePJ);
        gerente.setHorasTrabalhadas(20d);
        gerente.setValorHora(100d);

        gerente.calcularRenumeracao();
        gerente.calculaBonificacao(3d);
        System.out.println(gerente);

    }
}