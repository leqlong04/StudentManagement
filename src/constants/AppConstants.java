package constants;

import java.time.LocalDate;

public class AppConstants {
    //person
    public static final int NAME_MAX_LENGTH = 100;
    public static final int ADDRESS_MAX_LENGTH = 300;
    public static final double MIN_HEIGHT = 50.0;
    public static final double MAX_HEIGHT = 300.0;
    public static final double MIN_WEIGHT = 5.0;
    public static final double MAX_WEIGHT = 1000.0;
    public static final LocalDate MIN_YEAR = LocalDate.of(1990,1,1)  ;

    //student
    public static final int STUDENT_ID_LENGTH = 10;
    public static final int UNI_NAME_MAX_LENGTH = 200;
    public static final double MIN_GPA = 0.0;
    public static final double MAX_GPA = 10.0;
}
