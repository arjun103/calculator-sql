package com.example.calculatorsql;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculatorRepository extends CrudRepository<Input, Integer>
{

}
