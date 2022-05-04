package com.kodilla.kodillaspring.calculator;




import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculator() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.kodillaspring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(1.1, 1.2);
        double subResult = calculator.sub(1.5, 1.1);
        double mulResult = calculator.mul(5.0, 1.1);
        double divResult = calculator.div(12.0, 1.99);
        //Then
        Assertions.assertEquals(addResult, 2.3, 0.0);
        Assertions.assertEquals(subResult, 0.4, 0.1);
        Assertions.assertEquals(mulResult, 5.5, 0.0);
        Assertions.assertEquals(divResult, 6.0, 0.1);
    }
}
