import javax.swing.JOptionPane;

public class Paciente extends Pessoa{
	
	private String ultimaConsulta;
	private String prontuario;
	private String peso;
	
	public String getUltimaConsulta() {
		return ultimaConsulta;
	}
	public void setUltimaConsulta(String ultimaConsulta) {
		this.ultimaConsulta = ultimaConsulta;
	}
	public String getProntuario() {
		return prontuario;
	}
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public void inserirDado() {
		this.ultimaConsulta = (JOptionPane.showInputDialog("Data da ultima consulta: "));
		this.prontuario = (JOptionPane.showInputDialog("Prontuario: "));
		this.peso =(JOptionPane.showInputDialog("Digite seu peso: "));
	
	}
	
	public void MostrarDado() {
        
        String text = "Dados do paciente\n";
		text += "\nUltima Consulta: " + this.getUltimaConsulta();
		text += "\nProntuario: " + this.getProntuario();
		text += "\nPeso: " + this.getPeso();
		JOptionPane.showMessageDialog(null, text);
		}
}
