package com.example.calculatorsql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CalculatorService
{
    @Autowired
    CalculatorRepository calculatorRepository;

    public void add(Input input)
    {
        input.result = input.a + input.b;
        calculatorRepository.save(input);
    }

    public void substract(Input input)
    {
        input.result = input.a - input.b;
        calculatorRepository.save(input);
    }

    public void multiply(Input input)
    {
        input.result = input.a * input.b;
        calculatorRepository.save(input);
    }

    public void divide(Input input)
    {
        input.result = input.a / input.b;
        calculatorRepository.save(input);
    }

    public void modulo(Input input)
    {
        input.result = input.a % input.b;
        calculatorRepository.save(input);
    }

    List<Input> findAll()
    {
        return (List<Input>) calculatorRepository.findAll();
    }

    Input findByID(int id)
    {
        return calculatorRepository.findById(id).get();
    }

    void delete(int id)
    {
        calculatorRepository.deleteById(id);
    }
}
