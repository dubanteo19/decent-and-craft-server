package com.nlu.DecentAndCraft.specification;

import com.nlu.DecentAndCraft.model.Category;
import com.nlu.DecentAndCraft.model.Product;
import com.nlu.DecentAndCraft.model.ProductDetail;
import jakarta.persistence.criteria.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductSpecification implements Specification<ProductDetail> {


    Double minPrice;
    Double maxPrice;
    Long categoryId;
    String name;

    @Override
    public Predicate toPredicate(Root<ProductDetail> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        Join<ProductDetail, Product> productJoin = root.join("product");
        Join<ProductDetail, Category> categoryJoin = root.join("categoryList", JoinType.LEFT);
        List<Predicate> predicates = new ArrayList<>();
        if (minPrice != null) {
            predicates.add(cb.greaterThanOrEqualTo(productJoin.get("price"), minPrice));
        }
        if (maxPrice != null) {
            predicates.add(cb.lessThanOrEqualTo(productJoin.get("price"), maxPrice));
        }
        if (name != null) {
            predicates.add(cb.like(productJoin.get("name"), "%" + name + "%"));
        }
        if (categoryId != null) {
            predicates.add(cb.equal(categoryJoin.get("id"), categoryId));
        }
        query.distinct(true);
        return cb.and(predicates.toArray(new Predicate[0]));
    }
}
