package ge.tbc.testautomation.annotationsAndStreams;

public class Analyzable {
    @VariableNameAnnotation
    private String name;

    @VariableNameAnnotation(name = "Age")
    private int age;

    @VariableNameAnnotation(name = "Wages")
    private double salary;

    @VariableNameAnnotation(name = "FullName")
    private String fullName;

    @VariableNameAnnotation(name = "IsShort")
    private boolean isShort;

    @VariableNameAnnotation(name = "IsMale")
    private boolean isMale;

    @VariableNameAnnotation(name = "Numbers")
    private double numbers;

    @VariableNameAnnotation(name = "Years")
    private int years;

    @VariableNameAnnotation(name = "Weight")
    private float weight;

    @VariableNameAnnotation(name = "Letter")
    private char Letter;

    @VariableNameAnnotation(name = "LastNames")
    private String lastNames;

    @VariableNameAnnotation(name = "Speed")
    private double speed;

    @VariableNameAnnotation(name = "FirstNumber")
    private int firstNumber;

    @VariableNameAnnotation(name = "LastNumber")
    private int lastNumber;

    @VariableNameAnnotation(name = "Average")
    private float average;
}
