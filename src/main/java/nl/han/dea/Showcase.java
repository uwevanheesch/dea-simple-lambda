package nl.han.dea;

public class Showcase {

    private ContentProvider contentProvider;

    public static void main(String[] args) {
        var showcase = new Showcase();
        showcase.callWithSeprateClass();
        showcase.callWithAnonymousInnerClass();
        showcase.callWithLambda();
        showcase.callWithMethodReferenceUsingSystemOut();
        showcase.callWithMethodReferenceUsingOwnStaticMethod();
    }

    private void callWithSeprateClass() {
        // TODO create a separate class that implements the interface IPrintingService and call the
        // TODO Contentprovider-method printContent

        // contentProvider.printContent(new MyPrintingService());
    }

    private void callWithAnonymousInnerClass() {
        // call the printContentMethod using an anonymous inner class as a parameter
        // contentProvider.printContent( ... );
    }

    private void callWithLambda() {
        // call the printContentMethod using a lambda expression as parameter
        // contentProvider.printContent( ... );
    }

    private void callWithMethodReferenceUsingSystemOut() {
        // call the printContentMethod using a method reference to the println-method in System.out
        // contentProvider.printContent( ... );
    }

    private void callWithMethodReferenceUsingOwnStaticMethod() {
        // call the printContentMethod using a method reference to a static method you create in this class
        // contentProvider.printContent( ... );
    }

}
