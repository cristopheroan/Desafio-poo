public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadornaInternet {
  private ReprodutorMusical reprodutor;
  private AparelhoTelefonico telefone;
  private NavegadornaInternet navegador;

  public iPhone() {
      this.reprodutor = new ReprodutorMusical();
      this.telefone = new AparelhoTelefonico();
      this.navegador = new NavegadornaInternet();
  }

  public void reproduzirMusic() {
    reprodutor.tocar();
  }

  public void pausarMusica() {
    reprodutor.pausar();
  }

  public void selecionarMusica(String musica) {
    reprodutor.selecionarMusica(musica);
  }

  public void fazerLigacao(String numero) {
    telefone.ligar(numero);
  }

  public void atenderChamada() {
    telefone.atender();
  }

  public void iniciarCorreioVoz() {
    telefone.iniciarCorreioVoz();
  }

  public void exibirPaginaWeb() {
    navegador.exibirPagina(ur);
  }

  public void adicionarNovaAba() {
    navegador.adicionarNovaAba();
  }

  public void atualizarPagina() {
    navegador.atualizarPagina();
  }
}