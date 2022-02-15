public class RemoverRecursosSOTarefa implements Tarefa {

    private Recurso recurso;

    public RemoverRecursosSOTarefa(Recurso recurso) {
        this.recurso = recurso;
    }

    public void executar() {
        this.recurso.removerRecurso();
    }

    public void cancelar() {
        this.recurso.adicionarRecurso();
    }
}
