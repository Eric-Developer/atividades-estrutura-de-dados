package tiposDeDados;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar pontos
        Ponto ponto1 = new Ponto(12.0, 3.0);
        Ponto ponto2 = new Ponto(43.0, 5.0);

        // Criar uma reta com base nos pontos
        Reta reta = new Reta(ponto1, ponto2);

        // Imprimir informações sobre a reta
        System.out.println(reta);

        // Criar um polinômio com coeficientes
        List<Double> coeficientes = new ArrayList<>();
        coeficientes.add(1.0);
        coeficientes.add(2.0);
        coeficientes.add(3.0);
        Polinomio polinomio = new Polinomio(coeficientes);

        // Calcular o valor do polinômio em x = 2
        double resultado = polinomio.calcular(2.0);

        // Imprimir o valor calculado
        System.out.println("O valor do polinômio em x = 2 é: " + resultado);
    }
}

