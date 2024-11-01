# FomJLib
A Simple Java Project Function Manager

To Use This Project, You Need To Import api.jlibs.io.init_interpreter.InitInterpreter & api.jlibs.io.init_interpreter.RegistryMethod
They, you need to extend InitInterpreter in your main class and you need to put an initalize on your main function or your main class. It should be like this: "InitInterpreter example; this.name='YOUR PROJECT NAME'; example.init();"

Next, you need to add a annoiation before every function:
@RegistryMethod("YOUR FUNCTION PARENT NAME");

*Example Code*

    package com.example
    import api.jlibs.io.init_interpreter.InitInterpreter;
    import api.jlibs.io.init_interpreter.RegistryMethod;

    public class examplecode extends InitInterpreter
    {
        public void main()
        {
            InitInterpreter example;
            this.name="EXAMPLE";
            example.init();
        }    

        @RegistryMethod("EXAMPLE")
        public void cbbfunc()
        {
            System.out.println("CBB IS CLEVER MANN IN ZIZHU");
        }
    }
