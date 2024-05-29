package com.example.androidstudioassignmentsu2024;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    public void setup() {
	FlashcardManagerSingleton flashcards = new FlashcardManagerSingleton();
	Flashcard flashcard1 = new Flashcard("1", "2");
	Flashcard flashcard2 = new Flashcard("3", "4");
	Flashcard flashcard3 = new Flashcard("5", "6");
    } 
    // TODO 7: Write a unit test for ensuring correct behavior of the addFlashcard function you implemented in TODO 2 in FlashcardManagerSingletons
    @Test
    public void add_flashcard_test() {
        flashcards.add(flashcard1);
	flashcards.add(flashcard2);
	flashcards.add(flashcard3);

	assertEquals(3, flashcards.size());
    }
}
