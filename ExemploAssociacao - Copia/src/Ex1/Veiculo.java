package Ex1;

public class Veiculo {
	private String marca;
	private String tipo;
	private String modelo;
	private Pessoa motorista;
	
	
	public Veiculo (String tipo, String marca, String modelo, Pessoa motorista){
		setTipo(tipo);
		setMarca(marca);
		setModelo(modelo);
		setMotorista(motorista);
	}
	
	//Set
	public void setMarca(String marca) { //Marca
		this.marca = marca;}
	
	public void setTipo(String tipo) { //Tipo
		this.tipo = tipo;}

	public void setModelo(String modelo) {//Modelo
		this.modelo = modelo;}
	
	public void setMotorista(Pessoa motorista) { //Motorista
		this.motorista = motorista;}
	
	
	//Get
	public String getMarca() {//Marca
		return marca;}
	
	public String getModelo() { //Modelo
		return modelo;}
	
	public String getTipo() {//Tipo
		return tipo;}
	
	public Pessoa getMotorista() { //Motorista
		return motorista;}
	
}
