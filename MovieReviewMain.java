/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviereviewmain;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author DELL PC
 */
public class MovieReviewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> lines = readLine("movieReview.txt");
        for (String a : lines) {
            StringTokenizer token = new StringTokenizer(a, " ");
            String message;
            int score = Integer.parseInt(token.nextToken());
           
        }
    }

    private static List<String> readLine(String movieReviewtxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
