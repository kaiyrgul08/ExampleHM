import Exam.Homework;
import org.junit.Assert;
import org.junit.Test;

public class HmTest {
    @Test
    public void test(){
    Homework homework = new Homework();
        Assert.assertEquals(homework.dream(6),"четное число");
    }

}
