package butka.tarathep.lab6;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 27, 2023

// This is an interface called BadmintonPlayable
interface BadmintonPlayable {
    // A field called racketLength with a default value of 0
    double racketLenght = 0;
    // A field called worldRanking with a default value of 0
    int worldRanking = 0;

    // A method that returns the racket length
    public double getRacketLength();

    // A method that sets the racket length
    public double setRacketLength(double racketLenght);

    // A method that returns the world ranking
    public int getWorldRanking();

    // A method that sets the world ranking
    public int setWorldRanking(int worldRanking);
}
