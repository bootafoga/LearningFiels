package YandexTest;

public class TNumbers extends Telephones{

    @Override
    public String toString() {
        processedNum = getInputNum().replaceAll("[^\\d]", "");

        for (int i = 0; i < processedNum.length(); i++){
            if (i == getIndexOfSpace()) output+= " ";
            if (i == getIndexOfFirstBkt()) output+= "(";
            if (i == getIndexOfSecondBkt()) output+= ")";
            output+= processedNum.charAt(i);
        }

        output+= " - " + getOperator();
        return output;
    }

    private String output = "+";
    private String processedNum;

}

