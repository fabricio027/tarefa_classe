/**
 * @author Fabricio Vieira Cezario
 * @version 1.0
 */
public class Televisao {

    private String marca;
    private int tamanho;
    private String tipoTela;
    private int voltagem;
    private int volume;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void ligar() {
        System.out.println("Televisão ligada!");
    }

    public void desligar() {
        System.out.println("Televisão desligada!");
    }

    public void mudarVolume(int valor) {
        this.volume = valor;
    }
}
