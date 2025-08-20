package enums;

public enum AcademicPerformance {
    POOR, WEAK, AVERAGE, FAIR, GOOD, EXCELLENT;

    public static AcademicPerformance fromGPA(double gpa) {
        if(gpa < 3.0) return POOR;
        if(gpa < 5) return WEAK;
        if(gpa < 6.5) return AVERAGE;
        if(gpa < 7.5) return FAIR;
        if(gpa < 9) return GOOD;
        return EXCELLENT;
    }
}
