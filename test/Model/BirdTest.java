package Model;

import com.alejandro.Model.Bird;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ale on 2/16/17.
 */
public class BirdTest {

    private Bird bird;
    private static final double DELTA = 1e-15;

    @Before
    public void BeforeTest(){
        bird = new Bird();
    }

    @Test
    public void whenPlayerHitsTheUpButtonThenTheBirdJumps(){

        //Arrange
        double expectedVelocity = -15;

        //Act
        bird.jump();
        double actualVelocity = bird.getVelocity();

        //Assert
        Assert.assertEquals(expectedVelocity, actualVelocity, DELTA );
    }

}
