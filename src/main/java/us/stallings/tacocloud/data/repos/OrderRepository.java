package us.stallings.tacocloud.data.repos;

import org.springframework.data.repository.CrudRepository;
import us.stallings.tacocloud.data.models.TacoOrder;

import java.util.Optional;


public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}