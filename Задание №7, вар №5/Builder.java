class Builder {
    private HtmlElement root;

    public Builder(String rootName) {
        root = new Tag(rootName);
    }

    public Builder addChild(String childName) {
        HtmlElement child = new Tag(childName);
        root.add(child);
        return this;
    }

    public Builder addText(String childName, String key, String value) {
        Tag child = new Tag(childName);
        child.addAttribute(key, value);
        root.add(child);
        return this;
    }

    public HtmlElement build() {
        return root;
    }
}
