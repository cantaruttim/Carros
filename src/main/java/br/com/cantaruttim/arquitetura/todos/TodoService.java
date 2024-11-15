package br.com.cantaruttim.arquitetura.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;
    private TodoValidator validator;
    private EmailSender emailSender;

    public TodoService(TodoRepository todoRepositoy,
                       TodoValidator validator,
                       EmailSender emailSender){

        this.repository = todoRepositoy;
        this.validator = validator;
        this.emailSender = emailSender; 
    
    }

    public TodoEntity salvar(TodoEntity novoTodo) {
        validator.validar(novoTodo);
        return repository.save(novoTodo);
    }

    public void atualizarStatus(TodoEntity todo) {

        repository.save(todo);
        String status = todo.getConcluido() == Boolean.TRUE ? "Concluído" : "Não Concluído";
        emailSender.enviar("Todo com descricao" + todo.getDescricao() +  "foi Atualizado para " + status);
    }

    public TodoEntity buscarPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
