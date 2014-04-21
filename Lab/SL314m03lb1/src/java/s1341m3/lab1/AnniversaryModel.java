/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s1341m3.lab1;

/**
 *
 * @author Nish
 */
public class AnniversaryModel {

    private int theYear;

    static private class AnniversaryRecord {

        int year;
        String material;

        public AnniversaryRecord(int year, String material) {
            this.year = year;
            this.material = material;
        }

    }

    static private AnniversaryRecord[] anniversaryData = {
        new AnniversaryRecord(1, "Paper"),
        new AnniversaryRecord(2, "Cotton"),
        new AnniversaryRecord(3, "Leather"),
        new AnniversaryRecord(4, "Wood"),
        new AnniversaryRecord(5, "Ivory"),
        new AnniversaryRecord(6, "Pearl"),
    };

    public String getMaterial(){
        String rv = "nothing found";
        for (AnniversaryRecord anniversaryRecord : anniversaryData) {
            if (anniversaryRecord.year == theYear) {
                rv = anniversaryRecord.material;
                break;
            } else if (anniversaryRecord.year > theYear) {
                break;
            }
        }
        return rv;
    }
    public int getTheYear(){
        return theYear;
    }
    public void setTheYear(int theYear) {
        this.theYear = theYear;
    }

}
