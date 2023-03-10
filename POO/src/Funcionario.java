import javax.swing.JOptionPane;
 
public class Funcionario {
	
	private String funcao;
	private String admissao;
	private String horaEntrada;
	
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getAdmissao() {
		return admissao;
	}
	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}
	public String getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	
	public void insertDados() {
		this.funcao = (JOptionPane.showInputDialog("Funçao : "));
		this.admissao =(JOptionPane.showInputDialog("Admissao: "));
		this.horaEntrada =(JOptionPane.showInputDialog("Hora de entrada: "));
	
	}
	
	public void MostraDados() {
        
        String text = "Dados do funcionario\n";
		text += "\nFunção: " + this.getFuncao();
		text += "\nData de admissao: " + this.getAdmissao();
		text += "\nHora de entrada: " + this.getHoraEntrada();
		JOptionPane.showMessageDialog(null, text);
		}

}
