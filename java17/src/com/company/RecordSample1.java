package com.company;

public class RecordSample1 {
    record MyRecord(Integer id, String  name) {};

    public static void main(String[] args) {

        MyRecord myRecord1 = new MyRecord(0, "Taro");
        System.out.println("> myRecord1.toString()");
        System.out.println(myRecord1);

        System.out.println("> myRecord1.id()");
        System.out.println(myRecord1.id());

        System.out.println("> myRecord1.name()");
        System.out.println(myRecord1.name());


        MyRecord myRecord2 = GenerateRecord();
        System.out.println("> myRecord1.equals(myRecord2)");
        System.out.println(myRecord1.equals(myRecord2));

        System.out.println("> myRecord1 == myRecord2");
        System.out.println(myRecord1 == myRecord2);

    }


    private static MyRecord GenerateRecord(){
        return new MyRecord(0, "Taro");
    }




}
