import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

   @Test
   public void getMyaySoundTest(){
       Cat cat = new Cat(feline);
       Assert.assertEquals("Не мяукнул", "Мяу", cat.getSound());
   }
   @Test
   public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("1", "Птицы", "Рыба"));
       Assert.assertEquals(List.of("1", "Птицы", "Рыба"), cat.getFood());
   }
}
