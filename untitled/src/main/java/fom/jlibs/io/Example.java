package fom.jlibs.io;

import api.jlibs.io.init_interpreter.InitInterpreter;
import api.jlibs.io.init_interpreter.RegistryMethod;

public class Example extends InitInterpreter{

    public void main()
    {
        this.name="Example";
        InitInterpreter initInterpreter = null;
        initInterpreter.init();
    }

    @RegistryMethod("Example")
    public void cbbfunc()
    {

    }
}
