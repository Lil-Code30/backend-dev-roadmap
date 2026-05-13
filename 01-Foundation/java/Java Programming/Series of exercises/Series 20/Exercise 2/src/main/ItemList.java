package main;

public class ItemList implements Provider {

    private int position = 0;
    private final Playable[] items;

    public ItemList(Playable[] items) {
        this.items = items;
    }

    @Override
    public boolean hasMore() {
        /* Implement the program based on instructions */
    }

    @Override
    public Playable getNext() {
        /* Implement the program based on instructions */
    }
}