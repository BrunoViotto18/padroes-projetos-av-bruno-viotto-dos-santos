package prova.fretes;

import java.util.List;

public class FreteAereo extends Frete {

    public FreteAereo(double valorCarga) {
        super(valorCarga);
    }

    @Override
    public String getModalidade() {
        return "Aéreo";
    }

    @Override
    public double calcular() {
        return this.valorCarga * 0.06;
    }

    @Override
    public List<String> getDocumentos() {
        return List.of("AWB (Air Waybill)");
    }
}
