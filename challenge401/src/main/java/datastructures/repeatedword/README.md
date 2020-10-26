Repeated Word
Challenge
Write a method that takes in a String and returns the first repeated word in that String, without utilizing any of the built-in library methods available to your language,

Approach and Efficiency
The approach for this was to iterate over every character in the String and look for when the current character was a space, comma, or period (could include more punctuation cases). After that, there is a check to handle not including punctuation when grabbing a word, and then the last word that occurred before that space, period, or comma is grabbed, and checked if it's in the HashSet. If it is, that word is immediately returned, as we want to return the first instance that condition is true. If it is not in the Set, then the word is added to the set and the loop continues. This solution takes O(n) time and space.