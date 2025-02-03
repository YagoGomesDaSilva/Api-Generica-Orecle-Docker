package oracle.api.apioracle.service;

import oracle.api.apioracle.entity.ExemploTipos;
import oracle.api.apioracle.repository.ExemploTiposRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExemploTiposService {

    @Autowired
    private ExemploTiposRepository exemploTiposRepository;

    public List<ExemploTipos> listarTodos() {
        return exemploTiposRepository.findAll();
    }

    public Optional<ExemploTipos> buscarPorId(Long id) {
        return exemploTiposRepository.findById(id);
    }

    public ExemploTipos salvar(ExemploTipos exemploTipos) {
        return exemploTiposRepository.save(exemploTipos);
    }

    public void excluir(Long id) {
        exemploTiposRepository.deleteById(id);
    }
}

