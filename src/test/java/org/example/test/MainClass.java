package org.example.test;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

import java.util.ArrayList;
import java.util.List;

import static org.example.test.TreeADT.*;

public class MainClass {

    public static void main(String[] args) {
//        boolean val = TreeADT.findANode(TreeGenerator.getBST2(),  9);
//        printLeftView(TreeGenerator.getBST2());
//        System.out.println(val);
//        printPreorder(TreeGenerator.getBST3());
//printLevels(TreeGenerator.getBST3(), 0);

        boolean[] firstLevels = new boolean[100];
        printLeftView(TreeGenerator.getBST3(), 0, firstLevels);



    }

}