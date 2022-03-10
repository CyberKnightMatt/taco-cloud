package us.stallings.tacocloud.data.repos;

import us.stallings.tacocloud.data.models.TacoOrder;

import java.util.Optional;


public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}