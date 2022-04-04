
package projeto.model;


public class Mensagem {

    private String nomeCliente;
    private String meio;
    private String conteudo;
    private long data;

    public Mensagem(String cliente, String meioContato, String mensagem, long horario){
        this.nomeCliente = cliente;
        this.meio = meioContato;
        this.conteudo = mensagem;
        this.data = horario;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public String getConteudo() {
        return conteudo;
    }

    public long getData() {
        return data;
    }

    public String getMeio() {
        return meio;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setData(long data) {
        this.data = data;
    }

    public void setMeio(String meio) {
        this.meio = meio;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
