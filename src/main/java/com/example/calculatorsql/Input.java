package com.example.calculatorsql;

import javax.persistence.*;

@Entity
@Table(name = "Calculator")
public class Input
{
    @Id
    @GeneratedValue
    int id;

    @Column(name="num1")
    double a;

    @Column(name="num2")
    double b;

    @Column(name="result")
    double result;

    @Column(name="operation")
    String operation;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public double getA() { return a; }

    public void setA(double a) { this.a = a; }

    public double getB() { return b; }

    public void setB(double b) { this.b = b; }

    public double getResult() { return result; }

    public void setResult(double result) { this.result = result; }

    public String getOperation() { return operation; }

    public void setOperation(String operation) { this.operation = operation; }
}
