package com.example.calculatorsql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CalculatorController
{
    @Autowired
    CalculatorService calculatorService;

    @PostMapping("/calci/{operator}")
    void operation(@RequestBody Input input, @PathVariable String operator)
    {
        input.operation = operator;
        switch (operator)
        {
            case "add":
                calculatorService.add(input);
                break;
            case "substract":
                calculatorService.substract(input);
                break;
            case "multiply":
                calculatorService.multiply(input);
                break;
            case "divide":
                calculatorService.divide(input);
                break;
            case "modulo":
                calculatorService.modulo(input);
                break;
        }
    }

    @GetMapping("/calci/show")
    List<Input> findAll()
    {
        return calculatorService.findAll();
    }

    @GetMapping("/calci/show/{id}")
    Input findByID(@PathVariable int id)
    {
        return calculatorService.findByID(id);
    }

    @DeleteMapping("/calci/delete/{id}")
    void delete(@PathVariable  int id)
    {
        calculatorService.delete(id);
    }
}
