public class Time {
    public static void main(String[] args) {
      int hour = 13;
      int minute = 30;
      int second = 60;
      int numSecondSinceMidnight = (3600* hour)+ (60 * minute) + second; 
      System.out.print("The current time is :" + " " + hour + ":" + minute + "." );
      System.out.print("Number of seconds since midnight: ");
      System.out.println(numSecondSinceMidnight);
      int numSecondsPerDay = 3600*24;
      double doubleSecsPerDay = numSecondsPerDay;
      double percentUsed = numSecondsSinceMidnight/doubleSecsPerDay;
    
      System.out.println("Number of seconds left: " + (numSecondsPerDay-numSecondSinceMidnight));

       
   {
        double hours passed  = 12;
        double total hours = 24;

        double percentage = (hours passed / total hours) * 100;

        System.out.println("The percentage is: " + percentage + "%");
    }


  
       
    

      



    }
}
