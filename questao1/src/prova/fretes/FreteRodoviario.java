package prova.fretes;

import java.util.List;

public class FreteRodoviario extends Frete {

    public FreteRodoviario(double valorCarga) {
        super(valorCarga);
    }

    @Override
    public String getModalidade() {
        return "Rodoviário";
    }

    @Override
    public double calcular() {
        return this.valorCarga * 0.02;
    }

    @Override
    public List<String> getDocumentos() {
        return List.of("CT-e", "MDF-e");
    }
}
