package iterator.pseudocode;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}