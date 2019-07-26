package com.nerdvision;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator
{
    @RequestMapping("/add")
    public Result add( @RequestParam(value = "int1") int int1, @RequestParam(value = "int2") int int2 )
    {
        String result = String.valueOf( int1 + int2 );
        return new Result( int1, int2, "+", result );
    }


    @RequestMapping("/subtract")
    public Result sub( @RequestParam(value = "int1") int int1, @RequestParam(value = "int2") int int2 )
    {
        String result = String.valueOf( int2 - int1 );
        return new Result( int1, int2, "-", result );
    }


    @RequestMapping("/multiply")
    public Result multiply( @RequestParam(value = "int1") int int1, @RequestParam(value = "int2") int int2 )
    {
        String result = String.valueOf( int1 * int2 );
        return new Result( int1, int2, "*", result );
    }


    @RequestMapping("/divide")
    public Result divide( @RequestParam(value = "int1") int int1, @RequestParam(value = "int2") int int2 )
    {
        String result;
        if( int2 != 0 )
        {
            result = String.valueOf( int1 / int2 );
        }
        else
        {
            result = "Cannot divide by zero";
        }
        return new Result( int1, int2, "/", result );
    }
}
