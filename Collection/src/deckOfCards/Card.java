package deckOfCards;

import java.util.ArrayList;
import java.util.List;

public record Card(Suit suit, String face, int rank) {

    public enum Suit {
        CLUB, DIAMOND, HEART, SPADE;

        public char getImage(){
            return (new char[]{9827, 9830, 9829, 9824})[this.ordinal()];
        }
        //These Unicode values correspond to card suit symbols: ♣, ♦, ♥, ♠
        //(new ...): anonymous array of 'char' type
        //[this.ordinal()]: returns the ordinal value of the current enum constant and use it as the index for the anonymous array

    }//enum

    @Override
    public String toString() {
        int index = face.equals("10") ? 2 : 1;
        String faceString = face.substring(0, index);
        //substring method: extract a portion of a string
        return "%s%c(%d)".formatted(faceString, suit.getImage(), rank);
    }

    public static Card getNumericCard(Suit suit, int cardNumber){
        if(cardNumber > 1 && cardNumber < 11){
            return new Card(suit, String.valueOf(cardNumber), cardNumber-2);
        }
        System.out.println("Invalid numeric card selected");
        return null;
    }//method

    public static Card getFaceCard(Suit suit, char abbrev){

        int charIndex = "JQKA".indexOf(abbrev);
        if(charIndex>-1){
            return new Card(suit, "" + abbrev, charIndex+9);
        }
        System.out.println("Invalid Face card selected.");
        return null;

    }//method


    public static List<Card> getStandardDeck(){

        List<Card> deck = new ArrayList<>(52);
        for(Suit suit : Suit.values()){
            for(int i=2; i<=10; i++){
                deck.add(getNumericCard(suit, i));
            }
            for(char c : new char[]{'J', 'Q', 'K', 'A'}){
                deck.add(getFaceCard(suit, c));
            }
        }
        return deck;

    }//method

    public static void printDeck(List<Card> deck){
        printDeck(deck, "Current Deck", 4);
    }

    public static void printDeck(List<Card> deck, String description, int rows){
        System.out.println("-".repeat(50));
        if (description != null) {
            System.out.println(description);
        }
        int cardsInRow = deck.size()/rows ;
        for(int i=0; i<rows; i++){
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }
    }


}//record

