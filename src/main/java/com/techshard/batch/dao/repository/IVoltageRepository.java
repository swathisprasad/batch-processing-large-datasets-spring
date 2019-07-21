package com.techshard.batch.dao.repository;

import com.techshard.batch.dao.entity.Voltage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVoltageRepository extends JpaRepository<Voltage, Long> {

}
