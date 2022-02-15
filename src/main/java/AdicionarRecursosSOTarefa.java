public class AdicionarRecursosSOTarefa implements Tarefa {

    private Recurso recurso;

    public AdicionarRecursosSOTarefa(Recurso recurso) {
        this.recurso = recurso;
    }

    public void executar() {
        this.recurso.adicionarRecurso();
    }

    public void cancelar() {
        this.recurso.removerRecurso();
    }
}
