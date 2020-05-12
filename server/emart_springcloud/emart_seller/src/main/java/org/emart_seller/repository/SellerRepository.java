package org.emart_seller.repository;

import org.emart_seller.entity.SellerEntity;
import org.springframework.data.repository.CrudRepository;

public interface SellerRepository extends CrudRepository<SellerEntity,String> {}