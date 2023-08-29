package iphone_DIO;

import java.util.ArrayList;
import java.util.List;

import interfaces.InterfaceEmail;
import interfaces.InterfaceIpod;
import interfaces.InterfaceSMS;
import interfaces.InterfaceTelefone;

public class Iphone implements InterfaceTelefone, InterfaceIpod, InterfaceEmail, InterfaceSMS {

	public static void main(String[] args) {
		Iphone meuIphone = new Iphone();
		List<String> listaContatos = new ArrayList<String>();
		listaContatos.add("contato 1");
		listaContatos.add("contato 2");
		listaContatos.add("contato 13");

		meuIphone.acessarContato("Adriano");
		meuIphone.ligar("Adriano");
		meuIphone.consultarContatos(listaContatos);
		meuIphone.atenderOutraChamada("Alfredo");
		meuIphone.criarConferencia("Adriano ", " Alfredo", " ");

	}

	@Override
	public void escolherToques(String toque) {
		System.out.println("O toque escolhido foi: " + toque);
	}

	@Override
	public void digitarNumero(String numero) {
		System.out.println("voce digitou o numero: " + numero);

	}

	@Override
	public void receberChamadas() {
		System.out.println("alguem esta te ligando ");

	}

	@Override
	public void consultarContatos(List<String> listaContatos) {
		System.out.println("lista de contatos");
		for (String contato : listaContatos) {
			System.out.println(contato);
		}

	}

	@Override
	public void acessarContato(String contato) {
		System.out.println("nome: " + contato);

	}

	@Override
	public void ligar(String contato) {
		System.out.println("ligando para " + contato);

	}

	@Override
	public void colocarEspera(String esperar) {
		System.out.println("colocado em espera: " + esperar);

	}

	@Override
	public void atenderOutraChamada(String outrachamada) {
		System.out.println("outra chamada na linha: " + outrachamada);

	}

	@Override
	public void criarConferencia(String chamada1, String chamada2, String chamada3) {
		System.out.println("colocado na conferencia: " + chamada1 + " " + chamada2 + " " + chamada3);

	}

	@Override
	public void acessarCorreioVoz(List<String> mensagens) {
		for (String mensagem : mensagens) {
			System.out.println(mensagem);
		}

	}

	@Override
	public void consultarMensagens() {
		System.out.println("sua mensagem é essa ....");
		
	}

	@Override
	public void escreverSms() {
		System.out.println("digite sua mensaem aqui ");		
	}

	@Override
	public void lerSMS() {
		System.out.println("sua mensagem é esssa");
		
	}

	@Override
	public void conectarServidorEmail() {
		System.out.println("servidores disponiveis - Gamail, yahoo, ms email ");
		
	}

	@Override
	public void home() {
		System.out.println("voltando pra home ");
		
	}

	@Override
	public void consultarEmails() {
		System.out.println("Cessando lista de emails");
		
	}

	@Override
	public void acessarEmail() {
		System.out.println("esse é seu email");
		
	}

	@Override
	public void responder() {
		System.out.println("respondendo seu email");
		
	}

	@Override
	public void excluir() {
		System.out.println("email encaminhado pra lixeira ");
		
	}

	@Override
	public void enviar() {
		System.out.println("enviei seu email");
		
	}

	@Override
	public void esvaziarLixeira() {
		System.out.println("esvaziamos lixeira");
		
	}

	@Override
	public void notificar() {
		System.out.println("chegou um email");
		
	}

	@Override
	public void consultarLista() {
		System.out.println("acesando lista de midias");
		
	}

	@Override
	public void reproduzir() {
		System.out.println("reproduzindo musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("acesando lista de email");
		
	}

	@Override
	public void retornarLista() {
		System.out.println("voltei pra lista de midia");
		
	}

	@Override
	public void aumentarVolume() {
		System.out.println("aumentando volume");
		
	}

	@Override
	public void diminuirVolume() {
		System.out.println("diminuindo volume");
		
	}

	@Override
	public void modoHorizontal() {
		System.out.println("modo horizontal");
		
	}

}
