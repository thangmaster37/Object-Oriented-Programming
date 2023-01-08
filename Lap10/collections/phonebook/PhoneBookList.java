package com.oop.collections.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook
{
    ArrayList<Student> phoneBook;

    public PhoneBookList(){
        phoneBook = new ArrayList<>();
    }

    public void addPerson(Student p){
        phoneBook.add(p);
    }

    public Student searchByName(String name){
        for (int i = 0 ; i < phoneBook.size(); i++){
            if (phoneBook.get(i).name.equals(name)){
                return phoneBook.get(i);
            }
        }
        return null;
    }

    public Student searchByLastName(String lastname){
        for (int i = 0 ; i < phoneBook.size(); i++){
            if (phoneBook.get(i).lastname.equals(lastname)){
                return phoneBook.get(i);
            }
        }
        return null;
    }

    public Student searchByNumber(String phone){
        for (int i = 0 ; i < phoneBook.size(); i++){
            if (phoneBook.get(i).phone.equals(phone)){
                return phoneBook.get(i);
            }
        }
        return null;
    }

    public void deleteByNumber(String phone){
        for (int i = 0 ; i < phoneBook.size(); i++){
            if (phoneBook.get(i).phone.equals(phone)){
                phoneBook.remove(i);
            }
        }
    }
}
