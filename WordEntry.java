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
public class WordEntry {

    String Word;
    int numAppearances = 0;
    int totalScore = 0;

    public WordEntry(String text, double score) {
        Word = text;
        totalScore += score;
        numAppearances = 1;
    }

    public void numAppearance(int s) {

        numAppearances += s;
    }

    public String getWord() {
        return Word;
    }

    public double getAverage() {
        return (double) totalScore / numAppearances;
    }

    void addNewAppearance(double score) {
        totalScore += score;
        numAppearances++;
    }
}
