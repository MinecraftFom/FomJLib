package api.jlibs.io.init_interpreter;
import java.lang.reflect.Field;
import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

class RegistryMethodInterpreter {
    public static Map<String, Supplier<Integer>> registeredFunc = new HashMap<>();

    public static void process(Object obj) throws IllegalAccessException
    {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields)
        {
            RegistryMethod registryMethod = field.getAnnotation(RegistryMethod.class);
            if (registryMethod != null)
            {
                field.setAccessible(true);
                if (field.getType() == Supplier.class && field.getGenericType().equals(Supplier.class))
                {
                    try
                    {
                        Supplier<Integer> currentValue = (Supplier<Integer>) field.get(obj);
                        registeredFunc.put(registryMethod.value(), currentValue);
                    } catch (ClassCastException e)
                    {

                    }
                }
                else
                {

                }
            }
        }
    }
}

public @interface RegistryMethod
{
    String value() default "InitInterpreter";
}