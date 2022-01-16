package clinicaveterinaria;

public class CadastroCliente {
	private String nomeCliente;
	private String cpfCliente;
	private String telefoneCliente;
	private String enderecoCliente;
	private String nomeAnimal;
	private int idadeAnimal;
	
	public CadastroCliente(String nomeCliente, String cpfCliente, String telefoneCliente, String enderecoCliente,
			String nomeAnimal, int idadeAnimal) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.telefoneCliente = telefoneCliente;
		this.enderecoCliente = enderecoCliente;
		this.nomeAnimal = nomeAnimal;
		this.idadeAnimal = idadeAnimal;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public int getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}
	

	@Override
	public String toString() {
		return "CadastroCliente [nomeCliente=" + nomeCliente + ", cpfCliente=" + cpfCliente + ", telefoneCliente="
				+ telefoneCliente + ", enderecoCliente=" + enderecoCliente + ", nomeAnimal=" + nomeAnimal
				+ ", idadeAnimal=" + idadeAnimal + "]";
	}
	
}
