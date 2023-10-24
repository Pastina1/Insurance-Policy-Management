package com.policy.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {
    //Repository that searches for any keywords associated with a policy in the database using the query
    @Query(value = "SELECT p FROM Policy p WHERE " +
            "lower(p.policyNumber) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.policyDescription) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.policyType) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.agentList) LIKE lower(CONCAT('%', :keyword, '%'))")
    public List<Policy> search(@Param("keyword") String keyword);

}
