package med.igr.api.controller;

import med.igr.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("medicos")
@RestController
public class MedicoController {

    //chegar requisição do tipo posting para a url "medicos", chame o método "cadastrar" abaixo
    @PostMapping       //DTO - Record para receber e devolver para a API // Record é um recurso que permite representar uma classe imutável, contendo apenas atributos, construtor e métodos de leitura
    public void Cadastrar(@RequestBody DadosCadastroMedico dados){
        System.out.println(dados);
    }
}
