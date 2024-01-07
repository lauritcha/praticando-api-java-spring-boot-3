package med.voll.api.controller.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.controller.endereco.DadosEndereco;
import med.voll.api.controller.medico.Especialidade;

public record DadosCadastroPaciente(
        @NotBlank @Pattern(regexp = "\\d{11}")
        String cpf,
        @NotBlank
        String nome,
        @NotBlank @Email
        String email,
        @NotBlank
        String telefone,
        @NotNull @Valid
        DadosEndereco endereco
) {
}
