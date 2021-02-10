package nl.han.dea;

public class ContentProvider {

    private String someContent = "This is fancy content";

    public void printContent(IPrintingService printingService) {
        printingService.print(someContent);
    }


}
