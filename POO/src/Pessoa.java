import javax.swing.JOptionPane;
public class Pessoa {
	
	private String nome;
	private String dataNascimento;
	private String cpf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;}
		
	public void insertDados() {
		   
		   this.nome = (JOptionPane.showInputDialog("Nome"));
		   this.dataNascimento = (JOptionPane.showInputDialog("Data de nascimento"));
		   this.cpf =(JOptionPane.showInputDialog("CPF"));

		}
	public void MostrarDados() {
	        
	        String texto = "Dados\n";
			texto += "\nNome: " + this.getNome();
			texto += "\nData de nascimento: " + this.getDataNascimento();
			texto += "\nCPF: " + this.getCpf();
			JOptionPane.showMessageDialog(null, texto);
			}
	}


