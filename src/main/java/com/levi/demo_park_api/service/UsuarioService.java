package com.levi.demo_park_api.service;

import com.levi.demo_park_api.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service

public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
}
