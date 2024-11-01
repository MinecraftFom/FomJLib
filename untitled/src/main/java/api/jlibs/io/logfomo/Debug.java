package api.jlibs.io.logfomo;

import api.jlibs.io.logfomo.Logger;
import api.jlibs.io.logfomo.LoggerMethod;

@LoggerMethod("Debug")
public class Debug extends Logger{
    private String DebugText = "[     DEBUG     ]";
    public void debug(String[] _debug)
    {
        for(int i = 0; i < _debug.length; i++)
        {
            System.out.print("\033[100m"+DebugText);
        }
    }
}
