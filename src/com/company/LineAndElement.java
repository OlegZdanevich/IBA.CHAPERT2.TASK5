package com.company;

public class LineAndElement implements Comparable<LineAndElement>
{
    private double element;
    private double[] elements=null;
    LineAndElement(double element, double[]elements)
    {
        this.element=element;
        this.elements=elements.clone();
    }

    public double getElement() {
        return element;
    }

    public double[] getElements() {
        return elements;
    }
    @Override
    public int compareTo(LineAndElement p){

        if(element> p.getElement())
            return 1;
        else if(element< p.getElement())
            return -1;
        else
            return 0;
    }
}