package tech.ada.java.capitulo3;

public class GeradorDeNotaFiscalOriginal {
    private final EnviadorDeEmail email;
    private final NotaFiscalDao dao;

    public GeradorDeNotaFiscalOriginal(EnviadorDeEmail email, NotaFiscalDao dao) {
        this.email = email;
        this.dao = dao;
    }

    public NotaFiscal gera(Fatura fatura) {
        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        email.enviaEmail(nf);
        dao.persiste(nf);

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}

// Essa classe tem alta dependencia de outras classes, como EnviadorDeEmail e NotaFiscalDao.
// Se novas ações forem adiiconadas, a classe terá novas dependencias e crescerá.
// Caso haja alteraçoes nas classes acopladas, elas podem propagar para a classe principal.
// Uma forma de melhorar o nivel de acoplamento é utilizando uma interface AcaoAposGerarNota que represente qualquer ação que deva ser executada com a nota fiscal.
// Cada ação será uma implementação da interface.