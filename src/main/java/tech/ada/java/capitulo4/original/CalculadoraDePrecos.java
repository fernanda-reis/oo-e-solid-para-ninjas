package tech.ada.java.capitulo4.original;

public class CalculadoraDePrecos {
    public double calcula(Compra produto) {
        TabelaDePrecoPadrao tabela = new TabelaDePrecoPadrao();
        Frete correios = new Frete();
        double desconto = tabela.descontoPara(produto.getValor());
        double frete = correios.para(produto.getCidade());
        return produto.getValor() * (1-desconto) + frete;
    }
}

//O código pega o preço bruto do produto, e usa a tabela padrão para calcular o preço, adicionando o desconto devido.
//Em seguida, também descobre o valor do frete. Por fim, retorna o valor final: valor do produto - desconto + frete.
//Caso existam varias tabelas para calculo, ou varias regras de frete, o código ira lotar de ifs, e a classe deixará de ser coesa.
//Utilizamos o OCP para manter a classe fechada para modificação, mas aberta para extensão. Ciando uma abstrações para as dependencias e injetando-as na classe.

class TabelaDePrecoPadrao {
    public double descontoPara(double valor) {
        if(valor > 5000) return 0.03;
        if(valor > 1000) return 0.05;
        return 0;
    }
}

class Frete {
    public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }

        return 30;
    }
}
