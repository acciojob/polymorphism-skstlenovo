package com.driver;

public class Main {
    public class Product{
        public int product(int x, int y)
        {
            return x*y;
        }
        public int product(int x, int y, int z)
        {
            return x*y*z;
        }
        public double product(double x, double y)
        {
            return x*y;
        }

    }
    Product p=new Product();

    p.product(5,7);
    p.product(5,7,2);
    double x=999d, y=9999d;
    p.product(x,y);

}