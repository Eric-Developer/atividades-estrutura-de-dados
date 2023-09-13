package conjuntoDeNumerosInteiros;

import java.util.HashSet;
import java.util.Iterator;

public class ConjuntoDeInteiros {
    private HashSet<Integer> conjunto;

    public ConjuntoDeInteiros() {
        conjunto = new HashSet<>();
    }

    // Adicionar um elemento ao conjunto
    public void adicionar(int elemento) {
        conjunto.add(elemento);
    }

    // Remover um elemento do conjunto
    public void remover(int elemento) {
        conjunto.remove(elemento);
    }

    // Verificar se um elemento está no conjunto
    public boolean contem(int elemento) {
        return conjunto.contains(elemento);
    }

    // Obter o tamanho do conjunto
    public int tamanho() {
        return conjunto.size();
    }

    // Retorna uma representação em String do conjunto
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Iterator<Integer> iterator = conjunto.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
