package com.practic.serealization$desearealization;

import java.io.*;

class Person implements Serializable{
    String name;
    int age;



    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class MainSerealization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        //Serializable using objcet type to byteStream

       /* Person person=new Person("john",30);
        FileOutputStream stream=new FileOutputStream("C:\\Users\\DELL\\Downloads\\index.txt");
        ObjectOutputStream obj=new ObjectOutputStream(stream);
        obj.writeObject(person);
        stream.close();;
        obj.close();
        System.out.println("Object serialized");*/


        //ByteStream to convert object employee type
        FileInputStream fileStream=new FileInputStream("C:\\Users\\DELL\\Downloads\\index.txt");
        ObjectInputStream strm=new ObjectInputStream(fileStream);
        Person perso=(Person)strm.readObject();
        fileStream.close();
        strm.close();
        System.out.println("object is Deserialized:"+perso);


    }
}
