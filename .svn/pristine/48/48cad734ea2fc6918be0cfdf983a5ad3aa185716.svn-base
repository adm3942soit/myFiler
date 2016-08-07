package ua.edu.date;

import java.util.Calendar;
import java.util.GregorianCalendar;
import ua.edu.workWithStr.*;

final public class Dater
{
    public String getFullDate() {
        return Calendar.getInstance().getTime()+"";
    }
    public String getDD_MM_YYYY() {
        return getCurrentDay()+"_"+(getCurrentMonth()+1)+"_"+getCurrentYear()+"";
    }

	public static String getDate()
	{
		Calendar calendar = GregorianCalendar.getInstance();
		
		return new String( calendar.get( Calendar.YEAR ) + "-" 
				+ (calendar.get( Calendar.MONTH ) + 1) + "-" 
				+ calendar.get( Calendar.DAY_OF_MONTH)
				+ " " + getTime() );
//				+ " " + pad(2, '0', calendar.get( Calendar.HOUR_OF_DAY ) + "" ) + ":" 
//				+ pad(2, '0', calendar.get( Calendar.MINUTE ) + "" ) + ":" 
//				+ pad(2, '0', calendar.get( Calendar.SECOND ) + "") );
	}
    public static int getHourFromTime(String time){//"hh:mm:ss"
       if(time.isEmpty())return -1;
       int ind=time.indexOf(":");
       try {
           if (ind == -1) return Integer.valueOf(time);
           return Integer.valueOf(time.substring(0, ind));
       }catch(Exception ex){
           return -1;
       }

    }
    public static int getMinutesFromTime(String time){//"hh:mm:ss"
        if(time.isEmpty())return -1;
        int ind=time.indexOf(":");
        try {
            if (ind == -1) return -1;
            String mmss=time.substring(ind+1);
            ind=mmss.indexOf(":");
            if (ind == -1){
                return  Integer.valueOf(mmss);
            }else {
                return  Integer.valueOf(mmss.substring(0,ind));
            }
        }catch(Exception ex){
            return -1;
        }

    }
    public static int getSecondsFromTime(String time){//"hh:mm:ss"
        if(time.isEmpty())return -1;
        int ind=time.indexOf(":");
        try {
            if (ind == -1) return -1;
            String mmss=time.substring(ind+1);
            ind=mmss.indexOf(":");
            if (ind == -1){
                return  0;
            }else {
                return  Integer.valueOf(mmss.substring(ind+1));
            }
        }catch(Exception ex){
            return -1;
        }

    }

    public static String getDateForLog()
    {
        Calendar calendar = GregorianCalendar.getInstance();

        return new String(calendar.get( Calendar.DAY_OF_MONTH)  + "_"
                + (calendar.get( Calendar.MONTH ) + 1) + "_"
                +  calendar.get( Calendar.YEAR ));
    }
    public static String getYesterday(java.util.Date date)
    {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        return new String((calendar.get( Calendar.DAY_OF_MONTH)-1)  + "_"
                + (calendar.get( Calendar.MONTH ) + 1) + "_"
                +  calendar.get( Calendar.YEAR ));
    }
    public static java.util.Date getYesterdayDate(java.util.Date date)
    {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get( Calendar.YEAR ), calendar.get( Calendar.MONTH ) , (calendar.get( Calendar.DAY_OF_MONTH)-1));
        return
                calendar.getTime();
    }

	public static String getTime()
	{
		Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(new java.util.Date());
		String hourString = pad(2, '0', calendar.get( Calendar.HOUR_OF_DAY ) + "" );
		String minuteString = pad(2, '0', calendar.get( Calendar.MINUTE ) + "" );
		String secondString = pad(2, '0', calendar.get( Calendar.SECOND ) + "" );
		
		return new String( hourString + ":" 
				+ minuteString + ":" 
				+ secondString );
	}
    public static String getTimeHM()
    {
        Calendar calendar = GregorianCalendar.getInstance();

        String hourString = pad(2, '0', calendar.get( Calendar.HOUR_OF_DAY ) + "" );
        String minuteString = pad(2, '0', calendar.get( Calendar.MINUTE ) + "" );

        return new String( hourString + ":"  + minuteString );
    }
    public static boolean greater(java.util.Date  date){
        Calendar calendarOld = GregorianCalendar.getInstance();
        calendarOld.setTime(date);
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(new java.util.Date());
        if(calendarOld.getTime().before(calendar.getTime())) return true;
     return false;
    }
    public static int getCurrentYear(){
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(new java.util.Date());
        return calendar.get(Calendar.YEAR);
    }
    public static int getCurrentMonth(){
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(new java.util.Date());
        return calendar.get(Calendar.MONTH);
    }
    public static int getCurrentDay(){
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(new java.util.Date());
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public static boolean timeGreater(String  time){
        Calendar calendarOld = GregorianCalendar.getInstance();
        String[] timeArray=time.split(":");
        if(timeArray==null || timeArray.length<=1)return false;
        calendarOld.set(getCurrentYear(),getCurrentMonth(),getCurrentDay(),
                Integer.valueOf(timeArray[0]), Integer.valueOf(timeArray[1]));
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(new java.util.Date());
        if(calendarOld.getTime().before(calendar.getTime())) return true;
        return false;
    }
    public static boolean timeGreater(String time1,String  time){//"  :  : "
        Calendar calendarOld = GregorianCalendar.getInstance();
        String[] timeArray=time.split(":");
        if(timeArray==null || timeArray.length<=1)return false;
        calendarOld.set(getCurrentYear(),getCurrentMonth(),getCurrentDay(),
                Integer.valueOf(timeArray[0]), Integer.valueOf(timeArray[1]), Integer.valueOf(timeArray[2].trim()));
        Calendar calendar = GregorianCalendar.getInstance();
        String[] time1Array=time1.split(":");
        calendar.set(getCurrentYear(),getCurrentMonth(),getCurrentDay(),
                Integer.valueOf(time1Array[0]), Integer.valueOf(time1Array[1]), Integer.valueOf(time1Array[2].trim()));

        if(calendarOld.getTime().before(calendar.getTime())) return true;
        return false;
    }

    public static boolean timeEqualsOrGreater(String  time){
        Calendar calendarOld = GregorianCalendar.getInstance();
        String[] timeArray=time.split(":");
        if(timeArray==null || timeArray.length<=1)return false;

            calendarOld.set(getCurrentYear(), getCurrentMonth(), getCurrentDay(),
                    Integer.valueOf(timeArray[0]), Integer.valueOf(timeArray[1]));
            Calendar calendar = GregorianCalendar.getInstance();
            calendar.setTime(new java.util.Date());
            if (calendarOld.getTime().after(calendar.getTime())) return false;
        return true;
    }

    public static boolean timeLess(String  time){
        Calendar calendarOld = GregorianCalendar.getInstance();
        String[] timeArray=time.split(":");
        if(timeArray==null || timeArray.length<=1)return false;
        calendarOld.set(getCurrentYear(),getCurrentMonth(),getCurrentDay(),
                Integer.valueOf(timeArray[0]), Integer.valueOf(timeArray[1]));
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(new java.util.Date());
        if(calendarOld.getTime().after(calendar.getTime())) return true;
        return false;
    }
    public static boolean timeLessOrEquals(String  time){
        Calendar calendarOld = GregorianCalendar.getInstance();
        String[] timeArray=time.split(":");
        if(timeArray==null || timeArray.length<=1)return false;
        calendarOld.set(getCurrentYear(),getCurrentMonth(),getCurrentDay(),
                Integer.valueOf(timeArray[0]), Integer.valueOf(timeArray[1]));
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(new java.util.Date());
        if(calendarOld.getTime().equals(calendar.getTime())) return true;
        if(calendarOld.getTime().after(calendar.getTime())) return true;
        return false;
    }

    public static boolean timeLessNextDay(String  time){
        Calendar currentCalendar= GregorianCalendar.getInstance();
        Calendar calendarNext = GregorianCalendar.getInstance();
        String[] timeArray=time.split(":");
        if(timeArray==null || timeArray.length<=1)return false;
        calendarNext.set(getCurrentYear(),getCurrentMonth(),getCurrentDay()+1,
                Integer.valueOf(timeArray[0]), Integer.valueOf(timeArray[1]));

        if(calendarNext.getTime().after(currentCalendar.getTime())) return true;
        return false;
    }

    public static boolean timeBetween(String  time1, String time2){
        String[] time11=time1.split(":");
        String[] time22=time2.split(":");
        String s1=Stringer.trunkLeaderZero(time11[0]);
        String s2=Stringer.trunkLeaderZero(time22[0]);
        if(Integer.valueOf(s1.isEmpty()?"0":s1)<Integer.valueOf(s2.isEmpty()?"0":s2)) {
            return  timeEqualsOrGreater(time1)&&
                    timeLessOrEquals(time2);
        }else {
            if(Integer.valueOf(s1.isEmpty()?"0":s1)>Integer.valueOf(s2.isEmpty()?"0":s2)) {
                boolean a = timeEqualsOrGreater(time1);
                if (!a && timeLess(time2)) return true;
                if (a && timeEqualsOrGreater(time2) && timeLessNextDay(time2))
                    return true;
            }
            if(Integer.valueOf(s1.isEmpty()?"0":s1)==Integer.valueOf(s2.isEmpty()?"0":s2)) {
                String s3=Stringer.trunkLeaderZero(time11[1]);
                String s4=Stringer.trunkLeaderZero(time22[1]);

                if(Integer.valueOf(s3.isEmpty()?"0":s3)>Integer.valueOf(s4.isEmpty()?"0":s4)) {
                    boolean a = timeEqualsOrGreater(time1);
                    if (!a && timeLess(time2)) return true;
                    if (a && timeEqualsOrGreater(time2) && timeLessNextDay(time2))
                        return true;

                }else{
                    return  timeEqualsOrGreater(time1)&&
                            timeLessOrEquals(time2);

                }
            }
        }
      return false;
    }
	private static String pad(int fieldWidth, char padChar, String s)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = s.length(); i < fieldWidth; i++) 
		{
			sb.append(padChar);
		}
		sb.append(s);
		 
		return sb.toString();
	}
    public static String plus(String time1,String time2){
        int hour1 = getHourFromTime(time1);
        int min1 = Dater.getMinutesFromTime(time1);
        int hour2 = Dater.getHourFromTime(time2);
        int min2 = Dater.getMinutesFromTime(time2);
        int sum = (hour2 * 60 + min2 ) + (hour1 * 60 + min1 );
        int hourS=sum/60;
        int minS=sum%60;
        String timeS= Stringer.setLeaderZero(String.valueOf(hourS),2)+":"+Stringer.setLeaderZero(String.valueOf(minS),2);
        System.out.println(timeS);
        return timeS;

    }
    public static String transform(int sec){

        int min=sec/60;
        int hour=sec/3600;
        int sec1=sec-hour*3600-min*60;
        String time=Stringer.setLeaderZero(String.valueOf(hour), 2)+":"+
                    Stringer.setLeaderZero(String.valueOf(min), 2);
        System.out.println(time);
        return time;
    }
    public static void main(String[]args){
        if(Dater.timeEqualsOrGreater("10:10") && Dater.timeLessOrEquals(Dater.plus("10:10", Dater.transform(360)))){
            System.out.println(true);
        }else System.out.println(false);

    }
}
