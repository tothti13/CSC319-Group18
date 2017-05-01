/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviereviewmain;

/**
 *
 * @author DELL PC
 */
public class HashTable {
    private WordEntry[] Word;
    private int size;
    public HashTable(int size) {
        this.size = size;
        Word = new WordEntry[size];
    }

    public int computeHash(String revText) {
        int x = 2;
        revText = revText.toLowerCase();
        for (int temp = 0; temp < revText.length(); temp++) {
            x = (x * 2) + (int) revText.charAt(temp);
            x = x % size;
        }
        return x;
    }

    public double getAverage(String revText) {
        double x = 2;
        if (contains(revText)) {
            x = Word[computeHash(revText)].getAverage();
        }
        return x;
    }

    public void put(String revText, int score) {
        if (contains(revText)) {
            Word[computeHash(revText)].addNewAppearance(score);
        } else {
            Word[computeHash(revText)] = new WordEntry(revText, score);
        }
    }

    public boolean contains(String s) {
        boolean x = false;
        if (Word[computeHash(s)] != null) {
            x = true;
        }
        return x;
    }

}
