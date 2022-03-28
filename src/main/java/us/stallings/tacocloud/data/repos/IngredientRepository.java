package us.stallings.tacocloud.data.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import us.stallings.tacocloud.data.models.Ingredient;

import java.util.Optional;


public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
