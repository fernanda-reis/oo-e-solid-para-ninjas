package tech.ada.java.capitulo5.refactor;

public class Fatura {
    public List<Pagamento> pagamentos;
    public double valor;
    public boolean pago = false;

    public void adicionaPagamento(Pagamento pagamento){
        this.pagamentos.add(pagamento);

        if(valorTotalDosPagamentos() >  this.valor) {
            this.pago = true;
        }
    }

    private double valorTotalDosPagamentos(){
        double total = 0;

        for(Pagamento p : pagamentos) {
            total += p.getValor();
        }

        return total;
    }
}
