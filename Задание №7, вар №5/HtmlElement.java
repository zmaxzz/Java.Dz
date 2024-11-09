
import java.util.ArrayList;
import java.util.List;

abstract class HtmlElement {
    protected String name;
    protected List<HtmlElement> children = new ArrayList<>();

    public HtmlElement(String name) {
        this.name = name;
    }

    public void add(HtmlElement element) {
        children.add(element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(name).append(">");
        for (HtmlElement child : children) {
            sb.append(child.toString());
        }
        sb.append("</").append(name).append(">");
        return sb.toString();
    }
}