package com.mielowski.calculator.expression.chain;

import com.mielowski.calculator.expression.binary.AdditionExpression;
import com.mielowski.calculator.expression.binary.SubtractionExpression;

public class AdditiveExpressionFactory extends BinaryExpressionFactory {

    public AdditiveExpressionFactory() {
        addBinaryFunctionCreator(AdditionExpression.OPERATOR, AdditionExpression::new);
        addBinaryFunctionCreator(SubtractionExpression.OPERATOR, SubtractionExpression::new);
    }
}
