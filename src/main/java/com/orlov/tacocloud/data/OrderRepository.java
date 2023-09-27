package com.orlov.tacocloud.data;

import com.orlov.tacocloud.model.TacoOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {

}
