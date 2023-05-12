package cn.vanillazi.test;

import lombok.Data;

/**
 * just for test
 */
public class Main {
    /**
     * information of person
     */
    @Data
    public static class Person{
        /**
         * name of person
         */
        String name;
        /**
         * address of person
         */
        String address;
    }
    public static void main(String[] args) {
        var p=new Person();
        System.out.println("Hello world!"+p);
    }
}