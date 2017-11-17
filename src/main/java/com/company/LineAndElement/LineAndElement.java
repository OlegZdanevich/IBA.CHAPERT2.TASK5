package com.company.LineAndElement;


import org.apache.log4j.Logger;

public class LineAndElement
{
    private double elementOfLine;
    private double[] line=null;
    private static final Logger log = Logger.getLogger(LineAndElement.class);

    public LineAndElement(double elementOfLine, double[] line)
    {
        try {
            if(line==null) throw new  NullPointerException("Line should be initialized");

            this.elementOfLine=elementOfLine;
            this.line=line.clone();
        }
        catch (NullPointerException exception)
        {
            StackTraceElement[] info = exception.getStackTrace();
            StringBuilder trace = new StringBuilder("");

            for (int i = info.length - 1; i >= 0; i--) {
                trace.append(info[i].toString() + "\n");
            }
            log.error(exception.getMessage() + "\nTrace: \n" + trace);
            line=new double[1];
            line[0]=0;
        }

    }

    public double getElementOfLine() {
        return elementOfLine;
    }

    public double[] getLine() {
        return line;
    }
}