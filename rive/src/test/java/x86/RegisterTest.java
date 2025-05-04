package x86;

import mi.m4x.rive.registers.Register;

import java.lang.reflect.Field;

public class RegisterTest {
    public static void main(String[] args) {
        try {
            // Get all declared fields in the Register class
            Field[] fields = Register.class.getDeclaredFields();

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