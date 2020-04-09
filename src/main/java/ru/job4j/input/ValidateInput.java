package ru.job4j.input;

//TODO JavaDoc
public class ValidateInput implements Input {
    //TODO JavaDoc
    private Input input;

    //TODO JavaDoc
    public ValidateInput(Input input) {
    }

    //TODO Fix JavaDoc
    /**
     * Method receive String
     * from some input essence
     * and return it.
     * <p>
     * Method has no validation.
     * It receive line in
     * "fresh" condition
     *
     * @return line - object of String
     * class
     */
    @Override
    public String askLine() {
        return null;
    }

    //TODO Override methods

    /**
     * Method receive String
     * from some input essence
     * and return it,
     * if line contains
     * in array "possibleLines"
     * <p>
     * Method also can use
     * "message" that consist
     * some information about
     * desired line
     * <p>
     * Method has validation.

     * Method will ask lines
     * until it receive valid
     * line
     *
     * @param message       - String that consist
     *                      some information about
     *                      desired line. For example
     *                      we can print it to console
     *                      and user can read it
     * @param possibleLines - array of lines, that
     *                      we can return in this
     *                      method. So we can return
     *                      line only if it contains
     *                      in this array.
     *                      Method will receive new
     *                      lines until it receive
     *                      valid line
     * @return line - object of String
     * class that we receive
     * from user
     */
    @Override
    public String askLine(String message, String... possibleLines) {
        return null;
    }
}
