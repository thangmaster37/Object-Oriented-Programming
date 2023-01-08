package com.oop.collections.phonebook;
import java.util.ArrayList;
import java.util.HashMap;
public class PhoneBookMap implements PhoneBook
{
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        this.phoneBook = new HashMap<String, Student>();
    }

    public void addPerson(Student s){
        phoneBook.put(s.phone,s);
    }

    public Student searchByName(String name){
        for (Student student : phoneBook.values()){
            if (student.name.equals(name)){
                return student;
            }
        }
        return null;
    }

    public Student searchByLastName(String lastname){
        for (Student student : phoneBook.values()){
            if (student.lastname.equals(lastname)){
                return student;
            }
        }
        return null;
    }

    public Student searchByNumber(String number){
        for (Student student : phoneBook.values()){
            if (student.phone.equals(number)){
                return student;
            }
        }
        return null;
    }

    public void deleteByNumber(String phone){
        phoneBook.remove(phone);
    }

}
