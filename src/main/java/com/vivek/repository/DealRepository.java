package com.vivek.repository;

import com.vivek.model.Deal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealRepository extends JpaRepository<Deal,Long> {

}
