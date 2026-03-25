package tech.ada.java.capitulo5.original;

public class ProcessadorDeBoletos {
    public void processa(List<Boleto> boletos, Fatura fatura)  {
        double total = 0;

        for(Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor()), MeioDePagamento.BOLETO);
            fatura.getPagamentos().add(pagamento);
            total += boleto.getValor();
        }

        if(total >= fatura.getValor()) {
            fatura.setPago(true);
        }
    }
}


//O método passeia por uma lista de boletos, gera um pagamento e associa esse pagamento a uma fatura.
//No fim, verifica se o valor total dos pagamentos é maior ou igual que o valor da fatura, se sim, identifica que a fatura está paga.
//O problema desse código é a falta de encapsulamento. O código responsável por marcar a fatura como paga deveria estar escondido na própria Fatura.
//Uma classe bem encapsulada é aquela que esconde bem a maneira como faz as coisas.
