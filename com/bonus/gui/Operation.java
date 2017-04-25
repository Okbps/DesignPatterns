package com.bonus.gui;

import java.util.function.DoubleBinaryOperator;

/**
 * Created by Aspire on 25.04.2017.
 */
public enum Operation {
    ADDITION((x, y) -> x+y),
    SUBTRACTION((x, y) -> x-y),
    DIVISION((x, y) -> x/y),
    MULTIPLICATION((x, y) -> x*y),
    PERCENTAGE((x, y) -> x%y);

    private DoubleBinaryOperator operator;

    Operation(DoubleBinaryOperator operator) {
        this.operator = operator;
    }

    public DoubleBinaryOperator getOperator() {
        return operator;
    }
}
