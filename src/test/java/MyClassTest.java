import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MyClassTest {

   @Test
   public void shouldAddTwoIntegers(){
      MyClass myClass = new MyClass();

      assertThat(myClass.add(1, 2), is(3));
   }

}