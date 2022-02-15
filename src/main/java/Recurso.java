public class Recurso {

    private int tamanhoMB;
    private String nomeRecurso;
    private String situacao;

    public Recurso(int tamanhoMB, String nomeRecurso) {
        this.tamanhoMB = tamanhoMB;
        this.nomeRecurso = nomeRecurso;
    }

    public String getSituacao() {
        return situacao;
    }

    public void adicionarRecurso() {
        this.situacao = "Recurso adicionado ao Sistema Operacional";
    }

    public void removerRecurso() {
        this.situacao = "Recurso removido do Sistema Operacional";
    }
}
