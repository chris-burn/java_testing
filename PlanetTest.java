import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class PlanetTest{

  Planet planet;

  @Before 
  public void before(){
    planet = new Planet("Saturn", 58232);
  }

  @Test
  public void hasName(){
    assertEquals("Saturn", planet.getName());
  }

  @Test
  public void hasSize(){
    assertEquals(58232, planet.getSize());
  }

  @Test
  public void willExplode(){
    assertEquals("Boom! Saturn has exploded.", planet.explode());
  }

}