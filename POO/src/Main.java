
public class Main { 
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.insertDados();
		pessoa1.MostrarDados();
		
		Medico medico1 = new Medico();
		medico1.insertDados();
		medico1.MostrarDados();
		
		Paciente paciente1 = new Paciente();
		paciente1.inserirDado();
		paciente1.MostrarDado();
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.insertDados();
		funcionario1.MostraDados();
	}

}
