public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder("html");
        HtmlElement document = builder
                .addChild("head")
                .addChild("title")
                .addText("hello", "hello", "hello")
                .addChild("body")
                .addChild("h1")
                .addChild("p")
                .build();

        System.out.println(document);
    }
}