package prova.artefatos;

public class GeradorArtefatoMexico implements GeradorArtefato {

    @Override
    public String gerarComprovanteFiscal(double valor) {
        var iva = 0.16 * valor;
        return "CFDI (IVA[16%] = $" + iva + ")";
    }

    @Override
    public String getMetodoPagamento() {
        return "SPEI";
    }

    @Override
    public String getTermoPrivacidade() {
        return "Termo LFPDPPP";
    }

}
