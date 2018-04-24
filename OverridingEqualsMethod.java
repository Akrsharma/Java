//Overriding equals method in Java

class Complex{
    private double re, im;
    public Complex(double re, double im){
        this.re = re;
        this.im = im;
    }
    //Overring equals() methods to compare two Complex object
    @Override
    public boolean equals(Object obj) {
        //If the object is compared with itself then return true
        if(obj == this) return true;
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if(!(obj instanceof Complex)){
            return false;
        }
        //Typecast obj to Complex so that we can compare data members
        Complex oem =(Complex)obj;
        //Comapre the data members and return accordingly
        return Double.compare(re, oem.re) == 0 && Double.compare(im, oem.im) == 0;
    }
}

class OverridingEqualsMethod{
    public static void main(String[] args) {
        Complex c1 = new Complex(10,15);
        Complex c2 = new Complex(10,15);
        
        if(c1.equals(c2)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}