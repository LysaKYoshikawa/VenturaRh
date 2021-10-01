package com.yoshikawa.VenturaRh.controller;

import com.yoshikawa.VenturaRh.models.usuario.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @GetMapping(path = "/dados")
    public Usuario obterUsuario() {
        return new Usuario(27, "monalysa", "40485204800");
    }

    @GetMapping("/{id}")
    public Usuario obterUsuarioPorId1(@PathVariable int id) {
        return new Usuario( 1,"Maria", "987.456.321-00");

    }

    // @GetMapping("/home")
    //  public Usuario obterUsuarioPorId2(
    //         @RequestParam(name = "id", defaultValue = "1") int id) {
    //     return new Usuario(id, "pedro", "741.852.963-45");
    //      }

}


