package Ex1;

public class App {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Marcos");
		Veiculo v = new Veiculo ("Caminhao","Mercedes","Cara chata", p);
		
		System.out.println("Marca: "+v.getMarca());
		System.out.println("Modelo: "+v.getModelo());
		System.out.println("Nome motorista: "+v.getMotorista().getNome());
		

	}

}
