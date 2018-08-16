package com.mielowski.calculator.operation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class SquareOperationTest {
    @DisplayName("Squared values:")
    @ParameterizedTest(name = "sqr({0}) = {1}")
    @CsvSource({"1, 1", "2, 4", "8, 64", "-2, 4", "1.25, 1.5625", "-1.25, 1.5625"})
    public void xSquaredEqualsZ(BigDecimal x, BigDecimal z){
        BigDecimal result = new SquareOperation(ConstantOperation.of(x)).result();

        assertThat(result).isEqualTo(z);
    }
}
