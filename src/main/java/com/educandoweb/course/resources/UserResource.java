package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//camada de recurso são camadas controladoras (controllers)
@RestController
@RequestMapping(value = "/users") //recurso web da entidade user com o caminho /users
public class UserResource {

    //método para acessar os users
    //o response é do spring e retorna respostas web
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "maria", "maria@gmail.com", "99999", "kkk323");
        return ResponseEntity.ok().body(u);
        //ok para retornar com sucesso e body para retornar o corpo do u
    }
}
