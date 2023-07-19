package pe.com.dao;

import org.springframework.data.repository.CrudRepository;
import pe.com.domain.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long> {
    
}
