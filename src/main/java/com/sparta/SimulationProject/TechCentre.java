package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.Centre;
import com.sparta.SimulationProject.Model.CourseType;

public class TechCentre extends Centre {

    private int numberOfTraineesInCentre;
    private final int MAX_CAPACITY = 200;
    private final CourseType courseType;

    public TechCentre (CourseType courseType) {
        this.numberOfTraineesInCentre = 0;
        this.courseType = courseType;
    }

}