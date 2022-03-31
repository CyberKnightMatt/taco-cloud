package us.stallings.tacocloud.data.repos;

import org.springframework.data.repository.CrudRepository;
import us.stallings.tacocloud.data.models.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
