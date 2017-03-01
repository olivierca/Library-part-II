package com.simplon;


import java.util.ArrayList;

public class Worker {
    private String nameWorker="";
    private int workerTime = 0;
    private ArrayList<Book> Books = new ArrayList<Book>();
    private ArrayList<CD> CDs = new ArrayList<CD>();
    private ArrayList<DVD> DVDs = new ArrayList<DVD>();

    public Worker(String name,int hour){
        nameWorker = name;
        workerTime = hour;
    }

    public ArrayList<Book> putBooks(ArrayList<Book> books){
        Books.addAll(books);
        return Books;
    }

    public ArrayList<CD> putCds(ArrayList<CD> cds){
        CDs.addAll(cds);
        return CDs;
    }

    public ArrayList<DVD> putDVDs(ArrayList<DVD> dvds){
        DVDs.addAll(dvds);
        return DVDs;
    }

    public ArrayList<Book> Books(){
        return Books;
    }

    public ArrayList<CD> CDs(){
        return CDs;
    }

    public ArrayList<DVD> DVDs(){
        return DVDs;
    }

//    public void setWorkerTime(int hour){workerTime = hour;}
    public int getWorkerTime(){return workerTime;}
}
