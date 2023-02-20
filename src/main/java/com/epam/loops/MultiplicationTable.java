package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int i = 1; i <= 10; i++) {
            StringBuilder rec = new StringBuilder();
            rec.append(i);
            rec.append(" x ");
            rec.append(numberTableToPrint);
            rec.append(" = ");
            rec.append(i * numberTableToPrint);
            System.out.println(rec);
        }
    }

}
