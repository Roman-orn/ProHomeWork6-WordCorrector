package app;

public class Main {

    public static void main(String[] args){

        DataProvider dataProvider = new DataProvider();
        String[] dataArray = dataProvider.getData();

        Corrector corrector = new Corrector();
        String correctedData = corrector.handleData(dataArray);

        getOutput(correctedData);
    }

    private static void getOutput(String output){
        System.out.println(output);
    }
}
