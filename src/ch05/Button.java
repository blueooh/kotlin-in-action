package ch05;

public class Button {
    public void setOnClickListener(OnClickListener l) { /*...*/ }

    public static void setSam(SAMInterface samInterface) {
        // ...
    }

    public interface SAMInterface {
        void onClick(int position);
    }
}
