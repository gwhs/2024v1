package frc.robot;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RobotTest {

    
    @Test
    void testRobot() {
        Robot main = new Robot();
        Assertions.assertNotNull(main);

    }
}
