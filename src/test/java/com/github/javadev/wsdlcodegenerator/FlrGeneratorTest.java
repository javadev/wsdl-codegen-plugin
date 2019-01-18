package com.github.javadev.wsdlcodegenerator;

import java.util.Arrays;
import org.junit.Test;

public class FlrGeneratorTest {
    
    @Test
    public void genrateClass1() {
        FlrGenerator flrGenerator = new FlrGenerator(".", Arrays.asList("ShippedOrderDetail"), "test");
        flrGenerator.generate();
        
    }
}
