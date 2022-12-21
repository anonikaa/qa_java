import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionManeTest {
    private final String sex;
    private final boolean expected;
    public LionManeTest (String sex, boolean expected){
        this.sex = sex;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[] maneData() {
        return new Object[][] {
                { "Самка", false},
                {"Самец", true},
        };
    }
    @Test
    public void lionHasMane() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(expected, actual);

    }
}
