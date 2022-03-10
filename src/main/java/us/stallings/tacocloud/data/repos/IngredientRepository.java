package us.stallings.tacocloud.data.repos;

import us.stallings.tacocloud.data.models.Ingredient;

import java.util.Optional;


public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
