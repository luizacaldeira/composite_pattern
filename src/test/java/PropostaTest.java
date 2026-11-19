import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropostaTest {

    @Test
    void deveRetornarItensProposta() {
        Pacote pacote1 = new Pacote("Telefonia");

        Pacote pacote2 = new Pacote("Internet");
        Servico servico21 = new Servico("Fibra 300MB", 100);
        pacote2.addItem(servico21);

        Pacote pacote3 = new Pacote("Adicionais");
        Servico servico31 = new Servico("Segurança Digital", 15);
        Servico servico32 = new Servico("Backup em Nuvem", 10);
        pacote3.addItem(servico31);
        pacote3.addItem(servico32);

        Pacote itens = new Pacote("Plano Completo");
        itens.addItem(pacote1);
        itens.addItem(pacote2);
        itens.addItem(pacote3);

        Proposta proposta = new Proposta();
        proposta.setItens(itens);

        assertEquals("Pacote: Plano Completo\n" +
                "Pacote: Telefonia\n" +
                "Pacote: Internet\n" +
                "Serviço: Fibra 300MB - valor: 100\n" +
                "Pacote: Adicionais\n" +
                "Serviço: Segurança Digital - valor: 15\n" +
                "Serviço: Backup em Nuvem - valor: 10\n", proposta.getItens());
    }

    @Test
    void deveRetornarExcecaoPropostaSemItens() {
        try {
            Proposta proposta = new Proposta();
            proposta.getItens();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Proposta sem itens", e.getMessage());
        }
    }
}