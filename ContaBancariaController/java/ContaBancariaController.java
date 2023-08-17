package ContaBancariaController.java;

import java.util.HashMap;
import java.util.Map;

public class ContaBancariaController {

    private Map<String, PostDTO> contas = new HashMap<> ();

    private Object responseDTO;

    @GetMapping

    public ResponseEntity<GetDTO> getContaPorNomeUsuario(@PathVariable String nomeUsuario) {


        ResponseEntity<GetDTO> ok = ResponseEntity.ok (responseDTO);
        ResponseEntity<GetDTO> ok1 = ok;
        return ok1;
    }

    @PutMapping
    public ResponseEntity<GetDTO> alterarConta() {
        return alterarConta (null);
    }

    @PutMapping
    public ResponseEntity<GetDTO> alterarConta(@RequestMapping PostDTO requestDTO) {


        return ResponseEntity.ok("Conta alterada com sucesso!");
    }

    @PostMapping
    private ResponseEntity<GetDTO> criarConta(@RequestBody PostDTO requestDTO) {
        // Lógica para criar a conta e retornar o DTO de resposta com o valor atualizado
        return ResponseEntity.ok (responseDTO);
    }
}

