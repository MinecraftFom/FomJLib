package api.jlibs.io.logfomo;

import api.jlibs.io.init_interpreter.InitInterpreter;
import api.jlibs.io.init_interpreter.RegistryMethod;

@LoggerMethod
public class Logger extends InitInterpreter
{
    public void main()
    {
        this.name = "Logger";
        InitInterpreter initInterpreter = null;
        initInterpreter.init();
    }
    @RegistryMethod("Logger")
    private void changeStatues()
    {
        IsInited = false;
    }

    @RegistryMethod("Logger")
    private void initLoggerBG()
    {
        System.out.println("\033[47m");
    }
    protected boolean IsInited = true;


}

