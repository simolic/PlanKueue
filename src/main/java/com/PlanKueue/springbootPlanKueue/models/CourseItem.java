package com.PlanKueue.springbootPlanKueue.models;

import java.time.Instant;
import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Course_Item")
public class CourseItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long courseId;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private double grade = 0.0;

    //Array of categories belonging to the course
    //private ArrayList<CategoryItem> categoryList = new ArrayList<CategoryItem>(10);

    //Default constructor
    public CourseItem(){}

    //Parameterized constructor
    public CourseItem(String name){
        this.name = name;
    }

    //Adds category to categoryList if category doesn't exist
/* 
    public void addCategory(String categoryName){
        int index = inList(categoryName);
        if (index == -1){
            CategoryItem newCategory = new CategoryItem(categoryName);
            categoryList.add(newCategory);
        }
    }

    private int inList(String taskName){
        int at = -1;
        for (int i = 0; i < categoryList.size(); i++){
            if (categoryList.get(i).getCategoryName().equals(taskName))
                at = i;
        }
        return at;
    }
*/
}
