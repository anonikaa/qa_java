import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

public class FelineTest {
    @Mock
    Animal animal;

    Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
    @Test
    public void getFamilyTest(){
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void getKittensTest(){
        Assert.assertEquals(3, feline.getKittens(3));
    }
}
