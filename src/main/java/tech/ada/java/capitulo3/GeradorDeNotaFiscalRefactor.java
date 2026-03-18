package tech.ada.java.capitulo3;

public class GeradorDeNotaFiscalRefactor {
    private final List<AcaoAposGerarNota> acoes;

    public GeradorDeNotaFiscalRefactor(List<AcaoAposGerarNota> acoes){
        this.acoes = acoes;
    }

    public NotaFiscal gera(Fatura fatura) {
        double valor = fatura.getValorMensal();
        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        for(AcaoAposGerarNota acao : acoes){
            acao.executa(nf);
        }

        return nf;
    }

    private double impostoSimplesSobreO(double valor){
        return valor * 0.06;
    }
}

// A solução implementada segue o padrão de projeto Observer
// Outros padrões que ajudam a desacoplar classes são Visitor e Factory.
