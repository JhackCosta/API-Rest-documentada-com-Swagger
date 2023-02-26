package br.com.estudo.swagger.controllers;

import br.com.estudo.swagger.model.Usuario;
import br.com.estudo.swagger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping()
    public List<Usuario> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getOneUser(@PathVariable String username){
        return repository.findByUsername(username);
    }

    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void putUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

}
