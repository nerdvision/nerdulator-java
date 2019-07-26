package com.nerdvision;

public class Result
{
    private int int1;
    private int int2;
    private String operation;
    private String result;
    private String equation;


    public Result( int int1, int int2, String operation, String result )
    {
        this.int1 = int1;
        this.int2 = int2;
        this.operation = operation;
        this.result = result;
        this.equation = int1 + operation + int2;
    }


    public int getInt1()
    {
        return int1;
    }


    public int getInt2()
    {
        return int2;
    }


    public String getOperation()
    {
        return operation;
    }


    public String getResult()
    {
        return result;
    }


    public String getEquation()
    {
        return int1 + operation + int2;
    }
}
