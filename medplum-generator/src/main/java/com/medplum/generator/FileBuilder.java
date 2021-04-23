package com.medplum.generator;

public class FileBuilder {
    private static final String INDENT = " ".repeat(4);
    private final StringBuilder b;
    private int indentCount;

    public FileBuilder() {
        b = new StringBuilder();
        append("/*");
        append(" * Generated by " + Generator.class.getName());
        append(" * Do not edit manually.");
        append(" */");
        newLine();
    }

    public void increaseIndent() {
        indentCount++;
    }

    public void decreaseIndent() {
        indentCount--;
    }

    public void newLine() {
        b.append("\n");
    }

    public void append(final String line) {
        b.append(INDENT.repeat(indentCount));
        b.append(line);
        b.append("\n");
    }

    @Override
    public String toString() {
        return b.toString().replaceAll("\n\n\n", "\n\n");
    }
}
