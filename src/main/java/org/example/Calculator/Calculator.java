package org.example.Calculator;
import org.example.EvaluateExpression.Expression;

public class Calculator extends Exception
{
    public double performOperations(int a,int b,int expression)
    {
        double result;
        switch(expression)
        {
            case '+':
                result = Expression.addition(a,b);
            break;
            case '-':
                result = Expression.subraction(a,b);
            break;
            case '*':
                result = Expression.multiplication(a,b);
            break;
            case '/':
                result = Expression.division(a,b);
            break;
            default:
                throw new ArithmeticException();
        }
        return result;
    }
}

