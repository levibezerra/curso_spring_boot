package com.levi.demo_park_api.service;

import com.levi.demo_park_api.entity.Vaga;
import com.levi.demo_park_api.exception.CodigoUniqueViolationException;
import com.levi.demo_park_api.exception.EntityNotFoundException;
import com.levi.demo_park_api.exception.VagaDisponivelException;
import com.levi.demo_park_api.repository.VagaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.levi.demo_park_api.entity.Vaga.StatusVaga.LIVRE;

@RequiredArgsConstructor
@Service

public class VagaService {

    private final VagaRepository vagaRepository;

    @Transactional
    public Vaga salvar(Vaga vaga) {
        try {
            return vagaRepository.save(vaga);
        } catch (DataIntegrityViolationException ex) {
            throw new CodigoUniqueViolationException("Vaga", vaga.getCodigo());
        }
    }

    @Transactional(readOnly = true)
    public Vaga buscarPorCodigo(String codigo) {
        return vagaRepository.findByCodigo(codigo).orElseThrow(
                () -> new EntityNotFoundException("Vaga", codigo));
    }

    public Vaga buscarPorVagaLivre() {
        return vagaRepository.findFirstByStatus(LIVRE).orElseThrow(
                () -> new VagaDisponivelException("Nenhuma vaga livre foi encontrada")
        );
    }
}