package com.policy.model;

import com.policy.model.PolicyHolderRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PolicyHolderRecordRepository extends JpaRepository<PolicyHolderRecord, Long> {
    //Repository that searches for any keywords associated with a policy holder record in the database using the query
    @Query(value = "SELECT p FROM PolicyHolderRecord p WHERE " +
            "lower(p.policyNumber) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.customer) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.appliedDate) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.status) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.startDate) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.endDate) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.premium) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.otherDetails) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.agent) LIKE lower(CONCAT('%', :keyword, '%'))")
    public List<PolicyHolderRecord> search(@Param("keyword") String keyword);
}