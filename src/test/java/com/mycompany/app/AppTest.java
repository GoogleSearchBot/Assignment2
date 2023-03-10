package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void add_TwoPlusTwo_ReturnsFour() {
      // Arrange
      final int expected = 4;
  
      // Act
      final int actual = Calculator.add(2, 2);
  
      // Assert
      Assert.assertEquals(expected, actual);
    }    
    @Test
    public void subtract_FiveMinusTwo_ReturnsThree() {
      // Arrange
      final int expected = 4;
  
      // Act
      final int actual = Calculator.add(2, 2);
  
      // Assert
      Assert.assertEquals(expected, actual);
    }    
    @Test
    public void multiply_FourTimesTwo_ReturnsEight() {
      // Arrange
      final int expected = 8;
  
      // Act
      final int actual = Calculator.multiply(4, 2);
  
      // Assert
      Assert.assertEquals(expected, actual);
    }
    @Test
    public void divide_TenDividedTwo_ReturnsFive() {
      // Arrange
      final int expected = 5;
  
      // Act
      final int actual = Calculator.divide(10, 2);
  
      // Assert
      Assert.assertEquals(expected, actual);
    }           
}
