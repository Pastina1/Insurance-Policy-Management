package com.policy.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    //Repository that searches for any keywords associated with a customer in the database using the query
    @Query(value = "SELECT p FROM Customer p WHERE " +
            "lower(p.name) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.address) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.contactNumber) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.emailAddress) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.sex) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.dateOfBirth) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.employmentStatus) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.riskRate) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.agent) LIKE lower(CONCAT('%', :keyword, '%'))")
    public List<Customer> search(@Param("keyword") String keyword);
}
