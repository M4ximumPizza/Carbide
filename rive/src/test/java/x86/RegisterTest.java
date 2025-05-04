package x86;

import mi.m4x.rive.registers.Register;

import java.lang.reflect.Field;
import java.util.*;

public class RegisterTest {
    public static void main(String[] args) {
        try {
            // Get all declared fields in the Register class
            Field[] fields = Register.class.getDeclaredFields();
            Map<Integer, String> idToName = new TreeMap<>(); // Automatically sorted by ID

            for (Field field : fields) {
                // Check if the field is of type int
                if (field.getType() == int.class) {
                    field.setAccessible(true);
                    int value = field.getInt(null);
                    idToName.put(value, field.getName());
                }
            }

            System.out.println("Total int fields: " + idToName.size());

            int expected = -1;
            for (Map.Entry<Integer, String> entry : idToName.entrySet()) {
                int actual = entry.getKey();
                if (expected == -1) {
                    expected = actual;
                } else if (actual != expected + 1) {
                    System.err.println("Gap or disorder detected between ID " + expected + " and " + actual);
                }
                System.out.println("Name: " + entry.getValue() + ", ID: " + actual);
                expected = actual;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
