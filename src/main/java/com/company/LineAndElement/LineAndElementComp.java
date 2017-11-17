package com.company.LineAndElement;

import org.apache.log4j.Logger;

import java.util.Comparator;

public class LineAndElementComp implements Comparator<LineAndElement> {

    private static final Logger log = Logger.getLogger(LineAndElement.class);

    public int compare(LineAndElement firstElement, LineAndElement secondElement) {
        try {
            if(firstElement==null) throw new  NullPointerException("Object should be initialized");
            if(secondElement==null) throw new  NullPointerException("Object should be initialized");

            if (firstElement.getElementOfLine() > secondElement.getElementOfLine()) {
                return 1;
            } else {
                return -1;
            }
        }

        catch (NullPointerException exception)
        {
            StackTraceElement[] info = exception.getStackTrace();
            StringBuilder trace = new StringBuilder("");

            for (int i = info.length - 1; i >= 0; i--) {
                trace.append(info[i].toString() + "\n");
            }
            log.error(exception.getMessage() + "\nTrace: \n" + trace);
            return 0;
        }

    }

}
