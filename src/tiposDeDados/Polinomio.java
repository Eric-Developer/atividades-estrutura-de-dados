package tiposDeDados;

import java.util.ArrayList;
import java.util.List;

class Polinomio {
    private List<Double> coeficientes;

    public Polinomio(List<Double> coeficientes) {
        this.coeficientes = new ArrayList<>(coeficientes);
    }

    public double calcular(double x) {
        double resultado = 0;
        for (int i = 0; i < coeficientes.size(); i++) {
            resultado += coeficientes.get(i) * Math.pow(x, i);
        }
        return resultado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < coeficientes.size(); i++) {
            if (i > 0) {
                sb.append(" + ");
            }
            sb.append(coeficientes.get(i)).append("x^").append(i);
        }
        return sb.toString();
    }
}
