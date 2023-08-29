package interfaces;

import java.util.List;

public interface InterfaceTelefone {
	public void escolherToques(String toque);

	public void digitarNumero(String numero);

	public void receberChamadas();

	public void consultarContatos(List<String> listaContatos);

	public void acessarContato(String contato);

	public void ligar(String contato);

	public void colocarEspera(String esperar);

	public void atenderOutraChamada(String outrachamada);

	public void criarConferencia(String chamada1, String chamada2, String chamada3);

	public void acessarCorreioVoz(List<String> mensagens);

}
