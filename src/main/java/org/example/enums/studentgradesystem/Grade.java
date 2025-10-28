package org.example.enums.studentgradesystem;

public enum Grade {
    A, B, C, D, F;

    public static Grade getGrade(int score) {
        switch (score / 10) {
            case 10:
            case 9:
                return Grade.A;
            case 8:
                return Grade.B;
            case 7:
                return Grade.C;
            case 6:
                return Grade.D;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                return Grade.F;
            default:
                return null;
        }
    }
}
