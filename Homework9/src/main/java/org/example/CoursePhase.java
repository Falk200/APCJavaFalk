package org.example;

public enum CoursePhase {
    NOT_STARTED("Course not started yet"),
    ONGOING("Course ongoing"),
    FINISHED("Course finished"),;

    private final String message;

    CoursePhase(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}


