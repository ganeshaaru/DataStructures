package com.r.algorithms;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ShuntingYardAlgorithm
{
    private static  Map<String, Operator> operatorMap = initializeOperatorMap();

    private static Map<String, Operator> initializeOperatorMap()
    {
        operatorMap = new HashMap<>();
        operatorMap.put(Operator.ADD.sign, Operator.ADD);
        operatorMap.put(Operator.SUBTRACT.sign, Operator.SUBTRACT);
        operatorMap.put(Operator.MULTIPLY.sign, Operator.MULTIPLY);
        operatorMap.put(Operator.DIVIDE.sign, Operator.DIVIDE);
        return operatorMap;
    }

    public ShuntingYardAlgorithm()
    {
        // Default Constructor
    }


    private enum Operator
    {
        ADD(1, "+"),
        SUBTRACT(2, "-"),
        MULTIPLY(3, "*"),
        DIVIDE(4, "/");

        final int precedence;
        final String sign;

        Operator(int precedence, String sign)
        {
            this.precedence = precedence;
            this.sign = sign;
        }
    }

    private static boolean isHighPrecedence(String currentToken, String peekedOperator)
    {
        return operatorMap.containsKey(peekedOperator) && operatorMap.get(peekedOperator).precedence >= operatorMap.get(currentToken).precedence;
    }

    public static Integer evaluateExpression(String infix)
    {
        Stack<String> operatorStack = new Stack<>();
        Stack<BigDecimal> outputStack = new Stack<>();

        for (String currentToken : infix.split("\\s"))
        {

            if ("(".equalsIgnoreCase(currentToken))
            {
                operatorStack.push(currentToken);
            } else if (operatorMap.containsKey(currentToken))
            {
                while (!operatorStack.isEmpty() && isHighPrecedence(currentToken, operatorStack.peek()))
                {
                    String higherPrecedenceOperator = operatorStack.pop();
                    BigDecimal operandLeft = outputStack.pop();
                    BigDecimal operandRight = outputStack.pop();
                    outputStack.push(evaluate(operandLeft, operandRight, higherPrecedenceOperator));

                }
                operatorStack.push(currentToken);
            } else if (currentToken.equalsIgnoreCase(")"))
            {
                while (!"(".equalsIgnoreCase(operatorStack.peek()))
                {
                    String higherPrecedenceOperator = operatorStack.pop();
                    BigDecimal operandLeft = outputStack.pop();
                    BigDecimal operandRight = outputStack.pop();
                    outputStack.push(evaluate(operandLeft, operandRight, higherPrecedenceOperator));
                }
                operatorStack.pop();
            } else
            {
                outputStack.push(new BigDecimal(currentToken));
            }
        }


        while (!operatorStack.empty())
        {
            String higherPrecedenceOperator = operatorStack.pop();
            BigDecimal operandRight = outputStack.pop();
            BigDecimal operandLeft = outputStack.pop();

            outputStack.push(evaluate(operandLeft, operandRight, higherPrecedenceOperator));

        }
        return outputStack.pop().intValue();
    }

    private static BigDecimal evaluate(BigDecimal left, BigDecimal right, String operator)
    {
        BigDecimal retVal = BigDecimal.ZERO;
        if (operator.equals(Operator.MULTIPLY.sign))
        {
            retVal = left.multiply(right);
        } else if (operator.equals(Operator.ADD.sign))
        {
            retVal = left.add(right);
        } else if (operator.equals(Operator.SUBTRACT.sign))
        {
            retVal = left.subtract(right);
        } else if (operator.equals(Operator.DIVIDE.sign))
        {
            retVal = left.divide(right, 4, BigDecimal.ROUND_HALF_EVEN);
        }
        return retVal;
    }


}
