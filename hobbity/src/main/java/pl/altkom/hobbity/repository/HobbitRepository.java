package pl.altkom.hobbity.repository;

import org.springframework.data.repository.CrudRepository;
import pl.altkom.hobbity.model.Hobbity;

public interface HobbitRepository extends CrudRepository <Hobbity, Long> {

}
