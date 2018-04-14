package com.jpadb.jpa.dao;

import com.jpadb.jpa.model.Category;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;

/**
 * category个性化查询
 */
public class CategoryPredicate implements Specification<Category> {

    /**
     * cataName
     */
    private String cnameQ;

    private String cataCodeQ;

    public CategoryPredicate(String cnameQ, String cataCodeQ) {
        this.cnameQ = cnameQ;
        this.cataCodeQ = cataCodeQ;
    }

    @Override
    public Predicate toPredicate(Root<Category> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
         //cataName
        Path<String> cname = root.get("cataName");
        Path<String> cataCode = root.get("cataCode");
        query.where(cb.like(cname,"%"+cnameQ+"%"),
                cb.like(cataCode,"%"+cataCodeQ+"%")
                );
        return query.getGroupRestriction();
    }
}
