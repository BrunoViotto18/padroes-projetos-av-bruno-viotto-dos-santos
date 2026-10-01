package prova.artefatos;

public class GeradorArtefatoBrasil implements GeradorArtefato {
    @Override
    public String gerarComprovanteFiscal(double valor) {
        var iss = valor * 0.05;
        return "NFS-e (ISS[5%] = R$" + iss + ")";
    }

    @Override
    public String getMetodoPagamento() {
        return "Pix";
    }

    @Override
    public String getTermoPrivacidade() {
        return "Termo LGPD";
    }

}
