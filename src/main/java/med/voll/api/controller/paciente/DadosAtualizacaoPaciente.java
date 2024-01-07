package med.voll.api.controller.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import med.voll.api.controller.endereco.DadosEndereco;
public record DadosAtualizacaoPaciente(
        @NotNull Long id,
        String nome,
        String telefone,
        @Valid DadosEndereco endereco
) {
}