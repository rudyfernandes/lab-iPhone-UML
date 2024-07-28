public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    // Método principal para testes
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando funcionalidades do reprodutor musical
        meuIphone.tocar();
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.pausar();

        // Testando funcionalidades do aparelho telefônico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando funcionalidades do navegador de internet
        meuIphone.exibirPagina("http://www.java.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
