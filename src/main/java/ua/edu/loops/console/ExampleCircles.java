package ua.edu.loops.console;

import ua.edu.debug.Printer;

/**
 * Created with IntelliJ IDEA.
 * User: Asya
 * Date: 4/24/12
 * Time: 11:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class ExampleCircles {
    public Double result;
    public Double[] row;
    public ExampleCircles() {
    }
    /*
    *
    * */
    public Double getResultExpression(Double input, int count)
    {
      int i=0;
      result=0d;
      while(i<count){
          result+=input;
          Printer.intoConsole("ExampleCircles", "getResultExpression", result.toString());
          i++;
      }
      return result;
    }
    public Double factorial(Integer input)
    {
       int i=1;
       result=1d;
       while (i<=input)
       {
          result*=i;
           Printer.intoConsole("ExampleCircles", "factorial()", result.toString());
          i++;
       }
      return result;
    }
    public Double[] rowFibonacci(int limit)
    {
        row=new Double[limit];
        row[0]=1d;
        Printer.intoConsole("ExampleCircles", "rowFibonacci", row[0].toString());
        row[1]=1d;
        Printer.intoConsole("ExampleCircles", "rowFibonacci", row[1].toString());
        int index;
        for(index=2;index<limit;index++)
        {
           row[index]=row[index-1]+row[index-2];
           Printer.intoConsole("ExampleCircles", "rowFibonacci", row[index].toString());
        }
     return row;
    }
    public StringBuilder getListRowFibonacci(int limit)
    {
        StringBuilder res=new StringBuilder("");
        row=new Double[limit];
        row=rowFibonacci(limit);
        for (int i=0; i<limit;i++){
           res.append(";"+row[i].toString());
        }
      return res;
    }

}
