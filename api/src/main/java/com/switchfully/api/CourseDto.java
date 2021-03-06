package com.switchfully.api;

import javax.inject.Named;

@Named
public class CourseDto {
    private int courseId;
    private String name;
    private double studyPoints;
    private String category;
    private ProfessorDto professor;

    public static CourseDto courseDto() {
        return new CourseDto();
    }

    public CourseDto withCourseId(int courseId) {
        this.courseId = courseId;
        return this;
    }

    public CourseDto withName(String name){
        this.name = name;
        return this;
    }

    public CourseDto withStudyPoints(double studyPoints){
        this.studyPoints = studyPoints;
        return this;
    }

    public CourseDto withCategory(String category) {
        this.category = category;
        return this;
    }

    public CourseDto withProfessor(ProfessorDto professor) {
        this.professor = professor;
        return this;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public double getStudyPoints() {
        return studyPoints;
    }

    public String getCategory() {
        return category;
    }

    public ProfessorDto getProfessor() {
        return professor;
    }
}
