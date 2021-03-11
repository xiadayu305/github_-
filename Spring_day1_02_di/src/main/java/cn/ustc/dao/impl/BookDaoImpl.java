package cn.ustc.dao.impl;



import cn.ustc.dao.BookDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;

public class BookDaoImpl implements BookDao {

    private ArrayList<Object> al;
    private Properties properties;
    private int[] arr;
    private HashSet<Object> hs;
    private HashMap<Object, Object> hm ;

    public void setAl(ArrayList<Object> al) {
        this.al = al;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void setHs(HashSet<Object> hs) {
        this.hs = hs;
    }

    public void setHm(HashMap<Object, Object> hm) {
        this.hm = hm;
    }

    public void save() {
        System.out.println("book dao running...");
        System.out.println("ArrayList:"+al);
        System.out.println("Properties:"+properties);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("HashSet:"+hs);
        System.out.println("HashMap:"+hm);
    }
}
