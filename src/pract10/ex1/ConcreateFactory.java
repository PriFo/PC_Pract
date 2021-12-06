package pract10.ex1;

import pract10.ex1.Complex;
import pract10.ex1.ComplexAbstractFactory;

public class ConcreateFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex(){
        return new Complex();
    }

    @Override
    public Complex CreateComplex(int real,int image){
        return new Complex(real,image);
    }
    
}
