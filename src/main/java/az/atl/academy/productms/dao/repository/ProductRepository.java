package az.atl.academy.productms.dao.repository;

import az.atl.academy.productms.dao.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
