package api.jlibs.io.logfomo;

import api.jlibs.io.logfomo.Logger;
import api.jlibs.io.logfomo.LoggerMethod;

@LoggerMethod("Info")
public class Info extends Logger
{
    private String InfoText = "[     INFO     ]";
    public void info(String[] _info)
    {
        for(int i = 0; i < _info.length; i++)
        {
            System.out.print("\033[40m"+InfoText);
        }
    }

}
