package x86;

import mi.m4x.rive.Code;

import java.lang.reflect.Field;

public class CodeTest {
    public static void main(String[] args) {
        try {
            // Get all declared fields in the MemorySize class
            Field[] fields = Code.class.getDeclaredFields();

            for (Field field : fields) {
                // Check if the field is of type int
                if (field.getType() == int.class) {
                    // Make the field accessible and retrieve its value
                    field.setAccessible(true);
                    int value = field.getInt(null);
                    System.out.println("Name: " + field.getName() + ", ID: " + value);
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
