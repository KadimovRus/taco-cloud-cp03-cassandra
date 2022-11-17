package com.example.tacocloud.repository;

import com.example.tacocloud.entity.TacoOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {
    TacoOrder save(TacoOrder tacoOrder);


}
