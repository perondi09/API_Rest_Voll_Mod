package med.voll.api.medico;

import med.voll.api.enderco.DadosEndereco;

public record DadosCadastrosMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
