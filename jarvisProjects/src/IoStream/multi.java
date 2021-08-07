package IoStream;

class OddThread extends Thread // to print odd numbers

{

  int limit;

  sharedPrinter printer;

  public OddThread(int limit, sharedPrinter printer)

  {

     this.limit = limit;

     this.printer = printer;

  }

  @Override

  public void run() 

  {

     int oddNumber = 1;     //First odd number is 1

     while (oddNumber <= limit)

     {

       printer.printOdd(oddNumber);//Calling printOdd() method of SharedPrinter class

       oddNumber = oddNumber + 2; //Incrementing to next odd number

     }

  }

}

class EvenThread extends Thread // to print even numbers

{

  int limit;

  sharedPrinter printer;

  public EvenThread(int limit, sharedPrinter printer)

  {

     this.limit = limit;

     this.printer = printer;

  }

  @Override

  public void run() 

  {

     int evenNumber = 2;    //First even number is 2

     while (evenNumber <= limit)

     {

   printer.printEven(evenNumber);//Calling printEven() method of SharedPrinter class

  evenNumber = evenNumber + 2;//Incrementing to next even no.

   }

  }

}

class sharedPrinter

{

  boolean isOddPrinted = false;

  synchronized void printOdd(int number)

  {

    while (isOddPrinted)

    {

      try

      {

          wait();

      } 

      catch (InterruptedException e)

      {

          e.printStackTrace();

      }

}

System.out.println(Thread.currentThread().getName()+" : "+number);

isOddPrinted = true;

try

{

Thread.sleep(1000);

} 

catch (InterruptedException e) 

{

e.printStackTrace();

}

notify();

}

synchronized void printEven(int number)

{

while (! isOddPrinted)

{

try

{

wait();

}

catch (InterruptedException e) 

{

e.printStackTrace();

}

}

System.out.println(Thread.currentThread().getName()+" : "+number);

isOddPrinted = false;

try

{

Thread.sleep(1000); //sleeps for 1 second before notifying OddThread

} 

catch (InterruptedException e) 

{

e.printStackTrace();

}

notify();

}

}

public class multi 

{

public static void main(String[] args) 

{

sharedPrinter printer = new sharedPrinter();

OddThread oddThread = new OddThread(10, printer); //setting limit to 10 numbers

oddThread.setName("Odd-Thread");

EvenThread evenThread = new EvenThread(10, printer);

evenThread.setName("Even-Thread");

oddThread.start();

evenThread.start();

}

}
