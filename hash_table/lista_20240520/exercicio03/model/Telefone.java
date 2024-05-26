package hash_table.lista_20240520.exercicio03.model;

public class Telefone {
	private String number;
	public Telefone(String number) {
		this.number = number;
	}
	
	@Override
	public int hashCode() {
		long num = Long.parseLong(number);
		int hash;
        hash = (int) (num % 89) + 11;
        return hash;
	}
}
