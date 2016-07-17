class Entry{
public static void main(String [] args)
{
Calc c = new Calc(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
}
static class Calc{
private int a;
private int b;

public Calc(int a, int b) {
      this.a = a;
      this.b = b;
      sum(a, b);
      div(a, b);
      pow(a);
      pow(b);
      mul(a, b);
      minus(a, b);
  }

public int sum(int a, int b){
  int result = a+b;
  System.out.println("SUM = " + result);
  return result;
}


public float div(int a, int b){
  float bFloat = Float.valueOf(b);
  float result = a/bFloat;
  System.out.println("DIV = " + result);
  return result;
}

public int pow(int a){
   int result = a * a;
   System.out.println("POW = " + result);
   return result;
}

public int mul(int a, int b){
   int result = a*b;
   System.out.println("MUL = " + result);
   return result;
}
public int minus(int a, int b){
   int result = a - b;
   System.out.println("MINUS = " + result);
   return result;
}

public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
}
