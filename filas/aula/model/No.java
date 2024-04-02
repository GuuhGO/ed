package filas.aula.model;

public class No {
	public int dado;
	public No proximo;

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		buffer.append(dado);
		buffer.append("]");
		buffer.append("[");
		buffer.append("]");
		return buffer.toString();
	}
}
