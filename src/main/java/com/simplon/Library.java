package com.simplon;

import java.util.ArrayList;

public class Library {
    private static final int maxDVD = 3;
    private static final int openTime = 13;
    private static final int closeTime = 19;
    private int openHour = 5;

    private ArrayList<Book> Books = new ArrayList<Book>();
    private ArrayList<CD> CDs = new ArrayList<CD>();
    private ArrayList<DVD> DVDs = new ArrayList<DVD>();

    public Library(int openHour){

        this.openHour = openHour;
    }

    public ArrayList<Book> putBooks(ArrayList<Book> books,Worker worker)
    {
        if(!isOpen() && workerReady(worker))    Books.addAll(worker.Books());
        else if(isOpen() && books!=null)    Books.addAll(books);
        return this.Books;
    }

    public ArrayList<CD> putCDs(ArrayList<CD> cds,Worker worker)
    {
        if(!isOpen() && workerReady(worker))    CDs.addAll(worker.CDs());
        else if(isOpen() && cds!=null)    CDs.addAll(cds);
        return CDs;
    }

    public ArrayList<DVD> putDvds(ArrayList<DVD> dvds,Worker worker)
    {
        if(DVDs.size()<=maxDVD && isOpen() && dvds!=null) {
            int i = 0;
            int y = 0;

            // vérifier si un DVD est déja dans la librarie
            if (DVDs.size() > 0) {
                while (DVDs.get(i).getClass() != null) {
                    while (dvds.get(y).getClass() != null) {
                        if (DVDs.get(i).equals(dvds.get(y))) return DVDs;
                        y++;
                    }
                    i++;
                }
            }
            i = 0;
            while (DVDs.size() < maxDVD && i < dvds.size()) {
                DVDs.add(dvds.get(i));
                i++;
            }

        }
        else if(!isOpen() && workerReady(worker))
        {
            if(!isOpen() && workerReady(worker))    DVDs.addAll(worker.DVDs());
            else if(isOpen())    DVDs.addAll(dvds);
        }
        return DVDs;
    }

    private boolean workerReady(Worker worker){
        if(worker!=null)    return (worker.getWorkerTime()<openTime || worker.getWorkerTime()>closeTime);
        return false;
    }
    private boolean isOpen() {
        return (openHour >= openTime && openHour <= closeTime);
    }
}
