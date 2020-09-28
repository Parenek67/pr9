package com.company;

public class StudentFoundExeption extends Throwable {
    public String Error(){
        return "Такого студента нет";
    }
}
