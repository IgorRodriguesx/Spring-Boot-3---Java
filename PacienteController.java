package med.igr.api.controller;

import med.igr.api.endereco.DadosEndereco;
import med.igr.api.paciente.DadosCadastroPaciente;
import med.igr.api.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @PostMapping
    public void Cadastrar(@RequestBody DadosCadastroPaciente dados) {
        System.out.println("Dados recebidos: " + dados);

    }
}