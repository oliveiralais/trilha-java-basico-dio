import device.IPhone;

public class IPhoneMain {
    public static void main(String[] args) {
        IPhone device = new IPhone();

        device.selecionarMusica("Apologize");
        device.tocar();
        device.pausar();

        device.ligar("91234-5678");
        device.atender();
        device.iniciarCorreioVoz();

        device.exibirPagina("https://www.dio.me");
        device.adicionarNovaAba();
        device.atualizarPagina();
    }
}