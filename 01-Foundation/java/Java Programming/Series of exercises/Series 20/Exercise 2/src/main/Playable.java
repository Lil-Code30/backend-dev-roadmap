package main;

public interface Playable {
    // Returns a negative integer, zero, or a positive integer as this object
    // loses, draws, or wins against the specified object.
    int gameResult(Playable o);
}