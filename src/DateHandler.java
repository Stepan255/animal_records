import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHandler {
    protected static String dateFormat = "yyyy-MM-dd";
//    getTime()


//    public Date getDate(String dateToString){
//        SimpleDateFormat sdf = new SimpleDateFormat();
//        sdf.setLenient(false);
//        if (isThisDateValid(dateToString)) {
//
//            return sdf.parse(dateToString);
//        }
//
//        return ;
//    }

    public static String getDateToString(Date date){
        return (date.getYear()+1900) + "-" + (date.getMonth()+1) + "-" + (date.getDate());
    }

    public static Date getDate(String stringToDate){

//        if(stringToDate == null){
//            return false;
//        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);

        try {
            Date date = sdf.parse(stringToDate);
            return date;
        } catch (Exception e) {

            System.err.println("incorrect date:" + e.getMessage());
            return new Date(0000,00,00);
        }


    }
}
