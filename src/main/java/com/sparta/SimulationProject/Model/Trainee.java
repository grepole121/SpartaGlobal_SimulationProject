package com.sparta.SimulationProject.Model;

public class Trainee {

    private final CourseType courseType;
    private final int traineeId;

    public Trainee(int traineeId, CourseType courseType) {
        this.courseType = courseType;
        this.traineeId = traineeId;
    }

    public CourseType getCourseType() {
        return courseType;
    }
}
