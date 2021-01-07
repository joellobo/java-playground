package j2html;

import static j2html.TagCreator.*;

public class Main {
    public static void main(String[] args) {
        String render = body(
            h1("Hello, World!"),
            img().withSrc("/img/hello.png")
        ).render();
        System.out.println(render);
        
    }
}
