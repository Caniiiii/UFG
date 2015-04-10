package conversores;

public class StringToInt {
	public static int toInt(String nome) throws Exception{
		int numero = 0;
		
		try {
			numero = nome == null ? 0 : Integer.parseInt(nome);
		} catch (Exception e) {
			throw e;
		}
		return numero;
	}
}
