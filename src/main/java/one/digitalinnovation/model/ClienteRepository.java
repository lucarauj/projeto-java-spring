package one.digitalinnovation.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//não é obrigatória essa anotação
@Repository 
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
