package api.jlibs.io.init_interpreter;

import api.jlibs.io.init_interpreter.RegistryMethod;

import java.util.Map;
import java.util.function.Supplier;

public class InitInterpreter {


    //Must Be InitInterpreter Type

    public void init()
    {
        registeryLength++;
        registeredList[registeryLength]+=this.name;
        try
        {
            for (int i = 0; i < registeredFunc.size(); i++)
            {
                registeredFunc.get(i).get();
            }
        }catch (NullPointerException e)
        {

        }catch (IncompatibleClassChangeError e)
        {

        }

    }
    @RegistryMethod
    public void regapi(){};
    // Every Pre-Init Function Must Be java.lang.Integer Type !!!
    public String               name;
    protected    String[]                       registeredList;
    protected    Map<String, Supplier<Integer>> registeredFunc;
    protected    int                            registeryLength = 0;

}
