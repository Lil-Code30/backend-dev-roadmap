public class Task {
    public static void main(String[] args) {
        Entity entity = new Entity();

        // 1a: Class ----------------
        ValueChangedListener changedValueListener = new MyListener();
        entity.setValue("abcd");
        entity.setListener(changedValueListener);
        entity.setValue("toto");
        entity.setValue("titi");

        // 1b: Anonymous ----------------------
        /* Implement an observer using an anonymous class */
        entity.setValue("titi");

        // 1c: Lambda ------------------------
        /* Implement an observer using a lambda expression */
        entity.setValue("tutu");

        // 1d: Stubborn -------------------------
        ValueChangedListener stubbornListener = new StubbornListener();
        entity.setListener(stubbornListener);
        entity.setValue("toto");

    }
}