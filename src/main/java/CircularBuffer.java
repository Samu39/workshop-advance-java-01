public class CircularBuffer {
    private String[] array;
    private int writePosition;

    public CircularBuffer(){
        this(10);
    }

    public CircularBuffer(int size){
        array = new String[size];
        writePosition = 0;

    }

    public void write(String item){
        if(array[writePosition]==null) {
            array[writePosition] = item;
        }
    }

}
