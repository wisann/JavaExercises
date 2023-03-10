import javax.swing.JOptionPane;

public class Medico extends Pessoa {
	
	private String crm;
	private String hospital;
	private String especialidade;
	
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public void insertDados() {
		   
		   this.crm = (JOptionPane.showInputDialog("CRM: "));
		   this.hospital = (JOptionPane.showInputDialog("Hospital: "));
		   this.especialidade =(JOptionPane.showInputDialog("Especialidade: "));

		}
	public void MostrarDados() {
	        
	        String mensagem = "Dados do médico\n";
			mensagem += "\nCRM: " + this.getCrm();
			mensagem += "\nHospital: : " + this.getHospital();
			mensagem += "\nEspecialidade: " + this.getEspecialidade();
			JOptionPane.showMessageDialog(null, mensagem);
			}

}
