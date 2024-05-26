package hash_table.lista_20240520.exercicio03.view;

import hash_table.lista_20240520.exercicio03.model.Telefone;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            long num = (long) (Math.random() * (double) 9000000000l) + 1000000000l;
            Telefone t = new Telefone(String.valueOf(num));
            System.out.print(t.hashCode() + "\t");
        }
    }
}
