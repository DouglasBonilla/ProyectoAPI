package org.proyecto.controladores;

import org.proyecto.seguridad.dtos.UsuarioLogin;
import org.proyecto.seguridad.dtos.UsuarioRegistrar;
import org.proyecto.seguridad.dtos.UsuarioToken;
import org.proyecto.seguridad.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<UsuarioToken> login(@RequestBody UsuarioLogin usuarioLogin){
        return ResponseEntity.ok(usuarioService.login(usuarioLogin));
    }

    @PostMapping("/registro")
    public ResponseEntity<UsuarioToken> registro(@RequestBody UsuarioRegistrar requestRegistrar){
        return ResponseEntity.ok(usuarioService.registro(requestRegistrar));
    }


}
