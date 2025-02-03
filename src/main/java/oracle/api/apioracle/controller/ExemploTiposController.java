package oracle.api.apioracle.controller;

import oracle.api.apioracle.entity.ExemploTipos;
import oracle.api.apioracle.service.ExemploTiposService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/exemplos")
public class ExemploTiposController {

    @Autowired
    private ExemploTiposService exemploTiposService;

    @GetMapping
    public List<ExemploTipos> listarTodos() {
        return exemploTiposService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExemploTipos> buscarPorId(@PathVariable Long id) {
        Optional<ExemploTipos> exemplo = exemploTiposService.buscarPorId(id);
        return exemplo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ExemploTipos> criar(@RequestBody ExemploTipos exemploTipos) {
        ExemploTipos novoExemplo = exemploTiposService.salvar(exemploTipos);
        return ResponseEntity.ok(novoExemplo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ExemploTipos> atualizar(@PathVariable Long id, @RequestBody ExemploTipos exemploTipos) {
        if (!exemploTiposService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        exemploTipos.setId(id);
        return ResponseEntity.ok(exemploTiposService.salvar(exemploTipos));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        if (!exemploTiposService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        exemploTiposService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}

