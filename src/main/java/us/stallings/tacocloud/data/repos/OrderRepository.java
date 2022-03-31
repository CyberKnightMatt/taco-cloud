package us.stallings.tacocloud.data.repos;

import org.springframework.data.repository.CrudRepository;
import us.stallings.tacocloud.data.models.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}