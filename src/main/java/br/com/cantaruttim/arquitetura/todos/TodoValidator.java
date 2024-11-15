package br.com.cantaruttim.arquitetura.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository repository){
        this.repository = repository;
    }

    public void validar(TodoEntity todo){
        // precisamos verficiar no banco de dados se existe descricao igual
        if (existeTodoDescricao(todo.getDescricao())){
            throw new IllegalArgumentException("Já existe um item com essa descrição!!");
        }

    }

    private boolean existeTodoDescricao(String descricao) {
        return repository.existsByDescricao(descricao);
    }
    
}
