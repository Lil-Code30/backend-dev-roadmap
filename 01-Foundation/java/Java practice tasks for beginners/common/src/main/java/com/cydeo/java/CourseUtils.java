package com.cydeo.java;

import kotlin.NotImplementedError;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class CourseUtils {
    public static final String NEW_LINE_SEPARATOR = System.lineSeparator();

    public static void throwInternalCourseError() {
        throw new Error("Internal course error!");
    }

    public static void setSystemIn(String input) {
        if (input != null) {
            System.setIn(new ByteArrayInputStream(replaceLineSeparator(input).getBytes(StandardCharsets.UTF_8)));
        }
    }

    public static String replaceLineSeparator(String original) {
        return String.join(NEW_LINE_SEPARATOR, original.split("\\r?\\n"));
    }

    public static ByteArrayOutputStream setSystemOut() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos, true, StandardCharsets.UTF_8);
        System.setOut(ps);
        return baos;
    }

    public static boolean isSystemInEmpty() {
        try {
            return System.in.readAllBytes().length == 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean outputContainsAllIgnoringCase(String output, String... values) {
        return Arrays.stream(values)
                .allMatch(value -> output.toLowerCase().contains(value.toLowerCase()));
    }

    public static boolean outputContainsAllWithCaseMatch(String output, String... values) {
        return Arrays.stream(values)
                .allMatch(output::contains);
    }

    public static String provideInput(String... arr) {
        return (String.join("\n", arr));
    }

    public static String runMainMethod(Runnable mainMethod, String input, boolean toAssertSystemIn) {
        try {
            setSystemIn(input);
            ByteArrayOutputStream baos = setSystemOut();
            mainMethod.run();
            if (toAssertSystemIn) {
                if (isSystemInEmpty()) {
                    return "You are asking the user to enter data fewer times than required in the task!";
                }
            }
            return replaceLineSeparator(baos.toString(StandardCharsets.UTF_8));
        } catch (IllegalStateException e) {
            String userInput = input != null ? "the user input: " + input : "the empty user input";
            String errorPrefix =
                    "Try to run the main method with " + userInput + ", the method must process the input and exit, but the current version of the method";
            if (e.getMessage() == null || !e.getMessage().contains("Your input is incorrect")) {
                return errorPrefix + " waits more user inputs, it must be fixed.";
            }
            return errorPrefix + " throws an unexpected error, please, check the method's implementation.";
        } catch (NotImplementedError e) {
            return "You call not implemented methods (that use TODO()) inside the main method. Please, don't do it until the task asks it";
        }
    }

    public static String runMethod(Runnable method) {
        ByteArrayOutputStream baos = setSystemOut();
        method.run();
        return replaceLineSeparator(baos.toString(StandardCharsets.UTF_8));
    }

    public static String readFileToString(String filePath) {
        try {
            return Files.readString(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
            return null; // or handle the error as appropriate
        }
    }
}