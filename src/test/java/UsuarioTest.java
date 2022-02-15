import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class UsuarioTest {

    Usuario usuario;
    Recurso recurso;

    @BeforeEach
    void setUp() {
        usuario = new Usuario();
        recurso = new Recurso (200, "Nova interface gráfica do terminal");
    }

    @Test
    void deveAdicionarRecursoSO() {
        Tarefa adicionarRecurso = new AdicionarRecursosSOTarefa(recurso);
        usuario.executarTarefa(adicionarRecurso);

        assertEquals("Recurso adicionado ao Sistema Operacional", recurso.getSituacao());
    }

    @Test
    void deveRemoverRecursoSO() {
        Tarefa removerRecurso = new RemoverRecursosSOTarefa(recurso);
        usuario.executarTarefa(removerRecurso);

        assertEquals("Recurso removido do Sistema Operacional", recurso.getSituacao());
    }

    @Test
    void deveCancelarRemoverRecursoSO() {
        Tarefa adicionarRecurso = new AdicionarRecursosSOTarefa(recurso);
        Tarefa removerRecurso = new RemoverRecursosSOTarefa(recurso);

        usuario.executarTarefa(adicionarRecurso);
        usuario.executarTarefa(removerRecurso);

        usuario.cancelarUltimaTarefa();

        assertEquals("Recurso adicionado ao Sistema Operacional", recurso.getSituacao());
    }
}