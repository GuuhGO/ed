package hash_table.lista_20240520.exercicio04.view;

public class Main {
    public static void main(String[] args) {
        int vetor[] = {30, 23, 17, 12, 76, 58, 98, 58, 24, 36, 92, 17, 75, 74, 78, 78, 0, 11, 67, 17};
        int tamanho = vetor.length;
        for (int i = 0; i < tamanho; i++) {
            int posicao = hash(vetor[i]);
            System.out.printf("Valor: %d | Pos: %d\n", vetor[i], posicao);
        }
    }

    public static int hash(int valor) {
        int posicao;
        posicao = (int) valor / 10;
        return posicao;
    }
}
