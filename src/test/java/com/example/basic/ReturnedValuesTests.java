package com.example.basic;

        import static org.junit.Assert.assertEquals;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.test.context.junit4.SpringRunner;

        import java.lang.reflect.Field;
        import java.util.Arrays;
        import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReturnedValuesTests {

    private final ReturnedValues VALUES = new ReturnedValues("string", 1, Arrays.asList("This", "Little", "Array"));

    @Test
    public void otherStringIsReturned() throws NoSuchFieldException {

        int expectedInt = 2;

        //given
        ReturnedValues testValues = VALUES;

        //when
        testValues.setSomeInt(expectedInt);

        //then
        final Field field = testValues.getClass().getDeclaredField("someInt");
        field.setAccessible(true);
        try {
            assertEquals("Fields didn't match", expectedInt, field.get(testValues));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void stringIsReturned() throws NoSuchFieldException {

        String expectedString = "expected";

        //given
        ReturnedValues testValues = VALUES;

        //when
        testValues.setSomeString(expectedString);

        //then
        final Field field = testValues.getClass().getDeclaredField("someString");
        field.setAccessible(true);
        try {
            assertEquals("Fields didn't match", expectedString, field.get(testValues));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void listIsReturned() throws NoSuchFieldException {

        List<String> expectedList = Arrays.asList("This", "Array");

        //given
        ReturnedValues testValues = VALUES;

        //when
        testValues.setSomeArray(expectedList);

        //then
        final Field field = testValues.getClass().getDeclaredField("someArray");
        field.setAccessible(true);
        try {
            assertEquals("Fields didn't match", expectedList, field.get(testValues));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
