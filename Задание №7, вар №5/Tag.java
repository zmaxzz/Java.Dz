class Tag extends HtmlElement {
    private StringBuilder attributes = new StringBuilder();

    public Tag(String name) {
        super(name);
    }

    public void addAttribute(String key, String value) {
        if (attributes.length() == 0) {
            attributes.append(" ");
        } else {
            attributes.append(" ");
        }
        attributes.append(key).append("=").append(value).append("");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(name).append(attributes).append(">");
        for (HtmlElement child : children) {
            sb.append(child.toString());
        }
        sb.append("</").append(name).append(">");
        return sb.toString();
    }
}
