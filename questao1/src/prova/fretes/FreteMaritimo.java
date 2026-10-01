package prova.fretes;

import java.util.List;

public class FreteMaritimo extends Frete {

    public FreteMaritimo(double valorCarga) {
        super(valorCarga);
    }

    @Override
    public String getModalidade() {
        return "Marítimo";
    }

    @Override
    public double calcular() {
        return this.valorCarga * 0.01;
    }

    @Override
    public List<String> getDocumentos() {
        return List.of("BL (Bill of Lading)", "Fatura comercial");
    }
}
