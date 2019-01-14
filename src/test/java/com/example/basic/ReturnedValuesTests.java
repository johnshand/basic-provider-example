package com.example.basic;

        import static org.junit.Assert.assertEquals;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.test.context.junit4.SpringRunner;

        import java.lang.reflect.Field;
        import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReturnedValuesTests {

    @Test
    public void intIsReturned() throws NoSuchFieldException {

        int expectedInt = 2019;

        //given
        final ReturnedValues values = new ReturnedValues("string", 2000, Arrays.asList("This", "Little", "Array"));

        //when
        values.setSomeInt(expectedInt);

        //then
        final Field field = values.getClass().getDeclaredField("someInt");
        field.setAccessible(true);
        try {
            assertEquals("Fields didn't match", expectedInt, field.get(values));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
