package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {

       if(monthNumber == 1){
           System.out.println("Winter");
       }else if(monthNumber == 2){
           System.out.println("Spring ");
       }else if(monthNumber == 3){
           System.out.println("Summer");
       }else if(monthNumber == 4){
           System.out.println("Autumn");
       }else {
           System.out.println("Wrong number !");
       }
    }

    public static void main(String[] args) {
        SeasonDeterminer seasonDeterminer = new SeasonDeterminer();
        seasonDeterminer.tellTheSeason(2);
    }
}
