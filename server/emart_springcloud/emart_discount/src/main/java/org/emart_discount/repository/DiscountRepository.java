package org.emart_discount.repository;

import org.emart_discount.entity.DiscountEntity;
import org.springframework.data.repository.CrudRepository;

public interface DiscountRepository extends CrudRepository<DiscountEntity,String> {}