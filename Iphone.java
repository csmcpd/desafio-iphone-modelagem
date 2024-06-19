

/**
 * Class Iphone
 */
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public Iphone () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

  /**
   */
  public void tocar() {
    System.out.println("Tocando a música do reprodutor musical");
  };


  /**
   */
  public void pausar() {
    System.out.println("Pausando a música do reprodutor musical");
  };


  /**
   */
  public void selecionarMusica() {
    System.out.println("Selecionando a música do reprodutor musical");
  };


  /**
   */
  public void ligar() {
    System.out.println("Ligando do aparelho telefônico");
  };


  /**
   */
  public void atender() {
    System.out.println("Atendendo do aparelho telefônico");
  };


  /**
   */
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz do aparelho telefônico");
  };


  /**
   */
  public void exibirPagina() {
    System.out.println("Exibindo página do navegador");
  };


  /**
   */
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba na página do navegador");
  };


  /**
   */
  public void atualizarPagina() {
    System.out.println("Atualizando a página do navegador");
  };


}
