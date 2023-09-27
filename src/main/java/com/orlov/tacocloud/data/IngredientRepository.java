package com.orlov.tacocloud.data;

import org.springframework.data.repository.CrudRepository;

import com.orlov.tacocloud.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
  
}
