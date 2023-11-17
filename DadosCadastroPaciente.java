package med.igr.api.paciente;
import med.igr.api.endereco.DadosEndereco;
public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
}
