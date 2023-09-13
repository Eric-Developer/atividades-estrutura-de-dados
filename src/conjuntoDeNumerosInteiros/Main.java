package conjuntoDeNumerosInteiros;


public class Main {
    public static void main(String[] args) {
        ConjuntoDeInteiros conjunto = new ConjuntoDeInteiros();

        conjunto.adicionar(1);
        conjunto.adicionar(2);
        conjunto.adicionar(3);
        conjunto.adicionar(2); // Não será adicionado, pois conjuntos não permitem duplicatas

        System.out.println("Conjunto: " + conjunto);
        System.out.println("Tamanho do conjunto: " + conjunto.tamanho());

        conjunto.remover(2);

        System.out.println("Conjunto após a remoção do número 2: " + conjunto);
        System.out.println("Tamanho do conjunto após a remoção: " + conjunto.tamanho());

        System.out.println("O conjunto contém o número 3? " + conjunto.contem(3));
        System.out.println("O conjunto contém o número 4? " + conjunto.contem(4));
    }
}

