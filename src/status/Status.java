package status;

import java.util.Scanner;

public class Status {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code (ZERO, ONE, TWO, THREE) in string");

        try {
            String code = in.next().toUpperCase();
            StatusCode statusCode = StatusCode.valueOf(code);
            StatusUser t = new StatusUser();
            t.statusDetail(statusCode);
        } catch (IllegalArgumentException e) {
            System.out.println("NOT VALID CODE");
        }
    }
}
