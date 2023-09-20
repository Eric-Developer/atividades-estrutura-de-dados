package torre_hanoi;

public class TorresDeHanoi {
    public static void torresDeHanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mova o disco 1 de " + origem + " para " + destino);
        } else {
            torresDeHanoi(n - 1, origem, auxiliar, destino);
            System.out.println("Mova o disco " + n + " de " + origem + " para " + destino);
            torresDeHanoi(n - 1, auxiliar, destino, origem);
        }
    }

    public static void main(String[] args) {
        int numDiscos = 3; // Altere o número de discos conforme necessário
        char origem = 'A';
        char destino = 'C';
        char auxiliar = 'B';

        System.out.println("Passos para resolver as Torres de Hanoi com " + numDiscos + " discos:");
        torresDeHanoi(numDiscos, origem, destino, auxiliar);
    }
}
