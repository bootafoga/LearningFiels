package YandexTest;

abstract class Telephones {

    public void setInputNum(String inputNum) { this.inputNum = inputNum; }
    public void setOperator(String sortOperator) { this.operator = sortOperator; }

    public String getInputNum() {
        return inputNum;
    }
    public String getOperator() {
        return operator;
    }

    public void setIndexOfSpace(int indexOfSpace) { this.indexOfSpace = indexOfSpace; }
    public void setIndexOfFirstBkt(int indexOfFirstBkt) { this.indexOfFirstBkt = indexOfFirstBkt; }
    public void setIndexOfSecondBkt(int indexOfSecondBkt) { this.indexOfSecondBkt = indexOfSecondBkt; }

    public int getIndexOfSpace() { return indexOfSpace; }
    public int getIndexOfFirstBkt() { return indexOfFirstBkt; }
    public int getIndexOfSecondBkt() { return indexOfSecondBkt; }

    private String inputNum;
    private String operator;

    private int indexOfSpace;
    private int indexOfFirstBkt;
    private int indexOfSecondBkt;
}
