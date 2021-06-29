package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.CourseType;
import com.sparta.SimulationProject.Model.Trainee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TraineeTest {

    @Test
    @DisplayName("Test that trainee.getCourseType returns course type that was inputted when creating the Trainee object")
    public void TestReturnCourseType() {
        CourseType cSharp = CourseType.CSHARP;
        Trainee trainee = new Trainee(1, cSharp);
        Assertions.assertEquals(cSharp, trainee.getCourseType());
    }
}
