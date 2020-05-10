package org.emart_buyer.repository;

import org.emart_buyer.entity.BuyerEntity;
import org.springframework.data.repository.CrudRepository;

public interface BuyerRepository extends CrudRepository<BuyerEntity,String> {}