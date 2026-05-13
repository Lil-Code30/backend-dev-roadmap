package main;

public interface Provider {
    boolean hasMore();  // returns true if the provider has more items
    Playable getNext(); // returns the next main.Playable item
}